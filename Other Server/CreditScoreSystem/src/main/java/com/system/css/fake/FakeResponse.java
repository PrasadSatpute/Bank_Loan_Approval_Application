package com.system.css.fake;

import com.github.javafaker.Faker;
import com.system.css.model.response.Address;
import com.system.css.model.response.Customer;
import com.system.css.model.response.Response;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Component
public class FakeResponse {

    Faker faker = new Faker();
    Faker fakerWithLocales = new Faker(Locale.UK);

    List<Response> fakeResponse = new ArrayList<>();
    Address fakeAddress = new Address();
    Customer fakeCustomer = new Customer();

    @EventListener(ApplicationReadyEvent.class)
    public void createFakeResponse() {
        for (int i = 0; i < 2; i++) {
//            Set Address for Fake Customer
            fakeAddress.setStreet(fakerWithLocales.address().streetAddress());
            fakeAddress.setCity(fakerWithLocales.address().city());
            fakeAddress.setState(fakerWithLocales.address().state());
            fakeAddress.setZip(fakerWithLocales.address().zipCode());

//            Set Fake Customer Details
            fakeCustomer.setAddress(fakeAddress);
            fakeCustomer.setEmail(fakerWithLocales.internet().emailAddress());
            fakeCustomer.setIncome(generateRandomIncome());
            fakeCustomer.setGenuine(generateRandomGenuine());
            fakeCustomer.setPhone(generateRandomPhoneNumber());
            fakeCustomer.setCreditScore(generateRandomCreditScore());
            fakeCustomer.setFirstName(fakerWithLocales.name().firstName());
            fakeCustomer.setLastName(fakerWithLocales.name().lastName());
            fakeCustomer.setOtherLoanRunning(generateRandomBoolean());
            fakeCustomer.setPaymentDue(generateRandomPaymentDue());
            fakeCustomer.setLast6MonthPaymentHistory(generateRandomPaymentHistory());
        }
    }

    private static int generateRandomIncome() {
        Random random = new Random();
        return random.nextInt(50001) + 50000; // Random income between $50,000 and $100,000
    }

    private static boolean generateRandomGenuine() {
        Random random = new Random();
        return (random.nextInt(50001) + 50000) == (random.nextInt(50001) + 50000); // Random Genuine
    }

    private static String generateRandomPhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder("+");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }

    private static int generateRandomCreditScore() {
        Random random = new Random();
        return random.nextInt(101) + 700; // Random credit score between 700 and 800
    }

    // Function to generate random boolean value
    private static boolean generateRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    // Function to generate random payment due between 1500 and 2500
    private static int generateRandomPaymentDue() {
        Random random = new Random();
        return random.nextInt(1001) + 1500; // Generates between 1500 and 2500
    }

    // Function to generate random payment history for last 6 months
    private static ArrayList<Integer> generateRandomPaymentHistory() {
        List<Integer> paymentHistory = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            paymentHistory.add(random.nextInt(1001) + 1500); // Generates between 1500 and 2500
        }
        return (ArrayList<Integer>) paymentHistory;
    }

}

package com.bank.blas.model.response;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;
    private int income;
    private int creditScore;
    private int paymentDue;
    private boolean otherLoanRunning;
    private ArrayList<Integer> last6MonthPaymentHistory;
    public boolean genuine;
}

package com.system.css;

import com.system.css.fake.FakeResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CreditScoreSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditScoreSystemApplication.class, args);

//		Fake Customers created by Faker Class
//		FakeResponse response = new FakeResponse();
	}

}

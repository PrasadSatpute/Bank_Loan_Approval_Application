package com.bank.blas.model.request;

import lombok.*;

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
}

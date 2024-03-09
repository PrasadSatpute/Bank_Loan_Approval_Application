package com.bank.blas.model.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    private String street;
    public String city;
    private String state;
    private String zip;
}

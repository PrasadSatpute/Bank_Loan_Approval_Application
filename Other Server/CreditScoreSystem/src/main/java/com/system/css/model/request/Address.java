package com.system.css.model.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
}

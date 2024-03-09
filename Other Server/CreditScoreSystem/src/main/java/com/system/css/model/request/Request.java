package com.system.css.model.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Request {
    private Customer customer;
    private Loan loan;
}

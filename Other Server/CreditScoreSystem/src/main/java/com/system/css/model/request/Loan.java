package com.system.css.model.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Loan {
    private int amountRequested;
    private String purpose;
    private int term;
}

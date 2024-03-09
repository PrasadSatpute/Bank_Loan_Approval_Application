package com.system.css.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("income")
    private int income;

    @JsonProperty("creditScore")
    private int creditScore;

    @JsonProperty("paymentDue")
    private int paymentDue;

    @JsonProperty("otherLoanRunning")
    private boolean otherLoanRunning;

    @JsonProperty("last6MonthPaymentHistory")
    private ArrayList<Integer> last6MonthPaymentHistory;

    @JsonProperty("genuine")
    public boolean genuine;
}

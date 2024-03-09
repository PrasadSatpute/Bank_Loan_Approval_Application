package com.system.css.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Response {
    @JsonProperty("customer")
    private Customer customer;
}

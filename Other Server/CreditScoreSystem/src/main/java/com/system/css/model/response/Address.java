package com.system.css.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    @JsonProperty("street")
    private String street;

    @JsonProperty("city")
    public String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("zip")
    private String zip;
}

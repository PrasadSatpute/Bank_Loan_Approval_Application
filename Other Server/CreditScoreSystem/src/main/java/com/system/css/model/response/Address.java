package com.system.css.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @JsonProperty("street")
    private String street;

    @JsonProperty("city")
    public String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("zip")
    private String zip;
}

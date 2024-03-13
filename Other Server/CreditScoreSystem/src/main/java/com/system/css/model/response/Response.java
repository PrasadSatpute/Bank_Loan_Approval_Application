package com.system.css.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data                   // this annotation include getter and setter and toString
@Entity
@Table(name = "response")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerID;

    @JsonProperty("customer")
    private Customer customer;
}

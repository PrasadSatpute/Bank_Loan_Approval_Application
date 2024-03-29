package com.system.css.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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


    @Column(columnDefinition = "TEXT")
    @JsonProperty("customer")
    private String customer;

    // Getter and setter for customer field
    public Customer getCustomer() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(customer, Customer.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace(); // Handle the exception appropriately
            return null;
        }
    }

    public void setCustomer(Customer customer) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.customer = objectMapper.writeValueAsString(customer);
        } catch (JsonProcessingException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
}

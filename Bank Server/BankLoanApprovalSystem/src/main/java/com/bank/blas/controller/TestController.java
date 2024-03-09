package com.bank.blas.controller;

import com.bank.blas.model.request.Request;
import com.bank.blas.model.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/bank")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    private final RestTemplate restTemplate = restTemplate();
    private static HttpHeaders headers = new HttpHeaders();

    @GetMapping("/test")
    public String test()
    {
        return "Test Successful";
    }

    @PostMapping("/enquiry")
    public Response getResponse(@RequestBody Request request) {
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Request> http = new HttpEntity<>(request, headers);
        logger.info("Getting Response");
        Response getResponse = restTemplate.postForObject("http://localhost:8082/credit/enquiry", http, Response.class);
        System.out.println(getResponse.toString());
        return getResponse;
    }
}

package com.bank.blas.controller;

import com.bank.blas.model.request.Request;
import com.bank.blas.model.response.Response;
import com.bank.blas.model.token.JWTRequest;
import com.bank.blas.model.token.JWTResponse;
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
    private static final HttpHeaders headers = new HttpHeaders();

    private static String JWTToken = "fghjhgkfhcjvbklgfdhgkjl;";

    @GetMapping("/test")
    public String test()
    {
        return "Test Successful";
    }

    @PostMapping("/token")
    public JWTResponse getToken(@RequestBody JWTRequest request) {
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<JWTRequest> http = new HttpEntity<>(request, headers);
        logger.info("Getting Token Response");
        JWTResponse getResponse = restTemplate.postForObject("http://localhost:8082/auth/login", http, JWTResponse.class);
        assert getResponse != null;
        JWTToken = getResponse.getJwtToken();
        System.out.println(getResponse);
        return getResponse;
    }

    @PostMapping("/enquiry")
    public Response getResponse(@RequestBody Request request) {

//        Token Generation
        JWTRequest jwtRequest = new JWTRequest("xyz","xyz");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<JWTRequest> http1 = new HttpEntity<>(jwtRequest, headers);
        logger.info("Getting Token Response");
        JWTResponse getResponse1 = restTemplate.postForObject("http://localhost:8082/auth/login", http1, JWTResponse.class);
        assert getResponse1 != null;
        JWTToken = getResponse1.getJwtToken();
        System.out.println(getResponse1);



        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization","Bearer "+JWTToken);
        HttpEntity<Request> http = new HttpEntity<>(request, headers);
        logger.info("Getting Response");
        Response getResponse = restTemplate.postForObject("http://localhost:8082/credit/enquiry", http, Response.class);
        System.out.println(getResponse.toString());
        return getResponse;
    }
}

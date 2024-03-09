package com.bank.blas.controller;

import com.bank.blas.model.request.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class TestController {
    @GetMapping("/test")
    public String test()
    {
        return "Test Successful";
    }

    @PostMapping("/enquiry")
    public ResponseEntity<String> getResponse(@RequestBody Request request)
    {
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}

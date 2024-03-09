package com.system.css.controller;

import com.system.css.model.request.Request;
import com.system.css.model.response.Response;
import com.system.css.service.EnquiryService;
import com.system.css.util.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/credit")
public class TestController {

    @Autowired
    EnquiryService enquiryService;
    @GetMapping("/test")
    public String test()
    {
        return "Test Successful";
    }

    @PostMapping("/enquiry")
    public ResponseEntity<Object> getResponse(@RequestBody Request request) throws IOException {
        return ResponseHandler.responseBuilder("Requested",HttpStatus.OK,enquiryService.getData());
    }
}

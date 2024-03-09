package com.system.css.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.system.css.model.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class EnquiryService {

    Logger logger = LoggerFactory.getLogger(EnquiryService.class);
    private final ObjectMapper objectMapper;

    public EnquiryService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Response getData() throws IOException {
        Response r = new Response();
        r = readJsonResponseFromFile();
        return r;
    }

    public Response readJsonResponseFromFile() throws IOException{
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = new ClassPathResource("response.json").getInputStream();
            logger.info("Getting Response");
            return objectMapper.readValue(inputStream, Response.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Not get Response");
        return null;
    }
}

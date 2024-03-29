package com.bank.blas.model.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Response {
    private Data data;
    private String httpStatus;
    private String message;
}

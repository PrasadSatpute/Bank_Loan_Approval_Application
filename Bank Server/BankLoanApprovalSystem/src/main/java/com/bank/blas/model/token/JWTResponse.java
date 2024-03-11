package com.bank.blas.model.token;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JWTResponse {
    private String jwtToken;
    private String userName;
}

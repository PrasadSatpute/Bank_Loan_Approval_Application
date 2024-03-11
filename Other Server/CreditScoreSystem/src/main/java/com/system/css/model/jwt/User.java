package com.system.css.model.jwt;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String userID;
    private String name;
    private String email;
}

package com.example.JWTImplementation.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class User {
    private String username;
    private String password;
    private String fullName;
    private String emailId;
    private String mobileNo;
}

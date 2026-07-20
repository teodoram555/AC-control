package com.example.demo.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Setter
@Getter
public class User {
    @Id
    private String id;
    private String name;
    @Indexed(unique = true)
    private String email;
    private String password;

    public User(){
    }
    public User(String name, String email,String password){
        this.name=name;
        this.email=email;
        this.password=password;
    }

}

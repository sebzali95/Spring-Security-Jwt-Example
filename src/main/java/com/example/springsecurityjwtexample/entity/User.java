package com.example.springsecurityjwtexample.entity;
import lombok.*;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "USER_TBL")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    private int id;
    private String userName;
    private String password;
    private String email;
}

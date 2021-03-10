package me.goldapple.springbooinit.account;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Account{
    @Id @GeneratedValue
    private Long id ;
    private String username;
    private String password;

    public Account(String username , String password){
        this.username = username;
        this.password = password;
    }
}

package me.goldapple.springbooinit.account;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Account{
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
}

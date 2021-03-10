package me.goldapple.springbooinit;

import me.goldapple.springbooinit.account.Account;
import me.goldapple.springbooinit.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner{
    @Autowired
    private AccountService accountService;
    @Override
    public void run(ApplicationArguments args) throws Exception{
        Account goldapple = accountService.createAccount("goldapple" , "1234");
        System.out.println("goldapple.getUsername() = " + goldapple.getUsername());
    }
}

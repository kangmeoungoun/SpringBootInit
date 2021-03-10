package me.goldapple.springbooinit.account;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService implements UserDetailsService{
    private final AccountReposiroy accountReposiroy;
    private final PasswordEncoder passwordEncoder;
    public Account createAccount(String username,String password){
        Account account = new Account(username , passwordEncoder.encode(password));
        return accountReposiroy.save(account);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Optional<Account> byUsername =  accountReposiroy.findByUsername(username);
        Account account = byUsername.orElseThrow(() -> new UsernameNotFoundException(username));
        return new User(account.getUsername(),account.getPassword(),authorities());

    }

    private Collection<? extends GrantedAuthority> authorities(){
        //return List.of(new SimpleGrantedAuthority("ROLE_USER"));
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }
}

package me.goldapple.springbooinit.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountReposiroy extends JpaRepository<Account,Long>{
    Optional<Account> findByUsername(String username);
}

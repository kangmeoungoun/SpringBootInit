package me.goldapple.springbooinit.account;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.assertj.core.api.Assertions.assertThat;


@Transactional
@DataJpaTest
class AccountRepositoryTest{

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    void di() throws Exception{
        //given
        try(Connection connection = dataSource.getConnection();){
            Account account = new Account();
            account.setUsername("goldapple");
            account.setPassword("1234");

            Account newAccount = accountRepository.save(account);

            assertThat(newAccount).isNotNull();
            Account existingAccount = accountRepository.findByUsername(newAccount.getUsername());
            assertThat(existingAccount).isNotNull();
            assertThat(newAccount).isEqualTo(account);
            assertThat(newAccount).isEqualTo(existingAccount);
        }

        //when

        //then
    }
}
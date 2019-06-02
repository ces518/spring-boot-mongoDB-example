package me.june.springbootmongo.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataMongoTest
public class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void findByUsername() {
        Account account = new Account();
        account.setId("pjy3");
        account.setUsername("parkjune0");

        accountRepository.save(account);

        Account byUsername = accountRepository.findByUsername(account.getUsername());

        assertThat(byUsername).isNotNull();
        assertThat(byUsername.getUsername()).isEqualTo("parkjune0");
    }
}

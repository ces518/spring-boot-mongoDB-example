package me.june.springbootmongo;

import me.june.springbootmongo.account.Account;
import me.june.springbootmongo.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

@SpringBootApplication
public class SpringBootMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoApplication.class, args);
    }


    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Bean
    public ApplicationRunner applicationRunner () {
        return args -> {
            Account account = new Account();
            account.setId("pjy1");
            account.setUsername("june01");
            account.setPassword("12341");
            //mongoTemplate.insert(account);


            accountRepository.insert(account);
        };
    }
}

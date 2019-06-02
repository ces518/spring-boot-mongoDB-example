package me.june.springbootmongo.account;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-06-02
 * Time: 20:33
 **/
public interface AccountRepository extends MongoRepository<Account, String> {
    Account findByUsername(String username);
}

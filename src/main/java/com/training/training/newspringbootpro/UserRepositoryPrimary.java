package com.training.training.newspringbootpro;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class UserRepositoryPrimary implements UserRepository {

    @Override
    public User getUser(int id) {
        return new User(id, "User From Primary Repo");
    }
}

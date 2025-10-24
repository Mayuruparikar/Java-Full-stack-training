package com.training.training.newspringbootpro;
import org.springframework.stereotype.Repository;

@Repository("backupRepo")
public class UserRepositoryBackup implements UserRepository {

    @Override
    public User getUser(int id) {
        return new User(id, "User From Backup Repo");
    }
}


package com.training.training.newspringbootpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository primaryRepo; // gets Primary one automatically

    @Autowired
    @Qualifier("backupRepo")
    private UserRepository backupRepo; // manual choice

    public User getPrimaryUser(int id) {
        User user = primaryRepo.getUser(id);
        if (user == null) {
            throw new UserNotFoundException("Primary user not found with ID: " + id);
        }
        return user;
    }

    public User getBackupUser(int id) {
        User user = backupRepo.getUser(id);
        if (user == null) {
            throw new UserNotFoundException("Backup user not found with ID: " + id);
        }
        return user;
    }
}

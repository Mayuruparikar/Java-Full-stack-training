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
        return primaryRepo.getUser(id);
    }

    public User getBackupUser(int id) {
        return backupRepo.getUser(id);
    }
}

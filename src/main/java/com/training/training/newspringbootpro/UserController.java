package com.training.training.newspringbootpro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getPrimary(@PathVariable int id) {
        return userService.getPrimaryUser(id);
    }

    @GetMapping("/backup/{id}")
    public User getBackup(@PathVariable int id) {
        return userService.getBackupUser(id);
    }
}

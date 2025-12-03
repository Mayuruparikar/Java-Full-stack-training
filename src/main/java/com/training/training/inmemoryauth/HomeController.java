package com.training.training.inmemoryauth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @RequestMapping("/")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String index(){
        return "index";
    }
    @RequestMapping("/home")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String home()
    {
        return "home";
    }
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @RequestMapping("/about")
    public String about(){
        return "about";
    }


}

package com.training.training.newanno;

import com.training.training.newanno.PropertyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PropertyService customPropertyBean() {
        return new PropertyService();
    }
}

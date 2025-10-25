package com.training.training.newanno;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class LazyService {

    public String lazyMessage() {
        return "Hello I am from lazy bean object creation ";
    }
}

package com.training.training.newanno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @ResponseBody
    public String helloPage() {
        return "Hie, hope you are doing well bye ";
    }
}

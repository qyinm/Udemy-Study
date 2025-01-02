package com.hippoo.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class SayHelloController {

    //@GetMapping("/say-hello")
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }
}


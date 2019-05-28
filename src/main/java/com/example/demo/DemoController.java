package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
    public @ResponseBody
    String helloWorld() {
        return "Hello FUCKING World!!!"; //"application/json" mean this is a text not a redirect
    }
}


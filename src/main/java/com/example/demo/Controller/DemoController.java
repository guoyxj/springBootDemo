package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo Controller
 *
 * Created by guoyx on 2018/11/29.
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World 2018-11-30";
    }
}

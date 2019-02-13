package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PageController
 *
 * Created by guoyx on 2018/11/29.
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/index")
    public String toPage(){
        return "index";
    }

}

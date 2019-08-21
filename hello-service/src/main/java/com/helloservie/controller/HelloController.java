package com.helloservie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <p>
 * Author: GWL
 * Date: Create in 19:47 2019/8/20
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index(){
        return "hello world!!!";
    }

}

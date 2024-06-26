package com.rainbow.springbootinit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @responseBody + @controller
@RequestMapping("chart")
public class ChartController {

    /**
     * 同步生成controller
     */
    @PostMapping("gen")
    public void gen(){

    }
}

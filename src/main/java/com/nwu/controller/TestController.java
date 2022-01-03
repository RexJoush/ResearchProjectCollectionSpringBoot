package com.nwu.controller;

import com.nwu.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 标准 controller 文件，参考此 controller
 * @author Rex Joush
 * @time 2022.01.03
 */

@RestController
@RequestMapping("/hello")
public class TestController {


    @GetMapping("/test")
    public String hello(){
        return Result.ok("Hello World!");
    }

}

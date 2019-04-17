package com.sino.daily.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2019/4/17 17:06.
 *
 * @author caogu
 */
@RestController
public class DemoController {

    @RequestMapping("test")
    public String test() {
        return "OK!";
    }

}

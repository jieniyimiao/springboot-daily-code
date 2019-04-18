package com.sino.daily.controller;

import com.sino.daily.annotations.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2019/4/17 17:06.
 *
 * @author caogu
 */
@RestController
@ApiVersion(1)
@RequestMapping("{version}/my/")
public class ApiVersion1Controller {

    @RequestMapping("test")
    public String test() {
        return "OK! v1";
    }

}

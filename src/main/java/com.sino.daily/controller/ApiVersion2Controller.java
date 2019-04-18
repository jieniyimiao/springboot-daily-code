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
@RequestMapping("{version}/my/")
@ApiVersion(1)
public class ApiVersion2Controller {

    @RequestMapping("test")
    @ApiVersion(2) // 方法会覆盖类的版本
    public String test() {
        return "OK! v2";
    }

}

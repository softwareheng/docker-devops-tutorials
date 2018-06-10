package com.devops.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * DevopsDemoController资源
 */
@RestController
public class DevopsDemoController {

    /**
     * 入口
     */
    @GetMapping(value = "/")
    public String home() {
        return "欢迎访问基于Docker的持续集成和持续交付项目样例";
    }

    /**
     * hello world
     *
     * @param name 姓名
     * @return 打招呼
     */
    @GetMapping(value = "/sayHi/{name}")
    public String sayHi(@PathVariable(name = "name") String name) {
        return String.format("hello World ! %s !", name);
    }
}

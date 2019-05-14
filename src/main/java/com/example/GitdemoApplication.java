package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class GitdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitdemoApplication.class, args);
    }

    @GetMapping("test")
    public String test(String arg) {
        System.out.println("arg:" + arg);
        return StringUtils.isEmpty(arg) ? "啊?谁叫我!" : arg.replaceAll("[?吗呀哟嘛]", "!").replaceAll("[!]+","!");
//return "我就是我,不一样的烟火";
    }

}

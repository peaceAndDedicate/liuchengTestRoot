package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("test1")
@Slf4j
public class Test1 {

    @GetMapping("funtion1")
    public String funtion1(HttpServletRequest req) {
        log.info(req.getRemoteAddr() + "在" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "访问了本机");
        return "欢迎进入刘呈的个人网站";
    }
}
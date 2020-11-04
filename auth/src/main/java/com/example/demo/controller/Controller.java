package com.example.demo.controller;

import com.example.demo.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("controller")
public class Controller {

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("funtion1")
    public String funtion1(HttpServletRequest req) {
        redisUtil.set("liucheng","123");
        log.info(req.getRemoteAddr() + "在" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "访问了本机");
        return "欢迎进入刘呈的个人网站，微服务名为auth";
    }
}
package com.kaijiyu.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)

    public String hello(HttpServletRequest request, HttpServletResponse response){


        return from;
    }
}

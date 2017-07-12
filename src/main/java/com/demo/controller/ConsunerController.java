package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.ConsumerService;

@Controller
public class ConsunerController {
    
    @Autowired
    private ConsumerService consumerService;
    
    @RequestMapping(value="/sayhello")
    public String sayHello(ModelMap model, HttpServletRequest request, HttpServletResponse response){
        consumerService.sayHello();
        return null;
    }
}

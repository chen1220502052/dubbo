package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class ConsumerServiceImpl implements ConsumerService{

    @Autowired
    private DemoService demoService;
    
    
    @Override
    public void sayHello(){
        System.out.println("hahhhhhhhhhhhhhhhhhhhhhahhahahahahhh");
        System.out.println(demoService.sayHello());
    }
    
    public static void main(String[] args){
        ///com.firsp/src/main/webapp/WEB-INF/
        String path = System.getProperty("user.dir");
        System.out.println(path);
        //D:\\myWorkplace\\com.firsp\\src\\main\\webapp\\WEB-INF\\applicationContext.xml
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/applicationContext-consumer.xml");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(demoService.sayHello());
//      timoRepository.deleteTimo(0);
    }
}

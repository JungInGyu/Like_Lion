package org.example.iocexam.controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.example.iocexam.domain.User;
import org.example.iocexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Resource
    private UserService userService;


    public UserController(UserService userService) {
        System.out.println("UserController 생성자 호출");
        this.userService = userService;
    }


    @PostConstruct
    public void init(){
        //해당 빈이 생성된 직후!! 호출해줌.
        System.out.println("postConstruct 실행!!");
    }

    @PreDestroy
    public void destroy(){
        //빈이 소멸되기 직전에 호출됨
        System.out.println("PreDestroy 실행!!");
    }


    public void joinUser(){
        //실제 동작 할 때는 사용자로 부터 정보를 받아 온다.
        User user = new User();
        user.setName("Jung");
        user.setEmail("dltnswn20@gmail.com");
        user.setPassword("1234");

        userService.joinUser(user);
    }
}

package com.third.shopping.controller;

import com.third.shopping.model.vo.LoginVO;
import com.third.shopping.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/member/login")
    public LoginVO login(LoginVO vo){
        return loginService.login(vo);
    }

}

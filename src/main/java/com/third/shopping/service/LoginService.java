package com.third.shopping.service;

import com.third.shopping.dao.LoginDAO;
import com.third.shopping.model.vo.InsertVO;
import com.third.shopping.model.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginDAO loginDAO;

    public LoginVO login(LoginVO vo) {
        return loginDAO.login(vo);
    }

}

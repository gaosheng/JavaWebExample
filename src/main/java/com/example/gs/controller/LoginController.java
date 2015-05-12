package com.example.gs.controller;

import com.example.gs.domain.LoginDO;
import com.example.gs.manager.LoginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginManager loginManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request){
        logger.info(request.getParameter("account"));
        logger.info(request.getParameter("password"));

        LoginDO loginDO = new LoginDO();
        loginDO.setAccount(request.getParameter("account"));
        loginDO.setPassword(request.getParameter("password"));
        loginManager.addLogin(loginDO);
        return "result";
    }

}

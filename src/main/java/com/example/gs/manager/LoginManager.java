package com.example.gs.manager;

import com.example.gs.dao.ILoginDAO;
import com.example.gs.domain.LoginDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginManager {

    @Autowired
    ILoginDAO iLoginDAO;

    public void addLogin(LoginDO loginDO){
        iLoginDAO.addLogin(loginDO);
    }

}

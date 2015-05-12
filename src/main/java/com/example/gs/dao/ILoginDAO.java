package com.example.gs.dao;

import com.example.gs.domain.LoginDO;
import org.apache.ibatis.annotations.Insert;

public interface ILoginDAO {


    @Insert("insert into test(account, password) values(#{account}, #{password})")
    public void addLogin(LoginDO loginDO);

}

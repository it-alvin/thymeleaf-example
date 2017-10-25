package com.alvin.controller;

import com.alvin.model.entity.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/index.html")
    public String index(ModelMap model) {
        List<UserAccount> uaList = new ArrayList<>();
        UserAccount ua = new UserAccount();
        ua.setRealname("黄河");
        ua.setGender(1);
        uaList.add(ua);
       
        ua = new UserAccount();
        ua.setRealname("长江");
        uaList.add(ua);
        
        model.put("uaList", uaList);
        return "thymeleafs/login";
    }
}

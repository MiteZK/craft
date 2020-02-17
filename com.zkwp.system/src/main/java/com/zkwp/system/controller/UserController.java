package com.zkwp.system.controller;

import com.zkwp.api.bean.User;
import com.zkwp.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @auther zhangkun
 * @date 2020/2/16 11:40
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

   @RequestMapping(value = "/addUser",method = RequestMethod.POST)
   public boolean addUser(User user){
       return userService.addUser(user);
   }

}

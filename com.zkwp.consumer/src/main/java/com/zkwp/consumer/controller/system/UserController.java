package com.zkwp.consumer.controller.system;

import com.zkwp.api.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zhangkun
 * @date 2020/2/16 11:10
 **/
@RestController(value = "/system")
public class UserController {
    private static final String REST_URL_PREFIX = "http://craft-system/craft/system";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user/add")
    public boolean addUser(User user){
        return restTemplate.postForObject(REST_URL_PREFIX+"/user/addUser",user,Boolean.class);
    }

}

package com.zkwp.consumer.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther zhangkun
 * @date 2020/2/16 15:01
 **/
@Controller
@RequestMapping(value = "/system")
public class IndexController {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}

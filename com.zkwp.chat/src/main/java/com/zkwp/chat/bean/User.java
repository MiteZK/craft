package com.zkwp.chat.bean;

import lombok.Data;

/**
 * @auther zhangkun
 * @date 2020/2/13 15:55
 **/
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String create;
    private String update;

}

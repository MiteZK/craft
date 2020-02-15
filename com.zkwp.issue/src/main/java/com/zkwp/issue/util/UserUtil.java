package com.zkwp.issue.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @auther zhangkun
 * @date 2020/2/14 9:14
 **/
public class UserUtil  {

    /**
     *  密码加密方法
     */
    public static String BCryptEncrypt(String password){
        if("".equals(password)||password==null){
            return null;
        }
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String newPassword = bCryptPasswordEncoder.encode(password);
        return newPassword;
    }

    public static void main(String[] args) {
       String pass = BCryptEncrypt("admin");
        System.out.println(pass);
    }

}

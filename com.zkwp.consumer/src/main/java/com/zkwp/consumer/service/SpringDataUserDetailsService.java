package com.zkwp.consumer.service;

import com.zkwp.api.bean.Permission;
import com.zkwp.consumer.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 **/
@Service
public class SpringDataUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        com.zkwp.api.bean.User user = userDao.getUserByUsername(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (user != null) {
            // 获取用户授权
            List<Permission> tbPermissions = userDao.findPermissionsByUserId(user.getId());

            // 声明用户授权
            tbPermissions.forEach(tbPermission -> {
                if (tbPermission != null && tbPermission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
        }

        // 由框架完成认证工作
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}

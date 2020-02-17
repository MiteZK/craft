package com.zkwp.system.dao;


import com.zkwp.api.bean.Permission;
import com.zkwp.api.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther zhangkun
 * @date 2020/2/13 16:07
 **/
@Mapper
public interface UserDao {

     User getUserByUsername(@Param("username") String username);

     List<Permission> findPermissionsByUserId(@Param("userId") String userId);

     Boolean addUser(User user);
}

package com.zkwp.issue.dao;

import com.zkwp.issue.bean.Permission;
import com.zkwp.issue.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther zhangkun
 * @date 2020/2/13 16:07
 **/
@Mapper
public interface UserDao {

    public User getUserByUsername(@Param("username") String username);

    public List<Permission> findPermissionsByUserId(@Param("userId") String userId);
}

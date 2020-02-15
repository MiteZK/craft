package com.zkwp.chat.bean;

import lombok.Data;

/**
 * @auther zhangkun
 * @date 2020/2/13 15:56
 **/
@Data
public class Permission {
    private String parentId;
    private String name;
    private String enname;
    private String url;
    private String description;
    private String created;
    private String updated;

}

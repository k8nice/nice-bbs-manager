package com.nice.domain;

import lombok.Data;

import java.util.Date;

/**
 * 用户组实体类
 * @author ningh
 */
@Data
public class UserGroup {
    private Long userGroupId;
    private String userGroupName;
    private Date userCreateDate;
    private Date userUpateDate;
    private Long roleId;
}

package com.nice.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 权限实体类
 * @author ningh
 */
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 1596431447278743306L;
    private Long roleId;
    private String roleName;
    private String roleCode;
    private String remark;
    private String roleCreate;
    private String roleUpdate;
    private Long operateId;
}

package com.nice.domain;

import lombok.Data;

import java.util.Date;

/**
 * 菜单实体类
 * @author ningh
 */
@Data
public class Menu
{
    private Long menuId;
    private String menuName;
    private String remark;
    private String icon;
    private String channel;
    private String param;
    private Boolean locked;
    private Long ordno;
    private Long nlevel;
    private Long scort;
    private Date menuCreateDate;
    private Date menuUpdateDate;
}

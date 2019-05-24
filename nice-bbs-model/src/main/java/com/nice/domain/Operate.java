package com.nice.domain;

import lombok.Data;

import java.util.Date;

/**
 * 选项类
 * @author ningh
 */
@Data
public class Operate {
    private Long operateId;
    private String operateAsName;
    private Long menuId;
    private String operateName;
    private String icon;
    private String remark;
    private Integer ordno;
    private Boolean display;
    private Date operateCreateDate;
    private Date operateUpdateDate;
}

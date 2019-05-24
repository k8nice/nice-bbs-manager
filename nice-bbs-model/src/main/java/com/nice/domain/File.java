package com.nice.domain;

import lombok.Data;

import java.util.Date;

/**
 * 文件实体类
 * @author ningh
 */
@Data
public class File {
    private Long fileId;
    private String fileName;
    private Date fileCreateDate;
    private Date fileUpdateDate;
    private String fileType;
    private String fileRemark;
}

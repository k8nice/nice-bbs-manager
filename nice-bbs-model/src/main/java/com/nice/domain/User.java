package com.nice.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -7020619477594468968L;
    private Long userId;
    private String userName;
    private Date userCreateDate;
    private Date userUpdateDate;
    private String userEmail;
    private String userPhone;
    private String userGender;
    private String userAge;
    private String roleName;
    private String salt;
}

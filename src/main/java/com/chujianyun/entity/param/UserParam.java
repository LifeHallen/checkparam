package com.chujianyun.entity.param;

import lombok.Data;

@Data
public class UserParam {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户姓名
     */
    private Long userName;
    /**
     * 等级
     */
    private Integer level;
    /**
     * 性别
     */
    private char gender;
}

package com.dongyc.demoSpringBoot;
/**
 * 测试 lombok Data 功能 使用
 */

import lombok.Data;

@Data
public class UserEenty
{
    private String User_Name;
    private Integer Age;
}

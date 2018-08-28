package com.logistics.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserQueryCondition {

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "用户年龄起始值")
    private int age;

    @ApiModelProperty(value = "用户年龄终止值")
    private int ageTo;

    private String xxx;
}

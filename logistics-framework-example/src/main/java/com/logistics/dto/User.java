package com.logistics.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.logistics.validater.MyConstraint;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.util.Date;

@Data
public class User {
    //数据显示视图
    public interface UserSimpleView {}
    public interface UserDetailView extends UserSimpleView{}

    @JsonView(UserSimpleView.class)
    private String id;

    @JsonView(UserSimpleView.class)
    @MyConstraint(message = "这是一个测试")
    private String username;

    @JsonView(UserDetailView.class)
    @NotBlank(message = "密码不能为空")
    private String password;

    @JsonView(UserSimpleView.class)
    @Past(message = "生日必须是过去的时间")
    private Date birthday;

}

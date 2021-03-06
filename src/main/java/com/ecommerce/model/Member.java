package com.ecommerce.model;

import lombok.Data; //用来自动生成get()和set()方法

/**
 * Created by lenovo on 2019/5/1.
 */
@Data   //使用lombok需要加上此注解
public class Member {
    private int id;	//会员编号
    private String account;	//会员账号
    private String pass;	//会员密码
    private String adds;	//会员地址
    private String mail;	//会员邮箱
    private String tel;		//会员电话
    private String regtime;	//注册时间
    private String postcode;//邮政编码
    private String name;	//会员姓名
}

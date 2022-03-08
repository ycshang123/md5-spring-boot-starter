package com.ycshang.boot.starter.service;

import com.ycshang.boot.starter.util.MD5Util;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-08 20:14
 **/
public class Md5Service {
    public String getMD5(String input) {
        return MD5Util.getMD5(input.getBytes());
    }
}
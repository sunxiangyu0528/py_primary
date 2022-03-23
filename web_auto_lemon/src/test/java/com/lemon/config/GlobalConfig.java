package com.lemon.config;

public class GlobalConfig {
    //测试浏览器名
    public static final String BROWSER_NAME="chrome";
    //后台地址
    public static final String BACKSTAGE_URL="http://120.78.128.25:8765";
    //后台登录地址
    public static final String BACKSTAGE_LOGIN_URL=BACKSTAGE_URL+"/Admin/Index/login.html";
    //后台首页地址
    public static final String BACKSTAGE_INDEX_URL=BACKSTAGE_URL+"/Admin/Index/main.html";
    //前台项目地址
    public static final String FRONT_URL="http://120.78.128.25:8765";
    //前台登录页面地址
    public static final String FRONT_LOGIN_URL=FRONT_URL+"/Index/login.html";
    //前台首页页面地址
    public static final String FROMT_INDEX_URL=FRONT_URL+"/Index/index.html";
}

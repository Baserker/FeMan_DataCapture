package com.capture.data.contants;

import java.util.ArrayList;
import java.util.List;

/**
 * 各大网站链接的枚举类和静态变量
 * 模块名称：demo com.capture.data.contants
 * 功能说明：<br>
 * 开发人员：Luzhengxian
 * 创建时间： 2019-04-09 15:05
 * 系统版本：1.0.0
 **/

public enum UrlContants {

    //dilidili的枚举
    DILIDILI("http://www.dilidili.name","嘀哩嘀哩链接","dilidili",1),

    //bilibili的枚举
    BILIBILI("https://www.bilibili.com/anime/index/#","bilibili","哔哩哔哩链接",0),

    //其他网站的枚举(暂定为风车动漫)
    ANOTHER("","","",0);

    private String url;

    private String name;

    private String key;

    private int sign;

    public static List<String> keyList=new ArrayList<>();

    static {
        keyList=getAllKey();
    }

    UrlContants(String url, String name, String key, int sign) {
        this.url = url;
        this.name = name;
        this.key = key;
        this.sign = sign;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    //获取所有的key
    private static List<String> getAllKey(){
        List<String> list=new ArrayList<>();
        for(UrlContants urlContants:UrlContants.values()){
            list.add(urlContants.getKey());
        }
        return list;
    }

    //根据key获取对应的url
    public static String getUrlByKey(String key){
        String url=null;
        for(UrlContants urlContants:UrlContants.values()){
            if(urlContants.getKey().equals(key)){
                url=urlContants.getUrl();
            }
        }
        return url;
    }
}
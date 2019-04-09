package com.capture.data.utils;

import httpUtils.HttpResult;
import httpUtils.httpClient.HttpUtil;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

/**
 * dilidli的页面请求解析工具类
 * 模块名称：commonutils com.capture.data.Utils
 * 功能说明：<br>
 * 开发人员：luzx
 * 创建时间： 2019-03-20 14:55
 * 系统版本：1.0.0
 **/

public class DlHttpUtils {

    private static final String ENC = "UTF-8";
    private static final String ENC_GBK = "GBK";

    public static Document requestHtml(String url){
        Document document=null;
        if(StringUtils.isNotEmpty(url)){
            HttpUtil httpUtil=HttpUtil.create();
            HttpResult httpResult = null;
            try {
                httpResult = httpUtil.get(url);
            } catch (Exception e) {
                e.printStackTrace();
                return document;
            }
            String result = httpResult.makeHtml(ENC);
            document = Jsoup.parse(result, "", Parser.xmlParser());
        }
        return document;
    }

    public static void main(String[] args) {
        String url="http://www.dilidili.name/riyu/";
        Document content=requestHtml(url);
        Elements animeEls=content.select(".anime_list");
        if(animeEls.size()>0){
            
        }
    }
}
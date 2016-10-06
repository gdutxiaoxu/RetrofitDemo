package com.szl.retrofitdemo;

import java.util.List;

/**
 * @ explain:
 * @ author：xujun on 2016-8-25 14:54
 * @ email：gdutxiaoxu@163.com
 */
public class News {


    public int code;
    public String msg;
    /**
     * ctime : 2016-10-01 18:13
     * title : 新加坡防长提南海争端：各国恐因渔船相持不下
     * description : 搜狐国际
     * picUrl : http://photocdn.sohu.com/20161001/Img469502343_ss.jpeg
     * url : http://news.sohu.com/20161001/n469502342.shtml
     */

    public List<NewslistBean> newslist;

    public static class NewslistBean {
        public String ctime;
        public String title;
        public String description;
        public String picUrl;
        public String url;

        @Override
        public String toString() {
            return "NewslistBean{" +
                    "ctime='" + ctime + '\'' +
                    ", title='" + title + '\'' +
                    ", description='" + description + '\'' +
                    ", picUrl='" + picUrl + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "News{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", newslist=" + newslist +
                '}';
    }
}

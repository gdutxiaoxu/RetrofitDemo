package com.szl.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    String num="10";
    String page="10";
    String type="tiyu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.init("mobileOa");
        NewsModel.getNews(num,page);
        NewsModel.getTiYu(type,num,page);
        NewsModel.postNews(num,page);
    }
}

package com.example.lenovo.day02.Okhttputil;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lenovo on 2017/8/11.
 */

public class Okhttputils {
    private final OkHttpClient client;
    private static Okhttputils utils;
    private Okhttputils(){
          client=new OkHttpClient.Builder().build();
    }
    public static Okhttputils getInstance(){
        if(utils==null){
            synchronized (Okhttputils.class){
                if (utils==null){
                    utils=new Okhttputils();
                }
            }
        }
        return utils;
    }
    public void get(String str, Callback callback){
        Request request=new Request.Builder().url(str).build();
        Call call = client.newCall(request);
        call.enqueue(callback);

    }
}

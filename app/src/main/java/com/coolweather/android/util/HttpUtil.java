package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOKHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();  //创建一个OKHttpClient的实例
        Request request = new Request.Builder().url(address).build();  //创建一个空的Request对象
        client.newCall(request).enqueue(callback);  //返回的数据为JSON格式的
    }
}

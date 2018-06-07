package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 使用Gson解析json成对象时默认的是将json里对应字段的值解析到java对象里对应字段的属性里面。
 * 然后我们经常会遇到我们自己定义的java对象里的属性名跟json里的字段名是不一样的，这种情况怎么办呢，
 * 这时我们就可以使用@SerializedName注解来将对象里的属性跟json里字段对应值匹配起来。
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

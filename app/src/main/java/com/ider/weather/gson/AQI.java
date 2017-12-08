package com.ider.weather.gson;

/**
 * Created by Eric on 2017/3/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

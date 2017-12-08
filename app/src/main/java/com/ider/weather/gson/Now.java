package com.ider.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eric on 2017/3/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}

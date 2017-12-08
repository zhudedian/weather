package com.ider.weather.util;


import org.json.JSONException;
import org.json.JSONObject;




/**
 * Created by Eric on 2017/12/8.
 */

public class CityUtil {

    private static String TAG = "CityUtil";
    public static String getLocalCity() {
        String jsonStr = NetUtil.getStringFromUrl("http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json");
        String city = null;
        if (jsonStr != null) {
            try {
                JSONObject jo = new JSONObject(jsonStr);
                city = jo.getString("city");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return city;
    }

}

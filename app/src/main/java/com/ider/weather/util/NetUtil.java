package com.ider.weather.util;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Eric on 2017/12/8.
 */

public class NetUtil {
    private static String TAG = "NetUtil";
    public static String getStringFromUrl(String strUrl) {
        Log.i(TAG, "getStringFromUrl: " + strUrl);
        InputStream in = null;
        String content = null;
        URL url;
        try {
            url = new URL(strUrl);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            in = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str = null;
            content = new String();
            while ((str = br.readLine()) != null) {
                content = content + str;
                str = null;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }
}

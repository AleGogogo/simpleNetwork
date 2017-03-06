package com.example.bluerain.verticalindicator.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by bluerain on 17-3-5.
 */

public class NetworkUtils {



    public static InputStream innerRequest(String url, HashMap<String, String> params, HashMap<String, String> header) {
        InputStream inputStream = null;

        try {
            URL u = new URL(url);
            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            con.setRequestMethod("POST");
            Set<String> headerSet = header.keySet();
            for (String h : headerSet) {
                con.setRequestProperty(h, header.get(h));
            }
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            if (200 == con.getResponseCode()) {
                inputStream = con.getInputStream();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputStream;
    }

    public static void jsonRequest(String url, HashMap<String, String> params, HashMap<String, String> header, JsonRequestListener listener) {

        InputStream inputStream = innerRequest(url, params, header);
        if (null != inputStream) {


        } else {
            listener.onError("error");
        }
    }


    public static void syncPostRequest(String url, HashMap<String, String> params, HashMap<String, String> header, PostStringListener listener) {

        StringBuilder build = new StringBuilder();

        try {

            URL u = new URL(url);
            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            con.setRequestMethod("POST");
            Set<String> headerSet = header.keySet();
            for (String h : headerSet) {
                con.setRequestProperty(h, header.get(h));
            }
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            InputStream inputStream = con.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            if (200 == con.getResponseCode()) {
                String tmp = null;
                while ((tmp = reader.readLine()) != null) {
                    build.append(tmp);
                }
                listener.onSuccess(build.toString());
            } else {
                listener.onError("err,code is [" + con.getResponseCode() + "]");
            }
        } catch (Exception e) {
            listener.onError("other error");
        }
    }

    public static void asyncPostRequest(final String url, final HashMap<String, String> params, final HashMap<String, String> header, final PostStringListener listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                syncPostRequest(url, params, header, listener);
            }
        }).start();
    }


    public interface PostStringListener {
        void onSuccess(String response);

        void onError(String errInfo);
    }

    public static abstract class JsonRequestListener<T> {

        public abstract void onSuccess(T response);

        public abstract void onError(String errInfo);

        protected abstract void test(String errInfo);
    }
}

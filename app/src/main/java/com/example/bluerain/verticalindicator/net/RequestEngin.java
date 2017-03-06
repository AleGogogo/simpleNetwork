package com.example.bluerain.verticalindicator.net;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by bluerain on 17-3-5.
 */

public class RequestEngin implements Runnable {
    private Request mRequest;

    public RequestEngin(Request request) {
        mRequest = request;
    }

    public Request getmRequest() {
        return mRequest;
    }

    @Override
    public void run() {
        HashMap<String, String> header = mRequest.getmHeader();
        InputStream inputStream = null;
        try {
            URL u = new URL(mRequest.getUrl());
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
                mRequest.parasResponse(inputStream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

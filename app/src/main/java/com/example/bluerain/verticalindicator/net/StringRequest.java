package com.example.bluerain.verticalindicator.net;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by bluerain on 17-3-5.
 */

public class StringRequest extends Request {
    public StringRequest(String url, HashMap<String, String> mHeader, HashMap<String, String> mParams, int mPrority) {
        super(url, mHeader, mParams, mPrority);
    }

    @Override
    protected String onParasResponse(InputStream inputStream) {
        try {
            StringBuilder build = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String tmp = null;
            while ((tmp = reader.readLine()) != null) {
                build.append(tmp);
            }
            Log.d("TAG", "onParasResponse: " + build.toString());
            return build.toString();
        } catch (Exception e) {

        }
        return null;
    }
}

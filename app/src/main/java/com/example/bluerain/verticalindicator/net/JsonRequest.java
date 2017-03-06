package com.example.bluerain.verticalindicator.net;

import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by bluerain on 17-3-5.
 */

public class JsonRequest<T> extends Request {
    public JsonRequest(String url, HashMap<String, String> mHeader, HashMap<String, String> mParams, int mPrority) {
        super(url, mHeader, mParams, mPrority);
    }

    @Override
    protected T onParasResponse(InputStream inputStream) {

        //

        return null;
    }
}

package com.example.bluerain.verticalindicator.net;

import android.graphics.Bitmap;

import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by bluerain on 17-3-5.
 */

public class BitmapRequest extends Request {
    public BitmapRequest(String url, HashMap<String, String> mHeader, HashMap<String, String> mParams, int mPrority) {
        super(url, mHeader, mParams, mPrority);
    }

    @Override
    protected Bitmap onParasResponse(InputStream inputStream) {
        // TODO: 17-3-5  
        return null;
    }
}

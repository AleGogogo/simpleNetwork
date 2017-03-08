package com.example.bluerain.verticalindicator.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 * Created by LYW on 2017/3/7.
 */

public abstract class AbstractHttpResponse  implements HttpResponse {
    private static final String GZIP = "gzip";
    private GZIPInputStream mGzipInputStream;
    @Override
    public InputStream getBody() throws IOException {
           InputStream body = getBodyInternal();
           if (isGzip()){
               return  getGzipBody(body);
           }
        return body;
    }
    public InputStream getGzipBody(InputStream body) throws IOException {
           if (this.mGzipInputStream == null){
                 mGzipInputStream = new GZIPInputStream(body);
           }
        return mGzipInputStream;
    }
   //为什么要这样
    protected abstract InputStream getBodyInternal();
    public boolean isGzip(){
        if (getHeader().getContentEncoding().equals(GZIP)){
             return true;
        }
        return false;
    }

    @Override
    public void close() throws IOException {
        if (mGzipInputStream != null){
                mGzipInputStream.close();
        }
          closeInternal();
    }

    protected abstract void closeInternal();

    @Override
    public HttpStatus getStatus() {
        return null;
    }
}

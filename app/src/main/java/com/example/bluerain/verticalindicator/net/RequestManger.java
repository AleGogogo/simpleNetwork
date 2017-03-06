package com.example.bluerain.verticalindicator.net;

import java.net.PortUnreachableException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by bluerain on 17-3-5.
 */

public class RequestManger {

    public static final int DEFALT_THRAD_NUM = 5;
    private static RequestManger INSATANCE;


    private PriorityBlockingQueue<Request> mRequstQueue;

    private int threadNum;
    private ThreadPoolExecutor mThreadPoolExecutor;

    private RequestManger() {
        mRequstQueue = new PriorityBlockingQueue<>();
        mThreadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(DEFALT_THRAD_NUM);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Request request = mRequstQueue.take();
                        mThreadPoolExecutor.execute(new RequestEngin(request));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        //
    }

    public synchronized static RequestManger getInstance() {
        if (null == INSATANCE)
            INSATANCE = new RequestManger();
        return INSATANCE;
    }

    public void addRequest(Request request, Request.Listener listener) {
        request.setListner(listener);
        mRequstQueue.put(request);
    }

    public void setThradNum(int num) {
        threadNum = num;
        mThreadPoolExecutor.setCorePoolSize(num);
    }

    public void cancleRequest(Request request) {
        if (mRequstQueue.contains(request))
            request.cancle();
    }

}

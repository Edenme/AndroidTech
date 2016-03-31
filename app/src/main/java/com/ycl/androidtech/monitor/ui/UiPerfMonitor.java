package com.ycl.androidtech.monitor.ui;

import android.os.Looper;

/**
 * Created by yuchengluo on 2016/3/31.
 * UI���ټ�ع�����
 */
public class UiPerfMonitor implements UiPerfMonitorConfig{
    private static UiPerfMonitor mInstance = null;
    private LogPrinter looperPrinter;
    public synchronized static UiPerfMonitor getmInstance(){
        if(null == mInstance){
            mInstance = new UiPerfMonitor();
        }
        return mInstance;
    }

    //��ʼ��
    public UiPerfMonitor(){
        init();
    }

    public void startMonitor(){
        Looper.getMainLooper().setMessageLogging(looperPrinter);
    }
    private void init(){

    }
    private void initLogpath(){

    }
}

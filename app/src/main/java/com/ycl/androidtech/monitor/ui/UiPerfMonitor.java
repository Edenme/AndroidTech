package com.ycl.androidtech.monitor.ui;

import android.os.Looper;

import java.io.File;

/**
 * Created by yuchengluo on 2016/3/31.
 * UI���ټ�ع�����
 */
public class UiPerfMonitor implements UiPerfMonitorConfig,LogPrinterListener{
    private static UiPerfMonitor mInstance = null;
    private LogPrinter mLogPrinter;
    public synchronized static UiPerfMonitor getmInstance(){
        if(null == mInstance){
            mInstance = new UiPerfMonitor();
        }
        return mInstance;
    }

    //��ʼ��
    public UiPerfMonitor(){
        mLogPrinter = new LogPrinter(this);
        initLogpath();
    }

    public void startMonitor(){
        Looper.getMainLooper().setMessageLogging(mLogPrinter);
    }
    public void stopMonitor(){
        Looper.getMainLooper().setMessageLogging(null);
    }
    //��ʼ����־·��
    private void initLogpath(){
        File logpath = new File(LOG_PATH);
        if(!logpath.exists()){
            logpath.mkdir();
        }
    }

    @Override
    public void onWaringLevel1(String loginfo, long time) {

    }

    @Override
    public void onWaringLevel2(String loginfo, long time) {

    }
}

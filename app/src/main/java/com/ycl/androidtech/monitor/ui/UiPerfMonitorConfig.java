package com.ycl.androidtech.monitor.ui;

import android.os.Environment;

/**
 * Created by yuchengluo on 2016/3/31.
 */
public interface UiPerfMonitorConfig {
    public int WARNING_TIME = 100;   //���忨�ٿ�����ֵ
    public int DUMP_THREAD_INFO_TIME = 300;//��Ҫ�ϱ��߳���Ϣ��ֵ
    public String LOG_PATH = Environment.getExternalStorageDirectory().getPath() + "androidtech/uiperf";
}

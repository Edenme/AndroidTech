package com.ycl.androidtech.monitor.ui;

import android.os.Environment;

/**
 * Created by yuchengluo on 2016/3/31.
 */
public interface UiPerfMonitorConfig {
    public int TIME_WARNING_LEVEL_1 = 100;   //���忨�ٿ�����ֵ
    public int TIME_WARNING_LEVEL_2 = 300;//��Ҫ�ϱ��߳���Ϣ��ֵ
    public String LOG_PATH = Environment.getExternalStorageDirectory().getPath() + "androidtech/uiperf";
}

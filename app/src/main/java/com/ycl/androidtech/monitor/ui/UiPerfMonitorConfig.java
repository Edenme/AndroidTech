package com.ycl.androidtech.monitor.ui;

import android.os.Environment;

/**
 * Created by yuchengluo on 2016/3/31.
 */
public interface UiPerfMonitorConfig {

    //�澯��ֵ���趨
    public int TIME_WARNING_LEVEL_1 = 100;   //���忨�ٿ�����ֵ
    public int TIME_WARNING_LEVEL_2 = 300;//��Ҫ�ϱ��߳���Ϣ��ֵ
    //���ټ��� 0 �޿���
    public int UI_PERF_LEVEL_0 = 0;
    public int UI_PERF_LEVEL_1 = 1;
    public int UI_PERF_LEVEL_2 = 2;
    //�����״̬
    public int UI_PERF_MONITER_START = 0x01;
    public int UI_PERF_MONITER_STOP = 0x01 << 1;

    public String LOG_PATH = Environment.getExternalStorageDirectory().getPath() + "androidtech/uiperf";
}

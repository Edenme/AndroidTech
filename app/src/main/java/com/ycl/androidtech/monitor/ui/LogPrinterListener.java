package com.ycl.androidtech.monitor.ui;

/**
 * Created by yuchengluo on 2016/4/1.
 */
public interface LogPrinterListener {
    void onWaringLevel1(String loginfo,long time);//һ�龯��
    void onWaringLevel2(String loginfo,long time);//���龯�棬�����أ�������dump������Ϣ
}

package com.ycl.androidtech.monitor.ui.sampling;

/**
 * Created by yuchengluo on 2016/4/5.
 * CPU��Ϣ���ݽṹ
 */
public class CpuInfo {
    public long mId = 0;//һ��CPU��Ϣ��ID
    public long mCpuRate = 0;//�ܵ�CPUʹ����
    public long mAppRate = 0;//��ǰapp CPUʹ����
    public long mUserRate = 0;//�û�����
    public long mSystemRate = 0;//ϵͳ����
    public long mIoWait = 0;//�ȴ�ʱ��
    public CpuInfo(long id) {
        mId = id;
    }
    public String toString() {
        StringBuffer mci = new StringBuffer();
        mci.append("cpu:").append(mCpuRate).append("% ");
        mci.append("app:").append(mAppRate).append("% ");
        mci.append("[").append("user:").append(mUserRate).append("% ");
        mci.append("system:").append(mSystemRate).append("% ");
        mci.append("ioWait:").append(mIoWait).append("% ]");
        return mci.toString();
    }
}

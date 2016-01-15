package com.mazouri.fresco.utils.log;

import android.util.Log;

import java.util.Hashtable;

/**
 * Created by wangdong on 16-1-5.
 */
public class FrescoLogHelper {

    private static final String TAG = FrescoLogHelper.class.getSimpleName();

    //private boolean mIsLoggerEnable = true;
    private String mClassName;

    private static Hashtable<String, FrescoLogHelper> sLoggerTable;
    static {
        sLoggerTable = new Hashtable<String, FrescoLogHelper>();
    }

    public static FrescoLogHelper getLogger(String className) {
        FrescoLogHelper logger = (FrescoLogHelper)sLoggerTable.get(className);
        if(logger == null) {
            logger = new FrescoLogHelper(className);
            sLoggerTable.put(className, logger);
        }
        return logger;
    }

    private FrescoLogHelper(String name) {
        mClassName = name;
    }

    public void v(String log) {
        if(FrescoLog.DEBUG){
            FrescoLog.v(TAG, "{Thread:" + Thread.currentThread().getName() + "}" + "[" + mClassName + ":] " + log);
        }
    }

    public void d(String log) {
        if(FrescoLog.DEBUG){
            FrescoLog.d(TAG, "{Thread:" + Thread.currentThread().getName() + "}" + "[" + mClassName + ":] " + log);
        }
    }

    public void i(String log) {
        if(FrescoLog.DEBUG){
            FrescoLog.i(TAG, "{Thread:" + Thread.currentThread().getName() + "}" + "[" + mClassName + ":] " + log);
        }
    }

    public void i(String log, Throwable tr) {
        if(FrescoLog.DEBUG){
            FrescoLog.i(TAG, "{Thread:" + Thread.currentThread().getName() + "}" + "[" + mClassName + ":] " + log + "\n" + Log.getStackTraceString(tr));
        }
    }

    public void w(String log) {
        if(FrescoLog.DEBUG){
            FrescoLog.w(TAG, "{Thread:" + Thread.currentThread().getName() + "}" + "[" + mClassName + ":] " + log);
        }
    }

    public void w(String log, Throwable tr) {
        if(FrescoLog.DEBUG){
            FrescoLog.w(TAG, "{Thread:" + Thread.currentThread().getName() + "}" + "[" + mClassName + ":] " + log + "\n" + Log.getStackTraceString(tr));
        }
    }

    public void e(String log) {
        if(FrescoLog.DEBUG){
            FrescoLog.e(TAG, "{Thread:" + Thread.currentThread().getName() + "}" + "[" + mClassName + ":] " + log);
        }
    }

    public void e(String log, Throwable tr) {
        if(FrescoLog.DEBUG){
            FrescoLog.e(TAG, "{Thread:" + Thread.currentThread().getName() + "}" + "[" + mClassName + ":] " + log + "\n" + Log.getStackTraceString(tr));
        }
    }
}

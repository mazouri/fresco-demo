package com.mazouri.fresco.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.mazouri.fresco.utils.log.FrescoLog;
import com.mazouri.fresco.utils.log.FrescoLogHelper;

/**
 * Created by wangdong on 16-1-5.
 */
public class FrescoApp extends Application{

    private static final String TAG = FrescoLogHelper.class.getSimpleName();
    private static FrescoApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;

        //add for init fresco
        Fresco.initialize(this);
    }

    public static FrescoApp get(Context context) {
        return (FrescoApp) context.getApplicationContext();
    }

    public static FrescoApp getInstance() {
        return mInstance;
    }

    @Override
    public void onTerminate() {
        if (FrescoLog.DEBUG) {
            FrescoLog.d(TAG, "onTerminate called");
        }

        super.onTerminate();

        System.exit(0);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        // TODO Auto-generated method stub
        super.onConfigurationChanged(newConfig);
    }
}

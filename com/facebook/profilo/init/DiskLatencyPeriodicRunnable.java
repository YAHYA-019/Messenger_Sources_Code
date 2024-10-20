package com.facebook.profilo.init;

import X.0Gw;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: DiskLatencyPeriodicRunnable.class */
public class DiskLatencyPeriodicRunnable implements Runnable {
    public String LOG_TAG;
    public HybridData mHybridData;
    public String mTestFilePath;

    public static native HybridData initHybrid(MultiBufferLogger multiBufferLogger);

    public native void logDiskLatency(String str);

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = this.mTestFilePath;
            if (str == null) {
                str = new File(0Gw.A00().A03.A06, "disk_latency_test.bin").getCanonicalPath();
                this.mTestFilePath = str;
            }
            logDiskLatency(str);
        } catch (IOException e) {
            Log.e("DiskLatencyPeriodicRunnable", "failed to logDiskLatency", e);
        }
    }
}

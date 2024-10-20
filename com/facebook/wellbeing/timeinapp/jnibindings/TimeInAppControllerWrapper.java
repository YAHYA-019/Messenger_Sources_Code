package com.facebook.wellbeing.timeinapp.jnibindings;

import X.C0il;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: TimeInAppControllerWrapper.class */
public class TimeInAppControllerWrapper {
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("timeinapp-jni");
    }

    private native void dispatchHybrid(int i);

    private native void dispatchWithTimestampHybrid(int i, long j);

    private native void initControllerHybrid(ScheduledExecutorService scheduledExecutorService, SQLiteDatabase sQLiteDatabase, XAnalyticsHolder xAnalyticsHolder, int i, int i2);

    public static native HybridData initHybrid();

    private native void queryIntervalsHybrid(long j, long j2, TimeInAppIntervalList timeInAppIntervalList);

    private native void queryIntervalsWithEventHybrid(long j, long j2, TimeInAppIntervalWithEventList timeInAppIntervalWithEventList);

    public native String getCurrentState();

    public native int[] getDailyTimeInApp(long j);

    public native int[] getDailyTimeInAppUtc(long j, long j2);

    public native long getTimeInApp(long j, long j2);

    public native void setReminder(TimeInAppReminder timeInAppReminder, int i);

    public native void setSessionTrigger(String str, int i, TimeInAppReminder timeInAppReminder);

    public native void setValidateHeartBeatGap(boolean z);
}

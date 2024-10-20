package com.facebook.onecamera.components.logging.xlogger.ar;

import X.0fH;
import X.C0il;
import X.GOo;
import X.GOp;
import X.JKI;
import android.os.SystemClock;
import com.facebook.jni.HybridData;

/* loaded from: OneCameraARXLoggerImpl.class */
public class OneCameraARXLoggerImpl implements JKI {
    public static final String TAG = "OneCameraARXLoggerImpl";
    public HybridData mHybridData;

    public OneCameraARXLoggerImpl() {
        HybridData hybridData;
        if (GOo.A1T()) {
            hybridData = null;
        } else {
            loadSoLibrary();
            hybridData = initHybrid();
        }
        this.mHybridData = hybridData;
    }

    private native void createStandaloneOneCameraARXLoggerInternal();

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static native HybridData initHybrid();

    public static void loadSoLibrary() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C0il.A0B("spark-ocarxlogger-native");
        0fH.A0g(GOp.A14((float) (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos)), TAG, "OneCameraARXLogger load .so spark-ocarxlogger-native time = %f ms");
    }

    private native boolean onEventInternal(int i, String str, boolean z);

    private native boolean onFailureEventInternal(int i, String str, String str2, int i2, String str3);

    private native boolean onStartEventInternal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native void updateAnnotationInternal(String str, String str2, String str3);

    public void createStandaloneOneCameraARXLogger() {
        createStandaloneOneCameraARXLoggerInternal();
    }

    @Override // X.JKI
    public boolean onEvent(int i, String str, boolean z) {
        return onEventInternal(i, str, z);
    }

    @Override // X.JKI
    public boolean onFailureEvent(int i, String str, String str2, int i2, String str3) {
        return onFailureEventInternal(i, str, str2, i2, str3);
    }

    public boolean onStartEvent(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return onStartEventInternal(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // X.JKI
    public void updateAnnotation(String str, String str2, String str3) {
        updateAnnotationInternal(str, str2, str3);
    }
}

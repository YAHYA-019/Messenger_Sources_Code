package com.facebook.onecamera.components.logging.xlogger.cppimpl;

import X.0fH;
import X.4EW;
import X.C0il;
import X.C3o5;
import X.GOo;
import X.GOp;
import X.JKI;
import X.JMP;
import android.os.SystemClock;
import com.facebook.jni.HybridData;
import com.facebook.onecamera.components.logging.xlogger.ar.OneCameraARXLoggerImpl;
import java.util.List;

/* loaded from: OneCameraXLoggerCpp.class */
public class OneCameraXLoggerCpp implements JMP {
    public static final String TAG = "OneCameraXLoggerCpp";
    public final boolean mEnableLazyLoad;
    public HybridData mHybridData;
    public volatile boolean mIsNativeLibLoadedAndInit = false;

    public OneCameraXLoggerCpp(boolean z) {
        this.mEnableLazyLoad = z;
        4EW.A00();
        if (GOo.A1T()) {
            this.mHybridData = null;
        } else {
            if (z) {
                return;
            }
            initNative();
        }
    }

    private native String getActiveSessionIdInternal();

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    private native String getRecordingSessionIdInternal();

    public static native HybridData initHybrid();

    private native void initializeOneCameraARXLogger(OneCameraARXLoggerImpl oneCameraARXLoggerImpl);

    public static void loadSoLibrary() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C0il.A0B("spark-ocxlogger-native");
        0fH.A0d(GOp.A14((float) (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos)), Thread.currentThread(), TAG, "OneCameraXLogger load .so spark-ocxlogger-native time = %f ms in %s");
    }

    private native void onAnnotationUpdateEventInternal(int i, String str);

    private native String onEventInternal(int i, int i2, String str, String str2, String str3, int i3, String[] strArr, String[] strArr2, String[] strArr3, long j, long j2, long j3, int i4, boolean z, boolean z2, boolean z3);

    private native String onFailureEventInternal(int i, int i2, String str, String str2);

    private native String onPostCaptureEventInternal(int i, int i2, String str, String str2, int i3);

    public JKI createOneCameraARXLogger() {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        OneCameraARXLoggerImpl oneCameraARXLoggerImpl = new OneCameraARXLoggerImpl();
        initializeOneCameraARXLogger(oneCameraARXLoggerImpl);
        return oneCameraARXLoggerImpl;
    }

    public String getActiveSessionId() {
        return GOo.A1T() ? "mock_for_test" : this.mIsNativeLibLoadedAndInit ? getActiveSessionIdInternal() : "Hybrid_Not_Init";
    }

    public String getRecordingSessionId() {
        return GOo.A1T() ? "mock_for_test" : this.mIsNativeLibLoadedAndInit ? getRecordingSessionIdInternal() : "Hybrid_Not_Init";
    }

    public void initNative() {
        if (this.mIsNativeLibLoadedAndInit) {
            return;
        }
        synchronized (this) {
            if (!this.mIsNativeLibLoadedAndInit) {
                loadSoLibrary();
                this.mHybridData = initHybrid();
                this.mIsNativeLibLoadedAndInit = true;
            }
        }
    }

    public void onAnnotationUpdateEvent(int i, String str) {
        if (GOo.A1T()) {
            return;
        }
        if (this.mEnableLazyLoad) {
            initNative();
        }
        onAnnotationUpdateEventInternal(i, str);
    }

    public String onEvent(int i, int i2, String str, String str2, String str3, int i3, List list, List list2, List list3, long j, long j2, long j3, int i4, boolean z, boolean z2, boolean z3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        String[] strArr = null;
        String[] A0n = list != null ? C3o5.A0n(list) : null;
        String[] A0n2 = list2 != null ? C3o5.A0n(list2) : null;
        if (list3 != null) {
            strArr = C3o5.A0n(list3);
        }
        return onEventInternal(i, i2, str, str2, str3, i3, A0n, A0n2, strArr, j, j2, j3, i4, z, z2, z3);
    }

    public String onFailureEvent(int i, int i2, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return onFailureEventInternal(i, i2, str, str2);
    }

    public String onPostCaptureEvent(int i, int i2, String str, String str2, int i3) {
        if (GOo.A1T()) {
            return "mock_for_test";
        }
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return onPostCaptureEventInternal(i, i2, str, str2, i3);
    }
}

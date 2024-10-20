package com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl;

import X.0fH;
import X.4EW;
import X.AnonymousClass001;
import X.C0il;
import X.GOo;
import X.GOp;
import X.JDE;
import X.JNI;
import android.os.SystemClock;
import com.facebook.jni.HybridData;

/* loaded from: QPLUserFlowImpl.class */
public class QPLUserFlowImpl implements JNI {
    public static final String TAG = "QPLUserFlowImpl";
    public final boolean mEnableLazyLoad;
    public HybridData mHybridData;
    public volatile boolean mIsNativeLibLoadedAndInit = false;

    public QPLUserFlowImpl(boolean z) {
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

    private native void annotateInternal(long j, String str, String str2, boolean z, String str3);

    private native void endCancelInternal(long j, String str, String str2);

    private native void endFailInternal(long j, String str, int i, String str2, String str3);

    private native void endSuccessInternal(long j, String str);

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static native HybridData initHybrid();

    private void initNative() {
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

    private native long instanceIdWithStringInternal(int i, String str);

    public static void loadSoLibrary() {
        C0il.A0B("spark-qpluserflow-native");
        0fH.A0g(GOp.A14(0.0f), TAG, "QPLUserFlow load .so spark-qpluserflow-native time = %f ms");
    }

    private native void markPointInternal(long j, int i, String str);

    private native long startInternal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native void startWithFlowInstanceIdInternal(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public void annotate(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, false, "");
    }

    public void annotate(long j, String str, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, false, str3);
    }

    public void annotateWithCrucialData(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, true, "");
    }

    public void annotateWithCrucialData(long j, String str, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, true, str3);
    }

    public void endCancel(long j, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endCancelInternal(j, str, "");
    }

    public void endCancel(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endCancelInternal(j, str, str2);
    }

    public void endFail(long j, String str, int i, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endFailInternal(j, str, i, str2, "");
    }

    public void endFail(long j, String str, int i, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endFailInternal(j, str, i, str2, str3);
    }

    public void endSuccess(long j) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endSuccessInternal(j, "");
    }

    public void endSuccess(long j, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endSuccessInternal(j, str);
    }

    public long getInstanceIdWithString(int i, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return instanceIdWithStringInternal(i, str);
    }

    public void markPoint(long j, int i) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        markPointInternal(j, i, "");
    }

    public void markPoint(long j, int i, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        markPointInternal(j, i, str);
    }

    public long start(int i, JDE jde, long j) {
        throw AnonymousClass001.A0T("Not yet implemented");
    }

    public long start(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return startInternal(i, str, str2, str3, str4, str5, str6, str7);
    }

    public void startWithFlowInstanceId(long j, JDE jde, long j2) {
        throw AnonymousClass001.A0T("Not yet implemented");
    }

    public void startWithFlowInstanceId(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        startWithFlowInstanceIdInternal(j, str, str2, str3, str4, str5, str6, str7);
    }
}

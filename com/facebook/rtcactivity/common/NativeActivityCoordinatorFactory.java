package com.facebook.rtcactivity.common;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.rtcactivity.interfaces.DataSender;
import com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorCallback;
import com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger;

/* loaded from: NativeActivityCoordinatorFactory.class */
public class NativeActivityCoordinatorFactory implements NativeComponentFactory {
    public final HybridData mHybridData;

    static {
        C0il.A0B("rtcactivity");
    }

    public NativeActivityCoordinatorFactory(String str, RtcActivityCoordinatorCallback rtcActivityCoordinatorCallback, DataSender dataSender, RtcActivityCoordinatorLogger rtcActivityCoordinatorLogger) {
        this.mHybridData = initHybrid(str, rtcActivityCoordinatorCallback, dataSender, rtcActivityCoordinatorLogger);
    }

    private native NativeComponentHolder createNativeActivityCoordinator();

    public static native HybridData initHybrid(String str, RtcActivityCoordinatorCallback rtcActivityCoordinatorCallback, DataSender dataSender, RtcActivityCoordinatorLogger rtcActivityCoordinatorLogger);

    public NativeComponentHolder create() {
        return createNativeActivityCoordinator();
    }
}

package com.facebook.realtime.common.appstate;

import X.C0il;
import X.EnumC05854f5;
import com.facebook.jni.HybridData;

/* loaded from: AppStateSyncer.class */
public class AppStateSyncer {
    public final HybridData mHybridData;

    static {
        C0il.A0B("appstatesyncer_jni");
    }

    public AppStateSyncer(AppStateGetter appStateGetter) {
        this.mHybridData = initHybrid(appStateGetter);
    }

    public static native HybridData initHybrid(AppStateGetter appStateGetter);

    private native void notifyForegroundStateChange(int i);

    public void notifyForegroundStateChange(EnumC05854f5 enumC05854f5) {
        notifyForegroundStateChange(enumC05854f5.value);
    }

    public native void notifyNetworkStateChange(boolean z);

    public native void notifyNewInterface(long j, int i);
}

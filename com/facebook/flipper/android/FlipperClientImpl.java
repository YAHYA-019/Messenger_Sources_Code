package com.facebook.flipper.android;

import X.GOn;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperStateUpdateListener;
import com.facebook.flipper.core.StateSummary;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: FlipperClientImpl.class */
public class FlipperClientImpl {
    public final Map A00 = GOn.A1E(8);
    public final HybridData mHybridData;

    public FlipperClientImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static native FlipperClientImpl getInstance();

    public static native void init(EventBase eventBase, EventBase eventBase2, int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public native void addPluginNative(FlipperPlugin flipperPlugin);

    public native FlipperPlugin getPlugin(String str);

    public native String getState();

    public native StateSummary getStateSummary();

    public native boolean isConnected();

    public native void removePluginNative(FlipperPlugin flipperPlugin);

    public native void start();

    public native void stop();

    public native void subscribeForUpdates(FlipperStateUpdateListener flipperStateUpdateListener);

    public native void unsubscribe();
}

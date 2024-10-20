package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource;
import com.facebook.wearable.common.comms.rtc.hera.intf.IVideoSender;

/* loaded from: NativeVideoSender.class */
public final class NativeVideoSender implements IVideoSender {
    public boolean enableBwe;
    public final HybridData mHybridData;
    public final int streamId;

    public NativeVideoSender(int i, IRawVideoSource iRawVideoSource) {
        11T.A0F(iRawVideoSource, 2);
        this.streamId = i;
        HeraNativeLoader.load();
        this.mHybridData = initHybrid(this.streamId, iRawVideoSource);
        this.enableBwe = true;
    }

    private final native void activateNative(boolean z);

    private final native void deactivateNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, IRawVideoSource iRawVideoSource);

    @Override // X.JKh
    public void activate() {
        activateNative(this.enableBwe);
    }

    @Override // X.JKh
    public void deactivate() {
        deactivateNative();
    }

    @Override // X.JKh
    public native String getDebugStats();

    public final boolean getEnableBwe() {
        return this.enableBwe;
    }

    public int getStreamId() {
        return this.streamId;
    }

    public final void setEnableBwe(boolean z) {
        this.enableBwe = z;
    }
}

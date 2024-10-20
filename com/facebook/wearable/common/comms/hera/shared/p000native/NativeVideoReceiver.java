package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.AnonymousClass001;
import X.C00m;
import X.JDc;
import X.JQd;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;
import com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink;
import com.facebook.wearable.common.comms.rtc.hera.intf.IVideoReceiver;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: NativeVideoReceiver.class */
public final class NativeVideoReceiver implements IVideoReceiver {
    public final JQd encodedFrameCallback;
    public C00m frameListener;
    public final HybridData mHybridData;
    public JDc onStreamEnded;
    public final int streamId;
    public final boolean useSgVideoDecoder;

    public NativeVideoReceiver(int i, ISurfaceVideoSink iSurfaceVideoSink, JQd jQd, int i2, boolean z) {
        this.streamId = i;
        this.encodedFrameCallback = jQd;
        this.useSgVideoDecoder = z;
        HeraNativeLoader.load();
        if (iSurfaceVideoSink == null && jQd == null && i2 == -1) {
            throw AnonymousClass001.A0L("At least one of rawVideoSink, encodedFrameListener or outputFileDescriptor must be non-null/not -1.");
        }
        this.mHybridData = initHybrid(this.streamId, iSurfaceVideoSink, AnonymousClass001.A1T(jQd), i2);
    }

    public /* synthetic */ NativeVideoReceiver(int i, ISurfaceVideoSink iSurfaceVideoSink, JQd jQd, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, iSurfaceVideoSink, jQd, i2, (i3 & 16) != 0 ? false : z);
    }

    private final native void connectNative(int i, int i2, int i3, int i4, int i5, boolean z);

    private final native void disconnectNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, ISurfaceVideoSink iSurfaceVideoSink, boolean z, int i2);

    private final void onEncodedFrame(IManagedByteBufferPool.IBuffer iBuffer, int i, int i2, long j) {
    }

    private final void onFrameRendered() {
        C00m c00m = this.frameListener;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    private final void onStreamEnded() {
    }

    private final native void requestStopNative();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IVideoReceiver
    public void connect(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        connectNative(num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0, num4 != null ? num4.intValue() : 0, num5 != null ? num5.intValue() : 0, this.useSgVideoDecoder);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IVideoReceiver
    public void disconnect() {
        disconnectNative();
    }

    @Override // X.JHC
    public native String getDebugStats();

    public C00m getFrameListener() {
        return this.frameListener;
    }

    public JDc getOnStreamEnded() {
        return null;
    }

    public int getStreamId() {
        return this.streamId;
    }

    public void requestStop() {
        requestStopNative();
    }

    public void setFrameListener(C00m c00m) {
        this.frameListener = c00m;
    }

    public void setOnStreamEnded(JDc jDc) {
        this.onStreamEnded = jDc;
    }
}

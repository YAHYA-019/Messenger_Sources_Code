package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import X.Ikd;
import X.JDX;
import X.JHD;
import X.JHE;
import X.JJN;
import X.JLU;
import X.JLV;
import X.JO6;
import com.facebook.jni.HybridData;
import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IAudioReceiver;
import com.facebook.wearable.common.comms.rtc.hera.intf.IAudioSender;
import com.facebook.wearable.common.comms.rtc.hera.intf.IVideoReceiver;
import com.facebook.wearable.common.comms.rtc.hera.intf.IVideoSender;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: NativeLinkMultiplexer.class */
public final class NativeLinkMultiplexer implements JJN, JLU, JLV, JHE {
    public final HybridData mHybridData;
    public JO6 onCoordinationCallback;
    public JDX onLoggingCallback;
    public JHD onRemoteAvailability;

    public NativeLinkMultiplexer(List list) {
        11T.A0F(list, 1);
        HeraNativeLoader.load();
        this.mHybridData = initHybrid(list);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(List list);

    private final native void sendCoordination(int i, int i2, ByteBuffer byteBuffer);

    public native void addLocalAudioReceiver(IAudioReceiver iAudioReceiver, int i);

    public native void addLocalAudioSender(IAudioSender iAudioSender, int i);

    public native void addLocalVideoReceiver(IVideoReceiver iVideoReceiver, int i);

    public native void addLocalVideoSender(IVideoSender iVideoSender, int i);

    public final native String getDebugStats(int i);

    public JO6 getOnCoordinationCallback() {
        return this.onCoordinationCallback;
    }

    public JDX getOnLoggingCallback() {
        return this.onLoggingCallback;
    }

    public JHD getOnRemoteAvailability() {
        return this.onRemoteAvailability;
    }

    public final void onCoordination(int i, int i2, ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 2);
        JO6 jo6 = this.onCoordinationCallback;
        if (jo6 != null) {
            jo6.onCoordination(i, i2, byteBuffer);
        }
    }

    public final void onLoggingEvent(int i, ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 1);
        JDX jdx = this.onLoggingCallback;
        if (jdx != null) {
            HeraMessengerPluginImplementation heraMessengerPluginImplementation = ((Ikd) jdx).A00;
            heraMessengerPluginImplementation.A0I.handleLoggingEventMessage(i, byteBuffer, heraMessengerPluginImplementation.A0A);
        }
    }

    public final void onRemoteAvailability(int i, boolean z) {
        JHD jhd = this.onRemoteAvailability;
        if (jhd != null) {
            jhd.onRemoteAvailability(i, z);
        }
    }

    public native void removeLocalAudioReceiver(IAudioReceiver iAudioReceiver);

    public native void removeLocalAudioSender(IAudioSender iAudioSender);

    public native void removeLocalVideoReceiver(IVideoReceiver iVideoReceiver);

    public native void removeLocalVideoSender(IVideoSender iVideoSender);

    public void sendCoordinationUpdate(int i, int i2, ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 2);
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            allocateDirect.put(byteBuffer);
            allocateDirect.flip();
            byteBuffer = allocateDirect;
        }
        sendCoordination(i, i2, byteBuffer);
    }

    public void setOnCoordinationCallback(JO6 jo6) {
        this.onCoordinationCallback = jo6;
    }

    public void setOnLoggingCallback(JDX jdx) {
        this.onLoggingCallback = jdx;
    }

    @Override // X.JHE
    public void setOnRemoteAvailability(JHD jhd) {
        this.onRemoteAvailability = jhd;
    }
}

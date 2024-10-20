package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import X.AnonymousClass001;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IAudioReceiver;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: NativeAudioReceiver.class */
public final class NativeAudioReceiver implements IAudioReceiver {
    public static final Companion Companion = new Object();
    public static final String TAG = "NativeAudioReceiver";
    public final HybridData mHybridData;
    public final int streamId;

    /* loaded from: NativeAudioReceiver$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean available() {
            return NativeFeatures.INSTANCE.getHasAudio();
        }
    }

    public NativeAudioReceiver(int i, IRawAudioSink iRawAudioSink) {
        11T.A0F(iRawAudioSink, 2);
        this.streamId = i;
        if (!NativeFeatures.INSTANCE.getHasAudio()) {
            throw AnonymousClass001.A0q("NativeAudioReceiver not available! Check native build config.");
        }
        HeraNativeLoader.load();
        this.mHybridData = initHybrid(this.streamId, iRawAudioSink);
        Log.i(TAG, "Initialized");
    }

    private final native void connectNative();

    private final native void disconnectNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, IRawAudioSink iRawAudioSink);

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IAudioReceiver
    public void connect() {
        connectNative();
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IAudioReceiver
    public void disconnect() {
        disconnectNative();
    }

    @Override // X.JHC
    public native String getDebugStats();

    public int getStreamId() {
        return this.streamId;
    }
}

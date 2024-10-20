package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import X.AnonymousClass001;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IAudioSender;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: NativeAudioSender.class */
public final class NativeAudioSender implements IAudioSender {
    public static final Companion Companion = new Object();
    public static final String TAG = "NativeAudioSender";
    public final HybridData mHybridData;
    public final int streamId;

    /* loaded from: NativeAudioSender$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean available() {
            return NativeFeatures.INSTANCE.getHasAudio();
        }
    }

    public NativeAudioSender(int i, IRawAudioSource iRawAudioSource) {
        11T.A0F(iRawAudioSource, 2);
        this.streamId = i;
        if (!NativeFeatures.INSTANCE.getHasAudio()) {
            throw AnonymousClass001.A0q("NativeAudioSender not available! Check native build config.");
        }
        HeraNativeLoader.load();
        this.mHybridData = initHybrid(this.streamId, iRawAudioSource);
        Log.i(TAG, "Initialized");
    }

    private final native void activateNative();

    private final native void deactivateNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, IRawAudioSource iRawAudioSource);

    @Override // X.JKh
    public void activate() {
        activateNative();
    }

    @Override // X.JKh
    public void deactivate() {
        deactivateNative();
    }

    @Override // X.JKh
    public native String getDebugStats();

    public int getStreamId() {
        return this.streamId;
    }
}

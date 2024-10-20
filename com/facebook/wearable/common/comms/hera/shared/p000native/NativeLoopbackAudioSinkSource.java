package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import X.AnonymousClass001;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.INativeLoopbackAudioSinkSource;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: NativeLoopbackAudioSinkSource.class */
public final class NativeLoopbackAudioSinkSource implements INativeLoopbackAudioSinkSource {
    public static final Companion Companion = new Object();
    public static final String TAG = "NativeLoopbackAudioSinkSource";
    public static NativeLoopbackAudioSinkSource instance;
    public final HybridData mHybridData;

    /* loaded from: NativeLoopbackAudioSinkSource$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean available() {
            return NativeFeatures.INSTANCE.getHasLoopbackAudio();
        }

        public final NativeLoopbackAudioSinkSource getInstance() {
            if (NativeLoopbackAudioSinkSource.instance == null) {
                NativeLoopbackAudioSinkSource.instance = new NativeLoopbackAudioSinkSource();
                Log.i(NativeLoopbackAudioSinkSource.TAG, "Created NativeLoopbackAudioSinkSource");
            }
            NativeLoopbackAudioSinkSource nativeLoopbackAudioSinkSource = NativeLoopbackAudioSinkSource.instance;
            11T.A0I(nativeLoopbackAudioSinkSource, "null cannot be cast to non-null type com.facebook.wearable.common.comms.hera.shared.native.NativeLoopbackAudioSinkSource");
            return nativeLoopbackAudioSinkSource;
        }
    }

    public NativeLoopbackAudioSinkSource() {
        if (!NativeFeatures.INSTANCE.getHasLoopbackAudio()) {
            throw AnonymousClass001.A0q("NativeLoopbackAudioSinkSource not available! Check native build config.");
        }
        HeraNativeLoader.load();
        this.mHybridData = initHybrid();
        Log.i(TAG, "Initialized");
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeLoopbackAudioSinkSource, com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    public native void release();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeLoopbackAudioSinkSource, com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    public native void start();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeLoopbackAudioSinkSource, com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    public native void stop();
}

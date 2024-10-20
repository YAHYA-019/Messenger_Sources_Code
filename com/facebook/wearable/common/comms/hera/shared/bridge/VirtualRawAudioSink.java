package com.facebook.wearable.common.comms.hera.shared.bridge;

import X.AnonymousClass001;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.p000native.NativeFeatures;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VirtualRawAudioSink.class */
public final class VirtualRawAudioSink implements IRawAudioSink {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    /* loaded from: VirtualRawAudioSink$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean available() {
            return NativeFeatures.INSTANCE.getHasRsysAudio();
        }
    }

    public VirtualRawAudioSink() {
        if (!NativeFeatures.INSTANCE.getHasRsysAudio()) {
            throw AnonymousClass001.A0q("VirtualRawAudioSink not available! Check native build config.");
        }
        HeraNativeLoader.load();
        this.mHybridData = initHybrid();
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink
    public native void release();
}

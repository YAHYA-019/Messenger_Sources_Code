package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.AnonymousClass001;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: NativeRawAudioSource.class */
public final class NativeRawAudioSource implements IRawAudioSource {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    /* loaded from: NativeRawAudioSource$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean available() {
            return NativeFeatures.INSTANCE.getHasWearablesAudio();
        }
    }

    public NativeRawAudioSource() {
        this(false);
    }

    public NativeRawAudioSource(boolean z) {
        if (!NativeFeatures.INSTANCE.getHasWearablesAudio()) {
            throw AnonymousClass001.A0q("NativeRawAudioSource not available! Check native build config.");
        }
        HeraNativeLoader.load();
        this.mHybridData = initHybrid(z);
    }

    public /* synthetic */ NativeRawAudioSource(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(boolean z);

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    public native void release();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    public native void start();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    public native void stop();
}

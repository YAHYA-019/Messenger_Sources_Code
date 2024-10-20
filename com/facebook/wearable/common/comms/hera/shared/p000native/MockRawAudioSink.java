package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.AnonymousClass001;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MockRawAudioSink.class */
public final class MockRawAudioSink implements IRawAudioSink {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    /* loaded from: MockRawAudioSink$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean available() {
            return NativeFeatures.INSTANCE.getHasMockAudio();
        }
    }

    public MockRawAudioSink() {
        if (!NativeFeatures.INSTANCE.getHasMockAudio()) {
            throw AnonymousClass001.A0q("MockRawAudioSink not available! Check native build config.");
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

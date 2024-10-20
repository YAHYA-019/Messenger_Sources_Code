package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.AnonymousClass001;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: NativeRawAudioSink.class */
public final class NativeRawAudioSink implements IRawAudioSink {
    public static final Companion Companion = new Object();
    public final Function1 bufferCallback;
    public final HybridData mHybridData;

    /* loaded from: NativeRawAudioSink$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean available() {
            return NativeFeatures.INSTANCE.getHasAudio();
        }
    }

    public NativeRawAudioSink() {
        this(null);
    }

    public NativeRawAudioSink(Function1 function1) {
        this.bufferCallback = function1;
        if (!NativeFeatures.INSTANCE.getHasAudio()) {
            throw AnonymousClass001.A0q("NativeRawAudioSink not available! Check native build config.");
        }
        HeraNativeLoader.load();
        this.mHybridData = initHybrid(AnonymousClass001.A1T(function1));
    }

    public /* synthetic */ NativeRawAudioSink(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(boolean z);

    private final void onAudioBuffer(IManagedByteBufferPool.IBuffer iBuffer, int i, int i2) {
        Function1 function1 = this.bufferCallback;
        if (function1 != null) {
            function1.invoke(new PcmAudioBuffer(iBuffer, i, i2));
        } else {
            iBuffer.dispose();
        }
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink
    public native void release();
}

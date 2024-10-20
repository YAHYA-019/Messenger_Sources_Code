package com.facebook.wearable.airshield.security;

import X.C0il;
import X.HLk;
import com.facebook.jni.HybridData;

/* loaded from: Hint.class */
public final class Hint {
    public static final HLk Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HLk] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public static final /* synthetic */ void access$createHintNative(Hint hint, byte[] bArr) {
        hint.createHintNative(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void createHintNative(byte[] bArr);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native byte[] serializeNative();

    public final byte[] serialize() {
        return serializeNative();
    }
}

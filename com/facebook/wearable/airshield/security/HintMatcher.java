package com.facebook.wearable.airshield.security;

import X.C0il;
import X.HLl;
import com.facebook.jni.HybridData;

/* loaded from: HintMatcher.class */
public final class HintMatcher {
    public static final HLl Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HLl] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hintMatchesNative(byte[] bArr, byte[] bArr2);

    private final native HybridData initHybrid();
}

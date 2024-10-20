package com.facebook.wearable.airshield.security;

import X.11T;
import X.C0il;
import X.JR0;
import X.KXW;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PublicKey.class */
public final class PublicKey {
    public static final KXW Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.KXW] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public PublicKey(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }

    public /* synthetic */ PublicKey(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    private final native boolean equalsNative(long j);

    public static final PublicKey from(byte[] bArr) {
        11T.A0F(bArr, 0);
        PublicKey publicKey = new PublicKey(null);
        publicKey.setRaw(bArr);
        return publicKey;
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native boolean verifySignatureNative(long j, long j2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!11T.A0O(getClass(), JR0.A0m(obj))) {
            return false;
        }
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PublicKey");
        return equalsNative(((PublicKey) obj).getHandleNative());
    }

    public final long getNative() {
        return getHandleNative();
    }

    public native int hashCode();

    public final native byte[] serialize();

    public final boolean verifySignature(Hash hash, Signature signature) {
        11T.A0H(hash, signature);
        return verifySignatureNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed(), signature.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }
}

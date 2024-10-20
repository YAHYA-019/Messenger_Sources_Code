package com.facebook.wearable.airshield.security;

import X.11T;
import X.C0il;
import X.JR0;
import X.R3m;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PrivateKey.class */
public final class PrivateKey {
    public static final R3m Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.R3m, java.lang.Object] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public PrivateKey() {
        this.mHybridData = initHybrid();
    }

    public /* synthetic */ PrivateKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Hash deriveNative(long j);

    private final native boolean equalsNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native Signature signNative(long j);

    public final Hash derive(PublicKey publicKey) {
        11T.A0F(publicKey, 0);
        return deriveNative(publicKey.getNative());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!11T.A0O(getClass(), JR0.A0m(obj))) {
            return false;
        }
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PrivateKey");
        return equalsNative(((PrivateKey) obj).getHandleNative());
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public native int hashCode();

    public final native PublicKey recoverPublicKey();

    public final native byte[] serialize();

    public final Signature sign(Hash hash) {
        11T.A0F(hash, 0);
        return signNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }
}

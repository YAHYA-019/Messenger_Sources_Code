package com.facebook.wearable.airshield.security;

import X.11T;
import X.C0il;
import X.JR0;
import X.KXV;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Hash.class */
public final class Hash {
    public static final KXV Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.KXV] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public Hash(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }

    public /* synthetic */ Hash(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public static final /* synthetic */ void access$hashBytes(Hash hash, byte[] bArr) {
        hash.hashBytes(bArr);
    }

    private final native boolean equalsNative(long j);

    public static final Hash from(byte[] bArr) {
        11T.A0F(bArr, 0);
        Hash hash = new Hash(null);
        hash.setRaw(bArr);
        return hash;
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void hashBytes(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void hashString(String str);

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!11T.A0O(getClass(), JR0.A0m(obj))) {
            return false;
        }
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.Hash");
        return equalsNative(((Hash) obj).getHandleNative());
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public native int hashCode();

    public final native byte[] toByteArray();
}

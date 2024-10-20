package com.facebook.wearable.airshield.security;

import X.11T;
import X.9E6;
import X.C0il;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: InitializationVector.class */
public final class InitializationVector {
    public static final 9E6 Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9E6, java.lang.Object] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public InitializationVector() {
        this.mHybridData = initHybrid();
    }

    public /* synthetic */ InitializationVector(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native boolean equalsNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.InitializationVector");
        return equalsNative(((InitializationVector) obj).getHandleNative());
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public native int hashCode();

    public final native int size();

    public final native byte[] toByteArray();
}

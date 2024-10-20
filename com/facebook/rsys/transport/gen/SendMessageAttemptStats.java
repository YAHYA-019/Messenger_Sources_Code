package com.facebook.rsys.transport.gen;

import X.2JQ;
import X.HNG;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SendMessageAttemptStats.class */
public class SendMessageAttemptStats {
    public static 2JQ CONVERTER = IR0.A00(ActionId.VIEW_DID_APPEAR_BEGIN);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HNG.A00();
    }

    public SendMessageAttemptStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SendMessageAttemptStats(short s, long j, int i, int i2, int i3) {
        Short.valueOf(s).getClass();
        this.mNativeHolder = initNativeHolder(s, j, i, i2, i3);
    }

    public static native SendMessageAttemptStats createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(short s, long j, int i, int i2, int i3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SendMessageAttemptStats)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native short getAttemptsNumber();

    public native long getOutBytesWritten();

    public native int getResult();

    public native int getTransportChannel();

    public native int getTransportState();

    public native int hashCode();

    public native String toString();
}

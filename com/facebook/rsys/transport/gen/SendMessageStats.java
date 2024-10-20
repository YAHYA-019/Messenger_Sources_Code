package com.facebook.rsys.transport.gen;

import X.2JQ;
import X.HNG;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SendMessageStats.class */
public class SendMessageStats {
    public static 2JQ CONVERTER = IR0.A00(ActionId.DISPLAYED);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HNG.A00();
    }

    public SendMessageStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SendMessageStats(short s, long j, long j2, long j3, boolean z, int i, String str, int i2) {
        Short.valueOf(s).getClass();
        this.mNativeHolder = initNativeHolder(s, j, j2, j3, z, i, str, i2);
    }

    public static native SendMessageStats createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(short s, long j, long j2, long j3, boolean z, int i, String str, int i2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SendMessageStats)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native short getAttemptsNumber();

    public native long getEnqueueTimestampMs();

    public native int getErrorCode();

    public native String getErrorMessage();

    public native boolean getIsSuccess();

    public native long getOutBytesWritten();

    public native long getPublishTimestampMs();

    public native int getTransportChannel();

    public native int hashCode();

    public native String toString();
}

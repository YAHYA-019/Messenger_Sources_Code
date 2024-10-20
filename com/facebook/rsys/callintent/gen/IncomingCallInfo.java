package com.facebook.rsys.callintent.gen;

import X.2JQ;
import X.HMl;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: IncomingCallInfo.class */
public class IncomingCallInfo {
    public static 2JQ CONVERTER = N6e.A00(10);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMl.A00();
    }

    public IncomingCallInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public IncomingCallInfo(String str, McfReference mcfReference, CallMetadata callMetadata, String str2, String str3, Long l) {
        str.getClass();
        str3.getClass();
        this.mNativeHolder = initNativeHolder(str, mcfReference, callMetadata, str2, str3, l);
    }

    public static native IncomingCallInfo createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, McfReference mcfReference, CallMetadata callMetadata, String str2, String str3, Long l);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IncomingCallInfo)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native CallMetadata getCallMetadata();

    public native Long getIncomingInviteServerTime();

    public native String getIncomingInviteTransactionId();

    public native McfReference getMessageContext();

    public native String getReceiverId();

    public native String getSharedCallIdentifier();

    public native int hashCode();

    public native String toString();
}

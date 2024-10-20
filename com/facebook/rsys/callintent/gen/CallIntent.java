package com.facebook.rsys.callintent.gen;

import X.2JQ;
import X.7zP;
import X.HMl;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CallIntent.class */
public class CallIntent {
    public static 2JQ CONVERTER = IR0.A00(30);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMl.A00();
    }

    public CallIntent(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public CallIntent(String str, String str2, CallContext callContext, OutgoingCallConfig outgoingCallConfig, IncomingCallInfo incomingCallInfo, Object obj, Long l, String str3) {
        7zP.A1S(str, str2, callContext);
        this.mNativeHolder = initNativeHolder(str, str2, callContext, outgoingCallConfig, incomingCallInfo, obj, l, str3);
    }

    public static native CallIntent createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, CallContext callContext, OutgoingCallConfig outgoingCallConfig, IncomingCallInfo incomingCallInfo, Object obj, Long l, String str3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CallIntent)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native String getAppId();

    public native CallContext getCallContext();

    public native Long getConnectionId();

    public native String getConnectionLoggingId();

    public native IncomingCallInfo getIncomingCallInfo();

    public native String getLocalCallId();

    public native OutgoingCallConfig getOutgoingCallConfig();

    public native Object getSignalingSessionHolder();

    public native int hashCode();

    public native String toString();
}

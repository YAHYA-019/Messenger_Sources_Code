package com.facebook.rsys.callintent.gen;

import X.2JQ;
import X.7zP;
import X.HMl;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SignalingUserContext.class */
public class SignalingUserContext {
    public static 2JQ CONVERTER = IR0.A00(33);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMl.A00();
    }

    public SignalingUserContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SignalingUserContext(String str, String str2, String str3, SignalingTransportProxy signalingTransportProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, EnvironmentVariablesProxy environmentVariablesProxy) {
        7zP.A1S(str, str2, str3);
        signalingTransportProxy.getClass();
        overlayConfigManagerHolder.getClass();
        this.mNativeHolder = initNativeHolder(str, str2, str3, signalingTransportProxy, overlayConfigManagerHolder, environmentVariablesProxy);
    }

    public static native SignalingUserContext createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, String str3, SignalingTransportProxy signalingTransportProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, EnvironmentVariablesProxy environmentVariablesProxy);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SignalingUserContext)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native String getAppId();

    public native String getDeviceId();

    public native EnvironmentVariablesProxy getEnvironmentVariables();

    public native OverlayConfigManagerHolder getOverlayConfigManager();

    public native SignalingTransportProxy getSignalingTransport();

    public native String getUserId();

    public native int hashCode();

    public native String toString();
}

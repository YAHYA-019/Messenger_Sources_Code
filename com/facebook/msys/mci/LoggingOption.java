package com.facebook.msys.mci;

import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: LoggingOption.class */
public class LoggingOption {
    public static final LoggingOption $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public LoggingOption(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public LoggingOption(Integer num, TraceInfo traceInfo, Number number, String str, String str2, PrivacyContext privacyContext, boolean z, Number number2) {
        this.mNativeHolder = initNativeHolder(num, traceInfo, number, str, str2, privacyContext, z, number2);
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getInstanceIdNative(long j);

    private native Number getLocalDataIdNative(long j);

    private native Integer getMessageSourceNative(long j);

    private native String getNavigationChainNative(long j);

    private native PrivacyContext getPrivacyContextNative(long j);

    private native String getSendAttributionNative(long j);

    private native boolean getShouldStartHealthReportNative(long j);

    private native TraceInfo getTraceInfoNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(Integer num, TraceInfo traceInfo, Number number, String str, String str2, PrivacyContext privacyContext, boolean z, Number number2);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LoggingOption)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((LoggingOption) obj).mNativeHolder.mNativePointer);
    }

    public Number getInstanceId() {
        return getInstanceIdNative(this.mNativeHolder.mNativePointer);
    }

    public Number getLocalDataId() {
        return getLocalDataIdNative(this.mNativeHolder.mNativePointer);
    }

    public Integer getMessageSource() {
        return getMessageSourceNative(this.mNativeHolder.mNativePointer);
    }

    public String getNavigationChain() {
        return getNavigationChainNative(this.mNativeHolder.mNativePointer);
    }

    public PrivacyContext getPrivacyContext() {
        return getPrivacyContextNative(this.mNativeHolder.mNativePointer);
    }

    public String getSendAttribution() {
        return getSendAttributionNative(this.mNativeHolder.mNativePointer);
    }

    public boolean getShouldStartHealthReport() {
        return getShouldStartHealthReportNative(this.mNativeHolder.mNativePointer);
    }

    public TraceInfo getTraceInfo() {
        return getTraceInfoNative(this.mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}

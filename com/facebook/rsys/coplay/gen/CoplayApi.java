package com.facebook.rsys.coplay.gen;

import X.2JQ;
import X.HMs;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CoplayApi.class */
public abstract class CoplayApi {
    public static 2JQ CONVERTER = IR0.A00(55);

    /* loaded from: CoplayApi$CProxy.class */
    public final class CProxy extends CoplayApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMs.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CoplayApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void endMatch(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CoplayApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void gotAppInfo(long j, String str, String str2);

        public native int hashCode();

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void joinMatch(long j, Long l);

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void leaveMatch();

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void logEvent(String str, String str2, String str3, Long l, Long l2, Long l3, Long l4, String str4, String str5, String str6);

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void resetError();

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void setDmaGamingNotConsented(boolean z);

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void startMatch(long j, int i, String str);

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void updateAppName(long j, String str);

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void updateDisclaimerOptOutStatus(int i);

        @Override // com.facebook.rsys.coplay.gen.CoplayApi
        public native void updateOrientation(String str);
    }

    public abstract void endMatch(boolean z);

    public abstract void gotAppInfo(long j, String str, String str2);

    public abstract void joinMatch(long j, Long l);

    public abstract void leaveMatch();

    public abstract void logEvent(String str, String str2, String str3, Long l, Long l2, Long l3, Long l4, String str4, String str5, String str6);

    public abstract void resetError();

    public abstract void setDmaGamingNotConsented(boolean z);

    public abstract void startMatch(long j, int i, String str);

    public abstract void updateAppName(long j, String str);

    public abstract void updateDisclaimerOptOutStatus(int i);

    public abstract void updateOrientation(String str);
}

package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.HMt;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: CowatchLoggingApi.class */
public abstract class CowatchLoggingApi {
    public static 2JQ CONVERTER = N6e.A00(23);

    /* loaded from: CowatchLoggingApi$CProxy.class */
    public final class CProxy extends CowatchLoggingApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMt.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchLoggingApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchLoggingApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchLoggingApi
        public native void logEvent(int i, String str, String str2);

        @Override // com.facebook.rsys.cowatch.gen.CowatchLoggingApi
        public native void logImpressions(ArrayList arrayList, String str);

        @Override // com.facebook.rsys.cowatch.gen.CowatchLoggingApi
        public native void logVideoSelect(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z);
    }

    public abstract void logEvent(int i, String str, String str2);

    public abstract void logImpressions(ArrayList arrayList, String str);

    public abstract void logVideoSelect(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z);
}

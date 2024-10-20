package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.HMt;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CowatchFetchMediaFailureCallback.class */
public abstract class CowatchFetchMediaFailureCallback {
    public static 2JQ CONVERTER = IR0.A00(67);

    /* loaded from: CowatchFetchMediaFailureCallback$CProxy.class */
    public final class CProxy extends CowatchFetchMediaFailureCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMt.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchFetchMediaFailureCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchFetchMediaFailureCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchFetchMediaFailureCallback
        public native void onFailure(String str, String str2, int i, String str3, String str4);
    }

    public abstract void onFailure(String str, String str2, int i, String str3, String str4);
}

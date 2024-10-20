package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.HMt;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CowatchFetchAutoplaySuccessCallback.class */
public abstract class CowatchFetchAutoplaySuccessCallback {
    public static 2JQ CONVERTER = IR0.A00(66);

    /* loaded from: CowatchFetchAutoplaySuccessCallback$CProxy.class */
    public final class CProxy extends CowatchFetchAutoplaySuccessCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMt.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchFetchAutoplaySuccessCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchFetchAutoplaySuccessCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchFetchAutoplaySuccessCallback
        public native void onSuccess(CowatchAutoplayPayload cowatchAutoplayPayload);
    }

    public abstract void onSuccess(CowatchAutoplayPayload cowatchAutoplayPayload);
}

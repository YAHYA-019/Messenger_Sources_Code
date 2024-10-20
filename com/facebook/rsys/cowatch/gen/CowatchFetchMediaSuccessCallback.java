package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.HMt;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CowatchFetchMediaSuccessCallback.class */
public abstract class CowatchFetchMediaSuccessCallback {
    public static 2JQ CONVERTER = IR0.A00(68);

    /* loaded from: CowatchFetchMediaSuccessCallback$CProxy.class */
    public final class CProxy extends CowatchFetchMediaSuccessCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMt.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchFetchMediaSuccessCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchFetchMediaSuccessCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchFetchMediaSuccessCallback
        public native void onSuccess(CowatchMediaInfoModel cowatchMediaInfoModel);
    }

    public abstract void onSuccess(CowatchMediaInfoModel cowatchMediaInfoModel);
}

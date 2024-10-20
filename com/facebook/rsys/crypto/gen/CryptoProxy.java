package com.facebook.rsys.crypto.gen;

import X.2JQ;
import X.HMv;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CryptoProxy.class */
public abstract class CryptoProxy {
    public static 2JQ CONVERTER = IR0.A00(96);

    /* loaded from: CryptoProxy$CProxy.class */
    public final class CProxy extends CryptoProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMv.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CryptoProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CryptoProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.crypto.gen.CryptoProxy
        public native void setApi(CryptoApi cryptoApi);
    }

    public abstract void setApi(CryptoApi cryptoApi);
}

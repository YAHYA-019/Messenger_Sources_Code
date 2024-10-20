package com.facebook.rsys.calltransfer.gen;

import X.2JQ;
import X.N0A;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CallTransferApi.class */
public abstract class CallTransferApi {
    public static 2JQ CONVERTER = N6e.A00(13);

    /* loaded from: CallTransferApi$CProxy.class */
    public final class CProxy extends CallTransferApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0A.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CallTransferApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.calltransfer.gen.CallTransferApi
        public native void cancelTransfer();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallTransferApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.calltransfer.gen.CallTransferApi
        public native void startTransfer(Long l);
    }

    public abstract void cancelTransfer();

    public abstract void startTransfer(Long l);
}

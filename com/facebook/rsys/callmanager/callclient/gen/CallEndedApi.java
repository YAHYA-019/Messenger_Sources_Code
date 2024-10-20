package com.facebook.rsys.callmanager.callclient.gen;

import X.2JQ;
import X.HMm;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CallEndedApi.class */
public abstract class CallEndedApi {
    public static 2JQ CONVERTER = IR0.A00(34);

    /* loaded from: CallEndedApi$CProxy.class */
    public final class CProxy extends CallEndedApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMm.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CallEndedApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallEndedApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallEndedApi
        public native void removeCall();
    }

    public abstract void removeCall();
}

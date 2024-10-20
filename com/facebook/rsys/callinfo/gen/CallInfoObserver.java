package com.facebook.rsys.callinfo.gen;

import X.2JQ;
import X.HMk;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CallInfoObserver.class */
public abstract class CallInfoObserver {
    public static 2JQ CONVERTER = N6e.A00(7);

    /* loaded from: CallInfoObserver$CProxy.class */
    public final class CProxy extends CallInfoObserver {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMk.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CallInfoObserver createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallInfoObserver)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.callinfo.gen.CallInfoObserver
        public native void onUpdate();
    }

    public abstract void onUpdate();
}

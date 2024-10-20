package com.facebook.rsys.callmanager.gen;

import X.2JQ;
import X.HMo;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: Call.class */
public abstract class Call {
    public static 2JQ CONVERTER = IR0.A00(42);

    /* loaded from: Call$CProxy.class */
    public final class CProxy extends Call {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMo.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native Call createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Call)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.callmanager.gen.Call
        public native ApiBag getApis();

        public native int hashCode();
    }

    public abstract ApiBag getApis();
}

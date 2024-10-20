package com.facebook.rsys.tslog.gen;

import X.2JQ;
import X.HNH;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TslogProxy.class */
public abstract class TslogProxy {
    public static 2JQ CONVERTER = new IQz(6);

    /* loaded from: TslogProxy$CProxy.class */
    public final class CProxy extends TslogProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNH.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native TslogProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.tslog.gen.TslogProxy
        public native void setApi(TslogApi tslogApi);
    }

    public abstract void setApi(TslogApi tslogApi);
}

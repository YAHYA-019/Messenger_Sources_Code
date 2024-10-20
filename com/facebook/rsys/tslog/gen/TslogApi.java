package com.facebook.rsys.tslog.gen;

import X.2JQ;
import X.HNH;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TslogApi.class */
public abstract class TslogApi {
    public static 2JQ CONVERTER = new IQz(3);

    /* loaded from: TslogApi$CProxy.class */
    public final class CProxy extends TslogApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNH.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native TslogApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.tslog.gen.TslogApi
        public native void getEngine(GetTslogEngineCallback getTslogEngineCallback);

        public native int hashCode();
    }

    public abstract void getEngine(GetTslogEngineCallback getTslogEngineCallback);
}

package com.facebook.rsys.tslog.gen;

import X.2JQ;
import X.HNH;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TslogCounterApi.class */
public abstract class TslogCounterApi {
    public static 2JQ CONVERTER = new IQz(4);

    /* loaded from: TslogCounterApi$CProxy.class */
    public final class CProxy extends TslogCounterApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNH.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native TslogCounterApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.tslog.gen.TslogCounterApi
        public native void addSample(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogCounterApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract void addSample(int i);
}

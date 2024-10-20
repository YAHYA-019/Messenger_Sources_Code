package com.facebook.rsys.tslog.gen;

import X.2JQ;
import X.HNH;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TslogStreamApi.class */
public abstract class TslogStreamApi {
    public static 2JQ CONVERTER = new IQz(7);

    /* loaded from: TslogStreamApi$CProxy.class */
    public final class CProxy extends TslogStreamApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNH.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native TslogStreamApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.tslog.gen.TslogStreamApi
        public native TslogCounterApi createCounter(String str, int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogStreamApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract TslogCounterApi createCounter(String str, int i);
}

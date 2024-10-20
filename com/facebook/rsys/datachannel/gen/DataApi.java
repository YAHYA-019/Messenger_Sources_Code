package com.facebook.rsys.datachannel.gen;

import X.2JQ;
import X.HMw;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: DataApi.class */
public abstract class DataApi {
    public static 2JQ CONVERTER = IR0.A00(98);

    /* loaded from: DataApi$CProxy.class */
    public final class CProxy extends DataApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMw.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native DataApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.datachannel.gen.DataApi
        public native DataTransport createTransport(String str, DataChannelConfig dataChannelConfig);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DataApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.datachannel.gen.DataApi
        public native void removeTransport(String str, DataTransport dataTransport);
    }

    public abstract DataTransport createTransport(String str, DataChannelConfig dataChannelConfig);

    public abstract void removeTransport(String str, DataTransport dataTransport);
}

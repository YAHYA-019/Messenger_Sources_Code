package com.facebook.rsys.networktraffic.gen;

import X.2JQ;
import X.Kaf;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NetworkTrafficApi.class */
public abstract class NetworkTrafficApi {
    public static 2JQ CONVERTER = new LVi(39);

    /* loaded from: NetworkTrafficApi$CProxy.class */
    public final class CProxy extends NetworkTrafficApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            Kaf.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native NetworkTrafficApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetworkTrafficApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficApi
        public native void onHttpEventComplete(long j, HttpStats httpStats);

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficApi
        public native void onHttpEventResponse(long j);

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficApi
        public native void onHttpEventStart(long j);
    }

    public abstract void onHttpEventComplete(long j, HttpStats httpStats);

    public abstract void onHttpEventResponse(long j);

    public abstract void onHttpEventStart(long j);
}

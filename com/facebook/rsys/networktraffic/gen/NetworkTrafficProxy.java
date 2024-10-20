package com.facebook.rsys.networktraffic.gen;

import X.2JQ;
import X.Kaf;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NetworkTrafficProxy.class */
public abstract class NetworkTrafficProxy {
    public static 2JQ CONVERTER = new 2JQ() { // from class: X.40S
        public /* bridge */ /* synthetic */ Object AI2(McfReference mcfReference) {
            return NetworkTrafficProxy.CProxy.createFromMcfType(mcfReference);
        }

        public Class Ay5() {
            return NetworkTrafficProxy.class;
        }

        public long BHg() {
            long j = NetworkTrafficProxy.CProxy.sMcfTypeId;
            if (j == 0) {
                j = NetworkTrafficProxy.CProxy.nativeGetMcfTypeId();
                NetworkTrafficProxy.CProxy.sMcfTypeId = j;
            }
            return j;
        }
    };

    /* loaded from: NetworkTrafficProxy$CProxy.class */
    public final class CProxy extends NetworkTrafficProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            Kaf.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native NetworkTrafficProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetworkTrafficProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy
        public native void onCallEnd();

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy
        public native void onCallStart();
    }

    public abstract void onCallEnd();

    public abstract void onCallStart();
}

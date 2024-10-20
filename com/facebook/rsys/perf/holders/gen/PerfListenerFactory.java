package com.facebook.rsys.perf.holders.gen;

import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: PerfListenerFactory.class */
public abstract class PerfListenerFactory {
    public static 2JQ CONVERTER = N6e.A00(47);

    /* loaded from: PerfListenerFactory$CProxy.class */
    public final class CProxy extends PerfListenerFactory {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native PerfListenerFactory createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.perf.holders.gen.PerfListenerFactory
        public native PerfListener createPerfListener(String str, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof PerfListenerFactory)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract PerfListener createPerfListener(String str, String str2);
}

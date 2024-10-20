package com.facebook.rsys.perf.holders.gen;

import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: PerfListener.class */
public abstract class PerfListener {
    public static 2JQ CONVERTER = N6e.A00(46);

    /* loaded from: PerfListener$CProxy.class */
    public final class CProxy extends PerfListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native PerfListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof PerfListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.perf.holders.gen.PerfListener
        public native void onMarkerStart(String str, String str2);
    }

    public abstract void onMarkerStart(String str, String str2);
}

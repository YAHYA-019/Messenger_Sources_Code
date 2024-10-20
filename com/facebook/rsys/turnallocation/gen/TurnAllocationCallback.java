package com.facebook.rsys.turnallocation.gen;

import X.2JQ;
import X.HNI;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TurnAllocationCallback.class */
public abstract class TurnAllocationCallback {
    public static 2JQ CONVERTER = N6e.A00(65);

    /* loaded from: TurnAllocationCallback$CProxy.class */
    public final class CProxy extends TurnAllocationCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNI.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native TurnAllocationCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TurnAllocationCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationCallback
        public native void error(String str, int i);

        public native int hashCode();

        @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationCallback
        public native void success(String str);
    }

    public abstract void error(String str, int i);

    public abstract void success(String str);
}

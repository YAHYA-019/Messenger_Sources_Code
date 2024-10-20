package com.facebook.rsys.turnallocation.gen;

import X.2JQ;
import X.HNI;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TurnAllocationProxy.class */
public abstract class TurnAllocationProxy {
    public static 2JQ CONVERTER = N6e.A00(66);

    /* loaded from: TurnAllocationProxy$CProxy.class */
    public final class CProxy extends TurnAllocationProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNI.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native TurnAllocationProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationProxy
        public native void allocate(int i, String str, String str2, String str3, String str4, TurnAllocationCallback turnAllocationCallback);

        @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationProxy
        public native void allocateMultipleRelays(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, TurnAllocationCallback turnAllocationCallback);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TurnAllocationProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract void allocate(int i, String str, String str2, String str3, String str4, TurnAllocationCallback turnAllocationCallback);

    public abstract void allocateMultipleRelays(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, TurnAllocationCallback turnAllocationCallback);
}

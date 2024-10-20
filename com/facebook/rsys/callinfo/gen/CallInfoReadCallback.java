package com.facebook.rsys.callinfo.gen;

import X.2JQ;
import X.HMk;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: CallInfoReadCallback.class */
public abstract class CallInfoReadCallback {
    public static 2JQ CONVERTER = LVi.A00(4);

    /* loaded from: CallInfoReadCallback$CProxy.class */
    public final class CProxy extends CallInfoReadCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMk.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CallInfoReadCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callinfo.gen.CallInfoReadCallback
        public native void complete(CallInfo callInfo, ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallInfoReadCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract void complete(CallInfo callInfo, ArrayList arrayList);
}

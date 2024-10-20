package com.facebook.rsys.groupexpansion.gen;

import X.2JQ;
import X.C0il;
import X.GOo;
import X.HEE;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: GroupExpansionCompletedCallback.class */
public abstract class GroupExpansionCompletedCallback {
    public static 2JQ CONVERTER = IR0.A00(125);

    /* loaded from: GroupExpansionCompletedCallback$CProxy.class */
    public final class CProxy extends GroupExpansionCompletedCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (HEE.A00) {
                return;
            }
            GOo.A14();
            C0il.A0B("rsysgroupexpansionjni");
            HEE.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native GroupExpansionCompletedCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GroupExpansionCompletedCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback
        public native void onFailure(int i);

        @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback
        public native void onSuccess(String str, boolean z);
    }

    public abstract void onFailure(int i);

    public abstract void onSuccess(String str, boolean z);
}

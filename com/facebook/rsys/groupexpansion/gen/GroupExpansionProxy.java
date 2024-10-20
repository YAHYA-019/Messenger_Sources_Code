package com.facebook.rsys.groupexpansion.gen;

import X.2JQ;
import X.C0il;
import X.GOo;
import X.HEE;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: GroupExpansionProxy.class */
public abstract class GroupExpansionProxy {
    public static 2JQ CONVERTER = IR0.A00(ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES);

    /* loaded from: GroupExpansionProxy$CProxy.class */
    public final class CProxy extends GroupExpansionProxy {
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

        public static native GroupExpansionProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GroupExpansionProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy
        public native void expand(String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback);

        public native int hashCode();
    }

    public abstract void expand(String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback);
}

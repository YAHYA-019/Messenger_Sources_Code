package com.facebook.rsys.callinfo.gen;

import X.2JQ;
import X.HMk;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: UserProfilesReadCallback.class */
public abstract class UserProfilesReadCallback {
    public static 2JQ CONVERTER = N6e.A00(8);

    /* loaded from: UserProfilesReadCallback$CProxy.class */
    public final class CProxy extends UserProfilesReadCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMk.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native UserProfilesReadCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callinfo.gen.UserProfilesReadCallback
        public native void complete(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof UserProfilesReadCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract void complete(ArrayList arrayList);
}

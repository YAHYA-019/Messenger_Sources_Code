package com.facebook.rsys.raisehands.gen;

import X.2JQ;
import X.HNB;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: RaiseHandsApi.class */
public abstract class RaiseHandsApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.FORMAT_ERROR);

    /* loaded from: RaiseHandsApi$CProxy.class */
    public final class CProxy extends RaiseHandsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNB.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native RaiseHandsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.raisehands.gen.RaiseHandsApi
        public native void dismissLowerHandReminder();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RaiseHandsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.raisehands.gen.RaiseHandsApi
        public native void setIsRaised(boolean z);
    }

    public abstract void dismissLowerHandReminder();

    public abstract void setIsRaised(boolean z);
}

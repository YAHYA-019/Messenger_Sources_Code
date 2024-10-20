package com.facebook.rsys.videoeffectcommunication.gen;

import X.2JQ;
import X.N0G;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: UnapprovedEffectAlertCompletion.class */
public abstract class UnapprovedEffectAlertCompletion {
    public static 2JQ CONVERTER = N6e.A00(84);

    /* loaded from: UnapprovedEffectAlertCompletion$CProxy.class */
    public final class CProxy extends UnapprovedEffectAlertCompletion {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0G.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native UnapprovedEffectAlertCompletion createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof UnapprovedEffectAlertCompletion)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videoeffectcommunication.gen.UnapprovedEffectAlertCompletion
        public native void onConfirmation(boolean z);
    }

    public abstract void onConfirmation(boolean z);
}

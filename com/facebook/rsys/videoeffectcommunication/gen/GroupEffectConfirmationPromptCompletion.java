package com.facebook.rsys.videoeffectcommunication.gen;

import X.2JQ;
import X.N0G;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: GroupEffectConfirmationPromptCompletion.class */
public abstract class GroupEffectConfirmationPromptCompletion {
    public static 2JQ CONVERTER = N6e.A00(83);

    /* loaded from: GroupEffectConfirmationPromptCompletion$CProxy.class */
    public final class CProxy extends GroupEffectConfirmationPromptCompletion {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0G.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native GroupEffectConfirmationPromptCompletion createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GroupEffectConfirmationPromptCompletion)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videoeffectcommunication.gen.GroupEffectConfirmationPromptCompletion
        public native void onConfirmation(boolean z);
    }

    public abstract void onConfirmation(boolean z);
}

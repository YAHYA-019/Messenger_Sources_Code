package com.facebook.rsys.metaaivoicestate.gen;

import X.2JQ;
import X.N0C;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MetaAiVoiceStateProxy.class */
public abstract class MetaAiVoiceStateProxy {
    public static 2JQ CONVERTER = N6e.A00(43);

    /* loaded from: MetaAiVoiceStateProxy$CProxy.class */
    public final class CProxy extends MetaAiVoiceStateProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0C.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native MetaAiVoiceStateProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MetaAiVoiceStateProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onUpdate(MetaAiVoiceState metaAiVoiceState);
    }

    public abstract void onUpdate(MetaAiVoiceState metaAiVoiceState);
}

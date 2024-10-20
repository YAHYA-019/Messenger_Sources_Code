package com.facebook.rsys.mediastats.gen;

import X.2JQ;
import X.HN7;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: AudioLevelsCallback.class */
public abstract class AudioLevelsCallback {
    public static 2JQ CONVERTER = N6e.A00(36);

    /* loaded from: AudioLevelsCallback$CProxy.class */
    public final class CProxy extends AudioLevelsCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN7.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioLevelsCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.mediastats.gen.AudioLevelsCallback
        public native void complete(Map map);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioLevelsCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract void complete(Map map);
}

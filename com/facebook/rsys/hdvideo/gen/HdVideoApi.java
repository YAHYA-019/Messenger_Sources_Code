package com.facebook.rsys.hdvideo.gen;

import X.2JQ;
import X.HN2;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: HdVideoApi.class */
public abstract class HdVideoApi {
    public static 2JQ CONVERTER = IR0.A00(127);

    /* loaded from: HdVideoApi$CProxy.class */
    public final class CProxy extends HdVideoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN2.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native HdVideoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof HdVideoApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.hdvideo.gen.HdVideoApi
        public native void setHdVideoUserPreference(boolean z);
    }

    public abstract void setHdVideoUserPreference(boolean z);
}

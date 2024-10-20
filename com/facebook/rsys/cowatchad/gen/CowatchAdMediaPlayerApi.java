package com.facebook.rsys.cowatchad.gen;

import X.2JQ;
import X.HMu;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CowatchAdMediaPlayerApi.class */
public abstract class CowatchAdMediaPlayerApi {
    public static 2JQ CONVERTER = IR0.A00(89);

    /* loaded from: CowatchAdMediaPlayerApi$CProxy.class */
    public final class CProxy extends CowatchAdMediaPlayerApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMu.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchAdMediaPlayerApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.cowatchad.gen.CowatchAdMediaPlayerApi
        public native void didMediaChange(String str, long j);

        @Override // com.facebook.rsys.cowatchad.gen.CowatchAdMediaPlayerApi
        public native void didUpdatePlaybackTime(String str, long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchAdMediaPlayerApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract void didMediaChange(String str, long j);

    public abstract void didUpdatePlaybackTime(String str, long j);
}

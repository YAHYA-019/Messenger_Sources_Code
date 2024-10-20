package com.facebook.rsys.cowatchad.gen;

import X.2JQ;
import X.HMu;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CowatchAdPlayerApi.class */
public abstract class CowatchAdPlayerApi {
    public static 2JQ CONVERTER = IR0.A00(91);

    /* loaded from: CowatchAdPlayerApi$CProxy.class */
    public final class CProxy extends CowatchAdPlayerApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMu.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchAdPlayerApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi
        public native void didStartAdPlayback(String str, long j);

        @Override // com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi
        public native void didStopAdPlayback(String str, long j);

        @Override // com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi
        public native void didUpdatePlaybackTime(String str, long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchAdPlayerApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract void didStartAdPlayback(String str, long j);

    public abstract void didStopAdPlayback(String str, long j);

    public abstract void didUpdatePlaybackTime(String str, long j);
}

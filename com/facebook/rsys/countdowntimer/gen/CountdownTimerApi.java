package com.facebook.rsys.countdowntimer.gen;

import X.2JQ;
import X.Kab;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CountdownTimerApi.class */
public abstract class CountdownTimerApi {
    public static 2JQ CONVERTER = LVi.A00(7);

    /* loaded from: CountdownTimerApi$CProxy.class */
    public final class CProxy extends CountdownTimerApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            Kab.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CountdownTimerApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.countdowntimer.gen.CountdownTimerApi
        public native void cancel();

        @Override // com.facebook.rsys.countdowntimer.gen.CountdownTimerApi
        public native void end();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CountdownTimerApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.countdowntimer.gen.CountdownTimerApi
        public native void pause(long j);

        @Override // com.facebook.rsys.countdowntimer.gen.CountdownTimerApi
        public native void resume();

        @Override // com.facebook.rsys.countdowntimer.gen.CountdownTimerApi
        public native void start(long j, String str);
    }

    public abstract void cancel();

    public abstract void end();

    public abstract void pause(long j);

    public abstract void resume();

    public abstract void start(long j, String str);
}

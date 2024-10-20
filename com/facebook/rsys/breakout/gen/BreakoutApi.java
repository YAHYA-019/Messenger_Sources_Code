package com.facebook.rsys.breakout.gen;

import X.2JQ;
import X.HMi;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: BreakoutApi.class */
public abstract class BreakoutApi {
    public static 2JQ CONVERTER = IR0.A00(17);

    /* loaded from: BreakoutApi$CProxy.class */
    public final class CProxy extends BreakoutApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMi.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native BreakoutApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.breakout.gen.BreakoutApi
        public native void creatorManuallyJoinRoom(String str, int i);

        @Override // com.facebook.rsys.breakout.gen.BreakoutApi
        public native void endBreakoutSession(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof BreakoutApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.breakout.gen.BreakoutApi
        public native void restoreContext(int i);

        @Override // com.facebook.rsys.breakout.gen.BreakoutApi
        public native void startBreakoutSession(BreakoutSessionStartModel breakoutSessionStartModel);
    }

    public abstract void creatorManuallyJoinRoom(String str, int i);

    public abstract void endBreakoutSession(int i);

    public abstract void restoreContext(int i);

    public abstract void startBreakoutSession(BreakoutSessionStartModel breakoutSessionStartModel);
}

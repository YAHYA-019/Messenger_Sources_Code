package com.facebook.rsys.breakout.gen;

import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: BreakoutStore.class */
public abstract class BreakoutStore {
    public static 2JQ CONVERTER = N6e.A00(5);

    /* loaded from: BreakoutStore$CProxy.class */
    public final class CProxy extends BreakoutStore {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native BreakoutStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof BreakoutStore)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.breakout.gen.BreakoutStore
        public native void setHandler(BreakoutStoreHandler breakoutStoreHandler);

        @Override // com.facebook.rsys.breakout.gen.BreakoutStore
        public native void startBreakoutSession(BreakoutSessionStartModel breakoutSessionStartModel);

        @Override // com.facebook.rsys.breakout.gen.BreakoutStore
        public native void startObservers();

        @Override // com.facebook.rsys.breakout.gen.BreakoutStore
        public native void stopObservers();
    }

    public abstract void setHandler(BreakoutStoreHandler breakoutStoreHandler);

    public abstract void startBreakoutSession(BreakoutSessionStartModel breakoutSessionStartModel);

    public abstract void startObservers();

    public abstract void stopObservers();
}

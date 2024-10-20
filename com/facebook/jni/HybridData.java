package com.facebook.jni;

import X.0kA;
import X.C0gh;

/* loaded from: HybridData.class */
public class HybridData {
    public static final HybridData $redex_init_class = null;
    public final Destructor mDestructor = new 0kA(this);

    /* loaded from: HybridData$Destructor.class */
    public class Destructor extends 0kA {
        public volatile long mNativePointer;

        public Destructor(Object obj) {
            super(obj);
        }

        public static native void deleteNative(long j);

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        C0gh.A03("fbjni");
    }

    public boolean isValid() {
        boolean z = false;
        if (this.mDestructor.mNativePointer != 0) {
            z = true;
        }
        return z;
    }

    public void resetNative() {
        synchronized (this) {
            this.mDestructor.destruct();
        }
    }
}

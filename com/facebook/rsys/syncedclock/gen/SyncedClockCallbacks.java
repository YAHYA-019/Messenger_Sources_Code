package com.facebook.rsys.syncedclock.gen;

import X.2JQ;
import X.C0il;
import X.ESW;
import X.FdC;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SyncedClockCallbacks.class */
public abstract class SyncedClockCallbacks {
    public static 2JQ CONVERTER = new FdC(1);

    /* loaded from: SyncedClockCallbacks$CProxy.class */
    public final class CProxy extends SyncedClockCallbacks {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (ESW.A00) {
                return;
            }
            Execution.initialize();
            C0il.A0B("jniperflogger");
            C0il.A0B("rsyssyncedclockjni");
            ESW.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SyncedClockCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SyncedClockCallbacks)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.syncedclock.gen.SyncedClockCallbacks
        public native void sendErrorCallback();

        @Override // com.facebook.rsys.syncedclock.gen.SyncedClockCallbacks
        public native void sendSuccessCallback(long j, long j2, long j3, long j4);
    }

    public abstract void sendErrorCallback();

    public abstract void sendSuccessCallback(long j, long j2, long j3, long j4);
}

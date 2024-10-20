package com.facebook.rsys.snapshot.gen;

import X.2JQ;
import X.N0D;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SnapshotProxyDiscardCallback.class */
public abstract class SnapshotProxyDiscardCallback {
    public static 2JQ CONVERTER = N6e.A00(54);

    /* loaded from: SnapshotProxyDiscardCallback$CProxy.class */
    public final class CProxy extends SnapshotProxyDiscardCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0D.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SnapshotProxyDiscardCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.snapshot.gen.SnapshotProxyDiscardCallback
        public native void discardPhotoComplete(String str, boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SnapshotProxyDiscardCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract void discardPhotoComplete(String str, boolean z);
}

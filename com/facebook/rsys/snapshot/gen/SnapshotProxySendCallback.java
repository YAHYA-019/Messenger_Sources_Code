package com.facebook.rsys.snapshot.gen;

import X.2JQ;
import X.N0D;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SnapshotProxySendCallback.class */
public abstract class SnapshotProxySendCallback {
    public static 2JQ CONVERTER = N6e.A00(56);

    /* loaded from: SnapshotProxySendCallback$CProxy.class */
    public final class CProxy extends SnapshotProxySendCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0D.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SnapshotProxySendCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SnapshotProxySendCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.snapshot.gen.SnapshotProxySendCallback
        public native void savePhotoComplete(boolean z);

        @Override // com.facebook.rsys.snapshot.gen.SnapshotProxySendCallback
        public native void sendPhotoComplete(String str, boolean z);
    }

    public abstract void savePhotoComplete(boolean z);

    public abstract void sendPhotoComplete(String str, boolean z);
}

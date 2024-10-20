package com.facebook.rsys.snapshot.gen;

import X.2JQ;
import X.N0D;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SnapshotProxyStitchCallback.class */
public abstract class SnapshotProxyStitchCallback {
    public static 2JQ CONVERTER = N6e.A00(57);

    /* loaded from: SnapshotProxyStitchCallback$CProxy.class */
    public final class CProxy extends SnapshotProxyStitchCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0D.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SnapshotProxyStitchCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SnapshotProxyStitchCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.snapshot.gen.SnapshotProxyStitchCallback
        public native void stitchPhotoComplete(boolean z, String str);
    }

    public abstract void stitchPhotoComplete(boolean z, String str);
}

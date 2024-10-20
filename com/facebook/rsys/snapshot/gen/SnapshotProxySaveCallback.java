package com.facebook.rsys.snapshot.gen;

import X.2JQ;
import X.N0D;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SnapshotProxySaveCallback.class */
public abstract class SnapshotProxySaveCallback {
    public static 2JQ CONVERTER = N6e.A00(55);

    /* loaded from: SnapshotProxySaveCallback$CProxy.class */
    public final class CProxy extends SnapshotProxySaveCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0D.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SnapshotProxySaveCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SnapshotProxySaveCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.snapshot.gen.SnapshotProxySaveCallback
        public native void savePhotoComplete(boolean z);
    }

    public abstract void savePhotoComplete(boolean z);
}

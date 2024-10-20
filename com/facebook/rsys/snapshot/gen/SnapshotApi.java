package com.facebook.rsys.snapshot.gen;

import X.2JQ;
import X.N0D;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SnapshotApi.class */
public abstract class SnapshotApi {
    public static 2JQ CONVERTER = N6e.A00(49);

    /* loaded from: SnapshotApi$CProxy.class */
    public final class CProxy extends SnapshotApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0D.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native SnapshotApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SnapshotApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.snapshot.gen.SnapshotApi
        public native void snapshotCapture(int i, boolean z);

        @Override // com.facebook.rsys.snapshot.gen.SnapshotApi
        public native void snapshotCaptureWithCowatch(int i, boolean z, McfReference mcfReference);

        @Override // com.facebook.rsys.snapshot.gen.SnapshotApi
        public native void snapshotCapturedExternal(int i);

        @Override // com.facebook.rsys.snapshot.gen.SnapshotApi
        public native void snapshotDismissed(String str, boolean z);

        @Override // com.facebook.rsys.snapshot.gen.SnapshotApi
        public native void snapshotNotifyAborted();

        @Override // com.facebook.rsys.snapshot.gen.SnapshotApi
        public native void snapshotNotifyPrepareForCapture();

        @Override // com.facebook.rsys.snapshot.gen.SnapshotApi
        public native void snapshotScalePreview();

        @Override // com.facebook.rsys.snapshot.gen.SnapshotApi
        public native void snapshotSend(String str);
    }

    public abstract void snapshotCapture(int i, boolean z);

    public abstract void snapshotCaptureWithCowatch(int i, boolean z, McfReference mcfReference);

    public abstract void snapshotCapturedExternal(int i);

    public abstract void snapshotDismissed(String str, boolean z);

    public abstract void snapshotNotifyAborted();

    public abstract void snapshotNotifyPrepareForCapture();

    public abstract void snapshotScalePreview();

    public abstract void snapshotSend(String str);
}

package com.facebook.rsys.grid.gen;

import X.2JQ;
import X.HN1;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: GridApi.class */
public abstract class GridApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.VIDEO_SET_RENDERER_CONTEXT);

    /* loaded from: GridApi$CProxy.class */
    public final class CProxy extends GridApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN1.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native GridApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GridApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.grid.gen.GridApi
        public native void performPinningAction(String str, int i);

        @Override // com.facebook.rsys.grid.gen.GridApi
        public native void unpinAll();

        @Override // com.facebook.rsys.grid.gen.GridApi
        public native void updateMaxPeersVisible(int i);
    }

    public abstract void performPinningAction(String str, int i);

    public abstract void unpinAll();

    public abstract void updateMaxPeersVisible(int i);
}

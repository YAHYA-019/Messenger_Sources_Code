package com.facebook.rsys.mosaicgrid.gen;

import X.2JQ;
import X.HNA;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MosaicGridApi.class */
public abstract class MosaicGridApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.PREV_ACTIVITY_PAUSE);

    /* loaded from: MosaicGridApi$CProxy.class */
    public final class CProxy extends MosaicGridApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNA.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native MosaicGridApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MosaicGridApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.mosaicgrid.gen.MosaicGridApi
        public native void sendCurrentVideoSize(FrameSize frameSize);
    }

    public abstract void sendCurrentVideoSize(FrameSize frameSize);
}

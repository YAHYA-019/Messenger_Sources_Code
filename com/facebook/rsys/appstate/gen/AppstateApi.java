package com.facebook.rsys.appstate.gen;

import X.2JQ;
import X.HMg;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AppstateApi.class */
public abstract class AppstateApi {
    public static 2JQ CONVERTER = IR0.A00(0);

    /* loaded from: AppstateApi$CProxy.class */
    public final class CProxy extends AppstateApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMg.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AppstateApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AppstateApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsBackgrounded(boolean z);

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsPictureInPicture(boolean z);

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsScreenOff(boolean z);
    }

    public abstract void setIsBackgrounded(boolean z);

    public abstract void setIsPictureInPicture(boolean z);

    public abstract void setIsScreenOff(boolean z);
}

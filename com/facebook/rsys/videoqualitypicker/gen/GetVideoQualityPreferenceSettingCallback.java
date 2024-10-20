package com.facebook.rsys.videoqualitypicker.gen;

import X.2JQ;
import X.N0H;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: GetVideoQualityPreferenceSettingCallback.class */
public abstract class GetVideoQualityPreferenceSettingCallback {
    public static 2JQ CONVERTER = N6e.A00(86);

    /* loaded from: GetVideoQualityPreferenceSettingCallback$CProxy.class */
    public final class CProxy extends GetVideoQualityPreferenceSettingCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0H.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native GetVideoQualityPreferenceSettingCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GetVideoQualityPreferenceSettingCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videoqualitypicker.gen.GetVideoQualityPreferenceSettingCallback
        public native void onComplete(int i);
    }

    public abstract void onComplete(int i);
}

package com.facebook.rsys.videoqualitypicker.gen;

import X.2JQ;
import X.IQz;
import X.N0H;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoQualityPickerApi.class */
public abstract class VideoQualityPickerApi {
    public static 2JQ CONVERTER = new IQz(17);

    /* loaded from: VideoQualityPickerApi$CProxy.class */
    public final class CProxy extends VideoQualityPickerApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0H.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoQualityPickerApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoQualityPickerApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerApi
        public native void removeTemporaryVideoQualityOverride();

        @Override // com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerApi
        public native void setPreferredVideoQuality(int i);

        @Override // com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerApi
        public native void setTemporaryVideoQualityOverride(int i);
    }

    public abstract void removeTemporaryVideoQualityOverride();

    public abstract void setPreferredVideoQuality(int i);

    public abstract void setTemporaryVideoQualityOverride(int i);
}

package com.facebook.rsys.videoqualitypicker.gen;

import X.2JQ;
import X.N0H;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoQualityPickerProxy.class */
public abstract class VideoQualityPickerProxy {
    public static 2JQ CONVERTER = N6e.A00(88);

    /* loaded from: VideoQualityPickerProxy$CProxy.class */
    public final class CProxy extends VideoQualityPickerProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0H.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoQualityPickerProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoQualityPickerProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerProxy
        public native void getVideoQualityPreferenceSetting(GetVideoQualityPreferenceSettingCallback getVideoQualityPreferenceSettingCallback);

        public native int hashCode();

        @Override // com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerProxy
        public native void saveVideoQualityPreferenceSetting(int i);

        @Override // com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerProxy
        public native void setApi(VideoQualityPickerApi videoQualityPickerApi);
    }

    public abstract void getVideoQualityPreferenceSetting(GetVideoQualityPreferenceSettingCallback getVideoQualityPreferenceSettingCallback);

    public abstract void saveVideoQualityPreferenceSetting(int i);

    public abstract void setApi(VideoQualityPickerApi videoQualityPickerApi);
}

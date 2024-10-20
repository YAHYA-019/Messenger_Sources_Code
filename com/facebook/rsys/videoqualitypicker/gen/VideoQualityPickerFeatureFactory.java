package com.facebook.rsys.videoqualitypicker.gen;

import X.N0H;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: VideoQualityPickerFeatureFactory.class */
public abstract class VideoQualityPickerFeatureFactory {

    /* loaded from: VideoQualityPickerFeatureFactory$CProxy.class */
    public final class CProxy extends VideoQualityPickerFeatureFactory {
        static {
            N0H.A00();
        }

        public static native FeatureHolder create(VideoQualityPickerProxy videoQualityPickerProxy);

        public static native VideoQualityPickerFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}

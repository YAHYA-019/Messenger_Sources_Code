package com.facebook.rsys.videoqualitypicker.gen;

import X.0Pz;
import X.2JQ;
import X.AbstractC2326GOr;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: VideoQualityPickerModel.class */
public class VideoQualityPickerModel {
    public static 2JQ CONVERTER = N6e.A00(87);
    public static long sMcfTypeId;
    public final int preferredVideoQuality;
    public final int temporaryVideoQualityOverride;

    public VideoQualityPickerModel(int i, int i2) {
        this.preferredVideoQuality = i;
        this.temporaryVideoQualityOverride = i2;
    }

    public static native VideoQualityPickerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoQualityPickerModel)) {
                return false;
            }
            VideoQualityPickerModel videoQualityPickerModel = (VideoQualityPickerModel) obj;
            if (this.preferredVideoQuality == videoQualityPickerModel.preferredVideoQuality && this.temporaryVideoQualityOverride == videoQualityPickerModel.temporaryVideoQualityOverride) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.preferredVideoQuality) + this.temporaryVideoQualityOverride;
    }

    public String toString() {
        return 0Pz.A0o("VideoQualityPickerModel{preferredVideoQuality=", ",temporaryVideoQualityOverride=", "}", this.preferredVideoQuality, this.temporaryVideoQualityOverride);
    }
}

package com.facebook.rsys.videoeffectcommunication.gen;

import X.0Pz;
import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: VideoEffectCommunicationAdditionalEffectInfo.class */
public class VideoEffectCommunicationAdditionalEffectInfo {
    public static 2JQ CONVERTER = N6e.A00(85);
    public static long sMcfTypeId;
    public final int notificationType;

    public VideoEffectCommunicationAdditionalEffectInfo(int i) {
        this.notificationType = i;
    }

    public static native VideoEffectCommunicationAdditionalEffectInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationAdditionalEffectInfo)) {
                return false;
            }
            if (this.notificationType != ((VideoEffectCommunicationAdditionalEffectInfo) obj).notificationType) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 527 + this.notificationType;
    }

    public String toString() {
        return 0Pz.A0d("VideoEffectCommunicationAdditionalEffectInfo{notificationType=", "}", this.notificationType);
    }
}

package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PlaybackVolumeParametersDeprecated.class */
public class PlaybackVolumeParametersDeprecated {
    public static 2JQ CONVERTER = IR0.A00(13);
    public static long sMcfTypeId;
    public final int streamType;
    public final String userID;
    public final float volume;

    public PlaybackVolumeParametersDeprecated(String str, int i, float f) {
        str.getClass();
        this.userID = str;
        this.streamType = i;
        this.volume = f;
    }

    public static native PlaybackVolumeParametersDeprecated createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PlaybackVolumeParametersDeprecated)) {
                return false;
            }
            PlaybackVolumeParametersDeprecated playbackVolumeParametersDeprecated = (PlaybackVolumeParametersDeprecated) obj;
            if (this.userID.equals(playbackVolumeParametersDeprecated.userID) && this.streamType == playbackVolumeParametersDeprecated.streamType && this.volume == playbackVolumeParametersDeprecated.volume) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A07(this.userID) + this.streamType) * 31) + Float.floatToIntBits(this.volume);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PlaybackVolumeParametersDeprecated{userID=");
        A0k.append(this.userID);
        A0k.append(",streamType=");
        A0k.append(this.streamType);
        A0k.append(",volume=");
        A0k.append(this.volume);
        return AnonymousClass001.A0d("}", A0k);
    }
}

package com.facebook.rsys.audio.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: AudioStream.class */
public class AudioStream {
    public static 2JQ CONVERTER = IR0.A00(11);
    public static long sMcfTypeId;
    public final int channelState;
    public final boolean hasVoiceActivity;
    public final Float playbackVolumeDesiredDeprecated;
    public final AudioSource source;
    public final String streamId;
    public final McfReference streamSource;
    public final int streamState;
    public final int streamStateDesired;
    public final int type;

    public AudioStream(AudioSource audioSource, McfReference mcfReference, int i, boolean z, String str, int i2, int i3, int i4, Float f) {
        this.source = audioSource;
        this.streamSource = mcfReference;
        this.type = i;
        this.hasVoiceActivity = z;
        this.streamId = str;
        this.streamState = i2;
        this.streamStateDesired = i3;
        this.channelState = i4;
        this.playbackVolumeDesiredDeprecated = f;
    }

    public static native AudioStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudioStream)) {
                return false;
            }
            AudioStream audioStream = (AudioStream) obj;
            AudioSource audioSource = this.source;
            AudioSource audioSource2 = audioStream.source;
            if (audioSource == null) {
                if (audioSource2 != null) {
                    return false;
                }
            } else if (!audioSource.equals(audioSource2)) {
                return false;
            }
            McfReference mcfReference = this.streamSource;
            McfReference mcfReference2 = audioStream.streamSource;
            if (mcfReference == null) {
                if (mcfReference2 != null) {
                    return false;
                }
            } else if (!mcfReference.equals(mcfReference2)) {
                return false;
            }
            if (this.type != audioStream.type || this.hasVoiceActivity != audioStream.hasVoiceActivity) {
                return false;
            }
            String str = this.streamId;
            String str2 = audioStream.streamId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.streamState != audioStream.streamState || this.streamStateDesired != audioStream.streamStateDesired || this.channelState != audioStream.channelState) {
                return false;
            }
            Float f = this.playbackVolumeDesiredDeprecated;
            Float f2 = audioStream.playbackVolumeDesiredDeprecated;
            if (f == null) {
                if (f2 != null) {
                    return false;
                }
            } else if (!f.equals(f2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AbstractC2326GOr.A03(AnonymousClass001.A02(this.source)) + AnonymousClass001.A02(this.streamSource)) * 31) + this.type) * 31) + (this.hasVoiceActivity ? 1 : 0)) * 31) + 1BL.A05(this.streamId)) * 31) + this.streamState) * 31) + this.streamStateDesired) * 31) + this.channelState) * 31) + 4YU.A03(this.playbackVolumeDesiredDeprecated);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioStream{source=");
        A0k.append(this.source);
        A0k.append(",streamSource=");
        A0k.append(this.streamSource);
        A0k.append(",type=");
        A0k.append(this.type);
        A0k.append(",hasVoiceActivity=");
        A0k.append(this.hasVoiceActivity);
        A0k.append(",streamId=");
        A0k.append(this.streamId);
        A0k.append(",streamState=");
        A0k.append(this.streamState);
        A0k.append(",streamStateDesired=");
        A0k.append(this.streamStateDesired);
        A0k.append(",channelState=");
        A0k.append(this.channelState);
        A0k.append(",playbackVolumeDesiredDeprecated=");
        return AbstractC2327GOs.A0U(this.playbackVolumeDesiredDeprecated, A0k);
    }
}

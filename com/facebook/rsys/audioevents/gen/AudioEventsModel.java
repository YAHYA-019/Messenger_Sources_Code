package com.facebook.rsys.audioevents.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: AudioEventsModel.class */
public class AudioEventsModel {
    public static 2JQ CONVERTER = IR0.A00(14);
    public static long sMcfTypeId;
    public final boolean hasAudioPlayed;
    public final int latestAudioEvent;

    public AudioEventsModel(int i, boolean z) {
        this.latestAudioEvent = i;
        this.hasAudioPlayed = z;
    }

    public static native AudioEventsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AudioEventsModel)) {
                return false;
            }
            AudioEventsModel audioEventsModel = (AudioEventsModel) obj;
            if (this.latestAudioEvent == audioEventsModel.latestAudioEvent && this.hasAudioPlayed == audioEventsModel.hasAudioPlayed) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.latestAudioEvent) + (this.hasAudioPlayed ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioEventsModel{latestAudioEvent=");
        A0k.append(this.latestAudioEvent);
        A0k.append(",hasAudioPlayed=");
        return AbstractC2327GOs.A0X(A0k, this.hasAudioPlayed);
    }
}

package com.facebook.rsys.videoeffectcommunication.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: VideoEffectCommunicationParticipant.class */
public class VideoEffectCommunicationParticipant {
    public static 2JQ CONVERTER = new IQz(14);
    public static long sMcfTypeId;
    public final boolean isActiveInCall;
    public final boolean isActiveInSameEffect;
    public final int loadStatus;
    public final String participantId;

    public VideoEffectCommunicationParticipant(String str, boolean z, boolean z2, int i) {
        str.getClass();
        this.participantId = str;
        this.isActiveInCall = z;
        this.isActiveInSameEffect = z2;
        this.loadStatus = i;
    }

    public static native VideoEffectCommunicationParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationParticipant)) {
                return false;
            }
            VideoEffectCommunicationParticipant videoEffectCommunicationParticipant = (VideoEffectCommunicationParticipant) obj;
            if (this.participantId.equals(videoEffectCommunicationParticipant.participantId) && this.isActiveInCall == videoEffectCommunicationParticipant.isActiveInCall && this.isActiveInSameEffect == videoEffectCommunicationParticipant.isActiveInSameEffect && this.loadStatus == videoEffectCommunicationParticipant.loadStatus) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A07(this.participantId) + (this.isActiveInCall ? 1 : 0)) * 31) + (this.isActiveInSameEffect ? 1 : 0)) * 31) + this.loadStatus;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoEffectCommunicationParticipant{participantId=");
        A0k.append(this.participantId);
        A0k.append(",isActiveInCall=");
        A0k.append(this.isActiveInCall);
        A0k.append(",isActiveInSameEffect=");
        A0k.append(this.isActiveInSameEffect);
        A0k.append(",loadStatus=");
        return AbstractC2327GOs.A0W(A0k, this.loadStatus);
    }
}

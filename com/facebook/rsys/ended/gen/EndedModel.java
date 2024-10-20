package com.facebook.rsys.ended.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: EndedModel.class */
public class EndedModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.RTMP_PACKET_RECEIVED);
    public static long sMcfTypeId;
    public final boolean canTryAgain;
    public final UnsupportedCapabilityFallbacks fallbacks;
    public final int postCallViewType;
    public final int reason;
    public final boolean remoteEnded;
    public final boolean shouldInformPeer;
    public final boolean shouldTriggerVoicemail;
    public final String subReason;
    public final VideoQuality videoQuality;
    public final boolean wasConnected;

    public EndedModel(int i, String str, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks, VideoQuality videoQuality) {
        str.getClass();
        this.reason = i;
        this.subReason = str;
        this.wasConnected = z;
        this.postCallViewType = i2;
        this.canTryAgain = z2;
        this.remoteEnded = z3;
        this.shouldInformPeer = z4;
        this.shouldTriggerVoicemail = z5;
        this.fallbacks = unsupportedCapabilityFallbacks;
        this.videoQuality = videoQuality;
    }

    public static native EndedModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EndedModel)) {
                return false;
            }
            EndedModel endedModel = (EndedModel) obj;
            if (this.reason != endedModel.reason || !this.subReason.equals(endedModel.subReason) || this.wasConnected != endedModel.wasConnected || this.postCallViewType != endedModel.postCallViewType || this.canTryAgain != endedModel.canTryAgain || this.remoteEnded != endedModel.remoteEnded || this.shouldInformPeer != endedModel.shouldInformPeer || this.shouldTriggerVoicemail != endedModel.shouldTriggerVoicemail) {
                return false;
            }
            UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks = this.fallbacks;
            UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks2 = endedModel.fallbacks;
            if (unsupportedCapabilityFallbacks == null) {
                if (unsupportedCapabilityFallbacks2 != null) {
                    return false;
                }
            } else if (!unsupportedCapabilityFallbacks.equals(unsupportedCapabilityFallbacks2)) {
                return false;
            }
            VideoQuality videoQuality = this.videoQuality;
            VideoQuality videoQuality2 = endedModel.videoQuality;
            if (videoQuality == null) {
                if (videoQuality2 != null) {
                    return false;
                }
            } else if (!videoQuality.equals(videoQuality2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass002.A07(this.subReason, AbstractC2326GOr.A03(this.reason)) + (this.wasConnected ? 1 : 0)) * 31) + this.postCallViewType) * 31) + (this.canTryAgain ? 1 : 0)) * 31) + (this.remoteEnded ? 1 : 0)) * 31) + (this.shouldInformPeer ? 1 : 0)) * 31) + (this.shouldTriggerVoicemail ? 1 : 0)) * 31) + AnonymousClass001.A02(this.fallbacks)) * 31) + 4YU.A03(this.videoQuality);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EndedModel{reason=");
        A0k.append(this.reason);
        A0k.append(",subReason=");
        A0k.append(this.subReason);
        A0k.append(",wasConnected=");
        A0k.append(this.wasConnected);
        A0k.append(",postCallViewType=");
        A0k.append(this.postCallViewType);
        A0k.append(",canTryAgain=");
        A0k.append(this.canTryAgain);
        A0k.append(",remoteEnded=");
        A0k.append(this.remoteEnded);
        A0k.append(",shouldInformPeer=");
        A0k.append(this.shouldInformPeer);
        A0k.append(",shouldTriggerVoicemail=");
        A0k.append(this.shouldTriggerVoicemail);
        A0k.append(",fallbacks=");
        A0k.append(this.fallbacks);
        A0k.append(",videoQuality=");
        return AbstractC2327GOs.A0U(this.videoQuality, A0k);
    }
}

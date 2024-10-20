package com.facebook.rsys.videoeffectcommunication.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: VideoEffectCommunicationSharedEffectInfo.class */
public class VideoEffectCommunicationSharedEffectInfo {
    public static 2JQ CONVERTER = new IQz(15);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationAdditionalEffectInfo additionalInfo;
    public final boolean applyOnJoin;
    public final String cryptoHash;
    public final long effectId;
    public final String effectName;
    public final String effectThumbnailUri;
    public final int effectType;
    public final String initiatorId;
    public final String initiatorName;
    public final boolean synchronizedStart;
    public final boolean synchronizedStop;

    public VideoEffectCommunicationSharedEffectInfo(long j, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, int i, VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo) {
        this.effectId = j;
        this.effectName = str;
        this.effectThumbnailUri = str2;
        this.initiatorId = str3;
        this.initiatorName = str4;
        this.cryptoHash = str5;
        this.synchronizedStart = z;
        this.synchronizedStop = z2;
        this.applyOnJoin = z3;
        this.effectType = i;
        this.additionalInfo = videoEffectCommunicationAdditionalEffectInfo;
    }

    public static native VideoEffectCommunicationSharedEffectInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationSharedEffectInfo)) {
                return false;
            }
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo = (VideoEffectCommunicationSharedEffectInfo) obj;
            if (this.effectId != videoEffectCommunicationSharedEffectInfo.effectId) {
                return false;
            }
            String str = this.effectName;
            String str2 = videoEffectCommunicationSharedEffectInfo.effectName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.effectThumbnailUri;
            String str4 = videoEffectCommunicationSharedEffectInfo.effectThumbnailUri;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.initiatorId;
            String str6 = videoEffectCommunicationSharedEffectInfo.initiatorId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.initiatorName;
            String str8 = videoEffectCommunicationSharedEffectInfo.initiatorName;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.cryptoHash;
            String str10 = videoEffectCommunicationSharedEffectInfo.cryptoHash;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            if (this.synchronizedStart != videoEffectCommunicationSharedEffectInfo.synchronizedStart || this.synchronizedStop != videoEffectCommunicationSharedEffectInfo.synchronizedStop || this.applyOnJoin != videoEffectCommunicationSharedEffectInfo.applyOnJoin || this.effectType != videoEffectCommunicationSharedEffectInfo.effectType) {
                return false;
            }
            VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo = this.additionalInfo;
            VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo2 = videoEffectCommunicationSharedEffectInfo.additionalInfo;
            if (videoEffectCommunicationAdditionalEffectInfo == null) {
                if (videoEffectCommunicationAdditionalEffectInfo2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationAdditionalEffectInfo.equals(videoEffectCommunicationAdditionalEffectInfo2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((AbstractC2326GOr.A03(1BL.A01(this.effectId)) + 1BL.A05(this.effectName)) * 31) + 1BL.A05(this.effectThumbnailUri)) * 31) + 1BL.A05(this.initiatorId)) * 31) + 1BL.A05(this.initiatorName)) * 31) + 1BL.A05(this.cryptoHash)) * 31) + (this.synchronizedStart ? 1 : 0)) * 31) + (this.synchronizedStop ? 1 : 0)) * 31) + (this.applyOnJoin ? 1 : 0)) * 31) + this.effectType) * 31) + 4YU.A03(this.additionalInfo);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoEffectCommunicationSharedEffectInfo{effectId=");
        A0k.append(this.effectId);
        A0k.append(",effectName=");
        A0k.append(this.effectName);
        A0k.append(",effectThumbnailUri=");
        A0k.append(this.effectThumbnailUri);
        A0k.append(",initiatorId=");
        A0k.append(this.initiatorId);
        A0k.append(",initiatorName=");
        A0k.append(this.initiatorName);
        A0k.append(",cryptoHash=");
        A0k.append(this.cryptoHash);
        A0k.append(",synchronizedStart=");
        A0k.append(this.synchronizedStart);
        A0k.append(",synchronizedStop=");
        A0k.append(this.synchronizedStop);
        A0k.append(",applyOnJoin=");
        A0k.append(this.applyOnJoin);
        A0k.append(",effectType=");
        A0k.append(this.effectType);
        A0k.append(",additionalInfo=");
        return AbstractC2327GOs.A0U(this.additionalInfo, A0k);
    }
}

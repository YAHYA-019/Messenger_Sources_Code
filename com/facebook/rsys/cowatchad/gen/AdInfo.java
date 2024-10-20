package com.facebook.rsys.cowatchad.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.7zP;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: AdInfo.class */
public class AdInfo {
    public static 2JQ CONVERTER = IR0.A00(86);
    public static long sMcfTypeId;
    public final int adIndex;
    public final float aspectRatio;
    public final String clientToken;
    public final int durationMs;
    public final String helpUrl;
    public final String hideUrl;
    public final boolean isSponsored;
    public final String playbackUrl;
    public final long playbackUrlExpirationTimestampMs;
    public final String preferenceUrl;
    public final String reportUrl;
    public final int totalAdCount;
    public final String videoId;

    public AdInfo(String str, String str2, String str3, long j, int i, int i2, int i3, float f, boolean z, String str4, String str5, String str6, String str7) {
        7zP.A1S(str, str2, str3);
        this.clientToken = str;
        this.videoId = str2;
        this.playbackUrl = str3;
        this.playbackUrlExpirationTimestampMs = j;
        this.durationMs = i;
        this.adIndex = i2;
        this.totalAdCount = i3;
        this.aspectRatio = f;
        this.isSponsored = z;
        this.reportUrl = str4;
        this.hideUrl = str5;
        this.preferenceUrl = str6;
        this.helpUrl = str7;
    }

    public static native AdInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdInfo)) {
                return false;
            }
            AdInfo adInfo = (AdInfo) obj;
            if (!this.clientToken.equals(adInfo.clientToken) || !this.videoId.equals(adInfo.videoId) || !this.playbackUrl.equals(adInfo.playbackUrl) || this.playbackUrlExpirationTimestampMs != adInfo.playbackUrlExpirationTimestampMs || this.durationMs != adInfo.durationMs || this.adIndex != adInfo.adIndex || this.totalAdCount != adInfo.totalAdCount || this.aspectRatio != adInfo.aspectRatio || this.isSponsored != adInfo.isSponsored) {
                return false;
            }
            String str = this.reportUrl;
            String str2 = adInfo.reportUrl;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.hideUrl;
            String str4 = adInfo.hideUrl;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.preferenceUrl;
            String str6 = adInfo.preferenceUrl;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.helpUrl;
            String str8 = adInfo.helpUrl;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((1BL.A00((((((AnonymousClass002.A02(this.playbackUrlExpirationTimestampMs, AnonymousClass002.A07(this.playbackUrl, AnonymousClass002.A07(this.videoId, AbstractC2326GOr.A07(this.clientToken)))) + this.durationMs) * 31) + this.adIndex) * 31) + this.totalAdCount) * 31, this.aspectRatio) + (this.isSponsored ? 1 : 0)) * 31) + 1BL.A05(this.reportUrl)) * 31) + 1BL.A05(this.hideUrl)) * 31) + 1BL.A05(this.preferenceUrl)) * 31) + 7zN.A05(this.helpUrl);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AdInfo{clientToken=");
        A0k.append(this.clientToken);
        A0k.append(",videoId=");
        A0k.append(this.videoId);
        A0k.append(",playbackUrl=");
        A0k.append(this.playbackUrl);
        A0k.append(",playbackUrlExpirationTimestampMs=");
        A0k.append(this.playbackUrlExpirationTimestampMs);
        A0k.append(",durationMs=");
        A0k.append(this.durationMs);
        A0k.append(",adIndex=");
        A0k.append(this.adIndex);
        A0k.append(",totalAdCount=");
        A0k.append(this.totalAdCount);
        A0k.append(",aspectRatio=");
        A0k.append(this.aspectRatio);
        A0k.append(",isSponsored=");
        A0k.append(this.isSponsored);
        A0k.append(",reportUrl=");
        A0k.append(this.reportUrl);
        A0k.append(",hideUrl=");
        A0k.append(this.hideUrl);
        A0k.append(",preferenceUrl=");
        A0k.append(this.preferenceUrl);
        A0k.append(",helpUrl=");
        return GOq.A12(this.helpUrl, A0k);
    }
}

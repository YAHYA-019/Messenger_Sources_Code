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

/* loaded from: CowatchAd.class */
public class CowatchAd {
    public static 2JQ CONVERTER = IR0.A00(87);
    public static long sMcfTypeId;
    public final float adAspectRatio;
    public final String adHelpUri;
    public final String adHideUri;
    public final String adPreferenceUri;
    public final String adReportingUri;
    public final String clientToken;
    public final long durationMs;
    public final boolean isSponsored;
    public final String pageId;
    public final long startTimeMs;
    public final int status;
    public final String url;
    public final long urlExpirationMs;
    public final String videoId;

    public CowatchAd(String str, String str2, String str3, long j, long j2, long j3, int i, float f, boolean z, String str4, String str5, String str6, String str7, String str8) {
        7zP.A1S(str, str2, str3);
        this.clientToken = str;
        this.videoId = str2;
        this.url = str3;
        this.urlExpirationMs = j;
        this.startTimeMs = j2;
        this.durationMs = j3;
        this.status = i;
        this.adAspectRatio = f;
        this.isSponsored = z;
        this.adPreferenceUri = str4;
        this.adReportingUri = str5;
        this.adHideUri = str6;
        this.adHelpUri = str7;
        this.pageId = str8;
    }

    public static native CowatchAd createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAd)) {
                return false;
            }
            CowatchAd cowatchAd = (CowatchAd) obj;
            if (!this.clientToken.equals(cowatchAd.clientToken) || !this.videoId.equals(cowatchAd.videoId) || !this.url.equals(cowatchAd.url) || this.urlExpirationMs != cowatchAd.urlExpirationMs || this.startTimeMs != cowatchAd.startTimeMs || this.durationMs != cowatchAd.durationMs || this.status != cowatchAd.status || this.adAspectRatio != cowatchAd.adAspectRatio || this.isSponsored != cowatchAd.isSponsored) {
                return false;
            }
            String str = this.adPreferenceUri;
            String str2 = cowatchAd.adPreferenceUri;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.adReportingUri;
            String str4 = cowatchAd.adReportingUri;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.adHideUri;
            String str6 = cowatchAd.adHideUri;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.adHelpUri;
            String str8 = cowatchAd.adHelpUri;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.pageId;
            String str10 = cowatchAd.pageId;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((1BL.A00((AnonymousClass002.A02(this.durationMs, AnonymousClass002.A02(this.startTimeMs, AnonymousClass002.A02(this.urlExpirationMs, AnonymousClass002.A07(this.url, AnonymousClass002.A07(this.videoId, AbstractC2326GOr.A07(this.clientToken)))))) + this.status) * 31, this.adAspectRatio) + (this.isSponsored ? 1 : 0)) * 31) + 1BL.A05(this.adPreferenceUri)) * 31) + 1BL.A05(this.adReportingUri)) * 31) + 1BL.A05(this.adHideUri)) * 31) + 1BL.A05(this.adHelpUri)) * 31) + 7zN.A05(this.pageId);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAd{clientToken=");
        A0k.append(this.clientToken);
        A0k.append(",videoId=");
        A0k.append(this.videoId);
        A0k.append(",url=");
        A0k.append(this.url);
        A0k.append(",urlExpirationMs=");
        A0k.append(this.urlExpirationMs);
        A0k.append(",startTimeMs=");
        A0k.append(this.startTimeMs);
        A0k.append(",durationMs=");
        A0k.append(this.durationMs);
        A0k.append(",status=");
        A0k.append(this.status);
        A0k.append(",adAspectRatio=");
        A0k.append(this.adAspectRatio);
        A0k.append(",isSponsored=");
        A0k.append(this.isSponsored);
        A0k.append(",adPreferenceUri=");
        A0k.append(this.adPreferenceUri);
        A0k.append(",adReportingUri=");
        A0k.append(this.adReportingUri);
        A0k.append(",adHideUri=");
        A0k.append(this.adHideUri);
        A0k.append(",adHelpUri=");
        A0k.append(this.adHelpUri);
        A0k.append(",pageId=");
        return GOq.A12(this.pageId, A0k);
    }
}

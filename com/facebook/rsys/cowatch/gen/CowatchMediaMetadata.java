package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchMediaMetadata.class */
public class CowatchMediaMetadata {
    public static 2JQ CONVERTER = IR0.A00(75);
    public static long sMcfTypeId;
    public final boolean containsLicensedMusic;
    public final String contentRating;
    public final String dashManifest;
    public final long durationMs;
    public final boolean isLive;
    public final boolean isReel;
    public final boolean isReportable;
    public final float mediaAspectRatio;
    public final String mediaSubtitle;
    public final String mediaTitle;
    public final String mediaURL;
    public final String ownerAvatarURL;
    public final String ownerName;
    public final CowatchReelsMediaInfoModel reelsMediaMetadata;

    public CowatchMediaMetadata(String str, String str2, boolean z, long j, float f, String str3, String str4, boolean z2, boolean z3, String str5, boolean z4, String str6, String str7, CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel) {
        this.mediaURL = str;
        this.dashManifest = str2;
        this.isLive = z;
        this.durationMs = j;
        this.mediaAspectRatio = f;
        this.mediaTitle = str3;
        this.mediaSubtitle = str4;
        this.containsLicensedMusic = z2;
        this.isReportable = z3;
        this.contentRating = str5;
        this.isReel = z4;
        this.ownerName = str6;
        this.ownerAvatarURL = str7;
        this.reelsMediaMetadata = cowatchReelsMediaInfoModel;
    }

    public static native CowatchMediaMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaMetadata)) {
                return false;
            }
            CowatchMediaMetadata cowatchMediaMetadata = (CowatchMediaMetadata) obj;
            String str = this.mediaURL;
            String str2 = cowatchMediaMetadata.mediaURL;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.dashManifest;
            String str4 = cowatchMediaMetadata.dashManifest;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.isLive != cowatchMediaMetadata.isLive || this.durationMs != cowatchMediaMetadata.durationMs || this.mediaAspectRatio != cowatchMediaMetadata.mediaAspectRatio) {
                return false;
            }
            String str5 = this.mediaTitle;
            String str6 = cowatchMediaMetadata.mediaTitle;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.mediaSubtitle;
            String str8 = cowatchMediaMetadata.mediaSubtitle;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (this.containsLicensedMusic != cowatchMediaMetadata.containsLicensedMusic || this.isReportable != cowatchMediaMetadata.isReportable) {
                return false;
            }
            String str9 = this.contentRating;
            String str10 = cowatchMediaMetadata.contentRating;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            if (this.isReel != cowatchMediaMetadata.isReel) {
                return false;
            }
            String str11 = this.ownerName;
            String str12 = cowatchMediaMetadata.ownerName;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.ownerAvatarURL;
            String str14 = cowatchMediaMetadata.ownerAvatarURL;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel = this.reelsMediaMetadata;
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel2 = cowatchMediaMetadata.reelsMediaMetadata;
            if (cowatchReelsMediaInfoModel == null) {
                if (cowatchReelsMediaInfoModel2 != null) {
                    return false;
                }
            } else if (!cowatchReelsMediaInfoModel.equals(cowatchReelsMediaInfoModel2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((1BL.A00(AnonymousClass002.A02(this.durationMs, (((AbstractC2326GOr.A03(1BL.A05(this.mediaURL)) + 1BL.A05(this.dashManifest)) * 31) + (this.isLive ? 1 : 0)) * 31), this.mediaAspectRatio) + 1BL.A05(this.mediaTitle)) * 31) + 1BL.A05(this.mediaSubtitle)) * 31) + (this.containsLicensedMusic ? 1 : 0)) * 31) + (this.isReportable ? 1 : 0)) * 31) + 1BL.A05(this.contentRating)) * 31) + (this.isReel ? 1 : 0)) * 31) + 1BL.A05(this.ownerName)) * 31) + 1BL.A05(this.ownerAvatarURL)) * 31) + 4YU.A03(this.reelsMediaMetadata);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchMediaMetadata{mediaURL=");
        A0k.append(this.mediaURL);
        A0k.append(",dashManifest=");
        A0k.append(this.dashManifest);
        A0k.append(",isLive=");
        A0k.append(this.isLive);
        A0k.append(",durationMs=");
        A0k.append(this.durationMs);
        A0k.append(",mediaAspectRatio=");
        A0k.append(this.mediaAspectRatio);
        A0k.append(",mediaTitle=");
        A0k.append(this.mediaTitle);
        A0k.append(",mediaSubtitle=");
        A0k.append(this.mediaSubtitle);
        A0k.append(",containsLicensedMusic=");
        A0k.append(this.containsLicensedMusic);
        A0k.append(",isReportable=");
        A0k.append(this.isReportable);
        A0k.append(",contentRating=");
        A0k.append(this.contentRating);
        A0k.append(",isReel=");
        A0k.append(this.isReel);
        A0k.append(",ownerName=");
        A0k.append(this.ownerName);
        A0k.append(",ownerAvatarURL=");
        A0k.append(this.ownerAvatarURL);
        A0k.append(",reelsMediaMetadata=");
        return AbstractC2327GOs.A0U(this.reelsMediaMetadata, A0k);
    }
}

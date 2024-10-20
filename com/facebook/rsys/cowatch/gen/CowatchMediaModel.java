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

/* loaded from: CowatchMediaModel.class */
public class CowatchMediaModel {
    public static 2JQ CONVERTER = IR0.A00(76);
    public static long sMcfTypeId;
    public final boolean containsLicensedMusic;
    public final String dashManifest;
    public final long expirationTimestampMs;
    public final CowatchExternalMediaConfig externalMediaConfig;
    public final boolean isLive;
    public final String logInfo;
    public final float mediaAspectRatio;
    public final String mediaAuthor;
    public final String mediaDescription;
    public final String mediaFallbackURL;
    public final String mediaID;
    public final long mediaLastWatchedPositionMs;
    public final String mediaRankingRequestId;
    public final String mediaSource;
    public final long mediaStartPlayPositionMs;
    public final String mediaSubtitle;
    public final String mediaTitle;
    public final int mediaType;
    public final String mediaURL;
    public final boolean ownerIsVerified;
    public final long playableDurationMs;
    public final int tapAction;
    public final String thumbnailURL;
    public final String tracking;

    public CowatchMediaModel(String str, String str2, String str3, float f, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, long j, long j2, long j3, boolean z, boolean z2, String str11, boolean z3, String str12, int i2, String str13, long j4, CowatchExternalMediaConfig cowatchExternalMediaConfig) {
        str.getClass();
        str2.getClass();
        this.mediaID = str;
        this.mediaSource = str2;
        this.mediaURL = str3;
        this.mediaAspectRatio = f;
        this.dashManifest = str4;
        this.mediaType = i;
        this.thumbnailURL = str5;
        this.mediaTitle = str6;
        this.mediaAuthor = str7;
        this.mediaSubtitle = str8;
        this.mediaDescription = str9;
        this.mediaFallbackURL = str10;
        this.expirationTimestampMs = j;
        this.playableDurationMs = j2;
        this.mediaLastWatchedPositionMs = j3;
        this.ownerIsVerified = z;
        this.isLive = z2;
        this.mediaRankingRequestId = str11;
        this.containsLicensedMusic = z3;
        this.logInfo = str12;
        this.tapAction = i2;
        this.tracking = str13;
        this.mediaStartPlayPositionMs = j4;
        this.externalMediaConfig = cowatchExternalMediaConfig;
    }

    public static native CowatchMediaModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaModel)) {
                return false;
            }
            CowatchMediaModel cowatchMediaModel = (CowatchMediaModel) obj;
            if (!this.mediaID.equals(cowatchMediaModel.mediaID) || !this.mediaSource.equals(cowatchMediaModel.mediaSource)) {
                return false;
            }
            String str = this.mediaURL;
            String str2 = cowatchMediaModel.mediaURL;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.mediaAspectRatio != cowatchMediaModel.mediaAspectRatio) {
                return false;
            }
            String str3 = this.dashManifest;
            String str4 = cowatchMediaModel.dashManifest;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.mediaType != cowatchMediaModel.mediaType) {
                return false;
            }
            String str5 = this.thumbnailURL;
            String str6 = cowatchMediaModel.thumbnailURL;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.mediaTitle;
            String str8 = cowatchMediaModel.mediaTitle;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.mediaAuthor;
            String str10 = cowatchMediaModel.mediaAuthor;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.mediaSubtitle;
            String str12 = cowatchMediaModel.mediaSubtitle;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.mediaDescription;
            String str14 = cowatchMediaModel.mediaDescription;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.mediaFallbackURL;
            String str16 = cowatchMediaModel.mediaFallbackURL;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            if (this.expirationTimestampMs != cowatchMediaModel.expirationTimestampMs || this.playableDurationMs != cowatchMediaModel.playableDurationMs || this.mediaLastWatchedPositionMs != cowatchMediaModel.mediaLastWatchedPositionMs || this.ownerIsVerified != cowatchMediaModel.ownerIsVerified || this.isLive != cowatchMediaModel.isLive) {
                return false;
            }
            String str17 = this.mediaRankingRequestId;
            String str18 = cowatchMediaModel.mediaRankingRequestId;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            if (this.containsLicensedMusic != cowatchMediaModel.containsLicensedMusic) {
                return false;
            }
            String str19 = this.logInfo;
            String str20 = cowatchMediaModel.logInfo;
            if (str19 == null) {
                if (str20 != null) {
                    return false;
                }
            } else if (!str19.equals(str20)) {
                return false;
            }
            if (this.tapAction != cowatchMediaModel.tapAction) {
                return false;
            }
            String str21 = this.tracking;
            String str22 = cowatchMediaModel.tracking;
            if (str21 == null) {
                if (str22 != null) {
                    return false;
                }
            } else if (!str21.equals(str22)) {
                return false;
            }
            if (this.mediaStartPlayPositionMs != cowatchMediaModel.mediaStartPlayPositionMs) {
                return false;
            }
            CowatchExternalMediaConfig cowatchExternalMediaConfig = this.externalMediaConfig;
            CowatchExternalMediaConfig cowatchExternalMediaConfig2 = cowatchMediaModel.externalMediaConfig;
            if (cowatchExternalMediaConfig == null) {
                if (cowatchExternalMediaConfig2 != null) {
                    return false;
                }
            } else if (!cowatchExternalMediaConfig.equals(cowatchExternalMediaConfig2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.mediaStartPlayPositionMs, (((((((((((((AnonymousClass002.A02(this.mediaLastWatchedPositionMs, AnonymousClass002.A02(this.playableDurationMs, AnonymousClass002.A02(this.expirationTimestampMs, (((((((((((((((1BL.A00((AnonymousClass002.A07(this.mediaSource, AbstractC2326GOr.A07(this.mediaID)) + 1BL.A05(this.mediaURL)) * 31, this.mediaAspectRatio) + 1BL.A05(this.dashManifest)) * 31) + this.mediaType) * 31) + 1BL.A05(this.thumbnailURL)) * 31) + 1BL.A05(this.mediaTitle)) * 31) + 1BL.A05(this.mediaAuthor)) * 31) + 1BL.A05(this.mediaSubtitle)) * 31) + 1BL.A05(this.mediaDescription)) * 31) + 1BL.A05(this.mediaFallbackURL)) * 31))) + (this.ownerIsVerified ? 1 : 0)) * 31) + (this.isLive ? 1 : 0)) * 31) + 1BL.A05(this.mediaRankingRequestId)) * 31) + (this.containsLicensedMusic ? 1 : 0)) * 31) + 1BL.A05(this.logInfo)) * 31) + this.tapAction) * 31) + 1BL.A05(this.tracking)) * 31) + 4YU.A03(this.externalMediaConfig);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchMediaModel{mediaID=");
        A0k.append(this.mediaID);
        A0k.append(",mediaSource=");
        A0k.append(this.mediaSource);
        A0k.append(",mediaURL=");
        A0k.append(this.mediaURL);
        A0k.append(",mediaAspectRatio=");
        A0k.append(this.mediaAspectRatio);
        A0k.append(",dashManifest=");
        A0k.append(this.dashManifest);
        A0k.append(",mediaType=");
        A0k.append(this.mediaType);
        A0k.append(",thumbnailURL=");
        A0k.append(this.thumbnailURL);
        A0k.append(",mediaTitle=");
        A0k.append(this.mediaTitle);
        A0k.append(",mediaAuthor=");
        A0k.append(this.mediaAuthor);
        A0k.append(",mediaSubtitle=");
        A0k.append(this.mediaSubtitle);
        A0k.append(",mediaDescription=");
        A0k.append(this.mediaDescription);
        A0k.append(",mediaFallbackURL=");
        A0k.append(this.mediaFallbackURL);
        A0k.append(",expirationTimestampMs=");
        A0k.append(this.expirationTimestampMs);
        A0k.append(",playableDurationMs=");
        A0k.append(this.playableDurationMs);
        A0k.append(",mediaLastWatchedPositionMs=");
        A0k.append(this.mediaLastWatchedPositionMs);
        A0k.append(",ownerIsVerified=");
        A0k.append(this.ownerIsVerified);
        A0k.append(",isLive=");
        A0k.append(this.isLive);
        A0k.append(",mediaRankingRequestId=");
        A0k.append(this.mediaRankingRequestId);
        A0k.append(",containsLicensedMusic=");
        A0k.append(this.containsLicensedMusic);
        A0k.append(",logInfo=");
        A0k.append(this.logInfo);
        A0k.append(",tapAction=");
        A0k.append(this.tapAction);
        A0k.append(",tracking=");
        A0k.append(this.tracking);
        A0k.append(",mediaStartPlayPositionMs=");
        A0k.append(this.mediaStartPlayPositionMs);
        A0k.append(",externalMediaConfig=");
        return AbstractC2327GOs.A0U(this.externalMediaConfig, A0k);
    }
}

package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchReelsMediaInfoModel.class */
public class CowatchReelsMediaInfoModel {
    public static 2JQ CONVERTER = IR0.A00(84);
    public static long sMcfTypeId;
    public final String commentCount;
    public final String effectsTitle;
    public final String effectsUri;
    public final ArrayList hashtags;
    public final boolean isViewerLiked;
    public final String likeCount;
    public final String musicAlbumArtUri;
    public final String musicTitle;
    public final String privacyScopeImage;
    public final String privacyScopeLabel;
    public final int reelsMediaSource;
    public final String shareCount;

    public CowatchReelsMediaInfoModel(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, int i, String str7, String str8, String str9, boolean z) {
        arrayList.getClass();
        this.musicTitle = str;
        this.musicAlbumArtUri = str2;
        this.effectsTitle = str3;
        this.effectsUri = str4;
        this.hashtags = arrayList;
        this.privacyScopeLabel = str5;
        this.privacyScopeImage = str6;
        this.reelsMediaSource = i;
        this.likeCount = str7;
        this.commentCount = str8;
        this.shareCount = str9;
        this.isViewerLiked = z;
    }

    public static native CowatchReelsMediaInfoModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchReelsMediaInfoModel)) {
                return false;
            }
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel = (CowatchReelsMediaInfoModel) obj;
            String str = this.musicTitle;
            String str2 = cowatchReelsMediaInfoModel.musicTitle;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.musicAlbumArtUri;
            String str4 = cowatchReelsMediaInfoModel.musicAlbumArtUri;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.effectsTitle;
            String str6 = cowatchReelsMediaInfoModel.effectsTitle;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.effectsUri;
            String str8 = cowatchReelsMediaInfoModel.effectsUri;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (!this.hashtags.equals(cowatchReelsMediaInfoModel.hashtags)) {
                return false;
            }
            String str9 = this.privacyScopeLabel;
            String str10 = cowatchReelsMediaInfoModel.privacyScopeLabel;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.privacyScopeImage;
            String str12 = cowatchReelsMediaInfoModel.privacyScopeImage;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            if (this.reelsMediaSource != cowatchReelsMediaInfoModel.reelsMediaSource) {
                return false;
            }
            String str13 = this.likeCount;
            String str14 = cowatchReelsMediaInfoModel.likeCount;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.commentCount;
            String str16 = cowatchReelsMediaInfoModel.commentCount;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            String str17 = this.shareCount;
            String str18 = cowatchReelsMediaInfoModel.shareCount;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            if (this.isViewerLiked != cowatchReelsMediaInfoModel.isViewerLiked) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass002.A05(this.hashtags, (((((AbstractC2326GOr.A03(1BL.A05(this.musicTitle)) + 1BL.A05(this.musicAlbumArtUri)) * 31) + 1BL.A05(this.effectsTitle)) * 31) + 1BL.A05(this.effectsUri)) * 31) + 1BL.A05(this.privacyScopeLabel)) * 31) + 1BL.A05(this.privacyScopeImage)) * 31) + this.reelsMediaSource) * 31) + 1BL.A05(this.likeCount)) * 31) + 1BL.A05(this.commentCount)) * 31) + 7zN.A05(this.shareCount)) * 31) + (this.isViewerLiked ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchReelsMediaInfoModel{musicTitle=");
        A0k.append(this.musicTitle);
        A0k.append(",musicAlbumArtUri=");
        A0k.append(this.musicAlbumArtUri);
        A0k.append(",effectsTitle=");
        A0k.append(this.effectsTitle);
        A0k.append(",effectsUri=");
        A0k.append(this.effectsUri);
        A0k.append(",hashtags=");
        A0k.append(this.hashtags);
        A0k.append(",privacyScopeLabel=");
        A0k.append(this.privacyScopeLabel);
        A0k.append(",privacyScopeImage=");
        A0k.append(this.privacyScopeImage);
        A0k.append(",reelsMediaSource=");
        A0k.append(this.reelsMediaSource);
        A0k.append(",likeCount=");
        A0k.append(this.likeCount);
        A0k.append(",commentCount=");
        A0k.append(this.commentCount);
        A0k.append(",shareCount=");
        A0k.append(this.shareCount);
        A0k.append(",isViewerLiked=");
        return AbstractC2327GOs.A0X(A0k, this.isViewerLiked);
    }
}

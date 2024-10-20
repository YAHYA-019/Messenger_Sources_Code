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

/* loaded from: CowatchPlayerModel.class */
public class CowatchPlayerModel {
    public static 2JQ CONVERTER = IR0.A00(81);
    public static long sMcfTypeId;
    public final CowatchAdminMessageModel adminMessage;
    public final CowatchCaptionLocale captionSelectedLanguage;
    public final int contentAvailability;
    public final CowatchPlayerInternalModel internal;
    public final CowatchPlayerIosModel iosModel;
    public final boolean isStartedFromAutoplay;
    public final String mediaID;
    public final CowatchMediaInfoModel mediaInfo;
    public final int mediaPlaybackState;
    public final long mediaPositionMs;
    public final String mediaSource;
    public final CowatchSuggestedContentQueueModel suggestedContentQueue;

    public CowatchPlayerModel(String str, String str2, int i, long j, CowatchCaptionLocale cowatchCaptionLocale, CowatchMediaInfoModel cowatchMediaInfoModel, CowatchAdminMessageModel cowatchAdminMessageModel, int i2, CowatchPlayerIosModel cowatchPlayerIosModel, boolean z, CowatchPlayerInternalModel cowatchPlayerInternalModel, CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel) {
        cowatchPlayerIosModel.getClass();
        cowatchPlayerInternalModel.getClass();
        this.mediaID = str;
        this.mediaSource = str2;
        this.mediaPlaybackState = i;
        this.mediaPositionMs = j;
        this.captionSelectedLanguage = cowatchCaptionLocale;
        this.mediaInfo = cowatchMediaInfoModel;
        this.adminMessage = cowatchAdminMessageModel;
        this.contentAvailability = i2;
        this.iosModel = cowatchPlayerIosModel;
        this.isStartedFromAutoplay = z;
        this.internal = cowatchPlayerInternalModel;
        this.suggestedContentQueue = cowatchSuggestedContentQueueModel;
    }

    public static native CowatchPlayerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPlayerModel)) {
                return false;
            }
            CowatchPlayerModel cowatchPlayerModel = (CowatchPlayerModel) obj;
            String str = this.mediaID;
            String str2 = cowatchPlayerModel.mediaID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.mediaSource;
            String str4 = cowatchPlayerModel.mediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.mediaPlaybackState != cowatchPlayerModel.mediaPlaybackState || this.mediaPositionMs != cowatchPlayerModel.mediaPositionMs) {
                return false;
            }
            CowatchCaptionLocale cowatchCaptionLocale = this.captionSelectedLanguage;
            CowatchCaptionLocale cowatchCaptionLocale2 = cowatchPlayerModel.captionSelectedLanguage;
            if (cowatchCaptionLocale == null) {
                if (cowatchCaptionLocale2 != null) {
                    return false;
                }
            } else if (!cowatchCaptionLocale.equals(cowatchCaptionLocale2)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = this.mediaInfo;
            CowatchMediaInfoModel cowatchMediaInfoModel2 = cowatchPlayerModel.mediaInfo;
            if (cowatchMediaInfoModel == null) {
                if (cowatchMediaInfoModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaInfoModel.equals(cowatchMediaInfoModel2)) {
                return false;
            }
            CowatchAdminMessageModel cowatchAdminMessageModel = this.adminMessage;
            CowatchAdminMessageModel cowatchAdminMessageModel2 = cowatchPlayerModel.adminMessage;
            if (cowatchAdminMessageModel == null) {
                if (cowatchAdminMessageModel2 != null) {
                    return false;
                }
            } else if (!cowatchAdminMessageModel.equals(cowatchAdminMessageModel2)) {
                return false;
            }
            if (this.contentAvailability != cowatchPlayerModel.contentAvailability || !this.iosModel.equals(cowatchPlayerModel.iosModel) || this.isStartedFromAutoplay != cowatchPlayerModel.isStartedFromAutoplay || !this.internal.equals(cowatchPlayerModel.internal)) {
                return false;
            }
            CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel = this.suggestedContentQueue;
            CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel2 = cowatchPlayerModel.suggestedContentQueue;
            if (cowatchSuggestedContentQueueModel == null) {
                if (cowatchSuggestedContentQueueModel2 != null) {
                    return false;
                }
            } else if (!cowatchSuggestedContentQueueModel.equals(cowatchSuggestedContentQueueModel2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.internal, (AnonymousClass002.A05(this.iosModel, (((((((AnonymousClass002.A02(this.mediaPositionMs, (((AbstractC2326GOr.A03(1BL.A05(this.mediaID)) + 1BL.A05(this.mediaSource)) * 31) + this.mediaPlaybackState) * 31) + AnonymousClass001.A02(this.captionSelectedLanguage)) * 31) + AnonymousClass001.A02(this.mediaInfo)) * 31) + AnonymousClass001.A02(this.adminMessage)) * 31) + this.contentAvailability) * 31) + (this.isStartedFromAutoplay ? 1 : 0)) * 31) + 4YU.A03(this.suggestedContentQueue);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchPlayerModel{mediaID=");
        A0k.append(this.mediaID);
        A0k.append(",mediaSource=");
        A0k.append(this.mediaSource);
        A0k.append(",mediaPlaybackState=");
        A0k.append(this.mediaPlaybackState);
        A0k.append(",mediaPositionMs=");
        A0k.append(this.mediaPositionMs);
        A0k.append(",captionSelectedLanguage=");
        A0k.append(this.captionSelectedLanguage);
        A0k.append(",mediaInfo=");
        A0k.append(this.mediaInfo);
        A0k.append(",adminMessage=");
        A0k.append(this.adminMessage);
        A0k.append(",contentAvailability=");
        A0k.append(this.contentAvailability);
        A0k.append(",iosModel=");
        A0k.append(this.iosModel);
        A0k.append(",isStartedFromAutoplay=");
        A0k.append(this.isStartedFromAutoplay);
        A0k.append(",internal=");
        A0k.append(this.internal);
        A0k.append(",suggestedContentQueue=");
        return AbstractC2327GOs.A0U(this.suggestedContentQueue, A0k);
    }
}

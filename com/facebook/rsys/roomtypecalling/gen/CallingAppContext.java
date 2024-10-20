package com.facebook.rsys.roomtypecalling.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.GOq;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

/* loaded from: CallingAppContext.class */
public class CallingAppContext {
    public static 2JQ CONVERTER = IR0.A00(ActionId.SERVICE_ON_START_COMMAND);
    public static long sMcfTypeId;
    public final String callablePostId;
    public final HashSet callingTags;
    public final String horizonVoipZoneId;
    public final String horizonWorldId;
    public final String immersiveModeDoorId;
    public final boolean isMetaAiCall;
    public final String linkUrl;
    public final String liveBroadcastId;
    public final String phoneNumber;
    public final String pstnUserId;
    public final String rtcDoorId;
    public final String serverInfoData;
    public final String threadID;
    public final int threadType;

    public CallingAppContext(String str, int i, HashSet hashSet, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11) {
        this.threadID = str;
        this.threadType = i;
        this.callingTags = hashSet;
        this.serverInfoData = str2;
        this.linkUrl = str3;
        this.liveBroadcastId = str4;
        this.callablePostId = str5;
        this.immersiveModeDoorId = str6;
        this.rtcDoorId = str7;
        this.phoneNumber = str8;
        this.isMetaAiCall = z;
        this.pstnUserId = str9;
        this.horizonWorldId = str10;
        this.horizonVoipZoneId = str11;
    }

    public static native CallingAppContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallingAppContext)) {
                return false;
            }
            CallingAppContext callingAppContext = (CallingAppContext) obj;
            String str = this.threadID;
            String str2 = callingAppContext.threadID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.threadType != callingAppContext.threadType) {
                return false;
            }
            HashSet hashSet = this.callingTags;
            HashSet hashSet2 = callingAppContext.callingTags;
            if (hashSet == null) {
                if (hashSet2 != null) {
                    return false;
                }
            } else if (!hashSet.equals(hashSet2)) {
                return false;
            }
            String str3 = this.serverInfoData;
            String str4 = callingAppContext.serverInfoData;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.linkUrl;
            String str6 = callingAppContext.linkUrl;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.liveBroadcastId;
            String str8 = callingAppContext.liveBroadcastId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.callablePostId;
            String str10 = callingAppContext.callablePostId;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.immersiveModeDoorId;
            String str12 = callingAppContext.immersiveModeDoorId;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.rtcDoorId;
            String str14 = callingAppContext.rtcDoorId;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.phoneNumber;
            String str16 = callingAppContext.phoneNumber;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            if (this.isMetaAiCall != callingAppContext.isMetaAiCall) {
                return false;
            }
            String str17 = this.pstnUserId;
            String str18 = callingAppContext.pstnUserId;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            String str19 = this.horizonWorldId;
            String str20 = callingAppContext.horizonWorldId;
            if (str19 == null) {
                if (str20 != null) {
                    return false;
                }
            } else if (!str19.equals(str20)) {
                return false;
            }
            String str21 = this.horizonVoipZoneId;
            String str22 = callingAppContext.horizonVoipZoneId;
            if (str21 == null) {
                if (str22 != null) {
                    return false;
                }
            } else if (!str21.equals(str22)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((AbstractC2326GOr.A03(1BL.A05(this.threadID)) + this.threadType) * 31) + AnonymousClass001.A02(this.callingTags)) * 31) + 1BL.A05(this.serverInfoData)) * 31) + 1BL.A05(this.linkUrl)) * 31) + 1BL.A05(this.liveBroadcastId)) * 31) + 1BL.A05(this.callablePostId)) * 31) + 1BL.A05(this.immersiveModeDoorId)) * 31) + 1BL.A05(this.rtcDoorId)) * 31) + 1BL.A05(this.phoneNumber)) * 31) + (this.isMetaAiCall ? 1 : 0)) * 31) + 1BL.A05(this.pstnUserId)) * 31) + 1BL.A05(this.horizonWorldId)) * 31) + 7zN.A05(this.horizonVoipZoneId);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallingAppContext{threadID=");
        A0k.append(this.threadID);
        A0k.append(",threadType=");
        A0k.append(this.threadType);
        A0k.append(",callingTags=");
        A0k.append(this.callingTags);
        A0k.append(",serverInfoData=");
        A0k.append(this.serverInfoData);
        A0k.append(",linkUrl=");
        A0k.append(this.linkUrl);
        A0k.append(",liveBroadcastId=");
        A0k.append(this.liveBroadcastId);
        A0k.append(",callablePostId=");
        A0k.append(this.callablePostId);
        A0k.append(",immersiveModeDoorId=");
        A0k.append(this.immersiveModeDoorId);
        A0k.append(",rtcDoorId=");
        A0k.append(this.rtcDoorId);
        A0k.append(",phoneNumber=");
        A0k.append(this.phoneNumber);
        A0k.append(",isMetaAiCall=");
        A0k.append(this.isMetaAiCall);
        A0k.append(",pstnUserId=");
        A0k.append(this.pstnUserId);
        A0k.append(",horizonWorldId=");
        A0k.append(this.horizonWorldId);
        A0k.append(",horizonVoipZoneId=");
        return GOq.A12(this.horizonVoipZoneId, A0k);
    }
}

package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchAutoplayModel.class */
public class CowatchAutoplayModel {
    public static 2JQ CONVERTER = IR0.A00(61);
    public static long sMcfTypeId;
    public final String actorId;
    public final CowatchAutoplaySimpleModel autoplay;
    public final String autoplayActionId;
    public final CowatchMediaInfoModel contentInfo;
    public final boolean needsUpdatePeer;
    public final String sourceMediaId;
    public final String sourceMediaSource;

    public CowatchAutoplayModel(String str, String str2, String str3, String str4, CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel, CowatchMediaInfoModel cowatchMediaInfoModel, boolean z) {
        this.sourceMediaId = str;
        this.sourceMediaSource = str2;
        this.autoplayActionId = str3;
        this.actorId = str4;
        this.autoplay = cowatchAutoplaySimpleModel;
        this.contentInfo = cowatchMediaInfoModel;
        this.needsUpdatePeer = z;
    }

    public static native CowatchAutoplayModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAutoplayModel)) {
                return false;
            }
            CowatchAutoplayModel cowatchAutoplayModel = (CowatchAutoplayModel) obj;
            String str = this.sourceMediaId;
            String str2 = cowatchAutoplayModel.sourceMediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.sourceMediaSource;
            String str4 = cowatchAutoplayModel.sourceMediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.autoplayActionId;
            String str6 = cowatchAutoplayModel.autoplayActionId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.actorId;
            String str8 = cowatchAutoplayModel.actorId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel = this.autoplay;
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel2 = cowatchAutoplayModel.autoplay;
            if (cowatchAutoplaySimpleModel == null) {
                if (cowatchAutoplaySimpleModel2 != null) {
                    return false;
                }
            } else if (!cowatchAutoplaySimpleModel.equals(cowatchAutoplaySimpleModel2)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = this.contentInfo;
            CowatchMediaInfoModel cowatchMediaInfoModel2 = cowatchAutoplayModel.contentInfo;
            if (cowatchMediaInfoModel == null) {
                if (cowatchMediaInfoModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaInfoModel.equals(cowatchMediaInfoModel2)) {
                return false;
            }
            if (this.needsUpdatePeer != cowatchAutoplayModel.needsUpdatePeer) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((AbstractC2326GOr.A03(1BL.A05(this.sourceMediaId)) + 1BL.A05(this.sourceMediaSource)) * 31) + 1BL.A05(this.autoplayActionId)) * 31) + 1BL.A05(this.actorId)) * 31) + AnonymousClass001.A02(this.autoplay)) * 31) + 4YU.A03(this.contentInfo)) * 31) + (this.needsUpdatePeer ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAutoplayModel{sourceMediaId=");
        A0k.append(this.sourceMediaId);
        A0k.append(",sourceMediaSource=");
        A0k.append(this.sourceMediaSource);
        A0k.append(",autoplayActionId=");
        A0k.append(this.autoplayActionId);
        A0k.append(",actorId=");
        A0k.append(this.actorId);
        A0k.append(",autoplay=");
        A0k.append(this.autoplay);
        A0k.append(",contentInfo=");
        A0k.append(this.contentInfo);
        A0k.append(",needsUpdatePeer=");
        return AbstractC2327GOs.A0X(A0k, this.needsUpdatePeer);
    }
}

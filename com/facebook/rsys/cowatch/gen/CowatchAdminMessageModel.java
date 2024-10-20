package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.GOq;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchAdminMessageModel.class */
public class CowatchAdminMessageModel {
    public static 2JQ CONVERTER = IR0.A00(60);
    public static long sMcfTypeId;
    public final String adminMessage;
    public final String adminMessageActorUserId;
    public final int localAdminMessageType;

    public CowatchAdminMessageModel(String str, int i, String str2) {
        this.adminMessage = str;
        this.localAdminMessageType = i;
        this.adminMessageActorUserId = str2;
    }

    public static native CowatchAdminMessageModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAdminMessageModel)) {
                return false;
            }
            CowatchAdminMessageModel cowatchAdminMessageModel = (CowatchAdminMessageModel) obj;
            String str = this.adminMessage;
            String str2 = cowatchAdminMessageModel.adminMessage;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.localAdminMessageType != cowatchAdminMessageModel.localAdminMessageType) {
                return false;
            }
            String str3 = this.adminMessageActorUserId;
            String str4 = cowatchAdminMessageModel.adminMessageActorUserId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A03(1BL.A05(this.adminMessage)) + this.localAdminMessageType) * 31) + 7zN.A05(this.adminMessageActorUserId);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAdminMessageModel{adminMessage=");
        A0k.append(this.adminMessage);
        A0k.append(",localAdminMessageType=");
        A0k.append(this.localAdminMessageType);
        A0k.append(",adminMessageActorUserId=");
        return GOq.A12(this.adminMessageActorUserId, A0k);
    }
}

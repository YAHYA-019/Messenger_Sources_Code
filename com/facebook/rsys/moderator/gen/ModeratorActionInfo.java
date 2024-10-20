package com.facebook.rsys.moderator.gen;

import X.0Pz;
import X.2JQ;
import X.7zM;
import X.AbstractC2326GOr;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: ModeratorActionInfo.class */
public class ModeratorActionInfo {
    public static 2JQ CONVERTER = LVi.A00(34);
    public static long sMcfTypeId;
    public final String issuedByUserId;
    public final String uuid;

    public ModeratorActionInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.uuid = str;
        this.issuedByUserId = str2;
    }

    public static native ModeratorActionInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ModeratorActionInfo)) {
                return false;
            }
            ModeratorActionInfo moderatorActionInfo = (ModeratorActionInfo) obj;
            if (this.uuid.equals(moderatorActionInfo.uuid) && this.issuedByUserId.equals(moderatorActionInfo.issuedByUserId)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zM.A05(this.issuedByUserId, AbstractC2326GOr.A07(this.uuid));
    }

    public String toString() {
        return 0Pz.A0z("ModeratorActionInfo{uuid=", this.uuid, ",issuedByUserId=", this.issuedByUserId, "}");
    }
}

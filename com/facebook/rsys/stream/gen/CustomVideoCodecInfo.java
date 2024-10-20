package com.facebook.rsys.stream.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

/* loaded from: CustomVideoCodecInfo.class */
public class CustomVideoCodecInfo {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ASNYC_FAILED);
    public static long sMcfTypeId;
    public final int codecName;
    public final int contentType;
    public final HashSet supportedUserIds;
    public final long version;

    public CustomVideoCodecInfo(int i, int i2, long j, HashSet hashSet) {
        hashSet.getClass();
        this.codecName = i;
        this.contentType = i2;
        this.version = j;
        this.supportedUserIds = hashSet;
    }

    public static native CustomVideoCodecInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CustomVideoCodecInfo)) {
                return false;
            }
            CustomVideoCodecInfo customVideoCodecInfo = (CustomVideoCodecInfo) obj;
            if (this.codecName == customVideoCodecInfo.codecName && this.contentType == customVideoCodecInfo.contentType && this.version == customVideoCodecInfo.version && this.supportedUserIds.equals(customVideoCodecInfo.supportedUserIds)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.supportedUserIds, AnonymousClass002.A02(this.version, (AbstractC2326GOr.A03(this.codecName) + this.contentType) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CustomVideoCodecInfo{codecName=");
        A0k.append(this.codecName);
        A0k.append(",contentType=");
        A0k.append(this.contentType);
        A0k.append(",version=");
        A0k.append(this.version);
        A0k.append(",supportedUserIds=");
        return AbstractC2327GOs.A0U(this.supportedUserIds, A0k);
    }
}

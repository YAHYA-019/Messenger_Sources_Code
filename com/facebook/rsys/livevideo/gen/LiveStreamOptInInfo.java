package com.facebook.rsys.livevideo.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.GOq;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: LiveStreamOptInInfo.class */
public class LiveStreamOptInInfo {
    public static 2JQ CONVERTER = LVi.A00(18);
    public static long sMcfTypeId;
    public final int audience;
    public final String hostId;
    public final int target;
    public final String targetName;

    public LiveStreamOptInInfo(int i, int i2, String str, String str2) {
        this.audience = i;
        this.target = i2;
        this.targetName = str;
        this.hostId = str2;
    }

    public static native LiveStreamOptInInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveStreamOptInInfo)) {
                return false;
            }
            LiveStreamOptInInfo liveStreamOptInInfo = (LiveStreamOptInInfo) obj;
            if (this.audience != liveStreamOptInInfo.audience || this.target != liveStreamOptInInfo.target) {
                return false;
            }
            String str = this.targetName;
            String str2 = liveStreamOptInInfo.targetName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.hostId;
            String str4 = liveStreamOptInInfo.hostId;
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
        return ((((AbstractC2326GOr.A03(this.audience) + this.target) * 31) + 1BL.A05(this.targetName)) * 31) + 7zN.A05(this.hostId);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LiveStreamOptInInfo{audience=");
        A0k.append(this.audience);
        A0k.append(",target=");
        A0k.append(this.target);
        A0k.append(",targetName=");
        A0k.append(this.targetName);
        A0k.append(",hostId=");
        return GOq.A12(this.hostId, A0k);
    }
}

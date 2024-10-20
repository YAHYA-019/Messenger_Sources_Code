package com.facebook.rsys.mediastats.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: ScreenShareStats.class */
public class ScreenShareStats {
    public static 2JQ CONVERTER = N6e.A00(37);
    public static long sMcfTypeId;
    public final Integer contentType;

    public ScreenShareStats(Integer num) {
        this.contentType = num;
    }

    public static native ScreenShareStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScreenShareStats)) {
                return false;
            }
            Integer num = this.contentType;
            Integer num2 = ((ScreenShareStats) obj).contentType;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass001.A02(this.contentType);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScreenShareStats{contentType=");
        return AbstractC2327GOs.A0U(this.contentType, A0k);
    }
}

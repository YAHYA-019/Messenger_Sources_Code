package com.facebook.rsys.cowatchad.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOm;
import X.LVi;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchAdInsertionPoint.class */
public class CowatchAdInsertionPoint {
    public static 2JQ CONVERTER = LVi.A00(11);
    public static long sMcfTypeId;
    public final String mediaID;
    public final long minDurationMs;
    public final long startTimeMs;

    public CowatchAdInsertionPoint(String str, long j, long j2) {
        str.getClass();
        this.mediaID = str;
        this.startTimeMs = j;
        this.minDurationMs = j2;
    }

    public static native CowatchAdInsertionPoint createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchAdInsertionPoint)) {
                return false;
            }
            CowatchAdInsertionPoint cowatchAdInsertionPoint = (CowatchAdInsertionPoint) obj;
            if (this.mediaID.equals(cowatchAdInsertionPoint.mediaID) && this.startTimeMs == cowatchAdInsertionPoint.startTimeMs && this.minDurationMs == cowatchAdInsertionPoint.minDurationMs) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A03(this.minDurationMs, AnonymousClass002.A02(this.startTimeMs, AbstractC2326GOr.A07(this.mediaID)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAdInsertionPoint{mediaID=");
        A0k.append(this.mediaID);
        A0k.append(GOm.A00(ActionId.RTMP_CONNECTION_REQUESTED));
        A0k.append(this.startTimeMs);
        A0k.append(",minDurationMs=");
        A0k.append(this.minDurationMs);
        return 1BL.A0v(A0k);
    }
}

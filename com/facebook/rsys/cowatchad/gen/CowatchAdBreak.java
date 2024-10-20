package com.facebook.rsys.cowatchad.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchAdBreak.class */
public class CowatchAdBreak {
    public static 2JQ CONVERTER = IR0.A00(88);
    public static long sMcfTypeId;
    public final ArrayList ads;
    public final long durationMs;
    public final String mediaID;

    public CowatchAdBreak(String str, long j, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.mediaID = str;
        this.durationMs = j;
        this.ads = arrayList;
    }

    public static native CowatchAdBreak createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchAdBreak)) {
                return false;
            }
            CowatchAdBreak cowatchAdBreak = (CowatchAdBreak) obj;
            if (this.mediaID.equals(cowatchAdBreak.mediaID) && this.durationMs == cowatchAdBreak.durationMs && this.ads.equals(cowatchAdBreak.ads)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.ads, AnonymousClass002.A02(this.durationMs, AbstractC2326GOr.A07(this.mediaID)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAdBreak{mediaID=");
        A0k.append(this.mediaID);
        A0k.append(",durationMs=");
        A0k.append(this.durationMs);
        A0k.append(",ads=");
        return AbstractC2327GOs.A0U(this.ads, A0k);
    }
}

package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.7zM;
import X.7zP;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchAutoplayPayload.class */
public class CowatchAutoplayPayload {
    public static 2JQ CONVERTER = IR0.A00(62);
    public static long sMcfTypeId;
    public final String mediaId;
    public final String mediaSource;
    public final long previewDurationMs;
    public final String sourceMediaId;
    public final String sourceMediaSource;

    public CowatchAutoplayPayload(String str, String str2, long j, String str3, String str4) {
        7zP.A1S(str, str2, str3);
        str4.getClass();
        this.mediaId = str;
        this.mediaSource = str2;
        this.previewDurationMs = j;
        this.sourceMediaId = str3;
        this.sourceMediaSource = str4;
    }

    public static native CowatchAutoplayPayload createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchAutoplayPayload)) {
                return false;
            }
            CowatchAutoplayPayload cowatchAutoplayPayload = (CowatchAutoplayPayload) obj;
            if (this.mediaId.equals(cowatchAutoplayPayload.mediaId) && this.mediaSource.equals(cowatchAutoplayPayload.mediaSource) && this.previewDurationMs == cowatchAutoplayPayload.previewDurationMs && this.sourceMediaId.equals(cowatchAutoplayPayload.sourceMediaId) && this.sourceMediaSource.equals(cowatchAutoplayPayload.sourceMediaSource)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zM.A05(this.sourceMediaSource, AnonymousClass002.A07(this.sourceMediaId, AnonymousClass002.A02(this.previewDurationMs, AnonymousClass002.A07(this.mediaSource, AbstractC2326GOr.A07(this.mediaId)))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAutoplayPayload{mediaId=");
        A0k.append(this.mediaId);
        A0k.append(",mediaSource=");
        A0k.append(this.mediaSource);
        A0k.append(",previewDurationMs=");
        A0k.append(this.previewDurationMs);
        A0k.append(",sourceMediaId=");
        A0k.append(this.sourceMediaId);
        A0k.append(",sourceMediaSource=");
        return GOq.A12(this.sourceMediaSource, A0k);
    }
}

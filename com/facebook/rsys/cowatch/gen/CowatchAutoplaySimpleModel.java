package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchAutoplaySimpleModel.class */
public class CowatchAutoplaySimpleModel {
    public static 2JQ CONVERTER = IR0.A00(63);
    public static long sMcfTypeId;
    public final String mediaId;
    public final String mediaSource;
    public final long previewDurationMs;

    public CowatchAutoplaySimpleModel(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.mediaId = str;
        this.mediaSource = str2;
        this.previewDurationMs = j;
    }

    public static native CowatchAutoplaySimpleModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchAutoplaySimpleModel)) {
                return false;
            }
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel = (CowatchAutoplaySimpleModel) obj;
            if (this.mediaId.equals(cowatchAutoplaySimpleModel.mediaId) && this.mediaSource.equals(cowatchAutoplaySimpleModel.mediaSource) && this.previewDurationMs == cowatchAutoplaySimpleModel.previewDurationMs) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.mediaSource, AbstractC2326GOr.A07(this.mediaId)) + 1BL.A01(this.previewDurationMs);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAutoplaySimpleModel{mediaId=");
        A0k.append(this.mediaId);
        A0k.append(",mediaSource=");
        A0k.append(this.mediaSource);
        A0k.append(",previewDurationMs=");
        A0k.append(this.previewDurationMs);
        return AnonymousClass001.A0d("}", A0k);
    }
}

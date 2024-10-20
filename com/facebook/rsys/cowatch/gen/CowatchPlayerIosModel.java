package com.facebook.rsys.cowatch.gen;

import X.0Pz;
import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchPlayerIosModel.class */
public class CowatchPlayerIosModel {
    public static 2JQ CONVERTER = N6e.A00(25);
    public static long sMcfTypeId;
    public final boolean isInReportFlow;

    public CowatchPlayerIosModel(boolean z) {
        this.isInReportFlow = z;
    }

    public static native CowatchPlayerIosModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchPlayerIosModel)) {
                return false;
            }
            if (this.isInReportFlow != ((CowatchPlayerIosModel) obj).isInReportFlow) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 527 + (this.isInReportFlow ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A19("CowatchPlayerIosModel{isInReportFlow=", "}", this.isInReportFlow);
    }
}

package com.facebook.rsys.livevideo.gen;

import X.0Pz;
import X.2JQ;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: LiveVideoEndParameters.class */
public class LiveVideoEndParameters {
    public static 2JQ CONVERTER = LVi.A00(22);
    public static long sMcfTypeId;
    public final String funnelSessionId;

    public LiveVideoEndParameters(String str) {
        str.getClass();
        this.funnelSessionId = str;
    }

    public static native LiveVideoEndParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveVideoEndParameters) {
            return this.funnelSessionId.equals(((LiveVideoEndParameters) obj).funnelSessionId);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.funnelSessionId.hashCode();
    }

    public String toString() {
        return 0Pz.A0j("LiveVideoEndParameters{funnelSessionId=", this.funnelSessionId, "}");
    }
}

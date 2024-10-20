package com.facebook.rsys.ended.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: UnsupportedCapabilityFallbacks.class */
public class UnsupportedCapabilityFallbacks {
    public static 2JQ CONVERTER = IR0.A00(ActionId.RTMP_CONNECTION_REQUESTED);
    public static long sMcfTypeId;
    public final ErrorMessageFallback errorMessage;

    public UnsupportedCapabilityFallbacks(ErrorMessageFallback errorMessageFallback) {
        errorMessageFallback.getClass();
        this.errorMessage = errorMessageFallback;
    }

    public static native UnsupportedCapabilityFallbacks createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnsupportedCapabilityFallbacks) {
            return this.errorMessage.equals(((UnsupportedCapabilityFallbacks) obj).errorMessage);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.errorMessage.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UnsupportedCapabilityFallbacks{errorMessage=");
        return AbstractC2327GOs.A0U(this.errorMessage, A0k);
    }
}

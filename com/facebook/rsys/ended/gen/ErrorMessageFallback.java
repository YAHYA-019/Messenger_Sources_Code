package com.facebook.rsys.ended.gen;

import X.0Pz;
import X.2JQ;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: ErrorMessageFallback.class */
public class ErrorMessageFallback {
    public static 2JQ CONVERTER = IR0.A00(108);
    public static long sMcfTypeId;
    public final String message;

    public ErrorMessageFallback(String str) {
        str.getClass();
        this.message = str;
    }

    public static native ErrorMessageFallback createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorMessageFallback) {
            return this.message.equals(((ErrorMessageFallback) obj).message);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.message.hashCode();
    }

    public String toString() {
        return 0Pz.A0j("ErrorMessageFallback{message=", this.message, "}");
    }
}

package com.facebook.rsys.call.gen;

import X.0Pz;
import X.2JQ;
import X.AbstractC2326GOr;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CallNotification.class */
public class CallNotification {
    public static 2JQ CONVERTER = LVi.A00(2);
    public static long sMcfTypeId;
    public final int notificationType;
    public final String userId;

    public CallNotification(String str, int i) {
        str.getClass();
        this.userId = str;
        this.notificationType = i;
    }

    public static native CallNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CallNotification)) {
                return false;
            }
            CallNotification callNotification = (CallNotification) obj;
            if (this.userId.equals(callNotification.userId) && this.notificationType == callNotification.notificationType) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A07(this.userId) + this.notificationType;
    }

    public String toString() {
        return 0Pz.A0H(this.notificationType, "CallNotification{userId=", this.userId, ",notificationType=", "}");
    }
}

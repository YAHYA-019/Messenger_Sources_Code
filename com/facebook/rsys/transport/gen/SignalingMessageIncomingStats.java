package com.facebook.rsys.transport.gen;

import X.0Pz;
import X.1BL;
import X.2JQ;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: SignalingMessageIncomingStats.class */
public class SignalingMessageIncomingStats {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ASYNC_ACTION_SUCCESS);
    public static long sMcfTypeId;
    public final long receivedBytes;

    public SignalingMessageIncomingStats(long j) {
        this.receivedBytes = j;
    }

    public static native SignalingMessageIncomingStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof SignalingMessageIncomingStats)) {
                return false;
            }
            if (this.receivedBytes != ((SignalingMessageIncomingStats) obj).receivedBytes) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 527 + 1BL.A01(this.receivedBytes);
    }

    public String toString() {
        return 0Pz.A0h("SignalingMessageIncomingStats{receivedBytes=", "}", this.receivedBytes);
    }
}

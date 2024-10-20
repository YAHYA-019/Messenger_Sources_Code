package com.facebook.rsys.realtimesession.gen;

import X.0Pz;
import X.AbstractC2326GOr;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: RealtimeSessionUserId.class */
public class RealtimeSessionUserId {
    public final long nodeId;
    public final long userId;

    public RealtimeSessionUserId(long j, long j2) {
        this.userId = j;
        this.nodeId = j2;
    }

    public static native RealtimeSessionUserId createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof RealtimeSessionUserId)) {
                return false;
            }
            RealtimeSessionUserId realtimeSessionUserId = (RealtimeSessionUserId) obj;
            if (this.userId == realtimeSessionUserId.userId && this.nodeId == realtimeSessionUserId.nodeId) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.userId;
        int A03 = AbstractC2326GOr.A03((int) (j ^ (j >>> 32)));
        long j2 = this.nodeId;
        return A03 + ((int) ((j2 >>> 32) ^ j2));
    }

    public String toString() {
        return 0Pz.A0u("RealtimeSessionUserId{userId=", ",nodeId=", "}", this.userId, this.nodeId);
    }
}

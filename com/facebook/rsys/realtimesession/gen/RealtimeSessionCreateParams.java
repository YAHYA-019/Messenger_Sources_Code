package com.facebook.rsys.realtimesession.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: RealtimeSessionCreateParams.class */
public class RealtimeSessionCreateParams {
    public static 2JQ CONVERTER = LVi.A00(58);
    public static long sMcfTypeId;
    public final boolean e2ee;
    public final int peerMode;
    public final long peerTimeoutMs;
    public final String topic;

    public RealtimeSessionCreateParams(String str, int i, long j, boolean z) {
        str.getClass();
        this.topic = str;
        this.peerMode = i;
        this.peerTimeoutMs = j;
        this.e2ee = z;
    }

    public static native RealtimeSessionCreateParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof RealtimeSessionCreateParams)) {
                return false;
            }
            RealtimeSessionCreateParams realtimeSessionCreateParams = (RealtimeSessionCreateParams) obj;
            if (this.topic.equals(realtimeSessionCreateParams.topic) && this.peerMode == realtimeSessionCreateParams.peerMode && this.peerTimeoutMs == realtimeSessionCreateParams.peerTimeoutMs && this.e2ee == realtimeSessionCreateParams.e2ee) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.peerTimeoutMs, (AbstractC2326GOr.A07(this.topic) + this.peerMode) * 31) + (this.e2ee ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RealtimeSessionCreateParams{topic=");
        A0k.append(this.topic);
        A0k.append(",peerMode=");
        A0k.append(this.peerMode);
        A0k.append(",peerTimeoutMs=");
        A0k.append(this.peerTimeoutMs);
        A0k.append(",e2ee=");
        return AbstractC2327GOs.A0X(A0k, this.e2ee);
    }
}

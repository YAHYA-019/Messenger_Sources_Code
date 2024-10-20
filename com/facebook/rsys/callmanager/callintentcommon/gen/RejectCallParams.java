package com.facebook.rsys.callmanager.callintentcommon.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callintent.gen.CallIntent;

/* loaded from: RejectCallParams.class */
public class RejectCallParams {
    public static 2JQ CONVERTER = IR0.A00(39);
    public static long sMcfTypeId;
    public final CallIntent callIntent;
    public final int reason;
    public final boolean shouldInformPeer;
    public final String subReason;

    public RejectCallParams(Builder builder) {
        builder.callIntent.getClass();
        builder.subReason.getClass();
        this.callIntent = builder.callIntent;
        this.reason = builder.reason;
        this.subReason = builder.subReason;
        this.shouldInformPeer = builder.shouldInformPeer;
    }

    public static native RejectCallParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof RejectCallParams)) {
                return false;
            }
            RejectCallParams rejectCallParams = (RejectCallParams) obj;
            if (this.callIntent.equals(rejectCallParams.callIntent) && this.reason == rejectCallParams.reason && this.subReason.equals(rejectCallParams.subReason) && this.shouldInformPeer == rejectCallParams.shouldInformPeer) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.subReason, (AbstractC2327GOs.A08(this.callIntent) + this.reason) * 31) + (this.shouldInformPeer ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RejectCallParams{callIntent=");
        A0k.append(this.callIntent);
        A0k.append(",reason=");
        A0k.append(this.reason);
        A0k.append(",subReason=");
        A0k.append(this.subReason);
        A0k.append(",shouldInformPeer=");
        return AbstractC2327GOs.A0X(A0k, this.shouldInformPeer);
    }
}

package com.facebook.rsys.clienttransportmonitor.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: RsysCallStatus.class */
public class RsysCallStatus {
    public static 2JQ CONVERTER = N6e.A00(18);
    public static long sMcfTypeId;
    public final boolean inPip;
    public final int state;

    public RsysCallStatus(int i, boolean z) {
        this.state = i;
        this.inPip = z;
    }

    public static native RsysCallStatus createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof RsysCallStatus)) {
                return false;
            }
            RsysCallStatus rsysCallStatus = (RsysCallStatus) obj;
            if (this.state == rsysCallStatus.state && this.inPip == rsysCallStatus.inPip) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.state) + (this.inPip ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RsysCallStatus{state=");
        A0k.append(this.state);
        A0k.append(",inPip=");
        return AbstractC2327GOs.A0X(A0k, this.inPip);
    }
}

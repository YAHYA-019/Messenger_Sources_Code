package com.facebook.rsys.clienttransportmonitor.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: SocketStateStats.class */
public class SocketStateStats {
    public static 2JQ CONVERTER = N6e.A00(19);
    public static long sMcfTypeId;
    public final long downlinkThrottlingEnabled;
    public final long open;
    public final long uplinkThrottlingEnabled;

    public SocketStateStats(long j, long j2, long j3) {
        this.open = j;
        this.downlinkThrottlingEnabled = j2;
        this.uplinkThrottlingEnabled = j3;
    }

    public static native SocketStateStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof SocketStateStats)) {
                return false;
            }
            SocketStateStats socketStateStats = (SocketStateStats) obj;
            if (this.open == socketStateStats.open && this.downlinkThrottlingEnabled == socketStateStats.downlinkThrottlingEnabled && this.uplinkThrottlingEnabled == socketStateStats.uplinkThrottlingEnabled) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.open;
        int A03 = AbstractC2326GOr.A03((int) (j ^ (j >>> 32)));
        long j2 = this.downlinkThrottlingEnabled;
        int i = (A03 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.uplinkThrottlingEnabled;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SocketStateStats{open=");
        A0k.append(this.open);
        A0k.append(",downlinkThrottlingEnabled=");
        A0k.append(this.downlinkThrottlingEnabled);
        A0k.append(",uplinkThrottlingEnabled=");
        A0k.append(this.uplinkThrottlingEnabled);
        A0k.append("}");
        return A0k.toString();
    }
}

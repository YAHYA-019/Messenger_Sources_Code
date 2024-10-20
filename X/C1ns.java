package X;

import com.google.common.base.MoreObjects;

/* renamed from: X.1ns, reason: invalid class name */
/* loaded from: 1ns.class */
public final class C1ns {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C08t A03;
    public final boolean A04;

    public C1ns(C08t c08t, long j, long j2, long j3) {
        this.A03 = c08t;
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
        this.A04 = false;
    }

    public C1ns(C08t c08t, long j, long j2, long j3, boolean z) {
        this.A03 = c08t;
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
        this.A04 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1ns c1ns = (C1ns) obj;
            if (this.A03 != c1ns.A03 || this.A00 != c1ns.A00 || this.A01 != c1ns.A01 || this.A04 != c1ns.A04) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("mConnectionState", this.A03);
        stringHelper.add("mServiceGeneratedMs", this.A02);
        stringHelper.add("mLastConnectionMs", this.A00);
        stringHelper.add("mLastDisconnectMs", this.A01);
        stringHelper.add("mClockSkewDetected", this.A04);
        return stringHelper.toString();
    }
}

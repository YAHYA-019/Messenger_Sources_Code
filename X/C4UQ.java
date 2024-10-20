package X;

/* renamed from: X.4UQ, reason: invalid class name */
/* loaded from: 4UQ.class */
public final class C4UQ {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public C4UQ(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4UQ)) {
                return false;
            }
            C4UQ c4uq = (C4UQ) obj;
            if (this.A00 != c4uq.A00 || this.A03 != c4uq.A03 || this.A01 != c4uq.A01 || this.A02 != c4uq.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * 31;
        int i3 = this.A03 ? 1 : 0;
        if (i3 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = this.A01 ? 1 : 0;
        if (i5 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        if (!this.A02) {
            i = 0;
        }
        return i6 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("NetworkState(isConnected=");
        A0k.append(this.A00);
        A0k.append(", isValidated=");
        A0k.append(this.A03);
        A0k.append(", isMetered=");
        A0k.append(this.A01);
        A0k.append(", isNotRoaming=");
        A0k.append(this.A02);
        return AnonymousClass001.A0g(A0k, ')');
    }
}

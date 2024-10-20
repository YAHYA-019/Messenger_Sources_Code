package X;

/* loaded from: Jt0.class */
public final class Jt0 extends C04v {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public Jt0(int i, long j, long j2, long j3, long j4) {
        this.A00 = i;
        this.A04 = j;
        if (i != 0) {
            this.A02 = j2;
            this.A03 = j3;
        } else {
            this.A03 = j2;
            this.A02 = j3;
        }
        this.A01 = j4;
    }

    public boolean equals(Object obj) {
        Jt0 jt0;
        long j;
        long j2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Jt0)) {
                return false;
            }
            jt0 = (Jt0) obj;
            if (jt0.A00 != 1 || this.A04 != jt0.A04 || this.A02 != jt0.A02) {
                return false;
            }
            j = this.A03;
            j2 = jt0.A03;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Jt0)) {
                return false;
            }
            jt0 = (Jt0) obj;
            if (jt0.A00 != 0 || this.A04 != jt0.A04 || this.A03 != jt0.A03) {
                return false;
            }
            j = this.A02;
            j2 = jt0.A02;
        }
        return j == j2 && this.A01 == jt0.A01;
    }

    public int hashCode() {
        int A02;
        long j;
        int i = this.A00;
        long j2 = this.A04;
        if (i != 0) {
            A02 = AnonymousClass002.A02(this.A02, AnonymousClass002.A01(j2));
            j = this.A03;
        } else {
            A02 = AnonymousClass002.A02(this.A03, AnonymousClass002.A01(j2));
            j = this.A02;
        }
        int A022 = AnonymousClass002.A02(j, A02);
        long j3 = this.A01;
        return A022 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        String str;
        int i = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        if (i != 0) {
            A0k.append("Interval(startTime=");
            A0k.append(this.A04);
            A0k.append(", endTime=");
            A0k.append(this.A02);
            A0k.append(", startMtime=");
            A0k.append(this.A03);
            str = ", endMtime=";
        } else {
            A0k.append("CurrentInterval(startTime=");
            A0k.append(this.A04);
            A0k.append(", startMtime=");
            A0k.append(this.A03);
            A0k.append(", lastActiveTime=");
            A0k.append(this.A02);
            str = ", lastActiveMTime=";
        }
        A0k.append(str);
        A0k.append(this.A01);
        return 4YV.A0x(A0k);
    }
}

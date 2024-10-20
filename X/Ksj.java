package X;

/* loaded from: Ksj.class */
public final class Ksj {
    public final long A00;
    public final long A01;

    public Ksj(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            Ksj ksj = (Ksj) obj;
            if (ksj.A01 != this.A01 || ksj.A00 != this.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A03(this.A00, AnonymousClass002.A01(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PeriodicityInfo{repeatIntervalMillis=");
        A0k.append(this.A01);
        A0k.append(", flexIntervalMillis=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}

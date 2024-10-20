package X;

/* renamed from: X.Arx, reason: case insensitive filesystem */
/* loaded from: Arx.class */
public final class C1763Arx extends C04v {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final boolean A04;

    public C1763Arx(long j, long j2, long j3, boolean z, int i) {
        this.A00 = i;
        this.A02 = j;
        this.A03 = j2;
        this.A04 = z;
        this.A01 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1763Arx)) {
                return false;
            }
            C1763Arx c1763Arx = (C1763Arx) obj;
            if (this.A00 != c1763Arx.A00 || this.A02 != c1763Arx.A02 || this.A03 != c1763Arx.A03 || this.A04 != c1763Arx.A04 || this.A01 != c1763Arx.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = (AnonymousClass002.A02(this.A03, AnonymousClass002.A02(this.A02, this.A00 * 31)) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31;
        long j = this.A01;
        return A02 + ((int) (j ^ (j >>> 32)));
    }
}

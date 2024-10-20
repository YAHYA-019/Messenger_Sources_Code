package X;

/* renamed from: X.6xp, reason: invalid class name */
/* loaded from: 6xp.class */
public final class C6xp implements C6xq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final 6tM A03;
    public final Integer A04;

    public C6xp(6tM r302, Integer num, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = r302;
        this.A04 = num;
        this.A01 = i2;
        this.A02 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6xp)) {
                return false;
            }
            C6xp c6xp = (C6xp) obj;
            if (this.A00 != c6xp.A00 || !11T.A0O(this.A03, c6xp.A03) || !11T.A0O(this.A04, c6xp.A04) || this.A01 != c6xp.A01 || this.A02 != c6xp.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C1pq.A04(this.A04, C1pq.A04(this.A03, this.A00 + 31)) * 31) + this.A01) * 31) + this.A02;
    }
}

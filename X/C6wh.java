package X;

/* renamed from: X.6wh, reason: invalid class name */
/* loaded from: 6wh.class */
public final class C6wh extends C04v {
    public final int A00;
    public final C6wg A01;
    public final C6we A02;

    public C6wh(C6wg c6wg, C6we c6we, int i) {
        11T.A0F(c6wg, 3);
        this.A00 = i;
        this.A02 = c6we;
        this.A01 = c6wg;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6wh)) {
                return false;
            }
            C6wh c6wh = (C6wh) obj;
            if (this.A00 != c6wh.A00 || this.A02 != c6wh.A02 || !11T.A0O(this.A01, c6wh.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A05(this.A02, this.A00 * 31));
    }
}

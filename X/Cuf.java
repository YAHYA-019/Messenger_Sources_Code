package X;

/* loaded from: Cuf.class */
public final class Cuf implements DG9 {
    public final AnonymousClass544 A00;
    public final BNV A01;

    public Cuf(BNV bnv, AnonymousClass544 anonymousClass544) {
        C1pq.A08("listItem", anonymousClass544);
        this.A00 = anonymousClass544;
        this.A01 = bnv;
    }

    @Override // X.DG9
    public BNV BKB() {
        return this.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Cuf)) {
                return false;
            }
            Cuf cuf = (Cuf) obj;
            if (!11T.A0O(this.A00, cuf.A00) || this.A01 != cuf.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A00);
        return (A03 * 31) + C3o5.A03(this.A01);
    }
}

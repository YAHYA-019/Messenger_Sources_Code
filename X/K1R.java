package X;

/* loaded from: K1R.class */
public final class K1R extends K0U implements Comparable {
    public long A00;

    public K1R() {
        super(1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        K1R k1r = (K1R) obj;
        boolean z = false;
        if ((((6WE) this).A00 & 4) == 4) {
            z = true;
        }
        boolean z2 = false;
        if ((((6WE) k1r).A00 & 4) == 4) {
            z2 = true;
        }
        if (z != z2) {
            return z ? 1 : -1;
        }
        long j = ((6WD) this).A01 - ((6WD) k1r).A01;
        if (j == 0) {
            j = this.A00 - k1r.A00;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}

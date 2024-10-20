package X;

/* loaded from: L2e.class */
public final class L2e {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public KkQ A04;
    public C6ah A05;
    public final C6a5 A06;
    public final Kqz A07 = new Kqz();
    public final 6aO A09 = new 6aO(1);
    public final 6aO A08 = new 6aO();

    public L2e(C6a5 c6a5) {
        this.A06 = c6a5;
    }

    public static C6ab A00(L2e l2e) {
        Kqz kqz = l2e.A07;
        int i = kqz.A05.A02;
        C6ab c6ab = kqz.A06;
        if (c6ab == null) {
            c6ab = l2e.A05.A0A[i];
            if (c6ab == null) {
                return null;
            }
        }
        if (c6ab.A03) {
            return c6ab;
        }
        return null;
    }

    public void A01() {
        Kqz kqz = this.A07;
        kqz.A01 = 0;
        kqz.A04 = 0L;
        kqz.A08 = false;
        kqz.A07 = false;
        kqz.A09 = false;
        kqz.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}

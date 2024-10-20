package X;

/* renamed from: X.Gge, reason: case insensitive filesystem */
/* loaded from: Gge.class */
public final class C2531Gge extends ETa {
    public final int A00;
    public final Object A01;

    public C2531Gge(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01(MFG mfg) {
        int i = this.A00;
        boolean equals = EZn.A00.equals(mfg);
        if (i != 0) {
            if (equals) {
                ((0D2) this.A01).A0p();
            }
        } else if (equals) {
            ((0D2) this.A01).A0o();
        }
    }
}

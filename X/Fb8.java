package X;

/* loaded from: Fb8.class */
public final class Fb8 implements GEB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fb8(FyG fyG, DLQ dlq, int i) {
        this.A00 = i;
        this.A02 = dlq;
        this.A01 = fyG;
    }

    public /* bridge */ /* synthetic */ void Clq(DKM dkm, Object obj) {
        if (this.A00 != 0) {
            11T.A0F(dkm, 0);
            dkm.A0J(this.A02, 0);
        } else {
            dkm.A0H(this.A02);
        }
        dkm.A0I(this.A01);
    }
}

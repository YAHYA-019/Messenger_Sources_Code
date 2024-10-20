package X;

/* loaded from: AKe.class */
public final class AKe extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKe(Object obj, String str, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = i;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            C9n0 c9n0 = (C9n0) this.A02;
            6wV r0 = c9n0.A08;
            int i = this.A01;
            r0.Cfq(this.A03, i, 7zN.A04(r0), false);
            r0.setSpan(c9n0.A0A.getValue(), i, 7zN.A04(r0), 33);
            if (r0.B9o().A01 > i || r0.B9o().A00 > i) {
                r0.CuQ(i, i);
            }
        } else {
            C6ns c6ns = (C6ns) this.A02;
            c6ns.A01.flowAnnotate(c6ns.A00, this.A03, this.A01);
        }
        return 04S.A00;
    }
}

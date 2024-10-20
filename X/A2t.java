package X;

/* loaded from: A2t.class */
public final class A2t implements C2lr {
    public final long A00;
    public final long A01;

    public A2t(int i, int i2) {
        this(i | 9221401712017801216L, i2 | 9221401712017801216L);
    }

    public A2t(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // X.C2lr
    public boolean BSE(C2lr c2lr) {
        return 7zR.A1Z(c2lr, this);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        return 7zR.A1Z(obj, this);
    }

    @Override // X.C2lr
    public C2m0 BY9(C2ly c2ly, long j) {
        11T.A0F(c2ly, 0);
        return new C2m0(null, C3RP.A01(C2lu.A01(c2ly.B7k(), this.A01), j, C2lu.A01(c2ly.B7k(), this.A00)));
    }
}

package X;

/* loaded from: A2h.class */
public final class A2h implements C2lr {
    public final long A00;
    public final long A01;

    public A2h(long j, long j2) {
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
        return new C2m0(C2lu.A01(c2ly.B7k(), this.A01), C2lu.A01(c2ly.B7k(), this.A00), null);
    }
}

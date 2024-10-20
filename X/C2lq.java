package X;

/* renamed from: X.2lq, reason: invalid class name */
/* loaded from: 2lq.class */
public final class C2lq implements C2lr {
    public final C00m A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C2X2 A05;

    public C2lq(C2X2 c2x2, C00m c00m, int i, int i2, int i3, int i4) {
        11T.A0F(c2x2, 1);
        this.A05 = c2x2;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A00 = c00m;
    }

    @Override // X.C2lr
    public boolean BSE(C2lr c2lr) {
        11T.A0F(c2lr, 1);
        return C28q.A03(this, c2lr);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        11T.A0F(obj, 1);
        return C28q.A03(this, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.23P, java.lang.Object] */
    @Override // X.C2lr
    public C2m0 BY9(C2ly c2ly, long j) {
        11T.A0F(c2ly, 0);
        ?? obj = new Object();
        C2X2 c2x2 = this.A05;
        c2x2.Bdw((c2x2.ADb() || c2x2.BXQ()) ? new 3vS(new C2xk(this, 3), (Object[]) null, -1) : null, obj, C2lz.A00(26N.A01(j), this.A03 + this.A02), C2lz.A00(26N.A00(j), this.A04 + this.A01));
        return new C2m0(Math.max(C26P.A03(j), obj.A01), Math.max(C26P.A02(j), obj.A00), null);
    }
}

package X;

/* loaded from: M18.class */
public final class M18 extends C00q implements C00m {
    public final float A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M18(LPR lpr, Lsx lsx, MK0 mk0, AbstractC2938JdR abstractC2938JdR, float f, int i, long j, boolean z, boolean z2) {
        super(0);
        this.A01 = i;
        this.A06 = abstractC2938JdR;
        this.A05 = lpr;
        this.A04 = mk0;
        this.A02 = j;
        this.A03 = lsx;
        this.A08 = z;
        this.A07 = z2;
        this.A00 = f;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A01;
        Object obj = this.A06;
        if (i != 0) {
            AbstractC2938JdR abstractC2938JdR = (AbstractC2938JdR) obj;
            LPR lpr = (LPR) this.A05;
            MK0 mk0 = (MK0) this.A04;
            LPR A00 = KUk.A00(lpr, mk0.AQo());
            long j = this.A02;
            AbstractC2938JdR.A09(A00, (Lsx) this.A03, mk0, abstractC2938JdR, this.A00, j, this.A08, this.A07);
        } else {
            AbstractC2938JdR abstractC2938JdR2 = (AbstractC2938JdR) obj;
            LPR lpr2 = (LPR) this.A05;
            MK0 mk02 = (MK0) this.A04;
            LPR A002 = KUk.A00(lpr2, mk02.AQo());
            long j2 = this.A02;
            Lsx lsx = (Lsx) this.A03;
            boolean z = this.A08;
            boolean z2 = this.A07;
            float f = this.A00;
            float[] fArr = AbstractC2938JdR.A0Q;
            if (A002 == null) {
                abstractC2938JdR2.A0a(lsx, mk02, j2, z, z2);
            } else {
                lsx.A02(A002, new M18(A002, lsx, mk02, abstractC2938JdR2, f, 0, j2, z, z2), f, z2);
            }
        }
        return 04S.A00;
    }
}

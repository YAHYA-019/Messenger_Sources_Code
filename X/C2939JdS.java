package X;

/* renamed from: X.JdS, reason: case insensitive filesystem */
/* loaded from: JdS.class */
public final class C2939JdS extends AbstractC2941JdU {
    public final /* synthetic */ C2942Je7 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2939JdS(C2942Je7 c2942Je7) {
        super(c2942Je7);
        this.A00 = c2942Je7;
    }

    public L56 Bdz(long j) {
        A0I(j);
        LPQ lpq = ((AbstractC2941JdU) this).A04.A0H;
        LtK A0D = lpq.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                C2925JdD c2925JdD = ((LPQ) objArr[i2]).A0R.A05;
                11T.A0D(c2925JdD);
                c2925JdD.A05 = 0S2.A0C;
                i2++;
            } while (i2 < i);
        }
        AbstractC2941JdU.A03(lpq.A07.Bdx(this, lpq.A0H(), j), this);
        return this;
    }
}

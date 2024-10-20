package X;

/* loaded from: Icj.class */
public final class Icj implements JLE, JKJ, JG0 {
    public int A00;
    public int A01;
    public final JME A03;
    public final IFJ A04;
    public final Ict A02 = new Object();
    public final float[] A05 = GOn.A1a();
    public final boolean A06 = I6u.A00();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Ict] */
    public Icj(JME jme, IFJ ifj) {
        this.A04 = ifj;
        this.A03 = jme;
    }

    public void AAv(JMu jMu) {
        JME jme;
        HsT A00;
        HsT hsT;
        int i;
        Ict ict = this.A02;
        if (ict.A04 == null) {
            if (this.A06) {
                C2553Gh1 c2553Gh1 = new C2553Gh1("SurfaceInput");
                ict.A04 = c2553Gh1;
                jme = this.A03;
                A00 = c2553Gh1.A00;
                hsT = c2553Gh1;
            } else {
                jme = this.A03;
                A00 = I8U.A00("SurfaceInput");
                hsT = A00;
                ict.A04 = A00;
            }
            jme.CPz(A00.A00);
            int i2 = this.A01;
            if (i2 <= 0 || (i = this.A00) <= 0) {
                return;
            }
            hsT.A00(i2, i);
        }
    }

    public void AN3() {
        Ict ict = this.A02;
        HsT hsT = ict.A04;
        if (hsT != null) {
            hsT.A01();
            ict.A04 = null;
        }
        this.A03.CQ0();
    }

    @Override // X.JKJ
    public JMv AnT() {
        try {
            JME jme = this.A03;
            jme.D8A();
            float[] fArr = this.A05;
            jme.BGt(fArr);
            IFJ ifj = this.A04;
            ifj.A0B(fArr);
            Ict ict = this.A02;
            HsT hsT = ict.A04;
            if (hsT != null) {
                System.arraycopy(fArr, 0, hsT.A02.A03, 0, 16);
            }
            ict.A05 = ifj.A08();
            ict.A03 = jme.BFt();
        } catch (RuntimeException unused) {
        }
        return this.A02;
    }

    @Override // X.JKJ
    public /* synthetic */ int Aqq() {
        return 0;
    }

    public void BOo(I9U i9u) {
    }

    @Override // X.JKJ
    public void Crq(JG1 jg1) {
        this.A03.Crq(jg1);
    }

    @Override // X.JG0
    public Hp4 D76(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        Ict ict = this.A02;
        HsT hsT = ict.A04;
        if (hsT != null) {
            hsT.A00(i, i2);
        }
        IFJ ifj = this.A04;
        ifj.A09(this.A01, this.A00, i3, i4, 0, false, false);
        ict.A02 = i5;
        ict.A01 = i6;
        ict.A00 = i7;
        ict.A06 = z;
        return ifj.A08();
    }

    public void release() {
    }
}

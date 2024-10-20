package X;

/* loaded from: Icu.class */
public final class Icu implements JMv {
    public JMv A00;
    public final Gu7 A01 = new Gu7();

    public void A00(float f, float f2, float f3, int i, int i2, int i3, int i4) {
        Gu7 gu7 = this.A01;
        if (gu7.A05 == i && gu7.A06 == i2 && gu7.A04 == i3 && gu7.A03 == i4 && gu7.A01 == f && gu7.A02 == f2 && gu7.A00 == f3) {
            return;
        }
        gu7.A05 = i;
        gu7.A06 = i2;
        gu7.A04 = i3;
        gu7.A03 = i4;
        gu7.A01 = f;
        gu7.A02 = f2;
        gu7.A00 = f3;
        ((IFJ) gu7).A01 = true;
    }

    public void A01(int i, int i2, int i3, int i4) {
        A00(1.0f, 1.0f, 0.0f, i, i2, i3, i4);
    }

    @Override // X.JMv
    public int Ad5() {
        return this.A00.Ad5();
    }

    @Override // X.JMv
    public int Ahi() {
        return this.A00.Ahi();
    }

    @Override // X.JMv
    public HWs Aok() {
        return this.A00.Aok();
    }

    @Override // X.JMv
    public int B0k() {
        return this.A00.B0k();
    }

    @Override // X.JMv
    public long BFt() {
        return this.A00.BFt();
    }

    @Override // X.JMv
    public Hp4 BKK() {
        Hp4 BKK = this.A00.BKK();
        if (BKK != null) {
            Gu7 gu7 = this.A01;
            gu7.A0B(BKK.A03);
            int i = BKK.A01;
            int i2 = BKK.A00;
            gu7.A09(i, i2, i, i2, 0, false, false);
        }
        return this.A01.A08();
    }

    @Override // X.JMv
    public boolean BT0() {
        return this.A00.BT0();
    }

    @Override // X.JMv
    public boolean BW6() {
        return this.A00.BW6();
    }

    @Override // X.JMv
    public void CpQ(HWs hWs) {
        this.A00.CpQ(hWs);
    }

    @Override // X.JMv
    public HsT getTexture() {
        return this.A00.getTexture();
    }
}

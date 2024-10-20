package X;

/* renamed from: X.Dfd, reason: case insensitive filesystem */
/* loaded from: Dfd.class */
public final class C2149Dfd extends AbstractC2178Dg6 {
    public F35 A00;
    public GLn A01;
    public GLn A02;
    public Integer A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;

    public C2149Dfd(1Iw r302) {
        super(r302);
        this.A00 = F35.A00;
        this.A03 = 0S2.A00;
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0K(C26z c26z, int i) {
        11T.A0F(c26z, 0);
        C26z c26z2 = C26z.ALL;
        if (c26z == c26z2 || c26z == C26z.HORIZONTAL || c26z == C26z.LEFT || c26z == C26z.START) {
            this.A06 = i;
        }
        if (c26z == c26z2 || c26z == C26z.HORIZONTAL || c26z == C26z.RIGHT || c26z == C26z.END) {
            this.A05 = i;
        }
        if (c26z == c26z2 || c26z == C26z.VERTICAL || c26z == C26z.TOP) {
            this.A07 = i;
        }
        if (c26z == c26z2 || c26z == C26z.VERTICAL || c26z == C26z.BOTTOM) {
            this.A04 = i;
        }
        return this;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        C1rs c1rs;
        11T.A0F(ezJ, 0);
        GLn gLn = this.A02;
        C1rs c1rs2 = null;
        GLn gLn2 = this.A01;
        if (gLn == null) {
            if (gLn2 != null) {
                gLn2.BcK(C26z.TOP, this.A07);
                gLn2.BcK(C26z.BOTTOM, this.A04);
                gLn2.BcK(C26z.START, this.A06);
                gLn2.BcK(C26z.END, this.A05);
                c1rs2 = gLn2.ACp(ezJ);
            }
            return c1rs2;
        }
        if (gLn2 == null) {
            throw 1BK.A0h();
        }
        C1qo c1qo = super.A05;
        1Iw r0 = super.A04;
        int A02 = c1qo.A02(F0a.A00(EPJ.A09, r0) / 2.0f);
        GLn gLn3 = this.A01;
        ENO BKl = gLn3 != null ? gLn3.BKl() : null;
        ENO eno = ENO.A03;
        int i = 0;
        int i2 = 1;
        boolean A1W = AnonymousClass001.A1W(BKl, eno);
        GLn gLn4 = this.A02;
        if (gLn4 == null || gLn4.BKl() != eno) {
            i2 = 0;
        }
        C1rq A01 = this.A03 == 0S2.A00 ? C1rg.A01(r0, "FDSButtonGroup", 0) : 2cK.A01(r0, "FDSButtonGroup", 0);
        A01.A2A(C26z.TOP, this.A07 - A02);
        A01.A2A(C26z.BOTTOM, this.A04 - A02);
        A01.A2A(C26z.START, this.A06 - A02);
        A01.A2A(C26z.END, this.A05 - A02);
        A01.A0R();
        float f = 0.0f;
        A01.A0k(0.0f);
        GLn gLn5 = this.A01;
        if (gLn5 != null) {
            gLn5.BcK(C26z.ALL, A02);
            if (A1W) {
                f = 45.0f;
            }
            gLn5.BeO(f);
            gLn5.ATJ(i2 ^ 1);
            c1rs = gLn5.ACp(ezJ);
        } else {
            c1rs = null;
        }
        A01.A2W(c1rs);
        GLn gLn6 = this.A02;
        if (gLn6 != null) {
            gLn6.BcK(C26z.ALL, A02);
            if (i2 != 0) {
                i = 45;
            }
            gLn6.BeO(i);
            gLn6.ATJ(!A1W ? 1 : 0);
            c1rs2 = gLn6.ACp(ezJ);
        }
        A01.A2W(c1rs2);
        EnumC00743oh enumC00743oh = (!A1W || i2 == 0) ? EnumC00743oh.NO_WRAP : EnumC00743oh.WRAP;
        if (A01 instanceof C1rq) {
            A01.A00.A03 = enumC00743oh;
            return A01;
        }
        ((2cM) A01).A00.A03 = enumC00743oh;
        return A01;
    }

    public final void A0f(DfD dfD) {
        this.A01 = dfD;
    }

    public final void A0g(DfD dfD) {
        this.A02 = dfD;
    }
}

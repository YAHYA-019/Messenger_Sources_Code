package X;

/* renamed from: X.Dfn, reason: case insensitive filesystem */
/* loaded from: Dfn.class */
public abstract class AbstractC2159Dfn extends AbstractC2178Dg6 {
    public FF6 A00;
    public ERE A01;
    public ENa A02;
    public F37 A03;
    public 2MR A04;
    public 1Im A05;
    public CharSequence A06;
    public Integer A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public EN9 A0D;

    public AbstractC2159Dfn(1Iw r302) {
        super(r302);
        this.A02 = ENa.A08;
        this.A01 = ERE.A01;
        EN9 en9 = EN9.A03;
        this.A04 = en9.iconColor;
        this.A0D = en9;
        this.A08 = true;
        this.A03 = F37.A00;
        this.A07 = 0S2.A00;
    }

    public static final C1rs A00(ENa eNa, EN9 en9, EzJ ezJ, C1rs c1rs, C1rs c1rs2, 1Iw r306, 1Im r307, CharSequence charSequence) {
        EMz eMz;
        if (eNa != null) {
            float f = eNa.pressedStateSize;
            if (f < 44.0f) {
                c1rs.A29(C26z.ALL, Math.max(0.0f, (44.0f - f) / 2.0f));
            }
        }
        C2166Dfu A00 = EVm.A00(r306);
        ((AbstractC2150Dfe) A00).A03 = c1rs;
        ((AbstractC2150Dfe) A00).A04 = r307;
        A00.A06 = charSequence;
        11T.A0F(r306, 0);
        switch (en9.ordinal()) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
                eMz = EMz.A05;
                break;
            case 2:
            case 3:
                eMz = EMz.A06;
                break;
            default:
                throw 1BK.A1F();
        }
        AbstractC2178Dg6.A0F(A00, eMz, r306);
        if (c1rs2 != null) {
            ((AbstractC2150Dfe) A00).A02 = c1rs2;
        }
        A00.A07 = "android.widget.Button";
        return A00.A0N(ezJ);
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0J(int i) {
        this.A06 = super.A05.A0D(i);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0K(C26z c26z, int i) {
        switch (DKE.A0C(c26z)) {
            case 1:
                this.A0C = i;
                return this;
            case 2:
            default:
                super.A0K(c26z, i);
                return this;
            case 3:
                this.A09 = i;
                return this;
            case 4:
                this.A0B = i;
                return this;
            case 5:
                this.A0A = i;
                return this;
            case 6:
                this.A0B = i;
                this.A0A = i;
                return this;
            case 7:
                this.A0C = i;
                this.A09 = i;
                return this;
            case 8:
                this.A0C = i;
                this.A09 = i;
                this.A0B = i;
                this.A0A = i;
                return this;
        }
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0L(CharSequence charSequence) {
        this.A06 = charSequence;
        return this;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        11T.A0F(ezJ, 0);
        ENa eNa = this.A02;
        ERC erc = eNa.iconSize;
        float f = eNa.pressedStateSize;
        C1qo c1qo = super.A05;
        int A02 = c1qo.A02((f - erc.mSizeDp) / 2.0f);
        2MR r314 = this.A04;
        1Iw r0 = super.A04;
        C2173Dg1 A00 = C2173Dg1.A00(r0);
        FF6 ff6 = this.A00;
        if (ff6 == null) {
            throw 1BK.A0h();
        }
        ((AbstractC2156Dfk) A00).A01 = ff6;
        ERE ere = this.A01;
        if (ere == null) {
            ((ESq) A00).A00 = true;
            ere = null;
        }
        ((AbstractC2156Dfk) A00).A03 = ere;
        ((AbstractC2156Dfk) A00).A02 = erc;
        if (!this.A08) {
            r314 = 2MR.A0m;
        }
        C2173Dg1 A0g = A00.A0g(r314);
        ((AbstractC2156Dfk) A0g).A05 = this.A07;
        A0g.A0U(f);
        A0g.A0S(f);
        C26z c26z = C26z.TOP;
        A0g.A0K(c26z, this.A0C - A02);
        C26z c26z2 = C26z.BOTTOM;
        A0g.A0K(c26z2, this.A09 - A02);
        C26z c26z3 = C26z.START;
        A0g.A0K(c26z3, this.A0B - A02);
        C26z c26z4 = C26z.END;
        A0g.A0K(c26z4, this.A0A - A02);
        C1rs ACp = A0g.ACp(ezJ);
        1Im r305 = null;
        if (this.A02 == ENa.A07) {
            if (ACp != null) {
                int A022 = c1qo.A02((44.0f - erc.mSizeDp) / 2.0f);
                C1ro c1ro = C1ro.CENTER;
                ACp.A1y(c1ro);
                ACp.A2U(this.A08);
                ACp.A29(C26z.VERTICAL, 4.5f);
                EN9 en9 = this.A0D;
                if (this.A08) {
                    r305 = this.A05;
                }
                CharSequence charSequence = this.A06;
                C1rq A01 = C1rg.A01(r0, null, 0);
                A01.A2c();
                A01.A2g(c1ro);
                A01.A0z(44.0f);
                A01.A0l(44.0f);
                A01.A2e(A00(null, en9, ezJ, ACp, A01, r0, r305, charSequence));
                A01.A2A(c26z, this.A0C - A022);
                A01.A2A(c26z2, this.A09 - A022);
                A01.A2A(c26z3, this.A0B - A022);
                A01.A2A(c26z4, this.A0A - A022);
                return A01;
            }
        } else if (ACp != null) {
            ACp.A2U(this.A08);
            ENa eNa2 = this.A02;
            EN9 en92 = this.A0D;
            if (this.A08) {
                r305 = this.A05;
            }
            r305 = A00(eNa2, en92, ezJ, ACp, null, r0, r305, this.A06);
        }
        return r305;
    }

    public final void A0f(3Eh r302) {
        11T.A0F(r302, 0);
        FF6 A0I = A0I(r302);
        if (A0I == null) {
            ((ESq) this).A00 = true;
            A0I = null;
        }
        this.A00 = A0I;
    }

    public final void A0g(EN9 en9) {
        11T.A0F(en9, 0);
        this.A04 = en9.iconColor;
        this.A0D = en9;
    }

    @Override // X.AbstractC2178Dg6
    public int AZ1(EzJ ezJ) {
        11T.A0F(ezJ, 0);
        1Iw r0 = super.A04;
        FAL fal = ezJ.A04;
        ELb eLb = ezJ.A02;
        if (eLb == null) {
            eLb = ELb.A04;
        }
        EP4 A02 = FAl.A02(eLb, 0S2.A00);
        11T.A0A(A02);
        int A00 = Qzg.A00(fal, A02, r0);
        C1qo c1qo = super.A05;
        if (this.A02 != null) {
            return c1qo.A02(r0.iconSize.mSizeDp / 2.0f) + Math.round(A00 / 2.0f);
        }
        throw 1BK.A0h();
    }
}

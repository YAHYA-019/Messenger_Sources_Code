package X;

/* loaded from: Dxf.class */
public final class Dxf extends C1rj {
    public 1LI A00;
    public FIJ A01;
    public FIJ A02;
    public FIJ A03;
    public FIJ A04;
    public boolean A05;
    public boolean A06;

    public Dxf() {
        super("NTActionDelegateComponent");
        this.A06 = true;
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, Boolean.valueOf(this.A05), this.A02, Boolean.valueOf(this.A06), this.A03, this.A04};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        Dxf dxf = (Dxf) super.A0l();
        dxf.A00 = 4YV.A0J(dxf.A00);
        return dxf;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A00;
        FIJ fij = this.A04;
        FIJ fij2 = this.A03;
        FIJ fij3 = this.A01;
        FIJ fij4 = this.A02;
        boolean z = this.A06;
        boolean z2 = this.A05;
        2dD A0p = 7zM.A0p(r0, r302);
        if (z) {
            if (z2) {
                A0p.A1o(1LI.A09(r302, Dxf.class, "NTActionDelegateComponent", 90214667));
            }
            if (fij != null) {
                A0p.A2T(1LI.A0C(r302, Dxf.class, "NTActionDelegateComponent", new Object[]{fij}, 59939160));
            }
            if (fij2 != null) {
                A0p.A1q(1LI.A0C(r302, Dxf.class, "NTActionDelegateComponent", new Object[]{fij2}, -13054308));
            }
        } else {
            A0p.A1s(1LI.A09(r302, Dxf.class, "NTActionDelegateComponent", 440203301));
            A0p.A1o(1LI.A09(r302, Dxf.class, "NTActionDelegateComponent", 90214667));
        }
        if (fij3 != null) {
            A0p.A1v(1LI.A0C(r302, Dxf.class, "NTActionDelegateComponent", new Object[]{fij3}, 1128539692));
        }
        if (fij4 != null) {
            A0p.A1p(1LI.A0C(r302, Dxf.class, "NTActionDelegateComponent", new Object[]{fij4}, -1864886760));
        }
        return A0p.A2W();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        FIJ fij;
        boolean z;
        switch (r302.A01) {
            case -1864886760:
            case 1128539692:
                fij = (FIJ) r302.A03[0];
                fij.A07();
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -13054308:
                ((FIJ) r302.A03[0]).A07();
                z = true;
                return Boolean.valueOf(z);
            case 59939160:
                1Iw r0 = r302.A00.A00;
                fij = (FIJ) r302.A03[0];
                r0.A09(GCs.class);
                fij.A07();
                return null;
            case 90214667:
                z = true;
                return Boolean.valueOf(z);
            case 440203301:
                z = false;
                return Boolean.valueOf(z);
            default:
                return null;
        }
    }
}

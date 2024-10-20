package X;

import java.util.List;

/* renamed from: X.Dft, reason: case insensitive filesystem */
/* loaded from: Dft.class */
public final class C2165Dft extends AbstractC2178Dg6 implements GKV {
    public int A00;
    public Ecz A01;
    public EMX A02;
    public EMY A03;
    public Ehn A04;
    public RXv A05;
    public F7h A06;
    public ELb A07;
    public DgA A08;
    public DgB A09;
    public DgC A0A;
    public 1Im A0B;
    public boolean A0C;
    public boolean A0D;

    public C2165Dft(1Iw r302) {
        super(r302);
        this.A07 = ELb.A04;
        this.A09 = DgB.A01;
        this.A08 = DgA.A00;
        this.A0A = DgC.A01;
        this.A03 = EMY.A02;
        this.A02 = EMX.A03;
        this.A00 = 44;
        this.A0C = true;
    }

    public static final 2cM A00(C1rs c1rs, 1Iw r302, int i) {
        if (c1rs == null) {
            return null;
        }
        float A00 = F0a.A00(EPJ.A18, r302);
        2cM A002 = 2cK.A00(r302);
        A002.A2d(c1rs);
        A002.A0N();
        A002.A2c();
        DKE.A1Q(A002);
        A002.A12(A00);
        A002.A0r(i - (2.0f * A00));
        return A002;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        CharSequence charSequence;
        FAa A00;
        C2cq c2cq;
        C1rs c1rs;
        11T.A0F(ezJ, 0);
        EvK A02 = ezJ.A02();
        A02.A02 = this.A07;
        A02.A01 = new F7h(2MR.A2J);
        EzJ A002 = A02.A00();
        CharSequence charSequence2 = this.A09.A02;
        boolean z = false;
        if ((charSequence2 != null && charSequence2.length() != 0) || ((charSequence = this.A08.A02) != null && charSequence.length() != 0)) {
            z = true;
        }
        11T.A0F("At least one of 'mHeadlineText' or 'mBodyText' must be set.", 1);
        if (!z) {
            ((ESq) this).A00 = true;
        }
        1Iw r0 = super.A04;
        C2160Dfo A003 = EVq.A00(r0);
        ELb eLb = A002.A02;
        if (eLb == null) {
            eLb = ELb.A04;
        }
        A003.A00 = eLb;
        C2180Dg8 c2180Dg8 = new C2180Dg8();
        DgB dgB = this.A09;
        ((EnN) c2180Dg8).A02 = dgB.A02;
        ((EnN) c2180Dg8).A00 = dgB.A00;
        ((EnN) c2180Dg8).A01 = dgB.A01;
        A003.A0h(new DgB(c2180Dg8));
        Ehs ehs = new Ehs();
        Ehn ehn = this.A04;
        ehs.A01 = C1rp.SPACE_BETWEEN;
        A003.A03 = ehs;
        A003.A08 = this.A09.A00;
        2MR r304 = ehn != null ? ehn.A01 : null;
        boolean z2 = this.A0C;
        if (r304 != null) {
            A00 = FAa.A00();
            A00.A06(r304);
        } else if (z2) {
            A00 = null;
        } else {
            A00 = FAa.A00();
            A00.A06(2MR.A0o);
        }
        A003.A0k(A00);
        EnN enN = new EnN();
        enN.A02 = this.A08.A02;
        A003.A0g(new F7z(enN));
        FAa A004 = FAa.A00();
        A004.A01 = this.A08.A00;
        Ehn ehn2 = this.A04;
        A004.A06(ehn2 != null ? ehn2.A00 : this.A0C ? null : 2MR.A0o);
        A003.A0j(A004);
        A003.A02 = new Ehs();
        DgC dgC = this.A0A;
        if (dgC != null) {
            A003.A0i(dgC);
            A003.A04 = new Ehs();
            if (!this.A0C) {
                FAa A005 = FAa.A00();
                A005.A06(2MR.A0o);
                A003.A0C.A08(A005.A01());
            }
        }
        AbstractC2150Dfe abstractC2150Dfe = super.A03 ? new AbstractC2150Dfe(r0) : EVm.A00(r0);
        float A006 = F0a.A00(EPJ.A1A, r0);
        A003.A0W(C1ro.CENTER);
        A003.A0X(C26z.TOP, A006);
        C26z c26z = C26z.BOTTOM;
        A003.A0X(c26z, A006);
        A003.A0Q(1.0f);
        A003.A0R(1.0f);
        A003.A0D.A2c();
        List list = A003.A09;
        if (list == null) {
            list = AnonymousClass001.A0s();
            A003.A09 = list;
        }
        list.add(null);
        List list2 = A003.A09;
        if (list2 == null) {
            list2 = AnonymousClass001.A0s();
            A003.A09 = list2;
        }
        list2.add(null);
        C1rs ACp = A003.ACp(A002);
        C2cq c2cq2 = null;
        if (this.A0D) {
            Ecz ecz = this.A01;
            float A007 = F0a.A00(EPJ.A0o, r0);
            c2cq = C2cp.A00(r0, 0);
            c2cq.A1L(1);
            c2cq.A0e();
            c2cq.A27(c26z, 0.0f);
            c2cq.A0c();
            c2cq.A15(A007);
            if (ecz != null) {
                A007 = 0.0f;
            }
            c2cq.A13(A007);
            c2cq.A2a(7zL.A0D(A002.A00(2MR.A0p)));
        } else {
            c2cq = null;
        }
        RXv rXv = this.A05;
        int i = this.A00;
        EMY emy = this.A03;
        C1rs c1rs2 = null;
        if (rXv != null) {
            GKV gkv = rXv.A00;
            float A008 = F0a.A00(EPJ.A19, r0);
            float f = 0.0f;
            if (emy.alignment == null) {
                f = A008;
            }
            C26z c26z2 = C26z.START;
            gkv.BcJ(c26z2, f);
            C1rs ACp2 = gkv.ACp(A002);
            if (emy.alignment == null) {
                c1rs2 = A00(ACp2, r0, i);
            } else {
                c1rs2 = 2cK.A01(r0, (String) null, 0);
                c1rs2.A24(c26z2, A008);
                c1rs2.A2h(emy.alignment);
                c1rs2.A0j(0.0f);
                c1rs2.A0k(0.0f);
                c1rs2.A2d(ACp2);
            }
        }
        Ecz ecz2 = this.A01;
        boolean A1T = AnonymousClass001.A1T(ecz2 != null ? ecz2.A00 : null);
        C1rq A01 = C1rg.A01(r0, "FDSListCell", 0);
        A01.A1C(F0a.A00(EPJ.A0o, r0));
        A01.A0e();
        A01.A0r(this.A00);
        A01.A2Q(true);
        A01.A1N(0);
        A01.A2g(C1ro.FLEX_START);
        if (A1T) {
            Ecz ecz3 = this.A01;
            int i2 = this.A00;
            EMX emx = this.A02;
            if (ecz3 != null) {
                GKV gkv2 = ecz3.A00;
                float A009 = F0a.A00(EPJ.A19, r0);
                if (emx.alignment == null) {
                    gkv2.BcJ(C26z.END, A009);
                    c1rs = A00(gkv2.ACp(A002), r0, i2);
                } else {
                    c1rs = 2cK.A01(r0, (String) null, 0);
                    c1rs.A15(A009);
                    c1rs.A2h(emx.alignment);
                    DKE.A1Q(c1rs);
                    c1rs.A2d(gkv2.ACp(A002));
                }
            } else {
                c1rs = null;
            }
        } else {
            c1rs = null;
        }
        A01.A2e(c1rs);
        if (this.A0D && A1T) {
            C1rq A012 = C1rg.A01(r0, null, 0);
            A012.A0e();
            A012.A2e(ACp);
            A012.A2e(c1rs2);
            A012.A2e(c2cq);
            ACp = A012;
        }
        A01.A2e(ACp);
        if (this.A0D && A1T) {
            c1rs2 = null;
        }
        A01.A2e(c1rs2);
        if (!this.A0D || !A1T) {
            c2cq2 = c2cq;
        }
        A01.A2e(c2cq2);
        A01.A2T(this.A0B);
        A01.A2K("fds_list_cell");
        F7h f7h = this.A06;
        A01.A1H(f7h == null ? A002.A01(A002.A01) : A002.A01(f7h));
        A01.A2U(this.A0C);
        abstractC2150Dfe.A03 = A01;
        abstractC2150Dfe.A04 = this.A0B;
        abstractC2150Dfe.A00 = AbstractC2178Dg6.A03(abstractC2150Dfe, r0, null);
        abstractC2150Dfe.A02 = abstractC2150Dfe.A03;
        abstractC2150Dfe.A05 = null;
        return abstractC2150Dfe.A0N(A002);
    }

    public final void A0f(int i) {
        String A0D = super.A05.A0D(i);
        if (A0D != null) {
            this.A08 = new F7z(EMb.A03, A0D, true);
        }
    }

    public final void A0g(int i) {
        String A0D = super.A05.A0D(i);
        if (A0D != null) {
            C2180Dg8 c2180Dg8 = new C2180Dg8();
            ((EnN) c2180Dg8).A02 = A0D;
            ((EnN) c2180Dg8).A03 = true;
            this.A09 = new DgB(c2180Dg8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r302 == X.ELb.A05) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0h(X.ELb r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.A07 = r1
            X.ELb r0 = X.ELb.A04
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L19
            X.ELb r0 = X.ELb.A05
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L1b
        L19:
            r0 = 1
            r304 = r0
        L1b:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r305 = r0
            java.lang.String r0 = "FDSListCell only supports Level3 and Level4 FDSHierarchyLevel. Unsupported level: "
            r303 = r0
            r0 = r302
            r1 = r303
            r2 = r305
            java.lang.String r0 = X.AnonymousClass001.A0Z(r0, r1, r2)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            r1 = r306
            X.11T.A0F(r0, r1)
            r0 = r304
            if (r0 != 0) goto L41
            r0 = r301
            r1 = r306
            r0.A00 = r1
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2165Dft.A0h(X.ELb):void");
    }

    public final void A0i(CharSequence charSequence) {
        if (charSequence != null) {
            C2180Dg8 c2180Dg8 = new C2180Dg8();
            ((EnN) c2180Dg8).A02 = charSequence;
            this.A09 = new DgB(c2180Dg8);
        }
    }
}

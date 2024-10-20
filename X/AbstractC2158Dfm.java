package X;

/* renamed from: X.Dfm, reason: case insensitive filesystem */
/* loaded from: Dfm.class */
public abstract class AbstractC2158Dfm extends AbstractC2178Dg6 {
    public EMK A00;
    public EMV A01;
    public EMW A02;
    public F36 A03;
    public 1Im A04;
    public String A05;
    public String A06;
    public boolean A07;
    public int A08;
    public int A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2158Dfm(1Iw r302) {
        super(r302);
        11T.A0F(r302, 1);
        this.A07 = true;
        this.A02 = EMW.A03;
        this.A01 = EMV.A02;
        this.A03 = F36.A00;
    }

    public static final EP4 A00(ELb eLb) {
        int ordinal = eLb.ordinal();
        if (ordinal == 0) {
            return EP4.A02;
        }
        if (ordinal == 1) {
            return EP4.A04;
        }
        if (ordinal == 2) {
            return EP4.A06;
        }
        if (ordinal == 3) {
            return EP4.A08;
        }
        throw AnonymousClass002.A0C(eLb, "Unknown hierarchyLevel: ", AnonymousClass001.A0k());
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0J(int i) {
        String A0D = super.A05.A0D(i);
        if (A0D == null) {
            ((ESq) this).A00 = true;
            A0D = null;
        }
        this.A05 = A0D;
        return this;
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0K(C26z c26z, int i) {
        int A0C = DKE.A0C(c26z);
        if (A0C == 1) {
            this.A09 = i;
            return this;
        }
        if (A0C != 3) {
            if (A0C != 7) {
                if (A0C == 8) {
                    this.A09 = i;
                    this.A08 = i;
                    super.A0K(C26z.START, i);
                    c26z = C26z.END;
                }
                super.A0K(c26z, i);
                return this;
            }
            this.A09 = i;
        }
        this.A08 = i;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if (r311 == null) goto L8;
     */
    @Override // X.AbstractC2178Dg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1rs A0N(X.EzJ r302) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2158Dfm.A0N(X.EzJ):X.1rs");
    }

    public final void A0f(String str) {
        11T.A0F(str, 0);
        this.A05 = str;
    }

    public final void A0g(String str) {
        if (str == null) {
            ((ESq) this).A00 = true;
            str = null;
        }
        this.A06 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r305 == null) goto L6;
     */
    @Override // X.AbstractC2178Dg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int AZ1(X.EzJ r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.1Iw r0 = r0.A04
            r303 = r0
            r0 = r302
            X.FAL r0 = r0.A04
            r304 = r0
            r0 = r301
            X.EMK r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L26
            r0 = r305
            X.ELb r0 = r0.hierarchyLevel
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L36
        L26:
            r0 = r302
            X.ELb r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L36
            X.ELb r0 = X.ELb.A04
            r305 = r0
        L36:
            r0 = r305
            X.EP4 r0 = A00(r0)
            r305 = r0
            r0 = r304
            r1 = r305
            r2 = r303
            int r0 = X.Qzg.A00(r0, r1, r2)
            float r0 = (float) r0
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2158Dfm.AZ1(X.EzJ):int");
    }
}

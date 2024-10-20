package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B0f.class */
public final class B0f extends C1rj {
    public C89 A00;
    public MigColorScheme A01;
    public Boolean A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    public B0f() {
        super("AccountPasswordSetupComponent");
    }

    public static B16 A00(1Iw r301, 1Im r302, Bjz bjz, int i, boolean z, boolean z2) {
        AwO A00 = B16.A00(r301);
        A00.A2Y(bjz);
        B16 b16 = A00.A01;
        b16.A07 = z;
        A00.A2X(i);
        A00.A2S(r301.A0D(i));
        b16.A02 = r302;
        7zO.A1E(A00, 2RH.A05);
        A00.A0j(0.0f);
        if (z2) {
            b16.A01 = 1LI.A09(r301, B0f.class, "AccountPasswordSetupComponent", 96515278);
        }
        return A00.A2W();
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, Boolean.valueOf(this.A07), this.A04, this.A05, this.A02, this.A06, this.A03, Boolean.valueOf(this.A08)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1Im A09;
        int i;
        boolean z;
        Bjz bjz;
        B1s b1s = (B1s) 4YU.A0P(r302);
        MigColorScheme migColorScheme = this.A01;
        boolean z2 = this.A08;
        Bjz bjz2 = b1s.A00;
        Bjz bjz3 = b1s.A01;
        Bjz bjz4 = b1s.A02;
        boolean z3 = b1s.A03;
        boolean z4 = this.A07;
        boolean z5 = false;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        C26z c26z = C26z.TOP;
        A01.A25(c26z, 24.0f);
        A01.A1C(24.0f);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        if (z4) {
            2KD A0i = AbK.A0i(r302, migColorScheme);
            int i2 = 2131955233;
            if (z2) {
                i2 = 2131967683;
            }
            A0i.A2r(i2);
            A0i.A2m();
            A0i.A2b();
            A0i.A2X();
            4YU.A1K(A012, A0i);
            2KD A0i2 = AbK.A0i(r302, migColorScheme);
            7zO.A1M(A0i2, 2RH.A04, c26z);
            4YU.A1M(A0i2, 2RH.A03);
            A0i2.A2r(2131962947);
            A0i2.A2n();
            A0i2.A2b();
            A0i2.A2X();
            4YU.A1K(A012, A0i2);
        }
        A01.A2X(A012.A00);
        if (z2) {
            A01.A2X(A00(r302, 1LI.A09(r302, B0f.class, "AccountPasswordSetupComponent", -728244833), bjz2, 2131955313, false, false));
            A01.A2X(A00(r302, 1LI.A09(r302, B0f.class, "AccountPasswordSetupComponent", -272271848), bjz3, 2131962093, false, false));
            A09 = 1LI.A09(r302, B0f.class, "AccountPasswordSetupComponent", -356643487);
            i = 2131964137;
            z = true;
            bjz = bjz4;
        } else {
            A09 = 1LI.A09(r302, B0f.class, "AccountPasswordSetupComponent", -309973846);
            i = 2131962093;
            z = true;
            bjz = bjz3;
            z5 = true;
        }
        A01.A2X(A00(r302, A09, bjz, i, z5, z));
        AwI awI = new AwI(r302, new 8jJ());
        awI.A2W(2131962949);
        8jJ r0 = awI.A01;
        r0.A01 = z3;
        7zO.A1M(awI, 2RH.A05, c26z);
        7zN.A1D(awI, r302, B0f.class, "AccountPasswordSetupComponent", -1879460902);
        C1rs.A05(awI.A02, awI.A03, z ? 1 : 0);
        awI.A0J();
        A01.A2X(r0);
        return A01.A2V();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        boolean z;
        1Iw r307;
        C89 c89;
        boolean z2;
        switch (r302.A01) {
            case -1879460902:
                ((B0f) r302.A00.A01).A00.A00();
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -952092468:
                ((B0f) r302.A00.A01).A00.A05 = ((Ehh) obj).A01;
                return null;
            case -728244833:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                r307 = r0.A00;
                String str = ((Bbn) obj).A00;
                B0f b0f = (B0f) r02;
                B1s b1s = (B1s) 4YU.A0P(r307);
                c89 = b0f.A00;
                z2 = b1s.A03;
                c89.A01 = str.trim();
                break;
            case -356643487:
                1Iv r03 = r302.A00;
                1Is r04 = r03.A01;
                r307 = r03.A00;
                String str2 = ((Bbn) obj).A00;
                B0f b0f2 = (B0f) r04;
                B1s b1s2 = (B1s) 4YU.A0P(r307);
                c89 = b0f2.A00;
                z2 = b1s2.A03;
                c89.A03 = str2.trim();
                break;
            case -309973846:
            case -272271848:
                1Iv r05 = r302.A00;
                1Is r06 = r05.A01;
                r307 = r05.A00;
                String str3 = ((Bbn) obj).A00;
                B0f b0f3 = (B0f) r06;
                B1s b1s3 = (B1s) 4YU.A0P(r307);
                c89 = b0f3.A00;
                z2 = b1s3.A03;
                c89.A02 = str3.trim();
                break;
            case 96515278:
                C89 c892 = ((B0f) r302.A00.A01).A00;
                String str4 = c892.A04 ? c892.A03 : c892.A02;
                if (str4 == null || str4.isEmpty()) {
                    z = false;
                } else {
                    c892.A00();
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return null;
        }
        if (z2 == c89.A01()) {
            return null;
        }
        boolean z3 = !z2;
        if (r307.A02 == null) {
            return null;
        }
        r307.A0H(7zS.A0N(Boolean.valueOf(z3)), "updateState:AccountPasswordSetupComponent.setSaveButtonEnabled");
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1s b1s = (B1s) r303;
        String str = this.A04;
        String str2 = this.A05;
        String str3 = this.A06;
        Boolean bool = this.A02;
        Boolean bool2 = this.A03;
        Bjz bjz = new Bjz();
        bjz.A00 = str;
        boolean booleanValue = bool.booleanValue();
        bjz.A01 = booleanValue;
        Bjz bjz2 = new Bjz();
        bjz2.A00 = str2;
        bjz2.A01 = booleanValue;
        Bjz bjz3 = new Bjz();
        bjz3.A00 = str3;
        bjz3.A01 = booleanValue;
        b1s.A00 = bjz;
        b1s.A01 = bjz2;
        b1s.A02 = bjz3;
        if (bool2 != null) {
            b1s.A03 = bool2.booleanValue();
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

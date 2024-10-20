package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8lf, reason: invalid class name */
/* loaded from: 8lf.class */
public final class C8lf extends C1rj {
    public C2ko A00;
    public BeX A01;
    public MigColorScheme A02;
    public String A03;
    public String A04;
    public boolean A05;

    public C8lf() {
        super("MigTitleBarClearableEditText");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A04, this.A01, Boolean.valueOf(this.A05)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        8pQ A0P = 4YU.A0P(r302);
        MigColorScheme migColorScheme = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        boolean z = A0P.A01;
        C2iw c2iw = A0P.A00;
        4YV.A1M(migColorScheme, 1, c2iw);
        C1rq A01 = C1rg.A01(r302, null, 0);
        8Tg A06 = 8Tg.A06(r302);
        A06.A0R();
        A06.A2Y(migColorScheme);
        if (str2 == null || str2.length() == 0) {
            str2 = "";
        }
        C8oa c8oa = A06.A01;
        c8oa.A0P = str2;
        c8oa.A0Q = str;
        c8oa.A01 = 6;
        A06.A1w(c2iw);
        c8oa.A0U = true;
        c8oa.A03 = 7zL.A04(A06, 0.0f);
        A06.A0R();
        c8oa.A0N = 2KE.A09;
        c8oa.A0X = false;
        c8oa.A0K = z ? AnonymousClass961.A03 : AnonymousClass961.A04;
        C1u3 c1u3 = C1u3.A1z;
        11T.A0F(c1u3, 0);
        C1ut c1ut = C1ut.A0B;
        11T.A0F(c1ut, 0);
        c8oa.A0J = new 9RX(c1u3, c1ut, r302.A0D(2131952114));
        c8oa.A0E = 1LI.A04(r302, C8lf.class, "MigTitleBarClearableEditText");
        c8oa.A07 = 1LI.A09(r302, C8lf.class, "MigTitleBarClearableEditText", -612397567);
        A01.A2f(A06.A2W());
        A01.A1v(1LI.A05(r302, C8lf.class, "MigTitleBarClearableEditText"));
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
    
        if (r0.length() == 0) goto L19;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8lf.A15(X.1Im, java.lang.Object):java.lang.Object");
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (c2ko.A02 != 1597260695) {
            return null;
        }
        C8oa.A01(4YU.A0P(c2ko.A00).A00);
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A00, this, r303);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        8pQ r0 = (8pQ) r303;
        String str = this.A04;
        boolean z = false;
        11T.A0F(r302, 0);
        C2iw A0Z = 7zL.A0Z();
        if (str == null || str.length() == 0) {
            z = true;
        }
        Boolean A17 = 7zM.A17(z);
        if (r302.A02 != null) {
            r302.A0G(7zS.A0N(A17), "updateState:MigTitleBarClearableEditText.showClearTextButton");
        }
        r0.A00 = A0Z;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

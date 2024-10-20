package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8mg, reason: invalid class name */
/* loaded from: 8mg.class */
public final class C8mg extends C1rj {
    public int A00;
    public AYB A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;

    public C8mg() {
        super("MessagingSearchNoResultComponent");
        this.A04 = false;
        this.A05 = false;
        this.A00 = 2131965550;
    }

    public static 8T6 A00(1Iw r301) {
        return new 8T6(r301, new C8mg());
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A03, Boolean.valueOf(this.A04), Boolean.valueOf(this.A05), Integer.valueOf(this.A00)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0072, code lost:
    
        if (X.4YU.A0E(r302).getBoolean(2131034116) != false) goto L6;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8mg.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        AYB ayb;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 909251276 || (ayb = ((C8mg) r302.A00.A01).A01) == null) {
            return null;
        }
        ayb.C9G();
        return null;
    }
}

package X;

/* renamed from: X.8k8, reason: invalid class name */
/* loaded from: 8k8.class */
public final class C8k8 extends C1rj {
    public int A00;
    public C2he A01;

    public C8k8() {
        super("ViewPagerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, false, null, Integer.valueOf(this.A00)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2he c2he = this.A01;
        int i = this.A00;
        2kW r0 = new 2kW();
        r0.A01 = 0;
        r0.A02 = (-1) >>> 1;
        r0.A06 = new RpI();
        C2ke A00 = r0.A00();
        C2ki A002 = C2kV.A00(r302);
        A002.A0R();
        A002.A2j(true);
        7zL.A1K(r302);
        QOd qOd = new QOd();
        qOd.A01 = c2he;
        qOd.A00 = i;
        A002.A01.A0L = qOd;
        A002.A02.set(0);
        A002.A2e(null);
        A002.A2f(A00);
        return A002.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        Boolean bool = null;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == -511607246) {
            bool = AnonymousClass001.A0K();
        }
        return bool;
    }
}

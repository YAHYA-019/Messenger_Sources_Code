package X;

/* renamed from: X.55u, reason: invalid class name */
/* loaded from: 55u.class */
public final class C55u implements 55Q {
    public final 1Br A00 = 1Bq.A00(49322);
    public final C2kf A01;

    public C55u() {
        3wU r0 = new 3wU();
        r0.A01 = 3;
        r0.A02 = 1;
        r0.A0A = false;
        this.A01 = r0.A00();
    }

    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        C55v c55v = (C55v) anonymousClass544;
        boolean A1X = 1BL.A1X(r302, c55v);
        float f = ((4YU.A0B(r302.A0D).screenWidthDp - 24.0f) - 10.0f) / 3.0f;
        float f2 = f + 10.0f;
        C2ki A00 = C2kV.A00(r302);
        A00.A2f(this.A01);
        A00.A2Y(new DSs(r302, f, ((C4s1) 1Br.A0B(this.A00)).A08()));
        new C1qb(r302);
        C8qk c8qk = new C8qk();
        c8qk.A00 = c55v.A01;
        c8qk.A02 = c55v.A03;
        c8qk.A01 = c55v.A02;
        c8qk.A03 = Integer.valueOf((int) f);
        c8qk.A04 = false;
        A00.A2d(c8qk);
        A00.A16(12.0f);
        A00.A2j(A1X);
        A00.A0R();
        A00.A0r((f2 * ((float) Math.ceil(r0.size() / 3.0d))) + (((float) Math.ceil(r0.size() / 3.0d)) * 10.0f));
        return A00.A2W();
    }

    public Class BDi() {
        return C55v.class;
    }
}

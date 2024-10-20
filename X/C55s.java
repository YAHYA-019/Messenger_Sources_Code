package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.55s, reason: invalid class name */
/* loaded from: 55s.class */
public final class C55s implements 55Q {
    public final 1Br A00 = 1Bq.A00(49322);
    public final C2kf A01;

    public C55s() {
        3wU r0 = new 3wU();
        r0.A01 = 4;
        r0.A02 = 1;
        r0.A0A = false;
        this.A01 = r0.A00();
    }

    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        C55t c55t = (C55t) anonymousClass544;
        11T.A0F(r302, 0);
        11T.A0F(c55t, 1);
        int i = 96;
        if (Math.min(c55t.A00, 8) / 4.0f > 1.0f) {
            i = 192;
        }
        ImmutableList immutableList = c55t.A03;
        if (immutableList.size() > 8) {
            immutableList = immutableList.subList(0, 8);
            11T.A0A(immutableList);
        }
        2kG dSq = new DSq(r302, ((C4s1) this.A00.A00.get()).A08());
        C2ki A00 = C2kV.A00(r302);
        A00.A2f(this.A01);
        A00.A2Y(dSq);
        new C1qb(r302);
        C8qk c8qk = new C8qk();
        c8qk.A00 = c55t.A01;
        c8qk.A02 = immutableList;
        c8qk.A01 = c55t.A02;
        A00.A2d(c8qk);
        A00.A24(C26z.HORIZONTAL, 12.0f);
        A00.A2j(true);
        A00.A0j(1.0f);
        A00.A0r(i);
        return A00.A2W();
    }

    public Class BDi() {
        return C55t.class;
    }
}

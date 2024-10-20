package X;

import java.util.List;

/* renamed from: X.78u, reason: invalid class name */
/* loaded from: 78u.class */
public final class C78u implements C6zG {
    public final C6z3 A00;
    public final 6zD A01;

    public C78u() {
        this(null);
    }

    public C78u(6zD r302) {
        this.A01 = r302;
        this.A00 = C6z2.A0U;
    }

    @Override // X.C6zG
    public 1LI AMI(1LI r302, C1qb c1qb, C5j5 c5j5, 5vW r305, List list, int i) {
        11T.A0F(c1qb, 0);
        11T.A0F(r302, 2);
        11T.A0F(r305, 3);
        6zD r0 = this.A01;
        if (r0 != null && !r0.BUV(r305, i)) {
            return r302;
        }
        C1rq A01 = C1rg.A01(c1qb, null, 0);
        A01.A2i(C1rp.CENTER);
        A01.A0j(1.0f);
        A01.A2K("MessageCenterDecorator");
        C1rq A012 = C1rg.A01(c1qb, null, 0);
        A012.A1R(2132279551);
        A012.A2f(r302);
        A01.A2f(A012.A00);
        return A01.A00;
    }

    @Override // X.C6zJ
    public /* bridge */ /* synthetic */ Object Am9() {
        return this.A00;
    }
}

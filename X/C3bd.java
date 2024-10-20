package X;

/* renamed from: X.3bd, reason: invalid class name */
/* loaded from: 3bd.class */
public final class C3bd implements 1LL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3bd(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void ARE(1Qb r302) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            1Jm.A0Y((1Jx) this.A02, r302, (1Jm) obj);
            return;
        }
        1KI r0 = (1KI) obj;
        1LL r02 = (1LL) this.A02;
        1K6 r03 = r0.A04;
        r03.Cai((0El) null, r302);
        try {
            r02.ARE(r302);
        } finally {
            r03.Caj((0El) null, r302);
        }
    }
}

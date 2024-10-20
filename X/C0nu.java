package X;

/* renamed from: X.0nu, reason: invalid class name */
/* loaded from: 0nu.class */
public final class C0nu implements 0gJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C0nu(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void C9h(C0gq c0gq, C0iO c0iO) {
        if (this.A00 == 0) {
            0GV.A00((C0hg) this.A02, ((0pF) this.A01).A00);
            return;
        }
        0hY r0 = (0hY) this.A01;
        C0hg c0hg = (C0hg) this.A02;
        0gG r02 = (0gG) r0.AIl(c0hg);
        if (r02 != null) {
            C0hr.A02(r02, c0hg.A06(), C0gq.CRITICAL_REPORT);
        }
    }
}

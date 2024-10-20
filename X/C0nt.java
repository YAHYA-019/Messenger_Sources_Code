package X;

/* renamed from: X.0nt, reason: invalid class name */
/* loaded from: 0nt.class */
public final class C0nt implements 0gJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C0nt(0gK r302, 0hX r303, 0hY r304, C0hg c0hg, int i) {
        this.A00 = i;
        this.A01 = r303;
        this.A03 = r304;
        this.A04 = c0hg;
        this.A02 = r302;
    }

    public void C9h(C0gq c0gq, C0iO c0iO) {
        0gK r305;
        C0gq c0gq2;
        int i = this.A00;
        0gG r0 = (0gG) ((0hY) this.A03).AIl((C0hg) this.A04);
        if (i != 0) {
            if (r0 == null) {
                return;
            }
            r305 = (0gK) this.A02;
            c0gq2 = C0gq.LARGE_REPORT;
        } else {
            if (r0 == null) {
                return;
            }
            r305 = (0gK) this.A02;
            c0gq2 = C0gq.CRITICAL_REPORT;
        }
        r305.A08(r0, c0gq2, c0iO);
    }
}

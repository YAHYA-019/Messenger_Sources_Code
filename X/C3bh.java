package X;

/* renamed from: X.3bh, reason: invalid class name */
/* loaded from: 3bh.class */
public final class C3bh implements 1bH {
    public final 1bH A00;
    public final 1bH A01;
    public final 1bH A02;
    public final 1bH A03;

    public C3bh(1bH r302, 1bH r303, 1bH r304, 1bH r305) {
        this.A01 = r302;
        this.A00 = r303;
        this.A03 = r304;
        this.A02 = r305;
    }

    public long BIh(C03b c03b) {
        long BIh = this.A01.BIh(c03b);
        long BIh2 = this.A00.BIh(c03b);
        long BIh3 = this.A03.BIh(c03b);
        long BIh4 = this.A02.BIh(c03b);
        long j = 0;
        if (BIh > 0 && BIh2 > 0 && BIh3 > 0 && BIh4 > 0) {
            long j2 = BIh3 * BIh4;
            long j3 = BIh * BIh2;
            if (j2 > 0 && j3 > 0 && j3 < j2 * 0.75d) {
                j = 1;
            }
        }
        return j;
    }

    public String getName() {
        return "is_underfetched";
    }
}

package X;

/* renamed from: X.3bf, reason: invalid class name */
/* loaded from: 3bf.class */
public final class C3bf implements 1bH {
    public final 1bH A00;
    public final C1bX A01;

    public C3bf(1bH r302, C1bX c1bX) {
        this.A00 = r302;
        this.A01 = c1bX;
    }

    public long BIh(C03b c03b) {
        if (2 != this.A00.BIh(c03b)) {
            return 0L;
        }
        String AWx = c03b.AWx("origin");
        if (AWx == null) {
            AWx = "";
        }
        return "network".equals(AWx) ? 1L : 0L;
    }

    public String getName() {
        return "is_action_id_success_and_origin_network";
    }
}

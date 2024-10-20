package X;

/* renamed from: X.3be, reason: invalid class name */
/* loaded from: 3be.class */
public final class C3be implements 1bH {
    public final 1bH A00;
    public final C1bX A01;

    public C3be(1bH r302, C1bX c1bX) {
        this.A00 = r302;
        this.A01 = c1bX;
    }

    public long BIh(C03b c03b) {
        if (3 != this.A00.BIh(c03b)) {
            return 0L;
        }
        String AWx = c03b.AWx("failureThrowable");
        if (AWx == null) {
            AWx = "";
        }
        return "Forbidden".equals(AWx) ? 1L : 0L;
    }

    public String getName() {
        return "is_action_id_fail_and_failure_throwable_forbidden";
    }
}

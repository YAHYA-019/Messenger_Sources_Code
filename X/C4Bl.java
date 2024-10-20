package X;

/* renamed from: X.4Bl, reason: invalid class name */
/* loaded from: 4Bl.class */
public final class C4Bl implements C4Ah {
    public static final String __redex_internal_original_name = "BugReporterConditionalWorkerInfo";
    public 1BY A00;
    public final C15h A02 = new C4Xg(this, 23);
    public final C00i A01 = new 1BQ(16385);

    public C4Bl(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A02;
    }

    @Override // X.C4Ah
    public long Aro() {
        return 86400000L;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(594492937905231L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Am.BACKGROUND);
        C4Ak.A00(c4Ak, C4Ax.A01);
        C4Ak.A00(c4Ak, 4CC.A01);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED_UNMETERED);
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        return ((2yD) this.A01.get()).AZk(36311255543253695L);
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return "BugReporter";
    }
}

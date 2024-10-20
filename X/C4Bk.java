package X;

/* renamed from: X.4Bk, reason: invalid class name */
/* loaded from: 4Bk.class */
public final class C4Bk implements C4Ah {
    public static final C4Ao A03;
    public static final String __redex_internal_original_name = "ProfileBadgeMessageRequestsSummaryLoggerConditionalWorkerInfo";
    public 1BY A00;
    public final C00i A01 = new 1BQ(83207);
    public final C15h A02 = new C4Xg(this, 16);

    static {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Ax.A01);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        A03 = c4Ak.A01();
    }

    public C4Bk(1BO r302) {
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
        return new 1iF(1006295696494426L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        return A03;
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        return ((2yD) ((C09314po) this.A01.get()).A00.A00.get()).AZk(36314420934483900L);
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}

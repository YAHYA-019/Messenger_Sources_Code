package X;

/* renamed from: X.4At, reason: invalid class name */
/* loaded from: 4At.class */
public final class C4At implements C4Ah {
    public static final String __redex_internal_original_name = "MobileConfigConsistencyLoggingConditionalWorkerInfo";
    public 1BY A00;
    public final C15h A01 = new C4Xg(this, 27);

    public C4At(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A01;
    }

    @Override // X.C4Ah
    public long Aro() {
        return 43200000L;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(357833938572702L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Am.BACKGROUND);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        C4Ak.A00(c4Ak, C4An.A01);
        C4Ak.A00(c4Ak, C4Ax.A01);
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        return true;
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}

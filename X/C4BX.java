package X;

/* renamed from: X.4BX, reason: invalid class name */
/* loaded from: 4BX.class */
public final class C4BX implements C4Ah {
    public static final String __redex_internal_original_name = "SearchContextLineSyncWorkerInfo";
    public final 1De A00;
    public final C15h A01 = new C4Xh(this, 8);

    public C4BX(1De r302) {
        this.A00 = r302;
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A01;
    }

    @Override // X.C4Ah
    public long Aro() {
        return 86400000L;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(2971616476299527L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Ax.A01);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        C4Ak.A00(c4Ak, C4An.A01);
        c4Ak.A01.A00 = 0S2.A00;
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        return false;
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}

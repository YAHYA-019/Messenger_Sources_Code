package X;

/* renamed from: X.4B8, reason: invalid class name */
/* loaded from: 4B8.class */
public final class C4B8 implements C4Ah {
    public static final String __redex_internal_original_name = "VideoCacheCleanupConditionalWorkerInfo";
    public final 1De A00;
    public final 1Br A01;
    public final C15h A02 = new C4Xg(this, 45);

    public C4B8(1De r302) {
        this.A00 = r302;
        this.A01 = 1Bu.A03(r302.A00, 32979);
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A02;
    }

    @Override // X.C4Ah
    public long Aro() {
        this.A01.A00.get();
        return 7200000L;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(900907473652242L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Am.BACKGROUND);
        C4Ak.A00(c4Ak, C4An.A01);
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        4CB r0 = (4CB) this.A01.A00.get();
        Boolean bool = r0.A00;
        boolean booleanValue = bool != null ? bool.booleanValue() : ((4CE) r0.A01.get()).A00();
        r0.A00 = Boolean.valueOf(booleanValue);
        return booleanValue;
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}

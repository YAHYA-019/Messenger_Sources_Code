package X;

/* renamed from: X.4B7, reason: invalid class name */
/* loaded from: 4B7.class */
public final class C4B7 implements C4Ah {
    public static final String __redex_internal_original_name = "StoryVideoCacheCleanupConditionalWorkerInfo";
    public final 1De A00;
    public final 1Br A01;
    public final C15h A02 = new C4Xg(this, 44);

    public C4B7(1De r302) {
        this.A00 = r302;
        this.A01 = 1Bu.A03(r302.A00, 32978);
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A02;
    }

    @Override // X.C4Ah
    public long Aro() {
        4CD r0 = (4CD) this.A01.A00.get();
        Long l = r0.A01;
        long longValue = l != null ? l.longValue() : ((4CE) r0.A02.get()).A00() ? 1800000L : 7200000L;
        r0.A01 = Long.valueOf(longValue);
        return longValue;
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
        4CD r0 = (4CD) this.A01.A00.get();
        Boolean bool = r0.A00;
        boolean booleanValue = bool != null ? bool.booleanValue() : ((4CE) r0.A02.get()).A00();
        r0.A00 = Boolean.valueOf(booleanValue);
        return booleanValue;
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}

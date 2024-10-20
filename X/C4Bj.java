package X;

/* renamed from: X.4Bj, reason: invalid class name */
/* loaded from: 4Bj.class */
public final class C4Bj implements C4Ah {
    public static final C4Ao A04;
    public static final String __redex_internal_original_name = "ProfileBadgeSwitchAccountSummaryLoggerConditionalWorkerInfo";
    public 1BY A00;
    public final C00i A02 = new 1BQ(66417);
    public final C00i A01 = new 1BQ(83207);
    public final C15h A03 = new C4Xg(this, 17);

    static {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Ax.A01);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        A04 = c4Ak.A01();
    }

    public C4Bj(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A03;
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
        return A04;
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004e, code lost:
    
        if (((X.InterfaceC09434q3) r301.A02.get()).AVB().isEmpty() != false) goto L6;
     */
    @Override // X.C4Ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cxb() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.4po r0 = (X.C09314po) r0
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r303 = r0
            r0 = 36314420934483900(0x8103c600061fbc, double:3.0287242531792157E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L51
            r0 = r301
            X.00i r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.4q3 r0 = (X.InterfaceC09434q3) r0
            java.util.List r0 = r0.AVB()
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 == 0) goto L56
        L51:
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
        L56:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Bj.Cxb():boolean");
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}

package X;

/* renamed from: X.4Aw, reason: invalid class name */
/* loaded from: 4Aw.class */
public final class C4Aw implements C4Ah {
    public static final C4Ao A04;
    public static final String __redex_internal_original_name = "ClockSkewCheckConditionalWorkerInfo";
    public 1BY A00;
    public final C00i A01 = new 1BV((1BY) null, 49258);
    public final C00i A02 = new 1BQ(83604);
    public final C15h A03 = new C4Xg(this, 46);

    static {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Ax.A01);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        A04 = c4Ak.A01();
    }

    public C4Aw(1BO r302) {
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
        return null;
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        return A04;
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (((X.C08564nI) r301.A01.get()).A00() != false) goto L6;
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
            X.00i r0 = r0.A02
            java.lang.Object r0 = r0.get()
            r302 = r0
            X.0et r0 = X.C0et.A0P
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L2c
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.4nI r0 = (X.C08564nI) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A00()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L31
        L2c:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L31:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Aw.Cxb():boolean");
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}

package X;

/* renamed from: X.4Bf, reason: invalid class name */
/* loaded from: 4Bf.class */
public final class C4Bf implements C4Ah {
    public static final String __redex_internal_original_name = "BubblesSettingsConditionalWorkerInfo";
    public final 1Br A00 = 1Bq.A00(16385);
    public final 1Br A01 = 1Bq.A00(83604);
    public final C15h A02 = new C15h() { // from class: X.4Bg
        @Override // X.C15h
        public /* bridge */ /* synthetic */ Object get() {
            return 1Bn.A0A(66895);
        }
    };

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A02;
    }

    @Override // X.C4Ah
    public long Aro() {
        return ((2yD) this.A00.A00.get()).Auy(36594521521784924L) * 3600000;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(3719985438017145L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4An.A01);
        c4Ak.A01.A00 = 0S2.A0N;
        C4Ak.A00(c4Ak, C4Ax.A01);
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (((X.2yD) r301.A00.A00.get()).Auy(36594521521784924L) <= 0) goto L8;
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
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r302 = r0
            X.0et r0 = X.C0et.A0P
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L57
            int r0 = android.os.Build.VERSION.SDK_INT
            r304 = r0
            r0 = 30
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 < r1) goto L57
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r306 = r0
            r0 = 36594521521784924(0x8202860008085c, double:3.2058609924629185E-306)
            r307 = r0
            r0 = r306
            r1 = r307
            long r0 = r0.Auy(r1)
            r309 = r0
            r0 = 0
            r311 = r0
            r0 = r309
            r1 = r311
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 > 0) goto L5c
        L57:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L5c:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Bf.Cxb():boolean");
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}
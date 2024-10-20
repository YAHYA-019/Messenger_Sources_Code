package X;

/* renamed from: X.Joc, reason: case insensitive filesystem */
/* loaded from: Joc.class */
public final class C3271Joc extends 1RM {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C3271Joc(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        if (this.A00 == 0) {
            0fH.A0A(LDA.class, "Successfully wrote location signals");
            if (this.A02) {
                LD9 ld9 = (LD9) 1Br.A0B(((LDA) this.A01).A06);
                try {
                    LD9.A04(ld9, true);
                    LD9.A02(ld9, true);
                    LD9.A03(ld9, false);
                    LD9.A05(ld9, true);
                    ld9.A06++;
                    AbstractC01593ro A00 = LD9.A00(ld9, "fgl_write_success");
                    if (A00 != null) {
                        long now = ld9.A0B.now();
                        long j = now - ld9.A0A;
                        long j2 = now - ld9.A07;
                        A00.A05("write_duration_ms", j);
                        A00.A05("request_duration_ms", j2);
                        A00.A0A();
                    }
                    ld9.A0A = Long.MIN_VALUE;
                    ld9.A08 = Long.MIN_VALUE;
                    ld9.A07 = Long.MIN_VALUE;
                } catch (IllegalStateException unused) {
                    0fH.A0g("fgl_write_success", "ForegroundLocationFrameworkAnalyticsLogger", "Invalid state triggered from action: %s");
                }
            }
            ((LDA) this.A01).A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ad, code lost:
    
        if (r307 == null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3271Joc.A03(java.lang.Throwable):void");
    }
}

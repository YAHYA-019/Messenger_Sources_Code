package X;

/* loaded from: Krr.class */
public final class Krr {
    public final int A00;
    public final int A01;
    public final 6Yl A02;
    public final 6Yl A03;
    public final String A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r306 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Krr(X.6Yl r302, X.6Yl r303, java.lang.String r304, int r305, int r306) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r305
            if (r0 == 0) goto L11
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L14
        L11:
            r0 = 1
            r307 = r0
        L14:
            r0 = r307
            X.6DP.A03(r0)
            r0 = r304
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L45
            r0 = r301
            r1 = r304
            r0.A04 = r1
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            r1 = r302
            r0.A03 = r1
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r301
            r1 = r305
            r0.A01 = r1
            r0 = r301
            r1 = r306
            r0.A00 = r1
            return
        L45:
            java.lang.IllegalArgumentException r0 = X.JQx.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Krr.<init>(X.6Yl, X.6Yl, java.lang.String, int, int):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Krr krr = (Krr) obj;
            if (this.A01 != krr.A01 || this.A00 != krr.A00 || !this.A04.equals(krr.A04) || !this.A03.equals(krr.A03) || !this.A02.equals(krr.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A05(this.A03, AnonymousClass002.A07(this.A04, (AbstractC2326GOr.A03(this.A01) + this.A00) * 31)));
    }
}

package X;

/* loaded from: D47.class */
public final class D47 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public D47(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public void onFailure(Throwable th) {
        CQH A0P;
        BMG bmg;
        switch (this.A00) {
            case 0:
                boolean z = this.A02;
                CPg cPg = (CPg) this.A01;
                if (z) {
                    cPg.A09.C9k(2131962948);
                    A0P = AbM.A0P(cPg);
                    bmg = BMG.A1h;
                } else {
                    DJV.A00(cPg);
                    A0P = AbM.A0P(cPg);
                    bmg = BMG.A1v;
                }
                A0P.A0M(bmg, th.getMessage(), cPg.A0C);
                return;
            case 1:
                0fH.A0j("CustomEmployeeSurveyController", "Failed to fetch survey last interaction");
                return;
            default:
                0fH.A0k(C1566All.__redex_internal_original_name, "Failed to fetch suggestions");
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x04d7, code lost:
    
        if ((X.1Br.A00(r0.A03) - (r0.A00 * 1000)) >= (r0.A01 * 1000)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0509  */
    /* JADX WARN: Type inference failed for: r0v124, types: [X.All, androidx.fragment.app.Fragment, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D47.onSuccess(java.lang.Object):void");
    }
}

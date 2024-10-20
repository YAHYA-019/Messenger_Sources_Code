package X;

/* loaded from: Cs8.class */
public final class Cs8 implements DHS {
    public final /* synthetic */ AcQ A00;

    public Cs8(AcQ acQ) {
        this.A00 = acQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        if (r0.A0k == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CUc(X.AlE r302) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cs8.CUc(X.AlE):void");
    }

    public void CUd(AlE alE) {
        BP5 A00 = BP5.A00(alE.A1Y());
        0fH.A0i(A00.loggingName, "MessagingTabbedSearchFragment", "ListItemFragmentViewCallback#onViewDestroyed(%s)");
        if (A00.isSerpTab) {
            this.A00.A0u.remove(A00);
        } else if (A00 == BP5.A0f) {
            this.A00.A0V = null;
        } else if (A00 == BP5.A0S) {
            this.A00.A0U = null;
        }
        AcQ acQ = this.A00;
        ((CMo) acQ.A0w.get()).A02(A00.loggingName, false);
        alE.A0B = null;
        C00i c00i = acQ.A0A;
        if (c00i != null && ((AcP) c00i.get()).A03 != null) {
            AbI.A0T(acQ).A03.endCurrentFlow("abandon");
        }
        C00i c00i2 = acQ.A0A;
        if (c00i2 == null || ((AcP) c00i2.get()).A04 == null) {
            return;
        }
        AbI.A0T(acQ).A04.endCurrentFlow("abandon");
    }
}

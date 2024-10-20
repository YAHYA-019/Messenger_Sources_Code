package X;

/* loaded from: Cs9.class */
public final class Cs9 implements DHS {
    public final /* synthetic */ AlH A00;

    public Cs9(AlH alH) {
        this.A00 = alH;
    }

    public void CUc(AlE alE) {
        BP5 A00 = BP5.A00(alE.A1Y());
        0fH.A0i(A00.loggingName, "MessengerGlobalSearchFragment", "ListItemFragmentViewCallback#onViewCreated(%s)");
        if (A00 == BP5.A0G) {
            this.A00.A0D = alE;
        } else if (A00 == BP5.A0H) {
            this.A00.A0C = alE;
        }
        C00i c00i = this.A00.A0J;
        alE.A0B = CMo.A00(c00i, A00).A01;
        ((CMo) c00i.get()).A02(A00.loggingName, true);
    }

    public void CUd(AlE alE) {
        BP5 A00 = BP5.A00(alE.A1Y());
        0fH.A0i(A00.loggingName, "MessengerGlobalSearchFragment", "ListItemFragmentViewCallback#onViewDestroyed(%s)");
        if (A00 == BP5.A0H) {
            this.A00.A0C = null;
        } else if (A00 == BP5.A0G) {
            this.A00.A0D = null;
        }
        ((CMo) this.A00.A0J.get()).A02(A00.loggingName, false);
        alE.A0B = null;
    }
}

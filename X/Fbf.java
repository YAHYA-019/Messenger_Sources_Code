package X;

/* loaded from: Fbf.class */
public final class Fbf implements GHb {
    public final /* synthetic */ EzC A00;

    public Fbf(EzC ezC) {
        this.A00 = ezC;
    }

    @Override // X.GHb
    public void COR(EOp eOp) {
        EzC ezC = this.A00;
        ezC.A02(eOp);
        ezC.A05 = false;
    }

    @Override // X.GHb
    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        EzC ezC = this.A00;
        String message = th.getMessage();
        if (message == null) {
            message = "Failed to get consent state";
        }
        0fH.A0j("DefaultARFLMConsentManager", message);
        ezC.A05 = false;
    }
}

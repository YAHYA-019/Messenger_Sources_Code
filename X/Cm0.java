package X;

/* loaded from: Cm0.class */
public final class Cm0 implements DH7 {
    public final /* synthetic */ CRN A00;

    public Cm0(CRN crn) {
        this.A00 = crn;
    }

    @Override // X.DH7
    public void BxV() {
        CRN crn = this.A00;
        1Iw r0 = crn.A01;
        if (r0.A02 != null) {
            r0.A0G(new C2l4(AnonymousClass001.A1Z(), 4), "updateState:MeetingPlanComponent.hideLoadingSpinner");
        }
        B15.A01(r0, crn.A06);
    }

    @Override // X.DH7
    public void onSuccess() {
        this.A00.A02.A00.onBackPressed();
    }
}

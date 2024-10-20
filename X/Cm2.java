package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cm2.class */
public final class Cm2 implements DH7 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Cm2(1Iw r302, Bez bez, C5ic c5ic, MigColorScheme migColorScheme, int i) {
        this.A00 = i;
        this.A04 = bez;
        this.A01 = r302;
        this.A03 = c5ic;
        this.A02 = migColorScheme;
    }

    @Override // X.DH7
    public void BxV() {
        1Iw r0 = (1Iw) this.A01;
        if (r0.A02 != null) {
            r0.A0G(new C2l4(AnonymousClass001.A1Z(), 4), "updateState:MeetingPlanComponent.hideLoadingSpinner");
        }
        B15.A01(r0, (MigColorScheme) this.A02);
    }

    @Override // X.DH7
    public void onSuccess() {
        ((Bez) this.A04).A00.onBackPressed();
    }
}

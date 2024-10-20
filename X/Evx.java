package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: Evx.class */
public final class Evx {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(boolean z) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "messenger_onboarding_event");
        0DA r0 = new 0DA();
        r0.A01(3yU.A06, "major_surface");
        r0.A01(z ? 3yV.A01 : 3yV.A02, "minor_surface");
        r0.A01(C4Rf.CONTACT_IMPORT_QUICK_PROMOTION, "entry_point");
        0DA r02 = new 0DA();
        r02.A01((C07n) null, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        0DA r03 = new 0DA();
        r03.A02(r02, "button");
        if (A08.isSampled()) {
            1UG.A00(3yM.A02, r0, r03, A08);
        }
    }

    public final void A01(boolean z, boolean z2) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "messenger_onboarding_event");
        0DA r0 = new 0DA();
        r0.A01(3yU.A06, "major_surface");
        r0.A01(z ? 3yV.A01 : 3yV.A02, "minor_surface");
        r0.A01(C4Rf.CONTACT_IMPORT_QUICK_PROMOTION, "entry_point");
        0DA r02 = new 0DA();
        r02.A01(z2 ? BOo.A01 : BOo.A0B, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        0DA r03 = new 0DA();
        r03.A02(r02, "button");
        if (A08.isSampled()) {
            1UG.A00(3yM.A03, r0, r03, A08);
        }
    }
}

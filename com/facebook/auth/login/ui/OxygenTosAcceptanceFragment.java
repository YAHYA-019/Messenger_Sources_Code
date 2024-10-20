package com.facebook.auth.login.ui;

import X.0fH;
import X.1Bn;
import X.Eyp;
import X.F8h;
import X.RtY;
import android.os.Bundle;

/* loaded from: OxygenTosAcceptanceFragment.class */
public final class OxygenTosAcceptanceFragment extends AuthFragmentBase {
    public Eyp A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.auth.login.ui.AuthFragmentBase
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = (Eyp) 1Bn.A0A(98873);
        0fH.A0C(OxygenTosAcceptanceFragment.class, "Creating TosAcceptance fragment");
        Eyp eyp = this.A00;
        eyp.getClass();
        if (eyp.A00(getChildFragmentManager(), new RtY(this)) == null) {
            0fH.A0C(OxygenTosAcceptanceFragment.class, "No fragment was created");
            A1Y(new F8h(FirstPartySsoFragment.class).A00);
        }
    }
}

package com.facebook.messaging.neue.nux;

import X.1BY;
import X.1Bn;
import X.AnonymousClass001;
import X.C05w;
import X.C1Y6;
import X.DZD;
import X.EcU;
import X.Eru;
import X.FAJ;
import X.GF6;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: NeueNuxNavigableFragmentController.class */
public class NeueNuxNavigableFragmentController extends DZD {
    public FAJ A00;
    public Eru A01;

    /* JADX WARN: Multi-variable type inference failed */
    public boolean A1X() {
        C05w A0Y = getChildFragmentManager().A0Y(2131365350);
        if (!((A0Y instanceof GF6) && ((GF6) A0Y).Bkd()) && this.A01.A00()) {
            return super.A1X();
        }
        return true;
    }

    public void onAttach(Context context) {
        super/*X.1pK*/.onAttach(context);
        this.A00 = (FAJ) 1Bn.A0E(context, (1BY) null, 100122);
        this.A01 = new Eru((EcU) C1Y6.A00(context, "com_facebook_messaging_neue_nux_plugins_interfaces_interactions_NeueNuxOnBackSpec", "All", AnonymousClass001.A1Z()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof NuxFragment) {
            FAJ faj = this.A00;
            faj.getClass();
            faj.A02(((NuxFragment) fragment).A1a());
        }
    }
}

package com.facebook.messaging.hdmediasends.nux;

import X.11T;
import X.1Iw;
import X.1LI;
import X.2qQ;
import X.2qR;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.7zS;
import X.8Lf;
import X.8NJ;
import X.8Tn;
import X.C0B7;
import X.C8xf;
import X.C9py;
import X.H9y;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: HdMediaNuxFragment.class */
public final class HdMediaNuxFragment extends MigBottomSheetDialogFragment {
    public static final 2qR A00;

    static {
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132346628);
        A00 = 7zQ.A0k(A0o, 2132346627);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(HdMediaNuxFragment hdMediaNuxFragment) {
        Serializable serializable;
        Bundle bundle = hdMediaNuxFragment.mArguments;
        if (bundle != null && (serializable = bundle.getSerializable("ON_PRIMARY_BUTTON_CLICKED")) != null) {
            C0B7.A04(serializable, 1);
            Function1 function1 = (Function1) serializable;
            if (function1 != null) {
                7zN.A1a(function1, true);
            }
        }
        super.A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A0o() {
        Serializable serializable;
        Bundle bundle = this.mArguments;
        if (bundle != null && (serializable = bundle.getSerializable("ON_PRIMARY_BUTTON_CLICKED")) != null) {
            C0B7.A04(serializable, 1);
            Function1 function1 = (Function1) serializable;
            if (function1 != null) {
                7zN.A1a(function1, false);
            }
        }
        super.A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8Tn A07 = 8Tn.A07(r302, this);
        Bundle bundle = this.mArguments;
        Serializable serializable = bundle != null ? bundle.getSerializable("NUX_TRIGGER") : null;
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.hdmediasends.nux.HdMediaNuxHelper.NuxTrigger");
        8Lf A01 = serializable == H9y.A03 ? C9py.A01(C9py.A03(this, ActionId.VIEW_WILL_APPEAR_BEGIN), 7zN.A0s(this, 2131957563), getString(2131957564), this, ActionId.VIEW_DID_LOAD_BEGIN) : C9py.A02(7zN.A0s(this, 2131957562), this, 125);
        String string = getString(2131957566);
        String string2 = getString(2131957565);
        C8xf A002 = C8xf.A00(7zS.A02(A00, A1F()));
        11T.A0D(string);
        return 8Tn.A0A(A07, new 8NJ(A01, A002, string2, (CharSequence) null, string, (List) null, true));
    }
}

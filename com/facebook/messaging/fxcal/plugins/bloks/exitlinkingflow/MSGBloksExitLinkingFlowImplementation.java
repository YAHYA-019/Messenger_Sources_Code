package com.facebook.messaging.fxcal.plugins.bloks.exitlinkingflow;

import X.06Z;
import X.11T;
import X.1Br;
import X.1De;
import X.1HG;
import X.1I7;
import X.1pK;
import X.AbK;
import X.C2050DaD;
import X.DKC;
import X.DKE;
import X.DKc;
import X.DYw;
import X.Fwk;
import X.RFf;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import org.json.JSONException;

/* loaded from: MSGBloksExitLinkingFlowImplementation.class */
public final class MSGBloksExitLinkingFlowImplementation {
    public final 1Br A00;
    public final Context A01;
    public final 1De A02;

    public MSGBloksExitLinkingFlowImplementation(1De r302) {
        this.A02 = r302;
        Context A0A = AbK.A0A(r302);
        this.A01 = A0A;
        this.A00 = 1HG.A00(A0A, 65728);
    }

    public final Object A00(Fwk fwk, DKc dKc) {
        11T.A0F(fwk, 0);
        String A0y = DKE.A0y(dKc, 0);
        if (fwk instanceof C2050DaD) {
            FragmentActivity requireActivity = ((C2050DaD) fwk).A01.requireActivity();
            11T.A0I(requireActivity, "null cannot be cast to non-null type com.facebook.base.activity.FbFragmentActivity");
            06Z BDe = requireActivity.BDe();
            DYw dYw = (1pK) BDe.A0b(DYw.class.getCanonicalName());
            if (dYw != null && A0y != null) {
                try {
                    if (DKC.A1A("userID", DKC.A1F(A0y)).length() > 0) {
                        RFf rFf = dYw.A00;
                        if (rFf != null) {
                            DKC.A1I(rFf.A00.A00, "Linking successful", 1);
                        }
                    } else {
                        dYw.A1X();
                    }
                } catch (JSONException unused) {
                    dYw.A1X();
                }
            }
            BDe.A1Q("start_initial_loading_state", 1);
        }
        ((1I7) 1Br.A0B(this.A00)).CkT("msgr_interop_nux_dismiss");
        return null;
    }
}

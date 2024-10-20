package com.facebook.messaging.professionalmode.businesstools.upsell.fullscreen;

import X.0FI;
import X.11T;
import X.1Bn;
import X.1Iw;
import X.3E6;
import X.3OP;
import X.7zR;
import X.7zS;
import X.AbF;
import X.CFv;
import X.CoM;
import X.DHJ;
import X.DKB;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;

/* loaded from: NeueNuxProfessionalModeBusinessToolsNuxFragment.class */
public final class NeueNuxProfessionalModeBusinessToolsNuxFragment extends NuxFragment implements INeueNuxMilestoneFragment {
    public LithoView A00;
    public final DHJ A01 = new CoM(this, 2);

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return DKB.A00(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1572805495);
        LithoView A0M = 7zR.A0M(this);
        this.A00 = A0M;
        0FI.A08(-1350514855, A02);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            1Iw A0U = AbF.A0U(lithoView);
            1Bn.A0A(83291);
            lithoView.A0x(CFv.A00(A0U, this.A01, 7zS.A0j(this), "full_screen_nux"));
            if (requireArguments().getBoolean("arg_nux_flow_active", true)) {
                ((3OP) 1Bn.A0A(68279)).A00(3E6.A06);
            }
        }
    }
}

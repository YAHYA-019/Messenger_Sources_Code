package com.facebook.messaging.health.lowdiskspaceblockpage;

import X.0FI;
import X.11T;
import X.1Bq;
import X.1Br;
import X.7zL;
import X.7zR;
import X.QFq;
import X.RFc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: LowDiskSpaceBlockPageFragment.class */
public final class LowDiskSpaceBlockPageFragment extends NuxFragment implements INeueNuxMilestoneFragment {
    public LithoView A00;
    public final 1Br A01 = 1Bq.A00(67373);

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-889135369);
        LithoView A0M = 7zR.A0M(this);
        this.A00 = A0M;
        0FI.A08(-1580906121, A02);
        return A0M;
    }

    @Override // com.facebook.base.fragment.AbstractNavigableFragment
    public void onDestroyView() {
        int A02 = 0FI.A02(942613216);
        super.onDestroyView();
        this.A00 = null;
        0FI.A08(-795025666, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            11T.A0A(lithoView.A09);
            lithoView.A0x(new QFq(new RFc(this), (MigColorScheme) 7zL.A0R(requireContext(), 16979).get()));
        }
    }
}

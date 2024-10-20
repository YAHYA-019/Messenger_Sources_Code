package com.facebook.messaging.neue.nux.businessrtc;

import X.0FI;
import X.11T;
import X.1Bi;
import X.1iF;
import X.7zL;
import X.7zM;
import X.AbF;
import X.C1sx;
import X.CxA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.business.bizrtc.nux.BusinessRTCNuxView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;

/* loaded from: NeueNuxBusinessRTCNuxFragment.class */
public final class NeueNuxBusinessRTCNuxFragment extends NuxFragment implements INeueNuxMilestoneFragment {
    public BusinessRTCNuxView A00;

    @Override // com.facebook.base.fragment.AbstractNavigableFragment
    public 1iF A1R() {
        return AbF.A0C(2308150205997943L);
    }

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return "business_rtc_upsell";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(410020521);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        this.A00 = (BusinessRTCNuxView) 7zL.A0F(this, 2131366058);
        CxA.A00(this, (C1sx) 1Bi.A03(16837), 8);
        0FI.A08(-1045799059, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-476636803);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132542452, false);
        0FI.A08(1074220868, A02);
        return A0G;
    }
}

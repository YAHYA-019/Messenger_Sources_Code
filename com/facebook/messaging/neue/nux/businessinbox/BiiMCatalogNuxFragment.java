package com.facebook.messaging.neue.nux.businessinbox;

import X.0FI;
import X.1Bi;
import X.1iF;
import X.7zL;
import X.AbF;
import X.AbG;
import X.C1sx;
import X.CxA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;

/* loaded from: BiiMCatalogNuxFragment.class */
public final class BiiMCatalogNuxFragment extends NuxFragment implements INeueNuxMilestoneFragment {
    public BiiMCatalogNuxView A00;

    @Override // com.facebook.base.fragment.AbstractNavigableFragment
    public 1iF A1R() {
        return AbF.A0C(367103207806489L);
    }

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return "biim_catalog_upsell";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1502800150);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        this.A00 = (BiiMCatalogNuxView) 7zL.A0F(this, 2131366058);
        CxA.A00(this, (C1sx) 1Bi.A03(16837), 7);
        0FI.A08(-1924775509, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1697136521);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542451);
        0FI.A08(1243927651, A02);
        return A08;
    }
}

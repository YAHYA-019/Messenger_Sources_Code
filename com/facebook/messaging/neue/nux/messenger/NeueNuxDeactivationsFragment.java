package com.facebook.messaging.neue.nux.messenger;

import X.0FI;
import X.7zL;
import X.7zO;
import X.AbG;
import X.AbH;
import X.C00i;
import X.Erh;
import X.FAJ;
import X.FXr;
import X.RkA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;

/* loaded from: NeueNuxDeactivationsFragment.class */
public final class NeueNuxDeactivationsFragment extends NuxFragment implements INeueNuxMilestoneFragment {
    public View A00;
    public View A01;
    public View A02;
    public Erh A03;
    public FAJ A04;
    public FbSharedPreferences A05;
    public final C00i A06 = AbH.A0D();

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-861949651);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        this.A01 = 7zL.A0F(this, 2131363560);
        this.A02 = 7zL.A0F(this, 2131363563);
        Erh erh = this.A03;
        View view = this.A00;
        int integer = 7zO.A0D(this).getInteger(2131427334);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new RkA(view, erh, ImmutableList.of((Object) 2131363561), integer));
        FXr.A03(this.A01, this, 99);
        FXr.A03(this.A02, this, 100);
        0FI.A08(-1923637996, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1751503240);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542943);
        this.A00 = A08;
        0FI.A08(274578472, A02);
        return A08;
    }
}

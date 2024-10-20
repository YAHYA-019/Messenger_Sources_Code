package com.facebook.messaging.zombification;

import X.0FI;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1lN;
import X.AbG;
import X.AbJ;
import X.C00i;
import X.C1F;
import X.FAE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.resources.ui.FbRadioButton;

/* loaded from: PhoneReconfirmationForkFragment.class */
public final class PhoneReconfirmationForkFragment extends AbstractNavigableFragment implements 1lN {
    public View A00;
    public View A01;
    public Button A02;
    public TextView A03;
    public TextView A04;
    public C1F A05;
    public FAE A06;
    public FbRadioButton A07;
    public FbRadioButton A08;
    public TextView A0A;
    public final C00i A0B = 1BQ.A02(84886);
    public boolean A09 = false;

    public void A1S(Bundle bundle) {
        this.A06 = (FAE) 1Bn.A0A(100132);
        this.A05 = (C1F) 1Bi.A03(85297);
    }

    public String AWg() {
        return "phone_reconfirmation_fork_screen";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1991006315);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543097);
        0FI.A08(1101969115, A02);
        return A08;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("use_same_number", this.A09);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x018c, code lost:
    
        if (r301.A07.isChecked() != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.zombification.PhoneReconfirmationForkFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}

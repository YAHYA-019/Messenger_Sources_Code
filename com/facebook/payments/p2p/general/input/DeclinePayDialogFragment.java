package com.facebook.payments.p2p.general.input;

import X.0FI;
import X.1BK;
import X.2Ov;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.C00i;
import X.C15h;
import X.C2121Dea;
import X.DKD;
import X.DKS;
import X.DU0;
import X.DUD;
import X.FK6;
import X.Fch;
import X.G7K;
import X.RGs;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: DeclinePayDialogFragment.class */
public class DeclinePayDialogFragment extends 2Ov {
    public RGs A00;
    public Executor A01;
    public C15h A02;
    public final C00i A03 = AbH.A0P();
    public final Fch A04 = DKD.A0b();

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        String A15 = AbI.A15(this, this.mArguments.getString("sender_name"), 2131964198);
        C2121Dea A00 = DKS.A00(this);
        A00.A06(2131964199);
        A00.A0A(A15);
        DKS.A02(A00, this, 73, 2131964197);
        A00.A07(FK6.A00(this, 74));
        return A00.A0I();
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1891900362);
        super.onCreate(bundle);
        this.A02 = G7K.A01(this, 93);
        this.A01 = AbJ.A1D();
        0FI.A08(-545161412, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DU0 A00 = DU0.A00(1BK.A06(this.A03));
        DUD A05 = DUD.A05("p2p_decline_payment_initiate", "p2p_receive");
        A05.A0D("parent_activity_name", getActivity().getComponentName().getShortClassName());
        A00.A03(A05);
    }
}

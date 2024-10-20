package com.facebook.zero.messenger.optin.ui;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.2BQ;
import X.2Ov;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.C5ic;
import X.DKE;
import X.DR6;
import X.FK6;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: ZeroReconsiderDialog.class */
public final class ZeroReconsiderDialog extends 2Ov {
    public int A00;
    public String A01;
    public String A02;
    public final 1Br A03 = 7zN.A0I(this);
    public final 2BQ A05 = DKE.A0h();
    public final 1Br A04 = 7zM.A0S();

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Context requireContext = requireContext();
        1Bn.A0A(67527);
        DR6 A01 = C5ic.A01(requireContext, 7zQ.A0m(this.A03));
        A01.A00(2131964236);
        A01.A0J(1BK.A0v(requireContext, this.A02, 2131964233));
        A01.A0D(FK6.A00(this, 91), 2131964235);
        A01.A0B((DialogInterface.OnClickListener) null, 2131964234);
        return A01.A04();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1422289621);
        super.onCreate(bundle);
        this.A02 = bundle != null ? bundle.getString("ARG_CARRIER_NAME") : requireArguments().getString("ARG_CARRIER_NAME");
        this.A01 = bundle != null ? bundle.getString("ARG_FEATURE") : requireArguments().getString("ARG_FEATURE");
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A00 = bundle.getInt("QPL_INSTANCE");
        0FI.A08(606433907, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        String str = this.A02;
        if (str != null) {
            bundle.putString("ARG_CARRIER_NAME", str);
        }
        String str2 = this.A01;
        if (str2 != null) {
            bundle.putString("ARG_FEATURE", str2);
        }
        bundle.putInt("QPL_INSTANCE", this.A00);
    }
}

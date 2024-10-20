package com.facebook.zero.messenger.free;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.2Ov;
import X.7zN;
import X.7zQ;
import X.C5ic;
import X.C9oG;
import X.DKB;
import X.DR6;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/* loaded from: AutoMessengerSwitchToPaidDialog.class */
public final class AutoMessengerSwitchToPaidDialog extends 2Ov {
    public String A00;
    public final 1Br A01 = 7zN.A0I(this);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Context requireContext = requireContext();
        1Bn.A0A(67527);
        DR6 A01 = C5ic.A01(requireContext, 7zQ.A0m(this.A01));
        A01.A03(1BK.A0v(requireContext, this.A00, 2131953039));
        A01.A06(2131953037);
        C9oG.A02(A01, this, 69, 2131953038);
        return A01.A04();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(351207155);
        super.onCreate(bundle);
        String A00 = DKB.A00(37);
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A00 = bundle.getString(A00);
        0FI.A08(-181221199, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        String str = this.A00;
        if (str != null) {
            bundle.putString(DKB.A00(37), str);
        }
    }
}

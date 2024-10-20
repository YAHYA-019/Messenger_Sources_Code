package com.facebook.messaging.composer.block;

import X.0FI;
import X.1Bn;
import X.1iF;
import X.2Ov;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AbN;
import X.C00i;
import X.C5ic;
import X.CGL;
import X.CSG;
import X.DR6;
import android.app.Dialog;
import android.os.Bundle;

/* loaded from: CantReplyDialogFragment.class */
public class CantReplyDialogFragment extends 2Ov {
    public CGL A00;
    public C00i A01;
    public final C00i A02 = AbH.A0c(this);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        this.A01.get();
        DR6 A01 = C5ic.A01(requireContext(), AbF.A0p(this.A02));
        A01.A06(2131962577);
        A01.A0C(CSG.A00(this, 59), 2131962579);
        A01.A09(CSG.A00(this, 58));
        return A01.A04();
    }

    public 1iF A17() {
        return AbN.A0B();
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(131656624);
        super.onCreate(bundle);
        this.A00 = (CGL) 1Bn.A0A(83342);
        this.A01 = AbI.A0L();
        0FI.A08(-383303236, A02);
    }
}

package com.facebook.messaging.r2l.ui;

import X.1iF;
import X.2Ov;
import X.AbF;
import X.AbK;
import X.EAX;
import X.FeI;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.litho.LithoView;

/* loaded from: Rooms2LiveDialogFragment.class */
public abstract class Rooms2LiveDialogFragment extends 2Ov {
    public EAX A00;

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        EAX eax = new EAX(getContext());
        this.A00 = eax;
        eax.A0A(FeI.A00);
        boolean A1D = A1D();
        this.A00.setCancelable(A1D);
        this.A00.setCanceledOnTouchOutside(A1D);
        this.A00.A0C(A1D);
        LithoView A0O = AbK.A0O(this);
        this.A00.setContentView(A0O);
        A0j(A1D);
        A1C(A0O);
        return this.A00;
    }

    public 1iF A17() {
        return AbF.A0C(251839919177629L);
    }

    public abstract void A1C(LithoView lithoView);

    public abstract boolean A1D();
}

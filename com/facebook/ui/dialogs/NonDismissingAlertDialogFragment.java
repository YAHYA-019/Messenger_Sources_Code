package com.facebook.ui.dialogs;

import X.0D2;
import X.0FI;
import X.1iF;
import X.2Ov;
import X.AbF;
import X.C2121Dea;
import X.DMV;
import X.FEx;
import X.FXs;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

/* loaded from: NonDismissingAlertDialogFragment.class */
public abstract class NonDismissingAlertDialogFragment extends 2Ov {
    public C2121Dea A00;

    public final Dialog A0n(Bundle bundle) {
        C2121Dea A1C = A1C(bundle);
        this.A00 = A1C;
        return A1C.A0I();
    }

    public 1iF A17() {
        return AbF.A0C(881081412356415L);
    }

    public abstract C2121Dea A1C(Bundle bundle);

    public void onStart() {
        int i;
        int A02 = 0FI.A02(1972845333);
        super/*X.0D2*/.onStart();
        DMV dmv = ((0D2) this).A01;
        if (dmv == null) {
            i = 185066577;
        } else {
            Button button = dmv.A00.A0F;
            if (button != null) {
                FXs.A01(button, dmv, this, 73);
            }
            FEx fEx = dmv.A00;
            Button button2 = fEx.A0E;
            if (button2 != null) {
                FXs.A01(button2, dmv, this, 74);
            }
            Button button3 = fEx.A0D;
            if (button3 != null) {
                FXs.A01(button3, dmv, this, 75);
            }
            i = 1300291389;
        }
        0FI.A08(i, A02);
    }
}

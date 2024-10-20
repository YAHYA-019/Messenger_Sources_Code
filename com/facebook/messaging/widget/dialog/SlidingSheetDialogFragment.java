package com.facebook.messaging.widget.dialog;

import X.0FI;
import X.2Ov;
import X.3AI;
import X.6QF;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;

/* loaded from: SlidingSheetDialogFragment.class */
public abstract class SlidingSheetDialogFragment extends 2Ov {
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        3AI r0 = new 3AI(getContext(), this, A0l());
        6QF.A00(r0);
        Window window = r0.getWindow();
        if (window != null) {
            window.setGravity(87);
            window.setLayout(-1, -2);
        }
        return r0;
    }

    public boolean A1C() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2003553143);
        super.onCreate(bundle);
        A0g(2, 2132608322);
        0FI.A08(592575010, A02);
    }
}

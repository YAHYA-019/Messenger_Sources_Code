package com.facebook.messaging.fullscreendialog;

import X.0FI;
import X.2Ov;
import X.6QF;
import X.BI9;
import X.BsN;
import X.C2rv;
import X.C2rx;
import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: FullScreenDialogFragment.class */
public abstract class FullScreenDialogFragment extends 2Ov {
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        int i;
        BI9 bi9 = new BI9(getContext(), this, A0l());
        6QF.A00(bi9);
        Bundle bundle2 = this.mArguments;
        BsN bsN = bundle2 == null ? new BsN(bi9, -1, -1, -1) : new BsN(bi9, bundle2.getInt("arg_dialog_width", -1), bundle2.getInt("arg_dialog_height", -1), bundle2.getInt("arg_window_anim_style_res_id", -1));
        Dialog dialog = bsN.A03;
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        window.getClass();
        window.setSoftInputMode(16);
        Window window2 = dialog.getWindow();
        window2.getClass();
        WindowManager.LayoutParams attributes = window2.getAttributes();
        int i2 = bsN.A02;
        if (i2 == -1) {
            i2 = 2132608893;
        }
        attributes.windowAnimations = i2;
        attributes.flags |= R.attr.transcriptMode;
        Window window3 = dialog.getWindow();
        window3.getClass();
        window3.setAttributes(attributes);
        int i3 = bsN.A01;
        if (i3 != -1 && (i = bsN.A00) != -1) {
            Window window4 = dialog.getWindow();
            window4.getClass();
            WindowManager.LayoutParams attributes2 = window4.getAttributes();
            ((ViewGroup.LayoutParams) attributes2).width = i3;
            ((ViewGroup.LayoutParams) attributes2).height = i;
            attributes2.gravity = 83;
            window4.setAttributes(attributes2);
        }
        return dialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-130893758);
        super.onCreate(bundle);
        int i = 2132608314;
        if (C2rx.A03 == C2rv.A00(getContext())) {
            i = 2132608320;
        }
        A0g(2, i);
        0FI.A08(1452549874, A02);
    }
}

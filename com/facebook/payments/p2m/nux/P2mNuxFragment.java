package com.facebook.payments.p2m.nux;

import X.0FI;
import X.11T;
import X.7zL;
import X.AnonymousClass001;
import X.AnonymousClass553;
import X.C1rs;
import X.QE6;
import X.QLn;
import X.RGn;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.payments.p2m.nux.model.P2mNuxModel;
import java.util.BitSet;

/* loaded from: P2mNuxFragment.class */
public final class P2mNuxFragment extends SlidingSheetFullScreenDialogFragment {
    public View.OnClickListener A00;
    public AnonymousClass553 A01;
    public RGn A02;

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(-1504610151);
        11T.A0F(layoutInflater, 0);
        Context context = layoutInflater.getContext();
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            P2mNuxModel p2mNuxModel = (P2mNuxModel) bundle2.getParcelable("nux_data");
            if (p2mNuxModel != null) {
                QE6 qe6 = new QE6(7zL.A0W(context), new QLn());
                QLn qLn = qe6.A01;
                qLn.A02 = p2mNuxModel;
                BitSet bitSet = qe6.A02;
                bitSet.set(0);
                qLn.A01 = this.A01;
                qLn.A00 = this.A00;
                C1rs.A01(bitSet, qe6.A03);
                qe6.A0J();
                lithoView.A0x(qLn);
                0FI.A08(-615619005, A02);
                return lithoView;
            }
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -1374419874;
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -570584172;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        RGn rGn = this.A02;
        if (rGn != null) {
            P2mPurchaseProtectionBuyerNuxActivity p2mPurchaseProtectionBuyerNuxActivity = rGn.A00;
            if (p2mPurchaseProtectionBuyerNuxActivity.isFinishing()) {
                return;
            }
            p2mPurchaseProtectionBuyerNuxActivity.finish();
        }
    }
}

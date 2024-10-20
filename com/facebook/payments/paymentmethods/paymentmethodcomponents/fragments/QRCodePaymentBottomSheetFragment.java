package com.facebook.payments.paymentmethods.paymentmethodcomponents.fragments;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.AnonymousClass001;
import X.C1rs;
import X.DGJ;
import X.Dtt;
import X.Dzl;
import X.Eev;
import X.FIt;
import X.FXq;
import X.QAg;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.checkout.model.CheckoutData;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: QRCodePaymentBottomSheetFragment.class */
public final class QRCodePaymentBottomSheetFragment extends MigBottomSheetDialogFragment {
    public Eev A00;
    public ImmutableList A01 = ImmutableList.of();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        Bundle bundle = this.mArguments;
        if (bundle == null) {
            throw 1BK.A0h();
        }
        String string = bundle.getString("title");
        if (string == null || string.length() == 0) {
            string = getString(2131962842);
            11T.A0A(string);
        }
        return new QAg(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        Bundle bundle = this.mArguments;
        if (bundle == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        CheckoutData checkoutData = (CheckoutData) bundle.getParcelable("checkout_data");
        String string = bundle.getString("payment_type");
        String string2 = bundle.getString("session_id");
        String string3 = bundle.getString("order_id");
        String string4 = bundle.getString("per_payment_method_offer_id");
        String string5 = bundle.getString("qr_code");
        if (string5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String string6 = bundle.getString("qr_code_note");
        Dtt dtt = new Dtt(r302, new Dzl());
        MigColorScheme A1F = A1F();
        Dzl dzl = dtt.A01;
        dzl.A01 = A1F;
        BitSet bitSet = dtt.A02;
        bitSet.set(1);
        dzl.A02 = checkoutData;
        bitSet.set(0);
        dzl.A05 = string;
        bitSet.set(4);
        dzl.A09 = string2;
        bitSet.set(9);
        dzl.A04 = string3;
        bitSet.set(3);
        dzl.A06 = string4;
        bitSet.set(5);
        dzl.A07 = string5;
        bitSet.set(7);
        dzl.A08 = string6;
        bitSet.set(8);
        dzl.A03 = this.A01;
        bitSet.set(6);
        dzl.A00 = FXq.A00(this, 94);
        bitSet.set(2);
        C1rs.A05(bitSet, dtt.A03, 10);
        dtt.A0J();
        return dzl;
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        Eev eev = this.A00;
        if (eev != null) {
            FIt fIt = eev.A00;
            if (1Br.A06(fIt.A0I.A01).AZk(36313342902802654L)) {
                fIt.A0C(true);
            }
        }
    }

    public void onStart() {
        int A02 = 0FI.A02(311546192);
        super/*X.0D2*/.onStart();
        Eev eev = this.A00;
        if (eev != null) {
            eev.A00.A08();
        }
        0FI.A08(-2031152145, A02);
    }
}

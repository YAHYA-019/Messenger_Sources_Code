package com.facebook.payments.checkout;

import X.0FI;
import X.1BK;
import X.1Bi;
import X.1Iw;
import X.1iF;
import X.2Ov;
import X.7zL;
import X.7zO;
import X.AbF;
import X.C1rs;
import X.C2121Dea;
import X.DKH;
import X.DMV;
import X.Ewn;
import X.FIt;
import X.FKG;
import X.FXq;
import X.FXs;
import X.GFR;
import X.QDt;
import X.QKa;
import X.QxT;
import X.Rtz;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.payments.paymentmethods.model.CreditCard;
import java.util.BitSet;

/* loaded from: CvvDialogFragment.class */
public class CvvDialogFragment extends 2Ov {
    public FIt A00;
    public CreditCard A01;
    public String A02;
    public final Ewn A04 = (Ewn) 1Bi.A03(99103);
    public final GFR A03 = new Rtz(this);

    public static void A05(CvvDialogFragment cvvDialogFragment) {
        1BK.A0U(cvvDialogFragment.A04.A00).markerPoint(23265283, "security_code_verification_flow_closed");
        FIt fIt = cvvDialogFragment.A00;
        if (fIt != null) {
            fIt.A0A(ActionId.RTMP_CONNECTION_RELEASE, 0, AbF.A05());
        }
        cvvDialogFragment.A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.QxT, java.lang.Object] */
    public Dialog A0n(Bundle bundle) {
        if (bundle != null) {
            this.A02 = bundle.getString("extra_cvv_value");
        }
        Context context = getContext();
        1Iw A0W = 7zL.A0W(context);
        LithoView A0V = 7zO.A0V(context);
        String str = this.A02;
        ?? obj = new Object();
        ((QxT) obj).A00 = str;
        QDt qDt = new QDt(A0W, new QKa());
        QKa qKa = qDt.A01;
        qKa.A03 = obj;
        BitSet bitSet = qDt.A02;
        bitSet.set(1);
        qKa.A04 = this.A01;
        bitSet.set(0);
        qKa.A02 = this.A03;
        bitSet.set(4);
        qKa.A01 = FXs.A00((Object) obj, this, 38);
        bitSet.set(3);
        qKa.A00 = FXq.A00(this, 35);
        bitSet.set(2);
        C1rs.A04(bitSet, qDt.A03);
        qDt.A0J();
        A0V.A0x(qKa);
        C2121Dea A03 = C2121Dea.A03(context);
        A03.A09(A0V);
        DMV A0I = A03.A0I();
        A0I.setOnShowListener(new FKG(this, 3));
        return A0I;
    }

    public 1iF A17() {
        return DKH.A0K();
    }

    public void onCancel(DialogInterface dialogInterface) {
        A05(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1649938813);
        super.onCreate(bundle);
        this.A01 = (CreditCard) requireArguments().getParcelable("extra_credit_card");
        0FI.A08(-474153792, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putString("extra_cvv_value", this.A02);
    }
}

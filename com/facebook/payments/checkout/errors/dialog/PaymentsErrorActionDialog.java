package com.facebook.payments.checkout.errors.dialog;

import X.0FI;
import X.0S2;
import X.1BL;
import X.1Bi;
import X.1Iw;
import X.1JF;
import X.1iF;
import X.2MR;
import X.2Me;
import X.2Ov;
import X.7zO;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.AnonymousClass001;
import X.C1pq;
import X.C1rs;
import X.C2121Dea;
import X.CPc;
import X.DKC;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DKS;
import X.DMV;
import X.Eeq;
import X.FIQ;
import X.FKG;
import X.FcE;
import X.GFQ;
import X.QDx;
import X.QDy;
import X.QJP;
import X.QLG;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.payments.checkout.errors.model.CallToAction;
import com.facebook.payments.checkout.errors.model.PaymentsError;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import java.util.BitSet;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: PaymentsErrorActionDialog.class */
public class PaymentsErrorActionDialog extends 2Ov {
    public Context A00;
    public FbUserSession A01;
    public DMV A02;
    public GFQ A03;
    public PaymentsError A04;
    public FcE A05;
    public FIQ A06;
    public PaymentsLoggingSessionData A07;
    public Integer A08;
    public String A09;
    public Executor A0A;
    public CPc A0B;
    public LithoView A0C;
    public final Eeq A0D = new Eeq(this);

    private QLG A05(1Iw r302, String str, boolean z, boolean z2) {
        QDx qDx = new QDx(r302, new QLG());
        String str2 = this.A09;
        QLG qlg = qDx.A01;
        qlg.A03 = str2;
        qlg.A05 = z;
        qlg.A02 = str;
        qlg.A01 = this.A0D;
        qlg.A04 = z2;
        qlg.A00 = 200;
        BitSet bitSet = qDx.A02;
        bitSet.set(0);
        C1rs.A01(bitSet, qDx.A03);
        qDx.A0J();
        return qlg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(android.widget.Button r301, com.facebook.payments.checkout.errors.dialog.PaymentsErrorActionDialog r302, X.Quh r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.checkout.errors.dialog.PaymentsErrorActionDialog.A06(android.widget.Button, com.facebook.payments.checkout.errors.dialog.PaymentsErrorActionDialog, X.Quh, java.lang.String):void");
    }

    public static void A07(PaymentsErrorActionDialog paymentsErrorActionDialog) {
        Button button = paymentsErrorActionDialog.A02.A00.A0F;
        button.setEnabled(false);
        DKF.A14(paymentsErrorActionDialog.A00, button, 2MR.A0z, 2Me.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(PaymentsErrorActionDialog paymentsErrorActionDialog, Integer num, String str) {
        LithoView lithoView;
        QJP qjp;
        String str2 = str;
        1Iw A0P = AbI.A0P(paymentsErrorActionDialog);
        paymentsErrorActionDialog.A08 = num;
        int intValue = num.intValue();
        if (intValue == 0) {
            lithoView = paymentsErrorActionDialog.A0C;
            QDy qDy = new QDy(A0P, new QJP());
            PaymentsError paymentsError = paymentsErrorActionDialog.A04;
            qjp = qDy.A01;
            qjp.A00 = paymentsError;
            BitSet bitSet = qDy.A02;
            bitSet.set(0);
            C1rs.A05(bitSet, qDy.A03, 1);
            qDy.A0J();
        } else if (intValue == 1) {
            lithoView = paymentsErrorActionDialog.A0C;
            qjp = paymentsErrorActionDialog.A05(A0P, null, false, false);
        } else {
            if (intValue != 3) {
                if (intValue == 4) {
                    LithoView lithoView2 = paymentsErrorActionDialog.A0C;
                    String string = paymentsErrorActionDialog.A00.getResources().getString(2131955392);
                    if (str == null) {
                        str2 = paymentsErrorActionDialog.A00.getResources().getString(2131955391);
                    }
                    HashSet A0v = AnonymousClass001.A0v();
                    C1pq.A08("errorTitle", string);
                    C1pq.A08("errorDescription", str2);
                    PaymentsError paymentsError2 = new PaymentsError(null, null, null, null, str2, string, null, "", A0v, 0);
                    QDy qDy2 = new QDy(A0P, new QJP());
                    QJP qjp2 = qDy2.A01;
                    qjp2.A00 = paymentsError2;
                    BitSet bitSet2 = qDy2.A02;
                    bitSet2.set(0);
                    C1rs.A05(bitSet2, qDy2.A03, 1);
                    qDy2.A0J();
                    lithoView2.A0x(qjp2);
                    paymentsErrorActionDialog.A02.A00.A0F.setVisibility(8);
                    DKC.A1K(paymentsErrorActionDialog.A00.getResources(), paymentsErrorActionDialog.A02.A00.A0D, 2131962432);
                } else if (intValue == 2) {
                    lithoView = paymentsErrorActionDialog.A0C;
                    qjp = paymentsErrorActionDialog.A05(A0P, null, false, true);
                }
                paymentsErrorActionDialog.A08 = num;
            }
            String string2 = paymentsErrorActionDialog.A00.getResources().getString(2131955389);
            lithoView = paymentsErrorActionDialog.A0C;
            qjp = paymentsErrorActionDialog.A05(A0P, string2, true, false);
        }
        lithoView.A0x(qjp);
        paymentsErrorActionDialog.A08 = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        A08(this, 0S2.A00, null);
        CallToAction A00 = this.A04.A00();
        C2121Dea A002 = DKS.A00(this);
        A002.A09(this.A0C);
        String str = A00.A00;
        if (1JF.A0B(str)) {
            str = this.A00.getResources().getString(2131955713);
        }
        A002.A0H((DialogInterface.OnClickListener) null, str);
        CallToAction callToAction = this.A04.A02;
        if (callToAction != null) {
            A002.A0F((DialogInterface.OnClickListener) null, callToAction.A00);
        }
        DMV A0I = A002.A0I();
        this.A02 = A0I;
        A0I.setOnShowListener(new FKG(this, 4));
        return this.A02;
    }

    public 1iF A17() {
        return DKH.A0K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-306255471);
        super.onCreate(bundle);
        this.A01 = 1BL.A0G(this);
        this.A08 = 0S2.A00;
        this.A04 = (PaymentsError) requireArguments().getParcelable("extra_payment_error_model");
        this.A07 = (PaymentsLoggingSessionData) requireArguments().getParcelable("extra_payment_logging_session_data");
        this.A0C = AbK.A0O(this);
        this.A00 = (Context) 7zO.A0l(this, 83719);
        this.A0B = (CPc) 1Bi.A03(84955);
        this.A06 = DKG.A0i();
        this.A05 = (FcE) 7zO.A0l(this, 99328);
        this.A0A = AbJ.A1D();
        0FI.A08(-1917322144, A02);
    }
}

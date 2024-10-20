package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.locale.Country;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.p2p.messenger.core.prefs.PaymentsPreferenceActivity;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.p2p.service.model.request.CancelPaymentRequestParams;
import com.facebook.payments.p2p.verification.PaymentRiskVerificationActivity;
import com.facebook.payments.receipt.PaymentsReceiptActivity;
import com.facebook.payments.receipt.model.ReceiptCommonParams;
import com.facebook.payments.receipt.model.ReceiptComponentControllerParams;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;

/* loaded from: Fmn.class */
public final class Fmn implements GIB {
    public final Context A00;
    public final C00i A02;
    public final Euy A04;
    public final F9R A08;
    public final C15h A0A = G7K.A01(this, 96);
    public final C15h A09 = G7K.A01(this, 97);
    public final Fch A07 = DKD.A0b();
    public final F7J A05 = (F7J) 1Bi.A03(99158);
    public final 6Gx A06 = DKD.A0Z();
    public final C00i A01 = 1BQ.A02(84955);
    public final C00i A03 = AbH.A0F();

    public Fmn(Context context) {
        this.A00 = context;
        this.A02 = AbF.A0Q(context, 82272);
        this.A04 = (Euy) 1Bn.A0E(context, (1BY) null, 98787);
        this.A08 = (F9R) 1Bn.A0E(context, (1BY) null, 99164);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public ListenableFuture A00(FbUserSession fbUserSession, RTb rTb, String str) {
        FbFragmentActivity A0O = DKE.A0O(this.A00);
        if (A0O == null) {
            return C3o5.A0K(false);
        }
        F7J.A00((CurrencyAmount) null, 4RT.A00, this.A05, "p2p_receive", "p2p_receive", str);
        6Gx r0 = this.A06;
        FHR A00 = F7K.A00(rTb, "init");
        A00.A04(ER3.A01);
        r0.A05(A00);
        ?? A0j = 4YU.A0j();
        FnC fnC = new FnC(rTb, this, A0j);
        ImmutableList of = ImmutableList.of();
        this.A08.A02(fbUserSession, fnC, new EqP((Fragment) null, (Country) null, DM3.A0J, (PaymentCard) null, EMQ.A01, of, str, true));
        A0O.A5D(new C2059Dak(fbUserSession, this, 3));
        return A0j;
    }

    public ListenableFuture BLa(GIB gib, RTb rTb, ER0 er0, GMJ gmj) {
        return BLb(null, null, rTb, er0, gmj, null);
    }

    public ListenableFuture BLb(Context context, GIB gib, RTb rTb, ER0 er0, GMJ gmj, String str) {
        boolean z;
        Context context2 = context;
        GIB gib2 = gib;
        ER0 er02 = er0;
        String AVJ = gmj.AVJ();
        boolean z2 = false;
        if (AVJ == null) {
            return C3o5.A0J(false);
        }
        6Gx r0 = this.A06;
        FHR A00 = F7K.A00(rTb, "action_click");
        if (er0 == null) {
            er02 = null;
            switch (AVJ.hashCode()) {
                case -1997266183:
                    if (AVJ.equals("MFS_DECLINE_TRANSFER")) {
                        er02 = ER0.A0E;
                        break;
                    }
                    break;
                case -1548584797:
                    if (AVJ.equals("P2P_VERIFY_INFO")) {
                        er02 = ER0.A0N;
                        break;
                    }
                    break;
                case -1470935641:
                    if (AVJ.equals("P2P_PAY_REQUEST")) {
                        er02 = ER0.A0H;
                        break;
                    }
                    break;
                case -707266725:
                    if (AVJ.equals("P2P_CANCEL_REQUEST")) {
                        er02 = ER0.A05;
                        break;
                    }
                    break;
                case -625063307:
                    if (AVJ.equals("P2P_DECLINE_REQUEST")) {
                        er02 = ER0.A09;
                        break;
                    }
                    break;
                case -522953563:
                    if (AVJ.equals("P2P_DECLINE_TRANSFER")) {
                        er02 = ER0.A08;
                        break;
                    }
                    break;
                case -173961035:
                    if (AVJ.equals("P2P_UPDATE_CARD")) {
                        er02 = ER0.A0M;
                        break;
                    }
                    break;
                case 103504660:
                    if (AVJ.equals("P2P_OPEN_RECEIPT")) {
                        er02 = ER0.A0O;
                        break;
                    }
                    break;
                case 312954763:
                    if (AVJ.equals("MFS_MANAGE_MONEY")) {
                        er02 = ER0.A0F;
                        break;
                    }
                    break;
                case 760507307:
                    if (AVJ.equals("MFS_CANCEL_TRANSFER")) {
                        er02 = ER0.A0D;
                        break;
                    }
                    break;
                case 1355924673:
                    if (AVJ.equals("MFS_OPEN_NUX")) {
                        er02 = ER0.A0G;
                        break;
                    }
                    break;
                case 1818677402:
                    if (AVJ.equals("P2P_ACCEPT_MONEY")) {
                        er02 = ER0.A01;
                        break;
                    }
                    break;
            }
        }
        A00.A05(er02);
        r0.A05(A00);
        2JY r02 = (2JY) gmj;
        String A0r = r02.A0r(-1422950858);
        if (A0r != null && A0r.startsWith("fb-messenger://m.me/")) {
            String A0r2 = r02.A0r(-1422950858);
            Boolean A0K = AnonymousClass001.A0K();
            if (A0r2 != null) {
                Intent A05 = AbF.A05();
                DKF.A16(A05, A0r2);
                0LS.A0A(this.A00, A05);
            } else {
                String A0m = r02.A0m();
                if (A0m != null) {
                    Intent A052 = AbG.A05();
                    DKF.A16(A052, A0m);
                    0LS.A0C(this.A00, A052);
                } else {
                    A0K = false;
                }
            }
            return C3o5.A0J(A0K);
        }
        FbUserSession A0D = 4YV.A0D(context);
        switch (AVJ.hashCode()) {
            case -1779301172:
                if (AVJ.equals("P2P_OPEN_DIALOG")) {
                    if (gib == null) {
                        gib2 = this;
                    }
                    02W.A04(gmj instanceof Dkz);
                    C2121Dea A03 = C2121Dea.A03(this.A00);
                    ImmutableList A0c = r02.A0c(-1545853690, DpB.class, 1218940802);
                    if (A0c.size() >= 1) {
                        2JY r03 = (GMJ) A0c.get(0);
                        A03.A0H(new FJu(gib2, rTb, this, r03), r03.A0o());
                    }
                    if (A0c.size() >= 2) {
                        2JY r04 = (GMJ) A0c.get(1);
                        A03.A0G(new FJu(gib2, rTb, this, r04), r04.A0o());
                    }
                    if (A0c.size() >= 3) {
                        2JY r05 = (GMJ) A0c.get(2);
                        A03.A0F(new FJu(gib2, rTb, this, r05), r05.A0o());
                    }
                    A03.A0B(r02.A0r(735669409));
                    A03.A0A(r02.A0r(23200313));
                    AbM.A1I(A03);
                    return C3o5.A0K(true);
                }
                break;
            case -1548584797:
                if (AVJ.equals("P2P_VERIFY_INFO")) {
                    2JY A0O = DKG.A0O(r02, 1638153202, 769160620);
                    String A0k = A0O.A0k();
                    A0k.getClass();
                    String A0k2 = DKG.A0O(A0O, -808719889, 243639935).A0k();
                    A0k2.getClass();
                    Context context3 = this.A00;
                    FbFragmentActivity A0O2 = DKE.A0O(context3);
                    if (A0O2 != null) {
                        0LS.A07(A0O2, PaymentRiskVerificationActivity.A12(A0O2, A0k, A0k2), 10003);
                        1FV A0j = 4YU.A0j();
                        A0O2.A5D(new C2059Dak(A0j, this, 4));
                        return A0j;
                    }
                    Intent A12 = PaymentRiskVerificationActivity.A12(context3, A0k, A0k2);
                    Context A002 = AnonymousClass016.A00(context3, Activity.class);
                    if (A002 != null) {
                        0LS.A0A(A002, A12);
                    } else {
                        A12.addFlags(268435456);
                        0LS.A0A(context3, A12);
                    }
                    return C3o5.A0K(true);
                }
                break;
            case -707266725:
                if (AVJ.equals("P2P_CANCEL_REQUEST")) {
                    2JY A0O3 = DKG.A0O(r02, 1095692943, 2043063447);
                    F7J f7j = this.A05;
                    4RT r06 = 4RT.A01;
                    String A0k3 = A0O3.A0k();
                    F7J.A00((CurrencyAmount) null, r06, f7j, "p2p_request", (String) null, A0k3);
                    FHR A003 = F7K.A00(rTb, "init");
                    A003.A04(ER3.A05);
                    r0.A05(A003);
                    Fch fch = this.A07;
                    Context context4 = this.A00;
                    String string = context4.getString(2131953813);
                    Bundle A053 = 1BK.A05();
                    A053.putParcelable("CancelPaymentRequestParams", new CancelPaymentRequestParams(A0k3));
                    1IB A004 = 1Ho.A00(fch.A08.newInstance_DEPRECATED(1BJ.A00(348), A053, 0, AbH.A0B(fch)).A06(new CfG(context4, string)), true);
                    1Kd.A0D(this.A03, FwJ.A00(rTb, this, 29), A004);
                    return Fvf.A00(A004, this, 15);
                }
                break;
            case -522953563:
                if (AVJ.equals("P2P_DECLINE_TRANSFER")) {
                    F7J.A00((CurrencyAmount) null, 4RT.A04, this.A05, "p2p_receive", (String) null, (String) null);
                    FHR A005 = F7K.A00(rTb, "init");
                    A005.A04(ER3.A0A);
                    r0.A05(A005);
                    2JY A0B = 1BK.A0B(r02, 2JX.class, 1638153202, 769160620);
                    if (A0B == null) {
                        FI9.A00(this.A00, 2131963152);
                        return C3o5.A0J(false);
                    }
                    Fch fch2 = this.A07;
                    Context context5 = this.A00;
                    1IB A032 = fch2.A03(context5, AbH.A1E(this.A0A), A0B.A0k(), context5.getString(2131962386));
                    1Kd.A0D(this.A03, FwJ.A00(rTb, this, 28), A032);
                    return Fvf.A00(A032, this, 16);
                }
                break;
            case -173961035:
                if (AVJ.equals("P2P_UPDATE_CARD")) {
                    Context context6 = this.A00;
                    FbFragmentActivity A0O4 = DKE.A0O(context6);
                    if (A0O4 == null) {
                        return C3o5.A0J(false);
                    }
                    FHR A006 = F7K.A00(rTb, "init");
                    A006.A04(ER3.A0i);
                    r0.A05(A006);
                    0LS.A07(A0O4, C3o5.A0D(context6, PaymentsPreferenceActivity.class), 10001);
                    1FV A0j2 = 4YU.A0j();
                    A0O4.A5D(new C2059Dak(A0j2, this, 2));
                    return A0j2;
                }
                break;
            case 103504660:
                if (AVJ.equals("P2P_OPEN_RECEIPT")) {
                    if (context == null) {
                        context2 = this.A00;
                    }
                    if (str != null) {
                        z2 = true;
                    }
                    02W.A04(z2);
                    if ((gmj instanceof Dkz) && r02.mTypeTag == 1156700751 && r02.A0L(-1372183476, 2JX.class, 329547056) != null) {
                        HashSet A0v = AnonymousClass001.A0v();
                        ER6 er6 = ER6.A0K;
                        ELR elr = ELR.A02;
                        HashSet A0z = 4YV.A0z("receiptStyle", A0v, A0v);
                        C1pq.A08("productId", str);
                        ReceiptCommonParams receiptCommonParams = new ReceiptCommonParams(PaymentsDecoratorParams.A03(), new ReceiptComponentControllerParams(er6, elr, str, A0z), null);
                        ((FcU) this.A02.get()).A01(str);
                        Intent A007 = this.A04.A00(context2, PaymentsReceiptActivity.A12(this.A00, (ViewerContext) this.A09.get(), receiptCommonParams), EMw.A04);
                        if (A007 != null) {
                            if (!(context2 instanceof Activity)) {
                                A007.addFlags(268435456);
                            }
                            0LS.A0A(context2, A007);
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    return 1Kd.A0A(Boolean.valueOf(z));
                }
                break;
            case 1818677402:
                if (AVJ.equals("P2P_ACCEPT_MONEY")) {
                    2JY A0B2 = 1BK.A0B(r02, 2JX.class, 1638153202, 769160620);
                    if (A0B2 != null) {
                        return A00(A0D, rTb, A0B2.A0k());
                    }
                    FI9.A00(this.A00, 2131963152);
                    return C3o5.A0J(false);
                }
                break;
        }
        String A0r3 = r02.A0r(-1422950858);
        Boolean A0K2 = AnonymousClass001.A0K();
        if (A0r3 != null) {
            ((CPc) this.A01.get()).A05(this.A00, A0r3);
        } else {
            String A0m2 = r02.A0m();
            if (A0m2 != null) {
                Intent A054 = AbG.A05();
                DKF.A16(A054, A0m2);
                0LS.A0C(this.A00, A054);
            } else {
                A0K2 = false;
            }
        }
        return C3o5.A0J(A0K2);
    }
}

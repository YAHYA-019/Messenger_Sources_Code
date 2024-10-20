package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.messages.Message;
import com.facebook.payments.auth.pin.newpin.PaymentPinParams;
import com.facebook.payments.auth.pin.newpinv2.PaymentPinV2Activity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.invoice.creation.v2.model.InvoiceData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.p2m.invoicecreation.config.shared.P2mPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.paymentmethods.model.CreditCard;
import com.facebook.payments.paymentmethods.model.FbPaymentCard;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.resources.ui.FbTextView;
import com.facebook.user.model.User;
import com.facebook.widget.text.BetterTextView;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Ezy.class */
public abstract class Ezy {
    public boolean A00 = false;

    /* JADX WARN: Type inference failed for: r0v39, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public ListenableFuture A08() {
        String str;
        String At4;
        Ezy ezy;
        if (this instanceof E60) {
            ezy = ((E60) this).A06;
        } else {
            if (!(this instanceof E64)) {
                if (!(this instanceof E66)) {
                    return C3o5.A0K(true);
                }
                E66 e66 = (E66) this;
                PaymentMethod paymentMethod = e66.A07;
                if (paymentMethod instanceof FbPaymentCard) {
                    FbPaymentCard fbPaymentCard = (FbPaymentCard) paymentMethod;
                    if (fbPaymentCard.BWD()) {
                        if (!(fbPaymentCard instanceof CreditCard)) {
                            if (fbPaymentCard instanceof PaymentCard) {
                                PaymentCard paymentCard = (PaymentCard) fbPaymentCard;
                                str = paymentCard.A05;
                                At4 = 0Pz.A0j(paymentCard.A04, " • ", fbPaymentCard.At4());
                            }
                            return C3o5.A0K(true);
                        }
                        str = ((CreditCard) fbPaymentCard).A00;
                        At4 = fbPaymentCard.At4();
                        e66.A0D = 4YU.A0j();
                        EO0 eo0 = EO0.A08;
                        PaymentsDecoratorParams A02 = PaymentsDecoratorParams.A02();
                        Bundle A05 = 1BK.A05();
                        str.getClass();
                        A05.putString("CREDENTIAL_ID", str);
                        A05.putString("CARD_INFO", At4);
                        A05.putString("AUTH_PURPOSE", "SECURITY_ALL");
                        A05.putString("PAYMENT_TYPE", PaymentItemType.A0C.mValue);
                        EYG.A00(A05);
                        PaymentPinParams paymentPinParams = new PaymentPinParams(null, null, A05, null, null, eo0, null, A02, null, null, null, "CSC", null, null, -1.0f, false, true);
                        e66.A0O.get();
                        0LS.A05(PaymentPinV2Activity.A12(e66.A00, paymentPinParams), e66.A01, 54);
                        return e66.A0D;
                    }
                }
                if (paymentMethod instanceof PayPalBillingAgreement) {
                    PayPalBillingAgreement payPalBillingAgreement = (PayPalBillingAgreement) paymentMethod;
                    if (!payPalBillingAgreement.A05) {
                        if (e66.A04.A00().A08()) {
                            return C3o5.A0K(false);
                        }
                        0LS.A05(E66.A00(e66, payPalBillingAgreement), e66.A01, 52);
                        ?? A0j = 4YU.A0j();
                        e66.A0E = A0j;
                        return A0j;
                    }
                    e66.A0D = 4YU.A0j();
                    EO0 eo02 = EO0.A08;
                    PaymentsDecoratorParams A022 = PaymentsDecoratorParams.A02();
                    Bundle A052 = 1BK.A05();
                    String str2 = payPalBillingAgreement.A01;
                    str2.getClass();
                    A052.putString("CREDENTIAL_ID", str2);
                    A052.putString("AUTH_PURPOSE", "SECURITY_ALL");
                    String str3 = payPalBillingAgreement.A02;
                    str3.getClass();
                    A052.putString("PAYPAL_LOGIN_URL", str3);
                    A052.putString("PAYMENT_TYPE", PaymentItemType.A0C.mValue);
                    EYG.A00(A052);
                    PaymentPinParams paymentPinParams2 = new PaymentPinParams(null, null, A052, null, null, eo02, null, A022, null, null, null, "PAYPAL_ACCESS_TOKEN", null, null, -1.0f, false, true);
                    e66.A0O.get();
                    0LS.A05(PaymentPinV2Activity.A12(e66.A00, paymentPinParams2), e66.A01, 54);
                    return e66.A0D;
                }
                return C3o5.A0K(true);
            }
            ezy = ((E64) this).A05;
        }
        return ezy.A08();
    }

    public ListenableFuture A09() {
        boolean z;
        if (this instanceof E60) {
            return ((E60) this).A06.A09();
        }
        if (this instanceof E64) {
            return ((E64) this).A05.A09();
        }
        if (this instanceof E63) {
            E63 e63 = (E63) this;
            if (e63.A01.A06.size() != 1) {
                return C3o5.A0K(true);
            }
            e63.A03 = 4YU.A0j();
            Boolean bool = e63.A04;
            if (bool != null) {
                E63.A00(e63, bool);
            } else {
                FbUserSession A0C = 4YV.A0C(e63.A00);
                Fch fch = e63.A05;
                ImmutableList immutableList = e63.A01.A06;
                ImmutableList.Builder A0h = 4YU.A0h();
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    A0h.m11011add((Object) ((User) it.next()).A13);
                }
                String concat = immutableList.toString().concat(Boolean.toString(true));
                if (!4DQ.A03(fch.A02) || !concat.equals(fch.A03)) {
                    fch.A03 = concat;
                    C30G A0H = AbF.A0H(99);
                    A0H.A08("allow_exception", true);
                    A0H.A07(AbstractC00603o4.A00(90), A0h.build());
                    C3sa A00 = C3sa.A00(A0H);
                    AbstractC05414dq A09 = 1VX.A09(1BK.A04(fch.A0C), A0C);
                    4YV.A1B(A00);
                    fch.A02 = A09.A03(A00);
                }
                2FT A01 = 2FP.A01(new D2q(fch, immutableList, 18), fch.A02);
                e63.A02 = A01;
                1Kd.A0F(FwK.A01(e63, 25), A01, e63.A06);
            }
            return e63.A03;
        }
        if (this instanceof E66) {
            E66 e66 = (E66) this;
            ImmutableList immutableList2 = e66.A03.A0D;
            if (immutableList2 == null) {
                z = false;
            } else {
                e66.A09 = immutableList2;
                ImmutableList.Builder A0h2 = 4YU.A0h();
                1Du it2 = immutableList2.iterator();
                while (it2.hasNext()) {
                    String A0i = AnonymousClass001.A0i(it2);
                    if (A0i.equals("DEBIT_CARD") && e66.A0M.getString(2131965724) != null) {
                        A0h2.m11011add((Object) A0i);
                    }
                }
                e66.A08 = A0h2.build();
                E66.A03(4YV.A0C(e66.A00), e66);
                z = true;
            }
            return 1Kd.A0A(Boolean.valueOf(z));
        }
        if (this instanceof E5v) {
            E5v e5v = (E5v) this;
            e5v.A04 = 4YU.A0j();
            P2mPaymentConfig p2mPaymentConfig = (P2mPaymentConfig) e5v.A01.A09;
            InvoiceData invoiceData = e5v.A02.A02;
            p2mPaymentConfig.getClass();
            invoiceData.getClass();
            if (invoiceData.A08.equals("PAYMENT_REQUEST") || p2mPaymentConfig.A02) {
                e5v.A04.A04();
            } else {
                FbUserSession A0C2 = 4YV.A0C(e5v.A00);
                Eiz eiz = (Eiz) e5v.A07.get();
                String str = invoiceData.A0A;
                boolean A1X = 1BL.A1X(A0C2, str);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                A0M.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                1FV A092 = 7zT.A09(eiz.A00).A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MessengerP2mSellerPaymentCapabilityQuery", (String) null, "fbandroid", 694285767, 0, 1969697924L, 1969697924L, false, A1X)));
                e5v.A03 = A092;
                1Kd.A0D(e5v.A08, FwK.A01(e5v, 22), A092);
            }
            return e5v.A04;
        }
        if (this instanceof E5y) {
            E5y e5y = (E5y) this;
            if (e5y.A00 == null) {
                throw 1BK.A0h();
            }
            1Fw.A04((1EZ) 1Br.A0B(e5y.A04));
            EsA esA = (EsA) 1Br.A0B(e5y.A03);
            InvoiceData invoiceData2 = e5y.A00;
            11T.A0D(invoiceData2);
            return 2FP.A01(new ABe(e5y, 16), esA.A01(invoiceData2.A0A));
        }
        if (!(this instanceof E5u)) {
            return C3o5.A0K(true);
        }
        E5u e5u = (E5u) this;
        if (e5u.A01 == null) {
            throw 1BK.A0h();
        }
        1Fw.A04((1EZ) 1Br.A0B(e5u.A06));
        EsA esA2 = (EsA) 1Br.A0B(e5u.A04);
        InvoiceData invoiceData3 = e5u.A01;
        11T.A0D(invoiceData3);
        return 2FP.A01(new ABe(e5u, 15), esA2.A01(invoiceData3.A0A));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01dc, code lost:
    
        if (r0.A04.A00().compareTo(new com.facebook.payments.currency.CurrencyAmount(r0.A04.A00().A00, new java.math.BigDecimal(r0))) <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0202, code lost:
    
        if (r0.BJ9().size() >= X.AbJ.A00(r0.BJ9().contains(r0) ? 1 : 0)) goto L46;
     */
    /* JADX WARN: Type inference failed for: r0v198, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v317, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.ListenableFuture A0A(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ezy.A0A(java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    public Integer A0B() {
        if (!(this instanceof E60)) {
            if (!(this instanceof E64) && !(this instanceof E61) && !(this instanceof E66)) {
                if (!(this instanceof E5z)) {
                    if (!(this instanceof E62)) {
                        if (!(this instanceof E5x) && !(this instanceof E5s)) {
                            if (!(this instanceof E5y)) {
                                if (!(this instanceof E5u)) {
                                    return null;
                                }
                            }
                        }
                    }
                    return 0S2.A00;
                }
            }
            return 0S2.A01;
        }
        return 0S2.A0C;
    }

    public boolean A0C() {
        boolean z;
        Ezy ezy;
        if (this instanceof E60) {
            ezy = ((E60) this).A06;
        } else {
            if (!(this instanceof E64)) {
                if (!(this instanceof E66)) {
                    return true;
                }
                E66 e66 = (E66) this;
                z = false;
                if (e66.A07 == null && e66.A05 == null) {
                    return false;
                }
                if (!e66.A0G && !E66.A07(e66) && !4DQ.A03(e66.A0B) && !4DQ.A03(e66.A0C)) {
                    if (e66.A07 != null) {
                        return true;
                    }
                    ImmutableList immutableList = e66.A0A;
                    if (immutableList != null && immutableList.isEmpty()) {
                        return true;
                    }
                }
                return z;
            }
            ezy = ((E64) this).A05;
        }
        z = ezy.A0C();
        return z;
    }

    public View A0D(Context context, ViewGroup viewGroup) {
        if (this instanceof E64) {
            return ((E64) this).A05.A0D(context, viewGroup);
        }
        if (this instanceof E61) {
            return ((E61) this).A01;
        }
        if (this instanceof E62) {
            return ((E62) this).A01;
        }
        if (this instanceof E5s) {
            return ((E5s) this).A00;
        }
        if (!(this instanceof E5u)) {
            return null;
        }
        E5u e5u = (E5u) this;
        11T.A0F(context, 0);
        EBM ebm = e5u.A02;
        if (ebm == null) {
            throw 1BK.A0h();
        }
        2JX r0 = e5u.A00;
        if (r0 == null || !r0.getBooleanValue(-2109392274)) {
            ebm.setVisibility(8);
        } else {
            2JX r02 = e5u.A00;
            11T.A0D(r02);
            String A0r = r02.A0r(-227758988);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) context.getString(2131964020));
            if (A0r != null && A0r.length() != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                SpannableString valueOf = SpannableString.valueOf(context.getString(2131957323));
                valueOf.setSpan(new DOC(new Fme(context, e5u, A0r, 0), 7zQ.A0m(e5u.A03).B4i(), true), 0, valueOf.length(), 33);
                spannableStringBuilder.append((CharSequence) valueOf);
            }
            2OB r03 = ebm.A00;
            r03.setText(spannableStringBuilder);
            r03.setMovementMethod(new LinkMovementMethod());
            EBM ebm2 = e5u.A02;
            11T.A0D(ebm2);
            ebm2.setVisibility(0);
        }
        return e5u.A02;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x014e. Please report as an issue. */
    public void A0E(int i, int i2, Intent intent) {
        Ezy ezy;
        Message message;
        ImmutableList immutableList;
        if (this instanceof E60) {
            E60 e60 = (E60) this;
            if (intent != null && intent.getStringExtra("ShareType") != null && intent.getStringExtra("ShareType").equals(GOm.A00(46)) && (message = (Message) intent.getParcelableExtra("message")) != null && (immutableList = message.A0z) != null && !immutableList.isEmpty()) {
                boolean z = false;
                immutableList.get(0);
                6Gx r0 = e60.A07;
                FHR A00 = FHR.A00();
                A00.A04(ER3.A0a);
                A00.A05(ER0.A0C);
                A00.A08("capture_media");
                A00.A00.A0D("memo_text", e60.A02.A0B);
                A00.A07(e60.A02.A06);
                A00.A03(e60.A02.A00());
                if (e60.A02.A04 != null) {
                    z = true;
                }
                A00.A0B(z);
                r0.A05(A00);
            }
            ezy = e60.A06;
        } else if (this instanceof E64) {
            E64 e64 = (E64) this;
            FbUserSession A05 = 1Fw.A05(e64.A01);
            if (i == 1000 || i == 1001) {
                e64.A06.A01(intent, A05, i, i2);
                return;
            }
            switch (i) {
                case 50:
                case ActionId.UNKNOWN /* 51 */:
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                case ActionId.QUEUEING_BEGIN /* 54 */:
                    ezy = e64.A05;
                    break;
                default:
                    return;
            }
        } else {
            return;
        }
        ezy.A0E(i, i2, intent);
    }

    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        if (this instanceof E5r) {
            E5r e5r = (E5r) this;
            ((Ezy) e5r).A00 = true;
            e5r.A00 = context;
            e5r.A01 = r304;
            return;
        }
        if (this instanceof E61) {
            E61 e61 = (E61) this;
            ((Ezy) e61).A00 = true;
            e61.A00 = context;
            e61.A02 = p2pPaymentData;
            View A08 = AbG.A08(LayoutInflater.from(context), (ViewGroup) null, 2132542989);
            e61.A01 = A08;
            e61.A03 = (FbTextView) C09s.A01(A08, 2131368176);
            DKF.A0E(e61.A01, 2131366401).setText(0Pz.A0W(context.getString(2131957514), " · "));
            E61.A00(e61);
            return;
        }
        if (this instanceof E63) {
            E63 e63 = (E63) this;
            ((Ezy) e63).A00 = true;
            e63.A00 = context;
            e63.A01 = p2pPaymentData;
            if (bundle == null || !bundle.containsKey("KEY_P2P_SEND_ELIGIBILITY_RESULT")) {
                return;
            }
            e63.A04 = Boolean.valueOf(bundle.getBoolean("KEY_P2P_SEND_ELIGIBILITY_RESULT"));
            return;
        }
        if (this instanceof E5t) {
            E5t e5t = (E5t) this;
            ((Ezy) e5t).A00 = true;
            e5t.A00 = context;
            e5t.A0H(p2pPaymentData);
            return;
        }
        if (this instanceof E62) {
            E62 e62 = (E62) this;
            ((Ezy) e62).A00 = true;
            e62.A00 = context;
            View A082 = AbG.A08(LayoutInflater.from(context), (ViewGroup) null, 2132543002);
            e62.A01 = A082;
            e62.A02 = (ViewGroup) C09s.A01(A082, 2131368308);
            e62.A03 = (BetterTextView) C09s.A01(e62.A01, 2131368301);
            AbH.A1K(C09s.A01(e62.A01, 2131366697), AbF.A0p(e62.A05).Atp());
            E62.A00(e62, p2pPaymentData);
            return;
        }
        if (this instanceof E5v) {
            E5v e5v = (E5v) this;
            ((Ezy) e5v).A00 = true;
            e5v.A02 = p2pPaymentData;
            e5v.A01 = p2pPaymentConfig;
            e5v.A00 = context;
            return;
        }
        if (!(this instanceof E5s)) {
            E5u e5u = (E5u) this;
            11T.A0F(context, 0);
            7zT.A1W(r304, p2pPaymentData, p2pPaymentConfig, rsi);
            11T.A0F(rqd, 6);
            ((Ezy) e5u).A00 = true;
            e5u.A02 = new EBM(context);
            e5u.A01 = p2pPaymentData.A02;
            return;
        }
        E5s e5s = (E5s) this;
        ((Ezy) e5s).A00 = true;
        e5s.A00 = new EBM(context);
        InvoiceData invoiceData = p2pPaymentData.A02;
        invoiceData.getClass();
        P2mPaymentConfig p2mPaymentConfig = (P2mPaymentConfig) p2pPaymentConfig.A09;
        p2mPaymentConfig.getClass();
        invoiceData.A01.getClass();
        String str = invoiceData.A08;
        if (str.equals("BUYER_REQUEST") && p2mPaymentConfig.A02) {
            e5s.A00.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = 2131963125;
            if (p2mPaymentConfig.A01) {
                i = 2131963124;
            }
            spannableStringBuilder.append((CharSequence) context.getString(i));
            spannableStringBuilder.append((CharSequence) " ");
            SpannableString valueOf = SpannableString.valueOf(context.getString(2131963127));
            valueOf.setSpan(new DOC(new Fmc(context, e5s), AbF.A0p(e5s.A02).B4i(), true), 0, valueOf.length(), 33);
            spannableStringBuilder.append((CharSequence) valueOf);
            2OB r0 = e5s.A00.A00;
            r0.setText(spannableStringBuilder);
            r0.setMovementMethod(new LinkMovementMethod());
            2OB r02 = e5s.A00.A00;
            r02.setBackground(null);
            r02.setPadding(0, 0, 0, 0);
            r02.setGravity(1);
        } else {
            if (!str.equals("PAYMENT_REQUEST") || !p2mPaymentConfig.A03 || !1BK.A0N(e5s.A03).AZk(36312999300765108L)) {
                e5s.A00.setVisibility(8);
                return;
            }
            e5s.A00.getClass();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) context.getString(2131964431));
            spannableStringBuilder2.append((CharSequence) " ");
            String str2 = p2mPaymentConfig.A00;
            if (str2 != null && !str2.isEmpty()) {
                SpannableString valueOf2 = SpannableString.valueOf(context.getString(2131957323));
                valueOf2.setSpan(new DOC(new Fme(e5s, context, str2, 1), AbF.A0p(e5s.A02).B4i(), true), 0, valueOf2.length(), 33);
                spannableStringBuilder2.append((CharSequence) valueOf2);
            }
            2OB r03 = e5s.A00.A00;
            r03.setText(spannableStringBuilder2);
            r03.setMovementMethod(new LinkMovementMethod());
        }
        e5s.A00.setVisibility(0);
    }

    public void A0G(View view, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        if (this instanceof E64) {
            ((E64) this).A05.A0G(view, p2pPaymentConfig, p2pPaymentData);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A04, r307) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0H(com.facebook.payments.p2p.datamodel.P2pPaymentData r302) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ezy.A0H(com.facebook.payments.p2p.datamodel.P2pPaymentData):void");
    }
}

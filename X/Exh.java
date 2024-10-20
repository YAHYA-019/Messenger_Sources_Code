package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.util.JSONUtil;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.payments.checkout.AppSwitchInterstitialActivity;
import com.facebook.payments.checkout.configuration.model.CheckoutConfigPrice;
import com.facebook.payments.checkout.model.AppSwitchParams;
import com.facebook.payments.checkout.model.CheckoutAnalyticsParams;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.checkout.model.PaymentsOrderDetails;
import com.facebook.payments.checkout.model.SendPaymentCheckoutResult;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import com.facebook.payments.checkout.model.SimpleSendPaymentCheckoutResult;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.PaymentMethodEligibleOffer;
import com.facebook.payments.paymentmethods.model.SendPaymentBankDetails;
import com.facebook.payments.paymentmethods.paymentmethodcomponents.fragments.QRCodePaymentBottomSheetFragment;
import com.facebook.payments.webview.model.PaymentsWebViewOnlinePaymentParams;
import com.facebook.payments.webview.model.PaymentsWebViewParams;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: Exh.class */
public final class Exh {
    public final /* synthetic */ FIt A00;

    public Exh(FIt fIt) {
        this.A00 = fIt;
    }

    public void A00(SendPaymentCheckoutResult sendPaymentCheckoutResult) {
        FIt fIt = this.A00;
        FIQ fiq = fIt.A0J;
        CheckoutAnalyticsParams checkoutAnalyticsParams = DKF.A0X(fIt.A04).A0D;
        FIQ.A01(checkoutAnalyticsParams.A01(), fiq, checkoutAnalyticsParams.A00);
        FIt.A05(fIt, "checkout_payment_success");
        fIt.A02.A07(fIt.A04, sendPaymentCheckoutResult);
        fIt.A09();
    }

    public void A01(SendPaymentCheckoutResult sendPaymentCheckoutResult) {
        24X A0D;
        Context context;
        PaymentsWebViewParams paymentsWebViewParams;
        Intent A08;
        ETu eTu;
        int i;
        FIt fIt = this.A00;
        fIt.A02.A07(fIt.A04, sendPaymentCheckoutResult);
        SimpleSendPaymentCheckoutResult simpleSendPaymentCheckoutResult = (SimpleSendPaymentCheckoutResult) sendPaymentCheckoutResult;
        int intValue = FIt.A03(simpleSendPaymentCheckoutResult).intValue();
        if (intValue == 2) {
            fIt.A0K.A01();
            24X r0 = simpleSendPaymentCheckoutResult.A01;
            if (r0 == null || (A0D = r0.A0D("3ds_info")) == null) {
                fIt.A0C(false);
                return;
            }
            Rb2 rb2 = new Rb2();
            String A0H = JSONUtil.A0H(A0D.A0D(TraceFieldType.HTTPMethod), null);
            String A0P = C3o5.A0P(A0D, "data", null);
            if (A0H == null) {
                A0H = "GET";
            }
            if (A0H.equals("POST")) {
                Preconditions.checkArgument(DKC.A1Y(A0P), "Null or empty post data.");
            }
            RO8 ro8 = new RO8();
            String A0P2 = C3o5.A0P(A0D, "redirect_url", null);
            ro8.A03 = A0P2;
            C1pq.A08("redirectUrl", A0P2);
            String A0P3 = C3o5.A0P(A0D, "success_dismiss_url", null);
            ro8.A05 = A0P3;
            C1pq.A08("successDismissUrl", A0P3);
            String A0P4 = C3o5.A0P(A0D, "failure_dismiss_url", null);
            ro8.A01 = A0P4;
            C1pq.A08("failureDismissUrl", A0P4);
            String A0P5 = C3o5.A0P(A0D, "return_url", null);
            ro8.A04 = A0P5;
            C1pq.A08("returnUrl", A0P5);
            ro8.A02 = A0H;
            ro8.A00 = A0P;
            rb2.A03(new PaymentsWebViewOnlinePaymentParams(ro8));
            rb2.A01(DKG.A0j(fIt.A04));
            rb2.A02(DKG.A0m(fIt.A04));
            context = fIt.A06;
            String string = context.getString(2131968127);
            rb2.A05 = string;
            C1pq.A08("titleBarTitle", string);
            paymentsWebViewParams = new PaymentsWebViewParams(rb2);
        } else {
            if (intValue != 3) {
                if (intValue == 1) {
                    fIt.A0K.A01();
                    24X r02 = simpleSendPaymentCheckoutResult.A01;
                    r02.getClass();
                    24X A0e = 4YU.A0e(r02, "app_switch_info");
                    String A0H2 = JSONUtil.A0H(A0e.A0D(AnonymousClass000.A00(49)), null);
                    A0H2.getClass();
                    String A0P6 = C3o5.A0P(A0e, AbstractC00603o4.A00(411), null);
                    A0P6.getClass();
                    String str = null;
                    String str2 = null;
                    int i2 = 0;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    24X A0D2 = A0e.A0D("interstitial_info");
                    if (A0D2 != null) {
                        str = C3o5.A0P(A0D2, "title", null);
                        str3 = C3o5.A0P(A0D2, "primary_logo_url", null);
                        str5 = C3o5.A0P(A0D2, "primary_logo_title", null);
                        str4 = C3o5.A0P(A0D2, "primary_logo_caption", null);
                        str9 = C3o5.A0P(A0D2.A0D("primary_button"), "text", null);
                        24X A0D3 = A0D2.A0D("fallback_info");
                        str6 = C3o5.A0P(A0D3, "action_caption", null);
                        str7 = C3o5.A0P(A0D3, "action_text", null);
                        str8 = C3o5.A0P(A0D3, "action_url", null);
                        24X A0D4 = A0D2.A0D("auto_switch");
                        str2 = C3o5.A0P(A0D4, "text", null);
                        i2 = 4YU.A01(A0D4, "time_in_secs", 0);
                    }
                    int i3 = 0;
                    AppSwitchParams appSwitchParams = new AppSwitchParams(null, null, str, null, A0H2, A0P6, str2, str3, str4, str5, str6, str7, str8, null, str9, i2, 0);
                    ImmutableList A01 = RVQ.A01(fIt.A04);
                    if (A01 != null && !A01.isEmpty() && ((CheckoutConfigPrice) A01.get(0)).A02 != null && !((CheckoutConfigPrice) A01.get(0)).A02.isEmpty()) {
                        i3 = ((CheckoutConfigPrice) A01.get(0)).A02.size();
                    }
                    CurrencyAmount A00 = RVQ.A00(fIt.A04);
                    String str10 = appSwitchParams.A04;
                    String str11 = appSwitchParams.A06;
                    String str12 = appSwitchParams.A07;
                    String str13 = appSwitchParams.A08;
                    int i4 = appSwitchParams.A00;
                    String str14 = appSwitchParams.A09;
                    String str15 = appSwitchParams.A0A;
                    String str16 = appSwitchParams.A0B;
                    String str17 = appSwitchParams.A0C;
                    String str18 = appSwitchParams.A0D;
                    String str19 = appSwitchParams.A0E;
                    String str20 = appSwitchParams.A0G;
                    String A06 = A00 != null ? A00.A06(0S2.A00, fIt.A07.A05()) : "";
                    Optional optional = ((SimpleCheckoutData) fIt.A04).A0I;
                    if (optional == null) {
                        optional = Absent.INSTANCE;
                    }
                    PaymentMethod paymentMethod = (PaymentMethod) optional.get();
                    Context context2 = fIt.A06;
                    String Ai2 = paymentMethod.Ai2(context2.getResources());
                    CheckoutCommonParamsCore A0X = DKF.A0X(fIt.A04);
                    AppSwitchParams appSwitchParams2 = new AppSwitchParams(A0X.A0D, A0X.A0M, str10, A06, str11, str12, str13, str14, str15, str16, str17, str18, str19, Ai2, str20, i4, i3);
                    A08 = C3o5.A0D(context2, AppSwitchInterstitialActivity.class);
                    A08.putExtra("app_switch_params", appSwitchParams2);
                    eTu = fIt.A05;
                    i = 128;
                } else {
                    if (intValue == 4) {
                        fIt.A0K.A01();
                        24X r03 = simpleSendPaymentCheckoutResult.A01;
                        r03.getClass();
                        24X A0e2 = 4YU.A0e(r03, "qr_code_info");
                        String A0H3 = JSONUtil.A0H(A0e2.A0D("qr_code"), null);
                        String A0P7 = C3o5.A0P(A0e2, "title", null);
                        String A0P8 = C3o5.A0P(A0e2, "bottom_note", null);
                        RvK A012 = fIt.A0F.A01(fIt.A04);
                        Optional optional2 = ((SimpleCheckoutData) fIt.A04).A0J;
                        if (optional2 == null) {
                            optional2 = Absent.INSTANCE;
                        }
                        String str21 = optional2.isPresent() ? ((PaymentMethodEligibleOffer) optional2.get()).A00 : null;
                        A0H3.getClass();
                        Context context3 = fIt.A06;
                        Parcelable parcelable = fIt.A04;
                        CheckoutCommonParamsCore A0X2 = DKF.A0X(parcelable);
                        String str22 = A0X2.A0M.mValue;
                        String str23 = A0X2.A0D.A00.sessionId;
                        String str24 = A0X2.A0W;
                        ImmutableList of = A012 != null ? A012.A02 : ImmutableList.of();
                        Eev eev = new Eev(fIt);
                        94S r04 = MigBottomSheetDialogFragment.A01;
                        11T.A0F(of, 9);
                        FragmentActivity A0A = 4YV.A0A(context3);
                        if (A0A == null) {
                            throw 1BK.A0h();
                        }
                        Bundle A05 = 1BK.A05();
                        A05.putParcelable("checkout_data", parcelable);
                        A05.putString("payment_type", str22);
                        A05.putString("session_id", str23);
                        A05.putString("order_id", str24);
                        A05.putString("per_payment_method_offer_id", str21);
                        A05.putString("title", A0P7);
                        A05.putString("qr_code", A0H3);
                        A05.putString("qr_code_note", A0P8);
                        0D2 qRCodePaymentBottomSheetFragment = new QRCodePaymentBottomSheetFragment();
                        qRCodePaymentBottomSheetFragment.setArguments(A05);
                        qRCodePaymentBottomSheetFragment.A00 = eev;
                        qRCodePaymentBottomSheetFragment.A01 = of;
                        qRCodePaymentBottomSheetFragment.A0m(A0A.BDe(), "qr_code_payment_bottom_sheet_fragment_tag");
                        return;
                    }
                    if (intValue != 0) {
                        FIt.A00(fIt).ANz(sendPaymentCheckoutResult);
                        return;
                    }
                    fIt.A0K.A01();
                    PaymentsOrderDetails paymentsOrderDetails = simpleSendPaymentCheckoutResult.A00;
                    paymentsOrderDetails.getClass();
                    String str25 = paymentsOrderDetails.A01;
                    str25.getClass();
                    RO8 ro82 = new RO8();
                    ro82.A03 = str25;
                    String str26 = C1ic.A17;
                    ro82.A05 = str26;
                    C1pq.A08("successDismissUrl", str26);
                    ro82.A01 = str26;
                    C1pq.A08("failureDismissUrl", str26);
                    ro82.A02 = "GET";
                    PaymentsWebViewOnlinePaymentParams paymentsWebViewOnlinePaymentParams = new PaymentsWebViewOnlinePaymentParams(ro82);
                    Rb2 rb22 = new Rb2();
                    rb22.A03(paymentsWebViewOnlinePaymentParams);
                    rb22.A01(DKG.A0j(fIt.A04));
                    rb22.A02(DKG.A0m(fIt.A04));
                    Optional optional3 = ((SimpleCheckoutData) fIt.A04).A0I;
                    if (optional3 == null) {
                        optional3 = Absent.INSTANCE;
                    }
                    PaymentMethod paymentMethod2 = (PaymentMethod) optional3.get();
                    Context context4 = fIt.A06;
                    String Ai22 = paymentMethod2.Ai2(context4.getResources());
                    rb22.A05 = Ai22;
                    C1pq.A08("titleBarTitle", Ai22);
                    rb22.A07 = true;
                    PaymentsWebViewParams paymentsWebViewParams2 = new PaymentsWebViewParams(rb22);
                    FIQ.A02(PaymentsFlowStep.A1X, fIt.A0J, DKG.A0j(fIt.A04));
                    A08 = DKH.A08(context4, paymentsWebViewParams2);
                    eTu = fIt.A05;
                    i = 130;
                }
                eTu.A06(A08, i);
            }
            fIt.A0K.A01();
            SendPaymentBankDetails sendPaymentBankDetails = (SendPaymentBankDetails) ((EfU) fIt.A0B.get()).A00.A0T(SendPaymentBankDetails.class, 4YU.A0e(simpleSendPaymentCheckoutResult.A01, "net_banking_info"));
            sendPaymentBankDetails.getClass();
            RO8 ro83 = new RO8();
            String str27 = sendPaymentBankDetails.A06;
            ro83.A03 = str27;
            C1pq.A08("redirectUrl", str27);
            String str28 = sendPaymentBankDetails.A07;
            ro83.A05 = str28;
            C1pq.A08("successDismissUrl", str28);
            String str29 = sendPaymentBankDetails.A02;
            ro83.A01 = str29;
            C1pq.A08("failureDismissUrl", str29);
            String str30 = sendPaymentBankDetails.A03;
            if (str30 == null) {
                str30 = "GET";
            }
            ro83.A02 = str30;
            C1pq.A08("httpMethod", str30);
            ro83.A00 = sendPaymentBankDetails.A01;
            PaymentsWebViewOnlinePaymentParams paymentsWebViewOnlinePaymentParams2 = new PaymentsWebViewOnlinePaymentParams(ro83);
            Rb2 rb23 = new Rb2();
            rb23.A03(paymentsWebViewOnlinePaymentParams2);
            rb23.A01(DKG.A0j(fIt.A04));
            rb23.A02(DKG.A0m(fIt.A04));
            String str31 = sendPaymentBankDetails.A05;
            rb23.A05 = str31;
            C1pq.A08("titleBarTitle", str31);
            paymentsWebViewParams = new PaymentsWebViewParams(rb23);
            context = fIt.A06;
        }
        A08 = DKH.A08(context, paymentsWebViewParams);
        eTu = fIt.A05;
        i = 111;
        eTu.A06(A08, i);
    }

    public void A02(Throwable th) {
        FIt fIt = this.A00;
        FIQ fiq = fIt.A0J;
        CheckoutAnalyticsParams checkoutAnalyticsParams = DKF.A0X(fIt.A04).A0D;
        fiq.A08(checkoutAnalyticsParams.A01(), checkoutAnalyticsParams.A00, th);
        FIt.A05(fIt, "checkout_payment_error");
        Ewn ewn = fIt.A0K;
        RQi rQi = ewn.A01;
        Qul qul = rQi.A00;
        Qul qul2 = Qul.A01;
        if (qul != qul2 && qul != Qul.A03) {
            rQi.A00 = qul2;
            C00i c00i = ewn.A00;
            1BK.A0U(c00i).markerPoint(23265283, rQi.A00());
            if (1BK.A0U(c00i).isMarkerOn(23265283)) {
                1BK.A0U(c00i).markerEnd(23265283, (short) 467);
            }
        }
        fIt.A08();
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.logging.PaymentsFlowName;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.paypal.PaypalFundingOptionPaymentMethod;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.user.model.User;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: E65.class */
public final class E65 extends Ezy {
    public 1BY A00;
    public RQD A01;
    public P2pPaymentData A02;
    public RSI A03;
    public Context A08;
    public 1pK A09;
    public ListenableFuture A0A;
    public String A0B;
    public final Executor A0C;
    public final 1I7 A0D;
    public final AbR A0E;
    public final Fch A0G;
    public SettableFuture A04 = 4YU.A0j();
    public final ETm A0F = new E4r(this);
    public String A05 = "";
    public boolean A07 = false;
    public boolean A06 = false;

    public E65(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        AbR abR = (AbR) 1Bn.A0B(720);
        Fch A0b = DKD.A0b();
        1I7 r0 = (1I7) 1Hv.A02(7zP.A0J(), 65728);
        Executor A1D = AbJ.A1D();
        this.A0E = abR;
        this.A0D = r0;
        this.A0G = A0b;
        this.A0C = A1D;
    }

    public static ListenableFuture A00(FbUserSession fbUserSession, E65 e65) {
        PaymentMethod paymentMethod;
        if (!4DQ.A03(e65.A0A) && (paymentMethod = e65.A02.A04) != null && paymentMethod.getId() != null && e65.A02.A06.size() == 1 && !e65.A02.A04.getId().equals(e65.A0B)) {
            e65.A0B = e65.A02.A04.getId();
            if (!e65.A06) {
                Fch fch = e65.A0G;
                ListenableFuture A02 = Fch.A02(fbUserSession, fch, ((User) 1BK.A0r(e65.A02.A06)).A0k.id, e65.A02.A04.getId());
                Fvf fvf = new Fvf(fch, 40);
                1JU r0 = 1JU.A01;
                22U A022 = 1Kd.A02(new ListenableFuture[]{2FP.A02(fvf, A02, r0)});
                e65.A0A = A022;
                1Kd.A0F(FwK.A01(e65, 23), A022, r0);
            }
        }
        return e65.A0A;
    }

    public static void A01(FbUserSession fbUserSession, E65 e65) {
        ETm eTm = e65.A0F;
        1pK r0 = e65.A09;
        boolean z = true;
        if (!e65.A07) {
            z = false;
        }
        String str = e65.A05;
        if (!z) {
            str = null;
        }
        PaymentItemType paymentItemType = PaymentItemType.A0C;
        PaymentsLoggingSessionData A00 = F5s.A00(PaymentsFlowName.P2P_SEND_OR_REQUEST);
        HashMap A0u = AnonymousClass001.A0u();
        CurrencyAmount A002 = e65.A02.A00();
        if (A002 != null) {
            A0u.put("amount", Integer.toString(CurrencyAmount.A02.multiply(A002.A01).intValue()));
            A0u.put("currency", e65.A02.A00().A00);
        }
        PaypalFundingOptionPaymentMethod paypalFundingOptionPaymentMethod = e65.A02.A04;
        if (paypalFundingOptionPaymentMethod != null) {
            String id = paypalFundingOptionPaymentMethod.BHR() == ERI.A06 ? paypalFundingOptionPaymentMethod.A01.id : paypalFundingOptionPaymentMethod.getId();
            if (!TextUtils.isEmpty(id) && !TextUtils.isDigitsOnly(id)) {
                id = new String(Base64.decode(id, 2)).replaceAll("[^0-9]", "");
            }
            A0u.put("cred_id", id);
        }
        Epd epd = new Epd(r0, eTm, new Eeg(A0u), A00, paymentItemType, str);
        AbR abR = e65.A0E;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            FIe fIe = new FIe(abR, epd);
            1Bn.A0K();
            FbInjector.A04(A01);
            Epd epd2 = fIe.A01;
            1pK r02 = epd2.A00;
            r02.A1U(fIe.A06);
            C1q6 c1q6 = fIe.A05;
            r02.A1U(c1q6);
            String str2 = epd2.A05;
            if (str2 != null) {
                FcS.A00((ETA) 1Lo.A04((Context) null, fbUserSession, fIe.A00, 99311), fIe, str2, 16);
                return;
            }
            r02.A1T(c1q6);
            FHO fho = fIe.A08;
            6Gx A0a = DKC.A0a(fho.A00);
            FHR A003 = FHR.A00();
            A003.A04(ER3.A0a);
            A003.A08("pin_pay_auth_init");
            A0a.A05(A003);
            fho.A05(PaymentsFlowStep.A1K, epd2.A03, epd2.A04);
            fIe.A0J.A05(new C2069Dau(fbUserSession, fIe, 13), fIe.A0F.A03(), AbE.A00(275), fIe.A03);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        super.A00 = true;
        this.A09 = r304;
        this.A02 = p2pPaymentData;
        this.A03 = rsi;
        this.A01 = rqd;
        this.A08 = context;
        A00(4YV.A0D(context), this);
    }
}

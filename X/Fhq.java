package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.p2p.service.model.transactions.SendPaymentMessageParams;
import com.facebook.payments.p2p.service.model.transactions.SendPaymentMessageResult;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

/* loaded from: Fhq.class */
public final class Fhq implements 1Ro {
    public static final String __redex_internal_original_name = "SendPaymentMessageMethod";
    public 1BY A00;
    public final 6Gx A03 = DKD.A0Z();
    public final Context A01 = 7zP.A0J();
    public final AnonymousClass244 A05 = AbI.A0s();
    public final 1H2 A02 = DKE.A0R();
    public final C4N A04 = (C4N) 1Bi.A03(84806);

    public Fhq(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C04083zw A0T;
        SendPaymentMessageParams sendPaymentMessageParams = (SendPaymentMessageParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        String str = sendPaymentMessageParams.A0C;
        A0s.add(new BasicNameValuePair("offline_threading_id", str));
        CurrencyAmount currencyAmount = sendPaymentMessageParams.A00;
        A0s.add(new BasicNameValuePair("amount", DKF.A0t(currencyAmount)));
        A0s.add(new BasicNameValuePair("currency", currencyAmount.A00));
        String str2 = sendPaymentMessageParams.A0J;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("sender_credential", str2));
        }
        String str3 = sendPaymentMessageParams.A0B;
        if (str3 != null) {
            A0s.add(new BasicNameValuePair("memo_text", str3));
        }
        String str4 = sendPaymentMessageParams.A0D;
        if (str4 != null) {
            A0s.add(new BasicNameValuePair("fbpay_pin", str4));
        }
        String str5 = sendPaymentMessageParams.A0G;
        if (str5 != null) {
            A0s.add(new BasicNameValuePair("reauth_token", str5));
        }
        String str6 = sendPaymentMessageParams.A07;
        if (str6 != null) {
            A0s.add(new BasicNameValuePair("touchid_nonce", str6));
            A0s.add(new BasicNameValuePair("device_id", this.A02.A02()));
        }
        String str7 = sendPaymentMessageParams.A04;
        if (str7 != null) {
            A0s.add(new BasicNameValuePair("client_auth_token", str7));
            A0s.add(new BasicNameValuePair("device_id", this.A02.A02()));
            A0s.add(new BasicNameValuePair("app_id", this.A01.getPackageName()));
        }
        String str8 = sendPaymentMessageParams.A0F;
        if (!TextUtils.isEmpty(str8)) {
            A0s.add(new BasicNameValuePair("platform_trust_token", str8));
        }
        String str9 = sendPaymentMessageParams.A0M;
        if (str9 != null) {
            A0s.add(new BasicNameValuePair("theme_id", str9));
        }
        String str10 = sendPaymentMessageParams.A0N;
        if (str10 != null) {
            A0s.add(new BasicNameValuePair("theme_name", str10));
        }
        String str11 = sendPaymentMessageParams.A09;
        if (str11 != null) {
            A0s.add(new BasicNameValuePair("gift_type", str11));
        }
        if (str != null) {
            A0s.add(new BasicNameValuePair("idempotence_token", StringFormatUtil.formatStrLocaleSafe("%s_%s", str, "messenger_payments")));
        }
        String str12 = sendPaymentMessageParams.A0A;
        if (str12 != null) {
            A0s.add(new BasicNameValuePair("group_thread_id", str12));
        }
        String str13 = sendPaymentMessageParams.A0E;
        if (str13 != null) {
            A0s.add(new BasicNameValuePair("platform_context_id", str13));
        }
        String str14 = sendPaymentMessageParams.A0K;
        if (str14 != null) {
            A0s.add(new BasicNameValuePair("shipping_address_id", str14));
        }
        String str15 = sendPaymentMessageParams.A0L;
        if (str15 != null) {
            A0s.add(new BasicNameValuePair("shipping_option_id", str15));
        }
        String str16 = sendPaymentMessageParams.A0I;
        if (str16 != null) {
            A0s.add(new BasicNameValuePair(TraceFieldType.RequestID, str16));
        }
        String str17 = sendPaymentMessageParams.A06;
        if (str17 != null) {
            A0s.add(new BasicNameValuePair("csc", str17));
        }
        String str18 = sendPaymentMessageParams.A08;
        if (str18 != null) {
            JSONObject A12 = AnonymousClass001.A12();
            JSONObject A16 = DKD.A16(str18, "funding_option_id", A12);
            JSONObject A162 = DKD.A16(A12, "paypal_options", A16);
            A162.put("payment_options", A16);
            A0s.add(new BasicNameValuePair("custom_params", A162.toString()));
        }
        String str19 = sendPaymentMessageParams.A05;
        if (str19 != null) {
            A0s.add(new BasicNameValuePair("completed_auth_challenges", str19));
        }
        7aO r0 = this.A03.A00;
        if (r0 != null) {
            String str20 = r0.A04;
            if (str20 != null) {
                A0s.add(new BasicNameValuePair("session_id", str20));
            }
            String str21 = r0.A02;
            if (str21 != null) {
                A0s.add(new BasicNameValuePair("entry_point", str21));
            }
        }
        A0s.add(new BasicNameValuePair("format", "json"));
        if (!TextUtils.isEmpty(str8) || (str17 == null && str4 == null)) {
            A0T = DKC.A0T();
            A0T.A0F = StringFormatUtil.formatStrLocaleSafe("/%d/%s", 1BK.A0n(sendPaymentMessageParams.A0H), "messenger_payments");
        } else {
            Object[] objArr = {1BK.A0n(sendPaymentMessageParams.A0H), "messenger_payments"};
            A0T = DKC.A0T();
            A0T.A0F = StringFormatUtil.formatStrLocaleSafe(0Pz.A0W("ajax/payment/token_proxy.php?tpe=", "/%d/%s"), objArr);
            A0T.A0P = true;
        }
        AbF.A1Q(A0T, "messenger_payments");
        A0T.A0J = A0s;
        A0T.A06 = 0S2.A01;
        MediaResource mediaResource = sendPaymentMessageParams.A03;
        if (mediaResource != null) {
            A0T.A0I = ImmutableList.of((Object) new C4C4(this.A04.A00(mediaResource), "memo_images"));
        }
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0w = AbH.A0w(anonymousClass439);
        AnonymousClass244 anonymousClass244 = this.A05;
        return anonymousClass244.A0O(new 3AW((AnonymousClass245) null, A0w), anonymousClass244._typeFactory.A09(SendPaymentMessageResult.class));
    }
}

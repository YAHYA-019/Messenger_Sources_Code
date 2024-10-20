package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.p2p.service.model.request.CreatePaymentRequestParams;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhc.class */
public final class Fhc implements 1Ro {
    public static final String __redex_internal_original_name = "CreatePaymentRequestMethod";
    public final 6Gx A00 = DKD.A0Z();
    public final C4N A01 = (C4N) 1Bi.A03(84806);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        CreatePaymentRequestParams createPaymentRequestParams = (CreatePaymentRequestParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("amount", createPaymentRequestParams.A01));
        A0s.add(new BasicNameValuePair("offline_threading_id", createPaymentRequestParams.A05));
        A0s.add(new BasicNameValuePair("memo_text", createPaymentRequestParams.A04));
        String str2 = createPaymentRequestParams.A03;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("group_thread_id", str2));
        }
        String str3 = createPaymentRequestParams.A07;
        if (str3 != null) {
            A0s.add(new BasicNameValuePair("theme_id", str3));
        }
        String str4 = createPaymentRequestParams.A08;
        if (str4 != null) {
            A0s.add(new BasicNameValuePair("theme_name", str4));
        }
        String str5 = createPaymentRequestParams.A02;
        if (str5 != null) {
            A0s.add(new BasicNameValuePair("gift_type", str5));
        }
        7aO r0 = this.A00.A00;
        if (r0 != null && (str = r0.A02) != null) {
            A0s.add(new BasicNameValuePair("entry_point", str));
        }
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("format", "json"), A0s);
        AbF.A1Q(A0C, 1BJ.A00(1216));
        A0C.A0F = StringFormatUtil.formatStrLocaleSafe("/%s/p2p_payment_requests", createPaymentRequestParams.A06);
        A0C.A0J = A0s;
        A0C.A06 = 0S2.A01;
        MediaResource mediaResource = createPaymentRequestParams.A00;
        if (mediaResource != null) {
            A0C.A0I = ImmutableList.of((Object) new C4C4(this.A01.A00(mediaResource), "memo_images"));
        }
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return AbH.A1A(AbH.A0w(anonymousClass439), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }
}

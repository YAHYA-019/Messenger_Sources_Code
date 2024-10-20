package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.account.recovery.common.protocol.AccountRecoveryShortUrlHandlerMethodResult;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cfu.class */
public final class Cfu implements 1Ro {
    public static final String __redex_internal_original_name = "AccountRecoveryShortUrlHandlerMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A00 = 1JW.A00(2);
        A00.add(new BasicNameValuePair(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "shorturlvalidation"));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("url", (String) obj), A00);
        AbF.A1P(A0C, "accountRecoveryShortUrlHandler");
        A0C.A0F = "search";
        A0C.A02();
        A0C.A0J = A00;
        A0C.A06 = 0S2.A0C;
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return anonymousClass439.A00().A1W(AccountRecoveryShortUrlHandlerMethodResult.class);
    }
}

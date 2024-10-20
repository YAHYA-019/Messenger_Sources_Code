package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.messaging.contactacquisition.GmailConfirmationMethod$Params;
import java.util.ArrayList;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg1.class */
public final class Cg1 implements 1Ro {
    public static final String __redex_internal_original_name = "GmailConfirmationMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        GmailConfirmationMethod$Params gmailConfirmationMethod$Params = (GmailConfirmationMethod$Params) obj;
        ArrayList A03 = 1JW.A03(new NameValuePair[]{new BasicNameValuePair("email", gmailConfirmationMethod$Params.A00.normalized), new BasicNameValuePair("id_token", gmailConfirmationMethod$Params.A02), new BasicNameValuePair("flow", CJm.A01(gmailConfirmationMethod$Params.A01)), new BasicNameValuePair("provider", "google")});
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "openidConnectEmailConfirmation");
        return AbK.A0M(c04083zw, "auth/openidconnect_email_confirmation", A03);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0D = AbH.A0w(anonymousClass439).A0D(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
        return Boolean.valueOf(A0D != null ? A0D.A0O() : false);
    }
}

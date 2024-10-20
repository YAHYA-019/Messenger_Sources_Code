package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;
import com.facebook.messaging.phoneconfirmation.protocol.RequestConfirmationCodeParams;
import com.facebook.messaging.phoneconfirmation.protocol.ResponseConfirmationCodeParams;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgs.class */
public final class Fgs implements 1Ro {
    public static final String __redex_internal_original_name = "RequestCodeMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        RequestConfirmationCodeParams requestConfirmationCodeParams = (RequestConfirmationCodeParams) obj;
        ImmutableList of = ImmutableList.of((Object) new BasicNameValuePair("country", requestConfirmationCodeParams.A04), (Object) new BasicNameValuePair("phone_number", requestConfirmationCodeParams.A05), (Object) new BasicNameValuePair("activate_sms", String.valueOf(requestConfirmationCodeParams.A08)), (Object) new BasicNameValuePair(Property.SYMBOL_Z_ORDER_SOURCE, String.valueOf(requestConfirmationCodeParams.A07)), (Object) new BasicNameValuePair("qp_id", String.valueOf(requestConfirmationCodeParams.A06)), (Object) new BasicNameValuePair("format", "json"));
        0fH.A0A(Fgs.class, 0Pz.A0V("Request: ", of));
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "requestCode");
        return AbN.A0F(A0T, "method/user.sendMessengerPhoneConfirmationCode", of);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        RecoveredAccount recoveredAccount;
        RequestConfirmationCodeParams requestConfirmationCodeParams = (RequestConfirmationCodeParams) obj;
        boolean A0O = AbH.A0w(anonymousClass439).A0Z("found_account_with_password") ? anonymousClass439.A01().A0D("found_account_with_password").A0O() : false;
        24X A01 = anonymousClass439.A01();
        boolean A0J = JSONUtil.A0J(A01.A0C("auto_confirmed"), false);
        RecoveredAccount recoveredAccount2 = null;
        String A0H = A0J ? JSONUtil.A0H(A01.A0C("code"), null) : null;
        24X A0C = A01.A0C("account_data");
        if (A0C != null) {
            recoveredAccount = RecoveredAccount.A00(A0C, 0);
            24X A0C2 = A0C.A0C("recovered_messenger_account");
            if (A0C2 != null) {
                recoveredAccount2 = RecoveredAccount.A00(A0C2, 1);
            }
        } else {
            recoveredAccount = null;
        }
        return new ResponseConfirmationCodeParams(recoveredAccount, recoveredAccount2, requestConfirmationCodeParams, A0H, A0O, A0J);
    }
}

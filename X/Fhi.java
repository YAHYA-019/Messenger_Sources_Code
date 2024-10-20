package X;

import com.facebook.auth.protocol.InstagramPasswordCredentials;
import com.facebook.auth.protocol.InstagramPasswordUserInfo;
import com.facebook.auth.protocol.InstagramSSOUserInfo;
import com.facebook.auth.protocol.InstagramUserInfo;
import com.facebook.common.util.JSONUtil;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;
import com.facebook.messaging.phoneconfirmation.protocol.RequestConfirmationCodeParams;
import com.facebook.messaging.phoneconfirmation.protocol.ResponseConfirmationCodeParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhi.class */
public final class Fhi implements 1Ro {
    public static final String __redex_internal_original_name = "MessengerOnlyRequestCodeMethod";
    public final 1Oe A00 = DKD.A0J();
    public final C00i A02 = AbH.A0T();
    public final C00i A01 = FbInjector.A00;

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        InstagramPasswordCredentials instagramPasswordCredentials;
        String str2;
        String str3;
        String str4;
        RequestConfirmationCodeParams requestConfirmationCodeParams = (RequestConfirmationCodeParams) obj;
        requestConfirmationCodeParams.getClass();
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(this.A02)));
        A0s.add(new BasicNameValuePair("country", requestConfirmationCodeParams.A04));
        A0s.add(new BasicNameValuePair("phone_number", requestConfirmationCodeParams.A05));
        A0s.add(new BasicNameValuePair("family_device_id", this.A00.A04(C1fe.A2X)));
        String str5 = requestConfirmationCodeParams.A02;
        A0s.add(new BasicNameValuePair("account_recovery_id", str5));
        A0s.add(new BasicNameValuePair("account_recovery_previous_known_device_id", str5));
        str = "true";
        A0s.add(new BasicNameValuePair("allow_auto_confirmation", str));
        A0s.add(new BasicNameValuePair("pic_size_px", Integer.toString(C0A8.A03(1BL.A0B(this.A01), 100.0f))));
        A0s.add(new BasicNameValuePair("allow_account_with_password_match", requestConfirmationCodeParams.A09 ? "true" : "false"));
        InstagramUserInfo instagramUserInfo = requestConfirmationCodeParams.A01;
        if (instagramUserInfo != null) {
            if (instagramUserInfo instanceof InstagramSSOUserInfo) {
                str3 = ((InstagramSSOUserInfo) instagramUserInfo).A00.A00;
                if (str3 != null) {
                    str4 = "ig_access_token";
                    A0s.add(new BasicNameValuePair(str4, str3));
                }
            }
            if ((instagramUserInfo instanceof InstagramPasswordUserInfo) && (str2 = (instagramPasswordCredentials = ((InstagramPasswordUserInfo) instagramUserInfo).A00).A00) != null) {
                str3 = instagramPasswordCredentials.A01;
                if (str3 != null) {
                    A0s.add(new BasicNameValuePair("instagram_identifier", str2));
                    str4 = "instagram_password";
                    A0s.add(new BasicNameValuePair(str4, str3));
                }
            }
        }
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "requestMessengerOnlyConfirmationCode");
        return AbN.A0F(A0T, "method/user.sendMessengerOnlyPhoneConfirmationCode", A0s);
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

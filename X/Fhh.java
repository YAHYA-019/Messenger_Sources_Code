package X;

import com.facebook.auth.protocol.InstagramPasswordCredentials;
import com.facebook.auth.protocol.InstagramPasswordUserInfo;
import com.facebook.auth.protocol.InstagramSSOUserInfo;
import com.facebook.auth.protocol.InstagramUserInfo;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.phoneconfirmation.protocol.CheckConfirmationCodeParams;
import com.facebook.messaging.phoneconfirmation.protocol.CheckConfirmationCodeResult;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhh.class */
public final class Fhh implements 1Ro {
    public static final String __redex_internal_original_name = "CheckConfirmationCodeMethod";
    public final 1Oe A00 = DKD.A0J();
    public final C00i A02 = AbH.A0T();
    public final C00i A01 = FbInjector.A00;

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        InstagramPasswordCredentials instagramPasswordCredentials;
        String str;
        String str2;
        String str3;
        CheckConfirmationCodeParams checkConfirmationCodeParams = (CheckConfirmationCodeParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(this.A02)));
        A0s.add(new BasicNameValuePair("family_device_id", this.A00.A04(C1fe.A2O)));
        String str4 = checkConfirmationCodeParams.A02;
        if (str4 != null) {
            A0s.add(new BasicNameValuePair("code", str4));
        }
        A0s.add(new BasicNameValuePair("pic_size_px", Integer.toString(C0A8.A03(1BL.A0B(this.A01), 100.0f))));
        A0s.add(new BasicNameValuePair("phone_number", checkConfirmationCodeParams.A03));
        InstagramUserInfo instagramUserInfo = checkConfirmationCodeParams.A00;
        if (instagramUserInfo != null) {
            if (instagramUserInfo instanceof InstagramSSOUserInfo) {
                str2 = ((InstagramSSOUserInfo) instagramUserInfo).A00.A00;
                if (str2 != null) {
                    str3 = "ig_access_token";
                    A0s.add(new BasicNameValuePair(str3, str2));
                }
            }
            if ((instagramUserInfo instanceof InstagramPasswordUserInfo) && (str = (instagramPasswordCredentials = ((InstagramPasswordUserInfo) instagramUserInfo).A00).A00) != null) {
                str2 = instagramPasswordCredentials.A01;
                if (str2 != null) {
                    A0s.add(new BasicNameValuePair("instagram_identifier", str));
                    str3 = "instagram_password";
                    A0s.add(new BasicNameValuePair(str3, str2));
                }
            }
        }
        String str5 = checkConfirmationCodeParams.A01;
        if (str5 != null) {
            A0s.add(new BasicNameValuePair("account_recovery_id", str5));
        }
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "confirmMessengerOnlyConfirmationCode");
        return AbN.A0F(A0T, "method/user.confirmMessengerOnlyPhone", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        CheckConfirmationCodeParams checkConfirmationCodeParams = (CheckConfirmationCodeParams) obj;
        24X A0w = AbH.A0w(anonymousClass439);
        RecoveredAccount A00 = RecoveredAccount.A00(A0w, 0);
        24X A0C = A0w.A0C("recovered_messenger_account");
        return new CheckConfirmationCodeResult(A00, A0C != null ? RecoveredAccount.A00(A0C, 1) : null, checkConfirmationCodeParams.A02);
    }
}

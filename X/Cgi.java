package X;

import com.facebook.messaging.registration.protocol.UpdateAccountRecoveryIdParams;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgi.class */
public final class Cgi implements 1Ro {
    public static final String __redex_internal_original_name = "UpdateAccountRecoveryIdMethod";
    public final PhoneNumberUtil A01 = (PhoneNumberUtil) 1Bi.A03(100133);
    public final C1F A00 = (C1F) 1Bi.A03(85297);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair(DKB.A00(296), ((UpdateAccountRecoveryIdParams) obj).A00));
        C1F c1f = this.A00;
        str = "";
        String A00 = c1f.A00(str);
        11T.A0F(str, 0);
        String BD0 = 1Br.A09(c1f.A00).BD0(1NK.A6B);
        str = BD0 != null ? BD0 : "";
        PhoneNumberUtil phoneNumberUtil = this.A01;
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("phone_number", phoneNumberUtil.format(phoneNumberUtil.parse(A00, str), PhoneNumberUtil.PhoneNumberFormat.E164)), A0s);
        AbF.A1Q(A0C, "messengerOnlyAccountRecoveryIds");
        return AbK.A0M(A0C, "/me/messenger_only_account_recovery_ids", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}

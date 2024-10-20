package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.util.JSONUtil;
import com.facebook.securedaction.protocol.SecuredActionValidateChallengeParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fh7.class */
public final class Fh7 implements 1Ro {
    public static final String __redex_internal_original_name = "SecuredActionValidateChallengeMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        SecuredActionValidateChallengeParams securedActionValidateChallengeParams = (SecuredActionValidateChallengeParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("method", "POST"));
        A0s.add(new BasicNameValuePair("challenge_type", securedActionValidateChallengeParams.A01));
        A0s.add(new BasicNameValuePair("challenge_params", securedActionValidateChallengeParams.A00));
        String str = securedActionValidateChallengeParams.A02;
        if (str != null) {
            A0s.add(new BasicNameValuePair("cuid", str));
        }
        String str2 = securedActionValidateChallengeParams.A03;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("machine_id", str2));
        }
        C04083zw A0T = DKC.A0T();
        A0T.A0D = "validate_challenge";
        A0T.A0E = "POST";
        A0T.A0F = "secured_action/validate_challenge";
        A0T.A0J = A0s;
        A0T.A06 = 0S2.A01;
        java.util.Map map = securedActionValidateChallengeParams.A04;
        if (map.size() > 0) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                byte[] bArr = (byte[]) A0z.getValue();
                C4Pu c4Pu = new C4Pu("image/jpeg", bArr.length, AnonymousClass001.A0j(A0z));
                ((DpI) c4Pu).A00 = bArr;
                A0s2.add(new C4C4(c4Pu, AnonymousClass001.A0j(A0z)));
            }
            A0T.A0I = A0s2;
        }
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return Boolean.valueOf(JSONUtil.A0J(AbH.A0w(anonymousClass439).A0C(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS), false));
    }
}

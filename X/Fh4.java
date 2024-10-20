package X;

import com.facebook.push.fbpushtoken.UnregisterPushTokenParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fh4.class */
public final class Fh4 implements 1Ro {
    public static final String __redex_internal_original_name = "GraphUserUnregisterPushTokensMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("token", ((UnregisterPushTokenParams) obj).A00), A0s);
        AbF.A1Q(A0C, 1BJ.A00(2113));
        A0C.A0F = "me/unregister_push_tokens";
        A0C.A0J = A0s;
        A0C.A06 = 0S2.A00;
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return Boolean.valueOf("true".equals(anonymousClass439.A02()));
    }
}

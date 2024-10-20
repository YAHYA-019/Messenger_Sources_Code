package X;

import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.util.TriState;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgo.class */
public final class Fgo implements 1Ro {
    public static final String __redex_internal_original_name = "AuthenticatePageAdminMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("fields", "user_storage_key"), A0s);
        A0C.A0D = "authenticate";
        A0C.A0F = "me";
        A0C.A0J = A0s;
        A0C.A0E = "GET";
        A0C.A06 = 0S2.A01;
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        String A0P = C3o5.A0P(AbH.A0w(anonymousClass439), "user_storage_key", null);
        ViewerContext viewerContext = (ViewerContext) 1Bn.A0A(33059);
        String str = viewerContext.mUserId;
        return new AuthenticationResultImpl(new FacebookCredentials(str, viewerContext.mAuthToken, null, null, viewerContext.mSessionCookiesString, viewerContext.mSessionSecret, viewerContext.mSessionKey, viewerContext.mUsername, viewerContext.A00, false), TriState.UNSET, str, null, A0P, null);
    }
}

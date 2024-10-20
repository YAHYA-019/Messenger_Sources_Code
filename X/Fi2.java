package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.util.JSONUtil;
import com.facebook.common.util.TriState;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fi2.class */
public final class Fi2 implements 1Ro {
    public static final String[] A04 = {"user_storage_key", "accounts.limit(100){access_token}"};
    public static final String __redex_internal_original_name = "AuthenticatePageAccountMethod";
    public 1BY A00;
    public final C00i A02 = 1BQ.A02(16386);
    public final 1Ew A01 = AbI.A09();
    public final C00i A03 = 1BQ.A02(66658);

    public Fi2(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static final Fi2 A00(1BO r301) {
        return new Fi2(r301);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("fields", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A04)), A0s);
        A0C.A0D = "authenticate";
        A0C.A0F = "me";
        A0C.A0J = A0s;
        A0C.A0E = "GET";
        A0C.A06 = 0S2.A01;
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        String str = (String) obj;
        String A0H = JSONUtil.A0H(AbH.A0w(anonymousClass439).A0D("user_storage_key"), null);
        24X A0e = 4YU.A0e(4YU.A0e(anonymousClass439.A01(), "accounts"), "data");
        int i = 0;
        while (true) {
            String str2 = null;
            if (i >= A0e.A05()) {
                break;
            }
            24X A0B = A0e.A0B(i);
            if (A0B == null || !str.equals(C3o5.A0P(A0B, PublicKeyCredentialControllerUtility.JSON_KEY_ID, null))) {
                i++;
            } else {
                String A0P = C3o5.A0P(A0e.A0B(i), "access_token", null);
                if (A0P != null) {
                    1BY r0 = this.A00;
                    ViewerContext viewerContext = (ViewerContext) 1Bn.A0E((Context) null, r0, 83431);
                    ViewerContext BHu = this.A01.BHu();
                    if (!((1uQ) this.A03.get()).A04() || BHu == null) {
                        if (viewerContext != null && viewerContext.mIsPageContext) {
                            viewerContext = (ViewerContext) 1Bn.A0E((Context) null, r0, 33059);
                        }
                        BHu = viewerContext;
                    }
                    if (1BK.A0N(this.A02).AZk(18299249332067138L)) {
                        str2 = BHu.mSessionCookiesString;
                    }
                    return new AuthenticationResultImpl(new FacebookCredentials(str, A0P, BHu.mUserId, BHu.mAuthToken, str2, null, null, null, BHu.A00, false), TriState.UNSET, str, null, A0H, null);
                }
            }
        }
        throw AnonymousClass001.A0L("User not authorized for page id");
    }
}

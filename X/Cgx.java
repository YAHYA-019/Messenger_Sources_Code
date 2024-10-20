package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.protocol.GetLoggedInUserGraphQLResult;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.util.TriState;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: Cgx.class */
public final class Cgx implements 4qU, CallerContextable {
    public static final String __redex_internal_original_name = "VerifyRemoteUserBatchComponent";
    public Bbp A00;
    public String A01;
    public final C00i A08 = 1BQ.A00();
    public final C00i A02 = 1BQ.A02(49320);
    public final C00i A03 = 1BQ.A02(65755);
    public final C00i A06 = 1BV.A00(49321);
    public final C00i A04 = 1BQ.A02(84886);
    public final C00i A05 = 1BV.A00(49310);
    public final C00i A07 = AbH.A0G();

    public void A00() {
        if (2yD.A03(1BK.A0N(this.A08), 36310521103843642L)) {
            return;
        }
        CallerContext A0B = AbH.A0B(this);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(this);
        1BK.A1E(this.A07).execute(new D9V(A0B, this, A0s));
    }

    public Iterable B0L() {
        1Ro r0 = (1Ro) this.A06.get();
        TriState triState = TriState.UNSET;
        return ImmutableList.of((Object) new C4r6(triState, r0, null, null, PublicKeyCredentialControllerUtility.JSON_KEY_USER), (Object) new C4r6(triState, (1Ro) this.A05.get(), null, null, 4YT.A00(340)));
    }

    public void CA9(java.util.Map map) {
        C00i c00i = this.A03;
        User A0I = C3o5.A0I(c00i);
        if (A0I == null || map == null || map.get(PublicKeyCredentialControllerUtility.JSON_KEY_USER) == null) {
            return;
        }
        GetLoggedInUserGraphQLResult getLoggedInUserGraphQLResult = (GetLoggedInUserGraphQLResult) map.get(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        Boolean bool = (Boolean) map.get(4YT.A00(340));
        1Kh A0y = AbF.A0y();
        A0y.A03(getLoggedInUserGraphQLResult.A00);
        A0y.A1Z = bool != null ? bool.booleanValue() : false;
        A0y.A16 = __redex_internal_original_name;
        User A0w = AbF.A0w(A0y);
        String str = this.A01;
        String str2 = A0I.A13;
        String str3 = A0w.A13;
        0fH.A0a(str, str2, str3, __redex_internal_original_name, "entryPoint=%s, local=%s, remote=%s");
        if (str2.equals(str3) && A0I.A0e.name().equals(A0w.A0e.name()) && A0I.A2D == A0w.A2D && A0I.A25 == A0w.A25 && A0I.A29 == A0w.A29 && A0I.A1u == A0w.A1u) {
            return;
        }
        0fH.A0k(__redex_internal_original_name, "user data is inconsistent, updating data");
        boolean z = A0w.A25;
        if (z) {
            ((CIZ) this.A04.get()).A03(A0w.A0g, str3, z);
        }
        1Eu r0 = (1Ew) c00i.get();
        User Auc = r0.Auc();
        if (11T.A0O(Auc != null ? Auc.A13 : null, str3)) {
            1Eu.A02(r0, A0w, true);
        }
        Bbp bbp = this.A00;
        if (bbp != null) {
            bbp.A00.runOnUiThread(new D5E(bbp));
        }
    }
}

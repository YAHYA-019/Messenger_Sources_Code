package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.mdotme.model.PlatformRefParams;

/* loaded from: Cea.class */
public final class Cea implements DEW {
    public final FbUserSession A00;
    public final /* synthetic */ C1626Ao4 A01;

    public Cea(FbUserSession fbUserSession, C1626Ao4 c1626Ao4) {
        this.A01 = c1626Ao4;
        this.A00 = fbUserSession;
    }

    public Intent ACo(Context context, Bundle bundle) {
        String string = bundle.getString("cta_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Intent A05 = AbG.A05();
        BkQ bkQ = this.A01.A00;
        FbUserSession fbUserSession = this.A00;
        C4Nd c4Nd = new C4Nd();
        c4Nd.A0E = string;
        CallToAction callToAction = new CallToAction(c4Nd);
        String str = callToAction.A0E;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "postback_call_to_action_id");
        07S.A00(A0J, (Object) null, "message_id");
        PlatformRefParams platformRefParams = callToAction.A09;
        if (platformRefParams != null) {
            String str2 = platformRefParams.A00;
            if (!TextUtils.isEmpty(str2)) {
                07S.A00(A0J, str2, "postback_ref");
            }
            String str3 = platformRefParams.A01;
            if (!TextUtils.isEmpty(str3)) {
                07S.A00(A0J, str3, 4YT.A00(1376));
            }
            String str4 = platformRefParams.A02;
            if (!TextUtils.isEmpty(str4)) {
                07S.A00(A0J, str4, "source_id");
            }
        }
        C1683App c1683App = new C1683App();
        4YV.A1A(A0J, ((2Jf) c1683App).A00, "input");
        ((5iG) bkQ.A01.get()).A08(new C1614Amv(context, bkQ, 4), str, new DBG(6, fbUserSession, c1683App, bkQ));
        return A05;
    }
}

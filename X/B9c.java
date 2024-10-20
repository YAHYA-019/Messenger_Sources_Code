package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: B9c.class */
public final class B9c extends CP4 {
    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        String error;
        0fH.A0l("DeclineCallRequestHandler", "Handled decline call");
        CallModel A0W = AbL.A0W(1Lo.A04(context, fbUserSession, (1BY) null, 33088));
        if (A0W == null || A0W.inCallState != 2) {
            error = CP4.error(7, "Invalid request");
        } else {
            ((Hrj) 1Bn.A0E(context, (1BY) null, 83913)).A01(fbUserSession, KNP.DECLINE_CALL_ACTION.toString());
            error = CP4.success((Object) null);
        }
        return 1Kd.A0A(error);
    }
}

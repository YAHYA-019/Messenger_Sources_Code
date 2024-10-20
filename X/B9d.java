package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: B9d.class */
public final class B9d extends CP4 {
    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        0fH.A0l("EndCallRequestHandler", "Handle end call");
        C5V0 c5v0 = (C5V0) 1Lo.A06(fbUserSession, 115765);
        boolean A1Z = 7zP.A1Z(fbUserSession);
        1BY r0 = c5v0.A00.A00;
        if (((2QO) 1Lo.A04((Context) null, fbUserSession, r0, 99977)).BQN()) {
            ((IRF) 1Lo.A04((Context) null, fbUserSession, r0, 99979)).A0h(1, "User clicked end call");
        } else {
            A1Z = false;
        }
        return 2FP.A01(D3J.A01(this, 59), C3o5.A0K(A1Z));
    }
}

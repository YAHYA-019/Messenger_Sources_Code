package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: B9l.class */
public final class B9l extends CP4 {
    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        1Ql A08 = 1Br.A08(((5Iw) 1Bn.A0E(context, (1BY) null, 82256)).A01);
        A08.CaL(5Iw.A04, "");
        A08.commit();
        return 1Kd.A0A(CP4.success((Object) null));
    }

    public boolean shouldCheckUserId() {
        return false;
    }
}

package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: B9k.class */
public final class B9k extends CP4 {
    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        return 1Kd.A0A(CP4.success(String.valueOf(((5Iw) 1Bn.A0E(context, (1BY) null, 82256)).A02())));
    }

    public boolean shouldCheckUserId() {
        return false;
    }
}

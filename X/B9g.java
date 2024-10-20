package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: B9g.class */
public final class B9g extends CP4 {
    public final C00i A00 = AbH.A0J();

    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        2FT A00;
        if (jSONObject == null) {
            return CP4.A01("Invalid request", 7);
        }
        boolean optBoolean = jSONObject.optBoolean("is_group_thread", false);
        String optString = jSONObject.optString("recipient_id");
        int optInt = jSONObject.optInt("max_message_per_thread", -1);
        Cb7 cb7 = (Cb7) 1Bn.A0E(context, (1BY) null, 83043);
        if (TextUtils.isEmpty(optString)) {
            A00 = cb7.A00(null, optInt);
        } else {
            ThreadKey A02 = ((CbW) 1Lo.A04(context, fbUserSession, (1BY) null, 83487)).A02(context, optString, optBoolean);
            A00 = A02 != null ? cb7.A00(A02, optInt) : 1hM.A01;
        }
        return AbJ.A0t(this.A00, new D2u(4, context, fbUserSession, this), A00);
    }
}

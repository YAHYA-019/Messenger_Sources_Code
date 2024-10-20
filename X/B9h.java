package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: B9h.class */
public final class B9h extends CP4 {
    public final C00i A00 = AbH.A0J();

    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        if (jSONObject == null) {
            0fH.A0B(B9h.class, "No payload in the request");
            return CP4.A01("Invalid request", 7);
        }
        int min = Math.min(50, Math.max(0, jSONObject.optInt("call_history_count", 20)));
        Integer valueOf = Integer.valueOf(min);
        0fH.A07(B9h.class, valueOf, "Requesting %d call history records");
        Bql bql = new Bql(context, new MailboxFeature((1Uj) 1Lo.A04(context, fbUserSession, (1BY) null, 16686)));
        1FV A0j = 4YU.A0j();
        bql.A01.A00((MailboxCallback) null, true, valueOf).addResultCallback(1BK.A1E(bql.A02), new CzW(min, 1, fbUserSession, bql, A0j));
        return AbJ.A0t(this.A00, new D2l(this, 2), A0j);
    }
}

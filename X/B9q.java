package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: B9q.class */
public final class B9q extends CP4 implements CallerContextable {
    public static final CallerContext A01 = CallerContext.A0A(B9q.class, "unknown", "hn_load_threads_request");
    public static final String __redex_internal_original_name = "LoadThreadsRequestHandler";
    public final C00i A00 = 1BV.A00(68334);

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        ?? A0j;
        synchronized (this) {
            1BV A0R = 7zL.A0R(context, 17151);
            A0j = 4YU.A0j();
            2Ur A0J = ((C2xd) A0R.get()).A0J(fbUserSession);
            A0J.CmR(new Cbw(context, fbUserSession, this, A0j));
            A0J.A09(1F9.A0I);
            A0J.A0A(new 2fC(A01, 1Hb.A02, 2Uo.A02, 10, true, true, false));
        }
        return A0j;
    }
}

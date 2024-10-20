package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: B9m.class */
public final class B9m extends CP4 {
    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        String success;
        0fH.A0l("OptInOutRequestHandler", "Check state");
        1Bn.A0A(148148);
        5Iw r0 = (5Iw) 1Bn.A0E(context, (1BY) null, 82256);
        1Ql A08 = 1Br.A08(r0.A01);
        A08.CaL(5Iw.A04, "");
        A08.commit();
        if (jSONObject == null || jSONObject.optBoolean("skip_verify_permission", true) || IRF.A0Y((Activity) null, (IRF) 1Lo.A04(context, fbUserSession, (1BY) null, 99979), false)) {
            r0.A01(bwy.A06);
            success = CP4.success((Object) null);
        } else {
            success = CP4.error(4, "Permission error");
        }
        return 1Kd.A0A(success);
    }

    public int maxProtocolVersion(Bwy bwy) {
        int i = 2147483646;
        if (KNP.CHECK_STATE_FOR_ENABLE_STELLA_ACTION == bwy.A02) {
            i = 2;
        }
        return i;
    }

    public boolean shouldCheckUserId() {
        return false;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: B9r.class */
public final class B9r extends CP4 implements CallerContextable {
    public static final String __redex_internal_original_name = "StartCallRequestHandler";
    public final C00i A00 = 1BQ.A00();
    public final C00i A01 = 1BQ.A02(16433);

    public static SettableFuture A00(Context context, FbUserSession fbUserSession, ThreadKey threadKey, B9r b9r, ImmutableList immutableList, String str, boolean z) {
        SettableFuture A0j = 4YU.A0j();
        if (threadKey.A0w()) {
            ListenableFuture A00 = ((9Y9) 1Bn.A0E(context, (1BY) null, 67492)).A00(threadKey);
            1Kd.A0D(b9r.A01, new D4k(context, fbUserSession, threadKey, b9r, (C5V0) 1Lo.A06(fbUserSession, 115765), immutableList, A0j, str, z), A00);
            return A0j;
        }
        C5V0 c5v0 = (C5V0) 1Lo.A06(fbUserSession, 115765);
        BHk bHk = new BHk(threadKey, immutableList, 4YU.A0y(threadKey), "stella_call", (String) null, "stella", str, z, false, false);
        RhC.A01(str).A04();
        A0j.setFuture(c5v0.A0B(context, fbUserSession, bHk));
        return A0j;
    }

    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        ListenableFuture A0t;
        int i;
        String str;
        if (jSONObject == null) {
            return CP4.A01("Invalid request", 7);
        }
        String str2 = bwy.A04;
        RhC A00 = RhC.A00(Qng.A01, str2, bwy.A01, 60);
        A00.A05();
        JSONArray jSONArray = jSONObject.getJSONArray("recipient_id");
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            A0s.add(jSONArray.getString(i2));
        }
        boolean z = jSONObject.getBoolean("is_group_thread");
        boolean z2 = jSONObject.getBoolean("is_e2ee");
        boolean optBoolean = AbstractC06294ge.A00(context) ? jSONObject.optBoolean(GOm.A00(23), false) : false;
        0fH.A0l(__redex_internal_original_name, "Handled start call");
        1Bn.A0A(148148);
        if (!IRF.A0Y((Activity) null, (IRF) 1Lo.A04(context, fbUserSession, (1BY) null, 99979), optBoolean)) {
            i = 4;
            str = "Permission error";
        } else {
            if (!A0s.isEmpty()) {
                47I A002 = ((C3Nt) 1Bn.A0E(context, (1BY) null, 67603)).A00(1BK.A0N(this.A00).Auy(36594577356032149L));
                D3t d3t = new D3t(context, fbUserSession, this, str2, A0s, optBoolean, z, z2);
                C00i c00i = this.A01;
                A0t = AbJ.A0t(c00i, new D2l(this, 0), 4YV.A0b(c00i, d3t, A002));
                1Kd.A0E(D4p.A00(A00, this, 71), A0t);
                return A0t;
            }
            i = 2;
            str = "Invalid contact";
        }
        A0t = CP4.A01(str, i);
        1Kd.A0E(D4p.A00(A00, this, 71), A0t);
        return A0t;
    }
}

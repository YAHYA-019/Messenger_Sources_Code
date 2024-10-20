package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashMap;

/* loaded from: F7j.class */
public final class F7j {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public F7j(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 16980);
        this.A01 = 1Bu.A03(r0, 115624);
    }

    public static final HashMap A00(FbUserSession fbUserSession, F7j f7j) {
        HashMap A0u = AnonymousClass001.A0u();
        1BY r0 = f7j.A02.A00;
        String str = null;
        if (!((2QO) 1Lo.A04((Context) null, fbUserSession, r0, 99977)).A0S) {
            ThreadKey A00 = ((HpT) 1Lo.A04((Context) null, fbUserSession, r0, 83326)).A00();
            if (A00 != null) {
                str = 1BK.A0w(A00);
            }
            A0u.put("thread_id", str);
        }
        1Br.A0C(f7j.A01);
        A0u.put("is_halo", AnonymousClass001.A0K());
        return A0u;
    }

    public final FZo A01(FbUserSession fbUserSession, String str) {
        11T.A0F(fbUserSession, 0);
        long j = -1;
        return new FZo((SparseArray) null, (Ebb) null, (Ebb) null, (Object) null, (String) null, str, "amd_bloks_cache_key", (String) null, C4O5.A02(A00(fbUserSession, this)), AnonymousClass001.A0s(), (java.util.Map) null, (java.util.Map) null, (java.util.Map) null, -1, 38220833, j, j, false, false);
    }
}

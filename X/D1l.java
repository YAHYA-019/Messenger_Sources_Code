package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: D1l.class */
public final class D1l implements 7H9 {
    public final FbUserSession A00;
    public final ThreadKey A01;
    public final 2Of A02;
    public final HeterogeneousMap A03;

    public D1l(FbUserSession fbUserSession, ThreadKey threadKey, 2Of r304, HeterogeneousMap heterogeneousMap) {
        1BK.A1K(r304, 2, heterogeneousMap);
        this.A01 = threadKey;
        this.A02 = r304;
        this.A00 = fbUserSession;
        this.A03 = heterogeneousMap;
    }

    public void BLW(Context context, C5vw c5vw) {
        boolean A1X = 1BL.A1X(context, c5vw);
        if (c5vw instanceof 8NU) {
            8NU r0 = (8NU) c5vw;
            if (r0.A00 == 0) {
                BgK bgK = (BgK) 1Bn.A0A(85170);
                ThreadKey threadKey = this.A01;
                2Of r02 = this.A02;
                FbUserSession fbUserSession = this.A00;
                Number number = (Number) r0.A02;
                if (number != null) {
                    long longValue = number.longValue();
                    Object A0B = 1Br.A0B(bgK.A00);
                    if (threadKey.A0w()) {
                        ((22C) 1Lo.A04(context, fbUserSession, (1BY) null, 65962)).A0H(new CyY(context, fbUserSession, threadKey, A0B, r02, A1X ? 1 : 0, longValue), longValue, 0L);
                    }
                    if (threadKey.A1F()) {
                        ((1xC) 1Lo.A04(context, fbUserSession, (1BY) null, 33148)).A00(new CyC(3, context, fbUserSession, r02, A0B, threadKey), (int) longValue);
                    }
                }
            }
        }
    }
}

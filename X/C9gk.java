package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.Either;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.List;

/* renamed from: X.9gk, reason: invalid class name */
/* loaded from: 9gk.class */
public final class C9gk {
    public static final C9gk A00 = new Object();

    public final 2Oe A00(FbUserSession fbUserSession, 5SW r303, AnonymousClass201 anonymousClass201, String str, List list) {
        Long A0e = 0CW.A0e(7zR.A0U().A06());
        ThreadKey A0F = A0e != null ? ThreadKey.A0F(A0e.longValue(), 7zO.A0C(fbUserSession)) : null;
        Either either = null;
        if (A0F == null) {
            return null;
        }
        C6el A0H = 1BK.A0H(A0F);
        A0H.A02(r303);
        ThreadViewParams threadViewParams = new ThreadViewParams(A0H);
        ThreadKey threadKey = threadViewParams.A05;
        5SW r0 = threadViewParams.A0C;
        HeterogeneousMap A002 = anonymousClass201.A00();
        if (str != null) {
            either = new Either(str, null, true);
        }
        return C6rh.A00(either, threadKey, r0, A002, list, 2131365417);
    }
}

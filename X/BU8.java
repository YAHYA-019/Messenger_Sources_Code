package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* loaded from: BU8.class */
public abstract class BU8 {
    public static final C8i A00(Context context, FbUserSession fbUserSession, C5yq c5yq, ThreadSummary threadSummary, C5yl c5yl) {
        String str;
        11T.A0H(fbUserSession, context);
        11T.A0F(c5yl, 4);
        MigColorScheme A0c = 7zR.A0c(context);
        ThreadKey A0f = AbF.A0f(threadSummary);
        String A0w = 1BK.A0w(A0f);
        C8i c8i = new C8i();
        c8i.A00(A0c);
        c8i.A08 = c5yl;
        c8i.A00 = c5yq;
        c8i.A0B = A0w;
        C1pq.A08("objectId", A0w);
        c8i.A04 = A0f;
        c8i.A05 = threadSummary;
        AnonymousClass545 anonymousClass545 = (AnonymousClass545) 1Lo.A04(context, fbUserSession, (1BY) null, 49481);
        if (A0f.A18()) {
            1Du A12 = AbF.A12(threadSummary);
            while (A12.hasNext()) {
                str = AbH.A0j(A12).A00();
                if (str != null && !Objects.equal(anonymousClass545.A01.id, str)) {
                    c8i.A07 = 1BK.A0X(str);
                    break;
                }
            }
        }
        str = null;
        ((6Io) 1Bn.A0E(context, (1BY) null, 67893)).A06(fbUserSession, c5yq, A0f, c5yl, str);
        return c8i;
    }
}

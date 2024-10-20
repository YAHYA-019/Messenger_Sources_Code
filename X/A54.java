package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: A54.class */
public final class A54 implements 5Q4 {
    public final List A00;
    public final C01i A01;

    public A54(Context context, FbUserSession fbUserSession, List list) {
        this.A00 = list;
        this.A01 = C01g.A01(new AQf(context, fbUserSession, 7));
    }

    public boolean BQg(C5fv c5fv) {
        11T.A0F(c5fv, 0);
        c5fv.AxW(72O.A00);
        return false;
    }

    public void Ckt(ThreadKey threadKey, AnonymousClass539 anonymousClass539, 7TA r304, C5fv c5fv, String str, String str2, boolean z) {
        7zT.A1S(threadKey, r304, c5fv);
        c5fv.AxW(72O.A00);
    }
}

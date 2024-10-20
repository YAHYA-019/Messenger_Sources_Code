package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2q5, reason: invalid class name */
/* loaded from: 2q5.class */
public final class C2q5 {
    public final 1Br A00 = 1Bq.A00(65723);
    public final 1De A01;

    public C2q5(1De r302) {
        this.A01 = r302;
    }

    public final String A00(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        ImmutableList A09 = ((AnonymousClass242) 1Lo.A04((Context) null, fbUserSession, this.A01.A00, 16907)).A09(threadSummary);
        11T.A0A(A09);
        return A01(fbUserSession, A09);
    }

    public final String A01(FbUserSession fbUserSession, ImmutableList immutableList) {
        11T.A0F(fbUserSession, 0);
        if (immutableList.isEmpty()) {
            return null;
        }
        ImmutableList A00 = ((C2fp) 1Lo.A04((Context) null, fbUserSession, this.A01.A00, 17071)).A00(immutableList);
        11T.A0A(A00);
        if (A00.isEmpty()) {
            return null;
        }
        Object obj = A00.get(0);
        11T.A0A(obj);
        UserKey userKey = (UserKey) obj;
        11T.A0F(userKey, 0);
        return ((1XZ) this.A00.A00.get()).At0(userKey);
    }
}

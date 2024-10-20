package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A9f.class */
public final class A9f implements 6sC {
    public final C00i A00 = 1BQ.A01();
    public final C00i A01;

    public A9f(Context context, FbUserSession fbUserSession) {
        this.A01 = 1Lo.A00(context, fbUserSession, 67506);
    }

    public void Cl6(ThreadKey threadKey) {
        ((5Xd) this.A01.get()).A01(new A03(this, 25), 4YU.A0l(threadKey), Integer.valueOf(ThreadKey.A00(threadKey.A06)), Long.valueOf(threadKey.A05));
    }
}

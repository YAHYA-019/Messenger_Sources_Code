package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: Bpw.class */
public final class Bpw {
    public final Context A00 = FbInjector.A00();
    public final FbUserSession A01;
    public final 5Uf A02;

    public Bpw(FbUserSession fbUserSession) {
        this.A01 = fbUserSession;
        this.A02 = (5Uf) 1Lo.A06(fbUserSession, 83803);
    }
}

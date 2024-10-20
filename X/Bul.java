package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: Bul.class */
public final class Bul {
    public final FbUserSession A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final 54D A04;

    public Bul(FbUserSession fbUserSession) {
        this.A01 = AbF.A0B(fbUserSession, (1BY) null, 85140);
        this.A02 = AbF.A0A(fbUserSession, (1BY) null, 114987);
        this.A03 = AbF.A0A(fbUserSession, (1BY) null, 99981);
        this.A04 = new 54D(fbUserSession, FbInjector.A00());
        this.A00 = fbUserSession;
    }
}

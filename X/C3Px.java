package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3Px, reason: invalid class name */
/* loaded from: 3Px.class */
public final class C3Px {
    public 1BY A00;
    public final FbUserSession A01;

    public C3Px(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
    }

    public static final C3Px A00(1BO r301, Object obj) {
        return new C3Px(r301, (FbUserSession) obj);
    }
}

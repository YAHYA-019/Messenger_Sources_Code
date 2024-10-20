package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xw.class */
public final class C11904xw {
    public final FbUserSession A00;

    public C11904xw(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
    }

    public final String A00() {
        1G1 r0 = this.A00;
        boolean z = r0.Aue().mIsPageContext;
        if (Boolean.valueOf(z) == null || z) {
            return ((FbSharedPreferences) 1Bi.A03(33013)).BD0(1G3.A01(1NK.A0G, r0.A02));
        }
        return null;
    }
}

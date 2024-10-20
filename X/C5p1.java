package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* renamed from: X.5p1, reason: invalid class name */
/* loaded from: 5p1.class */
public final class C5p1 {
    public 1BY A00;
    public final C00i A03;
    public final C00i A05;
    public final C00i A02 = FbInjector.A00;
    public final C00i A06 = new 1BQ(67389);
    public final C00i A01 = new 1BQ(32771);
    public final C00i A04 = new 1BQ(16385);

    public C5p1(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A05 = new 1MV(fbUserSession, (1BY) null, 17061);
        this.A03 = new 1MV(fbUserSession, (1BY) null, 67281);
    }

    public static 5PR A00(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return 5PR.A0A;
            }
            if (intValue == 2) {
                return 5PR.A09;
            }
            if (intValue == 3) {
                return 5PR.A02;
            }
            if (intValue == 4) {
                return 5PR.A0B;
            }
            if (intValue == 5) {
                return 5PR.A03;
            }
        }
        return 5PR.A06;
    }
}

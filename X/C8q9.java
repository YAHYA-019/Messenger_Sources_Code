package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8q9, reason: invalid class name */
/* loaded from: 8q9.class */
public final class C8q9 extends 2Yf {
    public FbUserSession A00;
    public 8Kw A01;
    public MigColorScheme A02;

    public C8q9() {
        super("FriendsTabTrendingCommunitiesSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A02;
        8Kw r0 = this.A01;
        11T.A0F(c1qb, 0);
        7zS.A16(1, fbUserSession, migColorScheme, r0);
        8TR A00 = C5z5.A00(c1qb);
        A00.A2a(c1qb.A0D(2131964230));
        A00.A2Z(migColorScheme);
        List list = r0.A03.A00;
        long size = list.size();
        C1ua c1ua = C1ua.A01;
        if (size > c1ua.A00()) {
            2lQ r02 = 2lO.A02;
            7zS.A1L(A00, (2lO) null, 0S2.A00, new GBp(c1qb, fbUserSession, 19));
            A00.A2X(2131964231);
            C5z5 c5z5 = A00.A01;
            c5z5.A08 = true;
            c5z5.A01 = C9pw.A00(c1qb, fbUserSession, 1);
        }
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        A0I.A05(A00.A2W());
        A0l.A00(A0I);
        8qO r03 = new 8qO();
        r03.A00 = fbUserSession;
        r03.A02 = migColorScheme;
        r03.A01 = r0.A01;
        r03.A03 = 0QD.A0Y(list, (int) c1ua.A00());
        2Ys r04 = A0l.A00;
        r04.A00.add(r03);
        return r04;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8q9 c8q9 = (C8q9) r302;
            MigColorScheme migColorScheme = this.A02;
            MigColorScheme migColorScheme2 = c8q9.A02;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A00;
            FbUserSession fbUserSession2 = c8q9.A00;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            8Kw r0 = this.A01;
            8Kw r02 = c8q9.A01;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
        }
        return true;
    }
}

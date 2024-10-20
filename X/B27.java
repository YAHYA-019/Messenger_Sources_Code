package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.util.BitSet;

/* loaded from: B27.class */
public final class B27 extends 2Yf {
    public DJY A00;
    public MigColorScheme A01;
    public User A02;
    public String A03;

    public B27() {
        super("ProfileUnitsSections");
    }

    public 2Ys A0d(C1qb c1qb) {
        String str = this.A03;
        C54a c54a = (C54a) 1Bi.A03(68080);
        2Yr A0l = 7zL.A0l();
        E0s e0s = new E0s();
        e0s.A01 = 86400L;
        e0s.A04 = new B2X(c54a, str);
        e0s.A03 = 2Yg.A05(c1qb, B27.class, "ProfileUnitsSections");
        A0l.A01(e0s);
        return A0l.A00;
    }

    public Object A0e(1Im r302, Object obj) {
        2Yr A0l;
        int ordinal;
        2hP A0I;
        if (r302.A01 != 1935729872) {
            return null;
        }
        9TF r0 = (9TF) obj;
        1Iv r02 = r302.A00;
        B27 b27 = r02.A01;
        C1qb c1qb = (C1qb) r02.A00;
        ELK elk = r0.A01;
        2JX r03 = (2JX) r0.A03;
        B27 b272 = b27;
        String str = b272.A03;
        DJY djy = b272.A00;
        MigColorScheme migColorScheme = b272.A01;
        User user = b272.A02;
        if (elk != null && (ordinal = elk.ordinal()) != 0 && ordinal != 3) {
            if (ordinal == 1) {
                A0l = 7zL.A0l();
                A0I = 2hO.A0I(c1qb);
                C1rq A01 = C1rg.A01(c1qb, null, 0);
                A01.A2c();
                A01.A0D(C2cn.A02(7zR.A00(((1Iw) c1qb).A0D), migColorScheme.Abp()));
                A01.A1B(16.0f);
                A01.A2f(AbK.A0g(c1qb, migColorScheme));
                A0I.A04(A01);
            } else {
                if (ordinal != 2) {
                    throw AnonymousClass002.A0C(elk, "Received invalid state: ", AnonymousClass001.A0k());
                }
                if (r03 != null) {
                    A0l = 7zL.A0l();
                    A0I = 2hO.A0I(c1qb);
                    C1867Av4 c1867Av4 = new C1867Av4(c1qb, new B0C());
                    B0C b0c = c1867Av4.A01;
                    b0c.A04 = str;
                    BitSet bitSet = c1867Av4.A02;
                    bitSet.set(2);
                    b0c.A00 = r03;
                    bitSet.set(3);
                    b0c.A02 = migColorScheme;
                    bitSet.set(0);
                    b0c.A03 = user;
                    bitSet.set(4);
                    b0c.A01 = djy;
                    bitSet.set(1);
                    C1rs.A04(bitSet, c1867Av4.A03);
                    c1867Av4.A0J();
                    A0I.A05(b0c);
                }
            }
            A0l.A00(A0I);
            return A0l.A00;
        }
        A0l = 7zL.A0l();
        return A0l.A00;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B27 b27 = (B27) r302;
            MigColorScheme migColorScheme = this.A01;
            MigColorScheme migColorScheme2 = b27.A01;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            DJY djy = this.A00;
            DJY djy2 = b27.A00;
            if (djy != null) {
                if (!djy.equals(djy2)) {
                    return false;
                }
            } else if (djy2 != null) {
                return false;
            }
            String str = this.A03;
            String str2 = b27.A03;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            User user = this.A02;
            User user2 = b27.A02;
            if (user != null) {
                if (!user.equals(user2)) {
                    return false;
                }
            } else if (user2 != null) {
                return false;
            }
        }
        return true;
    }
}

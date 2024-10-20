package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.BaseMigColorScheme;

/* renamed from: X.91h, reason: invalid class name */
/* loaded from: 91h.class */
public final class C91h extends C3Yn {
    public String A00;
    public C91k A01;

    public static final 2cL A00(MigColorScheme migColorScheme, Jtt jtt, String str) {
        11T.A0A(4YU.A0E(jtt));
        2cM A01 = 2cK.A01(jtt, (String) null, 0);
        A01.A1C(32.0f);
        7zM.A1O(A01, migColorScheme);
        2KD A012 = 2K3.A01(jtt, 0);
        A012.A2r(2131960782);
        A012.A2X();
        A012.A2e();
        A012.A2x(migColorScheme);
        A012.A2m();
        A012.A17(80.0f);
        4YU.A1K(A01, A012);
        2KD A013 = 2K3.A01(jtt, 0);
        A013.A2r(2131960781);
        A013.A2X();
        A013.A2w(C1u7.A0B);
        A013.A2x(migColorScheme);
        A013.A2n();
        A013.A17(8.0f);
        A013.A18(24.0f);
        4YU.A1K(A01, A013);
        2cM A0M = 7zN.A0M(jtt, (String) null);
        A0M.A2e(new QFY(0));
        A0M.A2e(new QFY(1));
        A0M.A2e(new QFY(2));
        A0M.A2e(new QFY(3));
        A01.A2d(A0M);
        AnonymousClass860 A00 = C85z.A00(jtt);
        A00.A01.A03 = 7zL.A12(A00, 2131960780);
        A00.A02.set(1);
        A00.A0e();
        A00.A0l(36.0f);
        A00.A17(36.0f);
        A00.A18(24.0f);
        A00.A2X(migColorScheme);
        A00.A0M();
        7zR.A1A(A00, new AV7(str, jtt, 19));
        return 7zL.A0V(A01, A00.A2V());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.91h, X.3Yn] */
    public static C91h create(Jtt jtt, C91k c91k) {
        ?? c3Yn = new C3Yn();
        c3Yn.A01 = c91k;
        c3Yn.A00 = c91k.A00;
        return c3Yn;
    }

    @Override // X.C3Yn
    public 1LI A0C(Jtt jtt) {
        String str = this.A00;
        11T.A0F(str, 1);
        return A00((BaseMigColorScheme) 1Bi.A03(16815), jtt, str);
    }

    @Override // X.C3Yn
    public /* bridge */ /* synthetic */ 1LI A0D(Jtt jtt, Object obj) {
        2JY A0P;
        2JX A0L;
        Dky A21;
        4kO r0 = (4kO) obj;
        String str = this.A00;
        11T.A0G(r0, 1, str);
        2JY r02 = (2JY) r0.A03;
        if (r02 == null || (A0P = r02.A0P(2JX.class, 2136649995)) == null || (A0L = 1BL.A0L(A0P, -1248135374, 1759619574)) == null || (A21 = A0L.A21()) == null) {
            return A00((BaseMigColorScheme) 1Bi.A03(16815), jtt, str);
        }
        DuS A00 = DzF.A00(jtt);
        A00.A2X(A21);
        A00.A1H(((BaseMigColorScheme) 1Bi.A03(16815)).AmV());
        A00.A01.A06 = true;
        A00.A0R();
        return A00.A2W();
    }
}

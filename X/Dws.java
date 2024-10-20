package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Dws.class */
public final class Dws extends C1rj {
    public FbUserSession A00;
    public 2JX A01;
    public Edt A02;
    public MigColorScheme A03;
    public String A04;

    public Dws() {
        super("FXCalDetailsXpostProfilesFragmentLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A03, this.A01, this.A00, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList A2C;
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A03;
        2JX r0 = this.A01;
        Edt edt = this.A02;
        String str = this.A04;
        11T.A0F(r302, 0);
        7zT.A1W(fbUserSession, migColorScheme, r0, edt);
        11T.A0F(str, 5);
        C1i A0T = 7zU.A0T();
        1BV A0R = 7zL.A0R(7zL.A0A(r302), 99817);
        CQY A00 = A0T.A00(r302, migColorScheme);
        if (!FJ2.A09(r0)) {
            C8m6 A09 = A00.A09();
            11T.A0A(A09);
            return A09;
        }
        Erq erq = (Erq) A0R.get();
        2JX A1U = r0.A1U();
        2JX A0E = (A1U == null || (A2C = A1U.A2C()) == null) ? null : AbG.A0E(A2C, 0);
        ImmutableList A03 = FJ2.A03(A0E, str);
        if (A03 != null) {
            1Du it = A03.iterator();
            while (it.hasNext()) {
                2JX A0D = AbG.A0D(it);
                5AM r02 = new 5AM(C1u3.A1U, C1u4.SIZE_32, C1ut.A0A, migColorScheme, (CharSequence) null);
                String A04 = FJ2.A04(A0D);
                String A05 = FJ2.A05(A0D);
                2JX A1X = A0D.A1X();
                String A0r = DKF.A0r(A1X);
                String A0r2 = (A0E == null || !A0E.getBooleanValue(1270507286)) ? null : A1X.A0r(-1992687072);
                55D A002 = erq.A00(fbUserSession, migColorScheme, FJ2.A06(A0D), A0r);
                AnonymousClass557 anonymousClass557 = new AnonymousClass557();
                anonymousClass557.A08(A04);
                Fk7.A00(A002, anonymousClass557, migColorScheme, A05 == null ? "" : A05, A0r2);
                boolean booleanValue = A0D.getBooleanValue(1191572123);
                int i = 2131952178;
                if (booleanValue) {
                    i = 2131952164;
                }
                anonymousClass557.A0A = r302.A0E(i, new Object[]{A04, A05});
                anonymousClass557.A01 = new Fk5(9, r0, A0D, edt);
                anonymousClass557.A06(booleanValue ? ImmutableList.of((Object) r02) : ImmutableList.of());
                DKG.A1P(A00, anonymousClass557, migColorScheme);
            }
        }
        return 7zL.A0V(7zN.A0M(r302, (String) null), A00.A09());
    }
}

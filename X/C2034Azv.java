package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Azv, reason: case insensitive filesystem */
/* loaded from: Azv.class */
public final class C2034Azv extends C1rj {
    public FbUserSession A00;
    public C1u2 A01;
    public MigColorScheme A02;
    public java.util.Map A03;
    public boolean A04;

    public C2034Azv() {
        super("PollAdminMessageWinnerPreviewComponent");
    }

    public static final 2cM A00(FbUserSession fbUserSession, C1u2 c1u2, 1Iw r303, 2RK r304, MigColorScheme migColorScheme, UserKey userKey, String str) {
        2cM A00 = 2cK.A00(r303);
        C1912Awd A06 = C1912Awd.A06(fbUserSession, r303);
        A06.A2W(r304);
        C2q2 c2q2 = C2q2.A0B;
        C1987Ayg c1987Ayg = A06.A01;
        c1987Ayg.A02 = c2q2;
        C2qh c2qh = new C2qh();
        c2qh.A0B.put(C2fd.A0J, new A3m(c1u2, migColorScheme));
        2zP r0 = 2zP.A02;
        r0.getClass();
        c2qh.A07 = r0;
        c1987Ayg.A03 = new C2qg(c2qh);
        2RH r02 = 2RH.A05;
        4YU.A1N(A06, r02);
        c1987Ayg.A04 = ImmutableList.of((Object) userKey);
        A00.A2d(A06);
        2KD A01 = 2K3.A01(r303, 0);
        A01.A2y(2KE.A0A);
        A01.A2d();
        A01.A2x(migColorScheme);
        A01.A2X();
        A01.A2z(str);
        4YU.A1N(A01, r02);
        4YU.A1M(A01, 2RH.A04);
        A00.A2d(A01);
        7zU.A1D(A00, r02);
        7zO.A1J(A00, r02);
        return A00;
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A01, Boolean.valueOf(this.A04), this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2cM A01;
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A02;
        C1u2 c1u2 = this.A01;
        java.util.Map map = this.A03;
        boolean z = this.A04;
        11T.A0F(r302, 0);
        7zT.A1W(fbUserSession, migColorScheme, c1u2, map);
        if (map.size() == 0) {
            return null;
        }
        if (map.size() == 1) {
            Map.Entry A0z = AnonymousClass001.A0z(AnonymousClass001.A0y(map));
            A01 = A00(fbUserSession, c1u2, r302, 2RK.A03, migColorScheme, (UserKey) A0z.getKey(), (String) A0z.getValue());
        } else {
            A01 = 2cK.A01(r302, (String) null, 0);
            if (z) {
                2KD A0X = 7zN.A0X(r302, migColorScheme, 0);
                A0X.A2z(r302.A08(2131952474));
                A0X.A2d();
                A0X.A2y(2KE.A0A);
                4YU.A1N(A0X, 2RH.A09);
                A0X.A0L();
                A01.A2d(A0X);
            }
            C1rq A012 = C1rg.A01(r302, null, 0);
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z2 = AnonymousClass001.A0z(A0y);
                A012.A2e(A00(fbUserSession, c1u2, r302, 2RK.A0A, migColorScheme, (UserKey) A0z2.getKey(), (String) A0z2.getValue()));
            }
            A01.A2d(A012);
            A01.A2f(C1ro.CENTER);
        }
        return A01.A2V();
    }
}

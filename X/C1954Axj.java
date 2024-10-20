package X;

import android.content.Context;
import android.text.SpannableString;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Axj, reason: case insensitive filesystem */
/* loaded from: Axj.class */
public final class C1954Axj extends 1LH {
    public final SpannableString A00;
    public final Bdz A01;
    public final MigColorScheme A02;
    public final List A03;
    public final AnonymousClass553 A04;
    public final C5xv A05;
    public final boolean A06;

    public C1954Axj(SpannableString spannableString, Bdz bdz, AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, C5xv c5xv, List list, boolean z) {
        this.A02 = migColorScheme;
        this.A05 = c5xv;
        this.A04 = anonymousClass553;
        this.A00 = spannableString;
        this.A06 = z;
        this.A01 = bdz;
        this.A03 = list;
    }

    public 1LI A0s(C2k5 c2k5) {
        2cL r307;
        String A0B;
        11T.A0F(c2k5, 0);
        boolean z = this.A06;
        1Iw r0 = c2k5.A05;
        if (z) {
            2lQ r02 = 2lO.A02;
            2lO A0f = 7zS.A0f(0S2.A01, 1.0f);
            C2sn A0U = 7zQ.A0U(c2k5.AeS());
            8TA A00 = C8nk.A00(r0);
            A00.A2X(48.0f);
            A00.A0L();
            A00.A2Y(this.A02);
            A0U.A00(A00.A2W());
            r307 = C2so.A07(A0U, c2k5, A0f);
        } else {
            Context context = r0.A0D;
            FbUserSession A01 = 1Fw.A01(context);
            List list = this.A03;
            if (list != null) {
                8T0 A002 = 8mB.A00(r0);
                1Br A003 = 1Lm.A00(context, A01, 17067);
                ImmutableList.Builder builder = ImmutableList.builder();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    User A0t = AbG.A0t(it);
                    Name name = A0t.A0X;
                    if (name.A00() != null) {
                        AnonymousClass557 A0p = 7zL.A0p();
                        C2q1 c2q1 = C2q0.A05;
                        LightColorScheme A004 = LightColorScheme.A00();
                        C2fr A0P = ((2fZ) 1Br.A0B(A003)).A0P(A0t);
                        A0P.getClass();
                        A0p.A05 = 55C.A02(c2q1, A004, A0P);
                        A0p.A00 = 7zQ.A0H(A0t);
                        A0p.A08(name.A00());
                        if (A0t.A0D()) {
                            String str = A0t.A1N;
                            11T.A0A(str);
                            A0B = 3yH.A0B(c2k5, new Object[]{str, 4YU.A0t(4YU.A0E(c2k5.AeS()), 2131958232)}, 2131957592);
                        } else {
                            A0B = null;
                        }
                        A0p.A07(A0B);
                        MigColorScheme migColorScheme = this.A02;
                        A0p.A05(migColorScheme);
                        A0p.A06(7zN.A0e(CBK.A00(new Cwn(A0t, this, 9), migColorScheme, 3yH.A09(c2k5, 2131957590))));
                        AbG.A1R(A0p, builder);
                    }
                }
                A002.A2Y(1Fj.A01(builder));
                A002.A0R();
                A002.A0J();
                r307 = A002.A01;
            } else {
                r307 = null;
            }
        }
        2lQ r03 = 2lO.A02;
        MigColorScheme migColorScheme2 = this.A02;
        2lO A0L = 4YV.A0L(7zS.A0h(0S2.A00, 7zL.A0j(migColorScheme2.BDl()), 1), 0S2.A01, true, 1);
        C2sn A0U2 = 7zQ.A0U(r0);
        A0U2.A00(new QHM(this.A04, migColorScheme2, 2MG.A02, this.A05, 3yH.A09(A0U2, 2131957589)));
        2KD A012 = 2K3.A01(A0U2.A00, 0);
        7zM.A1O(A012, migColorScheme2);
        A012.A2x(migColorScheme2);
        C26z c26z = C26z.LEFT;
        2RH r04 = 2RH.A03;
        A012.A2D(c26z, r04.sizeRes);
        A012.A2D(C26z.RIGHT, r04.sizeRes);
        A012.A2n();
        A012.A2d();
        A012.A2z(this.A00);
        7zN.A1Q(A0U2, A012);
        return 7zM.A0l(r307, A0U2, c2k5, A0L);
    }
}

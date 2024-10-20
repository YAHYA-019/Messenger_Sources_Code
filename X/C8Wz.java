package X;

import android.content.Context;
import android.text.SpannableString;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8Wz, reason: invalid class name */
/* loaded from: 8Wz.class */
public final class C8Wz extends 1LH {
    public final 8Lp A00;
    public final 9Ir A01;
    public final MigColorScheme A02;

    public C8Wz(8Lp r302, 9Ir r303, MigColorScheme migColorScheme) {
        1BL.A1F(r303, r302);
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1i A0T = 7zU.A0T();
        1Iw r0 = c2k5.A05;
        MigColorScheme migColorScheme = this.A02;
        CQY A00 = A0T.A00(r0, migColorScheme);
        8Lp r02 = this.A00;
        if (r02.A00) {
            9hR.A00(4YV.A0I(), c2k5, A00, migColorScheme);
        } else {
            Context A0A = 7zL.A0A(r0);
            A00.A0C(2131956460);
            boolean A1X = 1BK.A1X(r02.A03, false);
            String A09 = 3yH.A09(c2k5, 2131956462);
            AKV akv = new AKV(3, this, A1X);
            boolean z = r02.A01;
            if (z) {
                akv = null;
            }
            boolean z2 = !z;
            C5ww c5ww = C5ww.A00;
            if (akv != null) {
                c5ww = C9ye.A01(akv, 46);
            }
            CQY.A02(A00, c5ww, (55E) null, "", A09, 0L, z2, A1X);
            SpannableString A002 = 9C7.A00(4YU.A0C(A0A), new 8C0(this, AQo.A01(this, 14), 5), 3yH.A09(c2k5, 2131956484), 3yH.A09(c2k5, 2131956480), "[[learn-more-backups]]");
            int i = 9GF.A00;
            int i2 = 9GF.A01;
            LightColorScheme.A00();
            A00.A0L(new C55g(C1u7.A0A, migColorScheme, 2KE.A04, A002, i, i2, i2, -1, true));
            String A092 = 3yH.A09(c2k5, 2131956498);
            AQo A01 = AQo.A01(this, 15);
            if (z) {
                A01 = null;
            }
            9hR r03 = new 9hR();
            r03.A05 = A092;
            if (A01 != null) {
                r03.A00 = C9ye.A01(A01, 45);
            }
            A00.A0F(r03.A01());
        }
        C8m6 A093 = A00.A09();
        11T.A0A(A093);
        return A093;
    }
}

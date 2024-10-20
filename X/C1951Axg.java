package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.Axg, reason: case insensitive filesystem */
/* loaded from: Axg.class */
public final class C1951Axg extends 1LH {
    public final C5ww A00;
    public final MigColorScheme A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C1951Axg(C5ww c5ww, MigColorScheme migColorScheme, String str, boolean z, boolean z2, boolean z3) {
        11T.A0F(str, 2);
        this.A01 = migColorScheme;
        this.A02 = str;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A00 = c5ww;
    }

    public 1LI A0s(C2k5 c2k5) {
        String obj;
        11T.A0F(c2k5, 0);
        C1i A0T = 7zU.A0T();
        1Iw r0 = c2k5.A05;
        MigColorScheme migColorScheme = this.A01;
        CQY A00 = A0T.A00(r0, migColorScheme);
        String A09 = 3yH.A09(c2k5, 2131967061);
        C5ww c5ww = this.A00;
        c5ww.getClass();
        boolean z = this.A05;
        CQY.A03(A00, c5ww, "", A09, z);
        int i = 9GF.A00;
        int i2 = 9GF.A01;
        LightColorScheme.A00();
        if (z) {
            obj = 3yH.A0A(c2k5, this.A02, 2131967060);
        } else {
            String str = this.A02;
            StringBuilder sb = new StringBuilder(3yH.A0A(c2k5, str, 2131967059));
            if (this.A04 && this.A03) {
                sb.append(3yH.A0A(c2k5, str, 2131967058));
            }
            obj = sb.toString();
            11T.A0D(obj);
        }
        A00.A0L(7zV.A0R(migColorScheme, obj, i, i2, true));
        return A00.A09();
    }
}

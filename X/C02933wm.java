package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.3wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wm.class */
public final class C02933wm extends C1rj {
    public MigColorScheme A00;

    public C02933wm() {
        super("NewConnectionBadgeComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A00;
        11T.A0F(r302, 0);
        11T.A0F(migColorScheme, 1);
        2KD A01 = 2K3.A01(r302, 0);
        A01.A2y(2KE.A05);
        A01.A2x(migColorScheme);
        A01.A2w(C1u7.A0D);
        A01.A2r(2131962079);
        Context context = r302.A0D;
        11T.A0A(context);
        int A00 = C0A8.A00(context, 4.0f);
        int i = 855638016;
        if (0AT.A02(migColorScheme.BDl())) {
            i = 1476395007;
        }
        A01.A0D(C2cn.A02(A00, i));
        A01.A25(C26z.HORIZONTAL, 2RH.A07.A00());
        return A01.A2W();
    }
}

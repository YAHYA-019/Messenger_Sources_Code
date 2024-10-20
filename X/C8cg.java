package X;

import android.graphics.drawable.Drawable;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8cg, reason: invalid class name */
/* loaded from: 8cg.class */
public final class C8cg extends 1LH {
    public final Drawable A00;
    public final C2iw A01;
    public final C9Ig A02;
    public final MigColorScheme A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C8cg(Drawable drawable, C2iw c2iw, C9Ig c9Ig, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3) {
        4YV.A1M(c9Ig, 2, c2iw);
        this.A03 = migColorScheme;
        this.A02 = c9Ig;
        this.A00 = drawable;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A01 = c2iw;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        MigColorScheme migColorScheme = this.A03;
        2MG r306 = this.A05 ? 2MG.A02 : 2MG.A03;
        1Iw AeS = c2k5.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, false);
        C9zj.A04(A0l, this, 52);
        A0l.A2c(r306);
        7zM.A1W(migColorScheme, A0l);
        C5yv A2V = A0l.A2V();
        AVJ A01 = AVJ.A01(this, 23);
        C1ro c1ro = C1ro.FLEX_END;
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A0G, 4YV.A06(2RH.A05));
        C2sn A0U = 7zQ.A0U(AeS);
        8TX A00 = C8nl.A00(A0U.A00);
        A00.A2Z(migColorScheme);
        A00.A0L();
        A00.A2X(2131963859);
        C9py.A05(A0U, A00, this, ActionId.DATA_LOAD_START);
        return C9dC.A00(A2V, C2so.A08(A0U, c2k5, A0g, c1ro), c2k5, migColorScheme, A01);
    }
}

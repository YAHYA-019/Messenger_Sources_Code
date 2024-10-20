package X;

import android.graphics.drawable.Drawable;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8e0, reason: invalid class name */
/* loaded from: 8e0.class */
public final class C8e0 extends 1LH {
    public final Drawable A00;
    public final C2iw A01;
    public final C9Ik A02;
    public final 99W A03;
    public final MigColorScheme A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C8e0(Drawable drawable, C2iw c2iw, C9Ik c9Ik, 99W r305, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        11T.A0F(c2iw, 7);
        this.A04 = migColorScheme;
        this.A02 = c9Ik;
        this.A09 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A06 = z4;
        this.A01 = c2iw;
        this.A00 = drawable;
        this.A08 = z5;
        this.A03 = r305;
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        11T.A0F(c2k5, 0);
        MigColorScheme migColorScheme = this.A04;
        1Iw AeS = c2k5.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, false);
        C9zj.A04(A0l, this, 56);
        A0l.A2c(this.A06 ? 2MG.A02 : 2MG.A06);
        7zM.A1W(migColorScheme, A0l);
        if (this.A08) {
            C9lC A00 = C9lC.A00();
            C9lC.A01(A00, c2k5, 2131964245);
            A00.A01 = migColorScheme;
            9zQ.A02(A0l, A00, this, 12);
        }
        C5yv A2V = A0l.A2V();
        AVJ A01 = AVJ.A01(this, 27);
        C1ro c1ro = C1ro.FLEX_END;
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A0G, 4YV.A06(2RH.A03));
        C2sn A0U = 7zQ.A0U(AeS);
        8TX A002 = C8nl.A00(A0U.A00);
        A002.A2b(!this.A07);
        A002.A2Z(migColorScheme);
        A002.A0L();
        99W r02 = this.A03;
        if (11T.A0O(r02, C8tS.A00)) {
            i = 2131964537;
        } else if (11T.A0O(r02, 8tT.A00)) {
            i = 2131964538;
        } else if (11T.A0O(r02, 8tU.A00)) {
            i = 2131964540;
        } else {
            if (!(r02 instanceof C8tR)) {
                throw 1BK.A1F();
            }
            i = 2131964539;
        }
        A002.A2X(i);
        C9py.A05(A0U, A002, this, ActionId.ABORTED);
        return C9dC.A00(A2V, C2so.A08(A0U, c2k5, A0g, c1ro), c2k5, migColorScheme, A01);
    }
}

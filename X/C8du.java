package X;

import android.view.ActionMode;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8du, reason: invalid class name */
/* loaded from: 8du.class */
public final class C8du extends 1LH {
    public final Function1 A00;
    public final A5D A01;
    public final AaC A02;
    public final C77n A03;
    public final 6RU A04;
    public final C77v A05;
    public final 6wU A06;
    public final C6xp A07;
    public final boolean A08;

    public C8du(A5D a5d, AaC aaC, C77n c77n, 6RU r305, C77v c77v, 6wU r307, C6xp c6xp, Function1 function1, boolean z) {
        1BL.A11(1, r305, r307, c77v);
        11T.A0F(a5d, 6);
        this.A04 = r305;
        this.A03 = c77n;
        this.A06 = r307;
        this.A05 = c77v;
        this.A07 = c6xp;
        this.A01 = a5d;
        this.A00 = function1;
        this.A02 = aaC;
        this.A08 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        8bG r314;
        11T.A0F(c2k5, 0);
        1BV A00 = 1BV.A00(66725);
        1Iw r0 = c2k5.A05;
        final 6RU r02 = this.A04;
        6wU r03 = this.A06;
        C77v c77v = this.A05;
        final C6xp c6xp = this.A07;
        3vS A0U = 7zO.A0U(AVG.A01(this, 39));
        String str = (String) this.A01.A02.getValue();
        if (this.A08 || (((2TI) A00.get()).A03() && !c77v.A03)) {
            final C77n c77n = this.A03;
            final AaC aaC = this.A02;
            r314 = new 1LH(aaC, c77n, r02, c6xp) { // from class: X.8a2
                public final AaC A00;
                public final C77n A01;
                public final 6RU A02;
                public final C6xp A03;

                {
                    1BL.A1H(r02, c77n, c6xp);
                    this.A02 = r02;
                    this.A01 = c77n;
                    this.A03 = c6xp;
                    this.A00 = aaC;
                }

                public 1LI A0s(C2k5 c2k52) {
                    C1u2 A0G = 7zS.A0G(c2k52, 0);
                    2lQ r04 = 2lO.A02;
                    2lO A0g = 7zL.A0g((2lO) null, C82m.A09(0S2.A01, 0));
                    C2sn A0L = 7zR.A0L(c2k52);
                    C2cm A0I = 7zL.A0I(A0L);
                    7zN.A18(A0I, C1u3.A2g, A0G);
                    A0I.A2X(this.A03.A03.A00(0S2.A0K));
                    A0I.A18(2.0f);
                    7zR.A1A(A0I, AVG.A01(this, 37));
                    7zO.A19(A0I, A0L);
                    return C2so.A07(A0L, c2k52, A0g);
                }
            };
        } else {
            r314 = new 8bG(r02, c77v, c6xp, AVG.A01(this, 40), false);
        }
        return new 7Ex((ActionMode.Callback) null, (ActionMode.Callback) null, (1LI) null, r314, (1LI) null, r0, A0U, r02, c77v, r03, c6xp, str, (String) null, 0, 2132279327, 2132279327, 2132279325, 0, 0, 33324672, false, false, false);
    }
}

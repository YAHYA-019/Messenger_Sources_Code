package X;

import com.facebook.common.util.TriState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Axm, reason: case insensitive filesystem */
/* loaded from: Axm.class */
public final class C1957Axm extends 1LH {
    public final BkE A00;
    public final TriState A01;
    public final TriState A02;
    public final 2Dp A03;
    public final MigColorScheme A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C1957Axm(TriState triState, TriState triState2, 2Dp r304, BkE bkE, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3) {
        this.A04 = migColorScheme;
        this.A03 = r304;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A01 = triState;
        this.A02 = triState2;
        this.A00 = bkE;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1i A0T = 7zU.A0T();
        1Iw r0 = c2k5.A05;
        MigColorScheme migColorScheme = this.A04;
        CQY A00 = A0T.A00(r0, migColorScheme);
        A00.A0L(new 56U(this.A03, migColorScheme, this.A06));
        int i = 2131953127;
        if (this.A05) {
            i = 2131953128;
        }
        CQY.A06(A00, 3yH.A09(c2k5, i), this, 12);
        if (this.A07) {
            CQY.A06(A00, 3yH.A09(c2k5, 2131953133), this, 13);
        }
        TriState triState = this.A01;
        if (triState.isSet()) {
            A00.A0K(Cvn.A00(this, 14), 3yH.A09(c2k5, 2131953126), triState.asBoolean());
            A00.A0B(2131953125);
        }
        TriState triState2 = this.A02;
        if (triState2.isSet()) {
            A00.A0K(Cvn.A00(this, 15), 3yH.A09(c2k5, 2131953131), triState2.asBoolean());
            A00.A0B(2131953130);
        }
        return CQY.A00(A00);
    }
}

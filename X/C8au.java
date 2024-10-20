package X;

import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8au, reason: invalid class name */
/* loaded from: 8au.class */
public final class C8au extends 1LH {
    public final View.OnClickListener A00;
    public final MigColorScheme A01;
    public final C5xv A02;
    public final int A03;
    public final int A04;

    public C8au(View.OnClickListener onClickListener, MigColorScheme migColorScheme, C5xv c5xv, int i, int i2) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A03 = i;
        this.A04 = i2;
        this.A00 = onClickListener;
        this.A02 = c5xv;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0R = 7zT.A0R(7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1)), 9221401712017801216L | this.A04, this.A03 | 9221401712017801216L);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0b = 7zN.A0b(AeS, A1W);
        A0b.A2X();
        A0b.A2b(migColorScheme);
        A0b.A2d(this.A02);
        A0b.A2i(A1W);
        7zN.A1R(A0L, A0b);
        return 8Tn.A06(A0L, c2k5, A0R, 8Tn.A08(AeS, new 8NJ(C9py.A02(3yH.A09(A0L, 2131959420), this, ActionId.MESSENGER_DELTA_REQUEST), C8xf.A00(2132411109), (CharSequence) null, (CharSequence) null, 3yH.A09(A0L, 2131959427), 7zN.A0v(8Ll.A01(C1u3.A4t, 3yH.A09(A0L, 2131959422), 3yH.A09(A0L, 2131959421), (String) null, 8), 8Ll.A01(C1u3.A39, 3yH.A09(A0L, 2131959426), 3yH.A09(A0L, 2131959425), (String) null, 8), 8Ll.A01(C1u3.A5l, 3yH.A09(A0L, 2131959424), 3yH.A09(A0L, 2131959423), (String) null, 8)), true), migColorScheme));
    }
}

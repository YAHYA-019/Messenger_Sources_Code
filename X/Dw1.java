package X;

import android.graphics.Color;
import com.facebook.acra.constants.ActionId;

/* loaded from: Dw1.class */
public final class Dw1 extends 1LH {
    public final String A00;
    public final boolean A01;

    public Dw1(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public static final void A01(C2k6 c2k6, Dw1 dw1, F99 f99, C00m c00m) {
        f99.A02(7zP.A0L(c2k6), dw1.A00, c00m, new G9M(2, f99, dw1, c2k6, c00m));
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1ro c1ro = C1ro.STRETCH;
        C1rp c1rp = C1rp.CENTER;
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        C2lh A00 = C2lc.A00(c2k5, GAA.A00);
        1Iw r0 = A0U.A00;
        Object A0A = r0.A0A(F99.class);
        if (A0A == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Object A0A2 = r0.A0A(F76.class);
        if (A0A2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String A09 = 3yH.A09(A0U, 2131955230);
        EL7 el7 = EL7.A02;
        Integer num = 0S2.A01;
        Integer num2 = 0S2.A00;
        boolean z = this.A01;
        A0U.A00(new Dvu(ERD.A01, new F9j(MfW.A0K, new EIt(Color.rgb(0, 100, 224), Color.rgb(69, ActionId.APPLY_FINISHED_LIST, 254))), el7, 7zP.A1V(A00) ? new EIu(3yH.A09(A0U, 2131953678)) : EIv.A00, A09, num, num2, new AKs(31, A0A2, A0A, A00, A0U, this), z));
        return new 2cL((C1ro) null, c1ro, c1rp, (EnumC00743oh) null, A0U.A01, false);
    }
}

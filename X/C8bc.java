package X;

import com.facebook.acra.constants.ActionId;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8bc, reason: invalid class name */
/* loaded from: 8bc.class */
public final class C8bc extends 1LH {
    public final Function1 A00;
    public final boolean A01;
    public final 2lO A02;
    public final EJX A03;
    public final EMg A04;

    public C8bc(2lO r302, EJX ejx, EMg eMg, Function1 function1, boolean z) {
        7zT.A1T(ejx, eMg, function1);
        this.A03 = ejx;
        this.A04 = eMg;
        this.A01 = z;
        this.A00 = function1;
        this.A02 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        EJX ejx = this.A03;
        GDs gDs = ejx.A00;
        if (gDs instanceof ACM) {
            final 2lO r0 = this.A02;
            final G9D g9d = new G9D(this, 17);
            return new 1LH(r0, g9d) { // from class: X.8Wb
                public final 2lO A00;
                public final C00m A01;

                {
                    11T.A0F(r0, 2);
                    this.A00 = r0;
                    this.A01 = g9d;
                }

                public 1LI A0s(C2k5 c2k52) {
                    11T.A0F(c2k52, 0);
                    2lO r305 = this.A00;
                    long A0A = 7zP.A0A();
                    Integer num = 0S2.A06;
                    C02963wp A0i = 7zL.A0i(num, A0A);
                    if (r305 == 2lO.A02) {
                        r305 = null;
                    }
                    2lO A0g = 7zL.A0g(r305, A0i);
                    C2sn A0L = 7zR.A0L(c2k52);
                    String A09 = 3yH.A09(A0L, 2131960227);
                    Integer num2 = 0S2.A03;
                    C97i c97i = C97i.A0i;
                    A0L.A00(new Dw8(7zS.A0Z((2lO) null, num, 2.0d), null, c97i, A09, num2, 1, ActionId.MISSED_EVENT));
                    C00m c00m = this.A01;
                    if (c00m != null) {
                        A0L.A00(new Dw8(7zR.A0R(7zS.A0Z((2lO) null, num, 8.0d), new GBr(c00m, 5), 1), null, c97i, 3yH.A09(A0L, 2131960214), 0S2.A0B, 0, ActionId.VIDEO_SET_RENDERER_CONTEXT));
                    }
                    return C2so.A06(A0L, c2k52, A0g);
                }
            };
        }
        boolean z = this.A01;
        2kG r02 = (2kG) 2rO.A00(c2k5, new G9D(this, 20), 4YU.A1b(z));
        List list = (List) 2rO.A00(c2k5, new G9J(31, gDs, c2k5, this), new Object[]{gDs});
        EMg eMg = this.A04;
        String A09 = 3yH.A09(c2k5, 2131960217);
        boolean z2 = ejx.A01;
        return new C8i5(r02, this.A02, z ? C95w.A04 : C95w.A02, eMg, A09, list, new G9D(this, 18), new G9D(this, 19), new GBr(this, 2), new GBr(this, 3), null, new GBr(this, 4), null, new GBs(this, 30), null, (-1) << (-1), false, false, z2);
    }
}

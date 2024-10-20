package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: Dup.class */
public final class Dup extends 1LH {
    public final Emx A00;

    public Dup(Emx emx) {
        this.A00 = emx;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, GA8.A00);
        C2lh A002 = C2lc.A00(c2k5, GA9.A00);
        C2lh A003 = C2lc.A00(c2k5, GA7.A00);
        AKK akk = new AKK(A003, 4);
        AKK akk2 = new AKK(A003, 5);
        F76 f76 = (F76) 2rO.A00(c2k5, new AKK(this, 2), new Object[0]);
        List list = (List) 2rO.A00(c2k5, new G9G(this, f76, 14), new Object[0]);
        boolean A1V = AnonymousClass001.A1V(2rO.A00(c2k5, new AKK(list, 3), new Object[0]));
        F99 f99 = (F99) 2rO.A00(c2k5, new AKs(30, A00, f76, A002, c2k5, this), new Object[0]);
        C01i c01i = FGU.A00;
        Drawable A004 = EZ3.A00(c2k5, new AKU(2132344962, 10, c2k5), AnonymousClass001.A1a(2132344962));
        C3bp A01 = F1p.A01(c2k5, new G9R(c2k5, this, f76, f99, akk2, akk, A1V));
        if (7zP.A1V(A00)) {
            return 7zL.A0Y();
        }
        03Y[] A1b = 7zO.A1b(F76.class, f76, 1BK.A1G(F99.class, f99));
        2lQ r0 = 2lO.A02;
        return new 7J5(EWB.A00(c2k5, 7zL.A0g((2lO) null, new 2lT(0S2.A01, 1.0f)), new GBv(A004, A002, A003, A01, this, f99, list, akk2, akk, A1V)), A1b, (03Y[]) null);
    }
}

package X;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: Duu.class */
public final class Duu extends 1LH {
    public final EcX A00;
    public final EcY A01;

    public Duu(EcX ecX, EcY ecY) {
        11T.A0F(ecY, 2);
        this.A00 = ecX;
        this.A01 = ecY;
    }

    public 1LI A0s(C2k5 c2k5) {
        QFe c8ej;
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, SGn.A00);
        F7y f7y = (F7y) A00.A02;
        if (f7y != null) {
            c8ej = new QFe(f7y, new J8q(A00, 49));
        } else {
            long A08 = 7zP.A08();
            2NI r0 = C8nc.A0O;
            1Iw r02 = c2k5.A05;
            C02A c02a = r02.A03.A01;
            C1J8 c1j8 = c02a.A02;
            boolean z = c02a.A0X;
            C9bp c9bp = new C9bp();
            Collection values = this.A00.A00.values();
            for (F7y f7y2 : 0QD.A0b(values, new C0qw(new Function1[]{SIW.A00, SIX.A00}, 0)).subList(0, Math.min(5, values.size()))) {
                c9bp.A00(new DvS(f7y2, new JR6(this, f7y2, 28), new JR6(A00, f7y2, 29)), Integer.valueOf(f7y2.A00.BHz()), false);
            }
            c8ej = new C8ej(r0, null, null, null, null, C9mj.A03(r02, c1j8, 7zN.A03(c2k5, A08), z), c9bp, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
        }
        return (1LI) c8ej;
    }
}

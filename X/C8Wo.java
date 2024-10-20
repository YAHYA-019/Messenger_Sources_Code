package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Wo, reason: invalid class name */
/* loaded from: 8Wo.class */
public final class C8Wo extends 1LH {
    public final int A00;
    public final MigColorScheme A01;
    public final List A02;

    public C8Wo(MigColorScheme migColorScheme, List list, int i) {
        this.A01 = migColorScheme;
        this.A00 = i;
        this.A02 = list;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        List<9S7> list = this.A02;
        ArrayList A0z = 1BL.A0z(list);
        for (9S7 r0 : list) {
            C6c2 A00 = C6c1.A00(c2k5.A05);
            A00.A2Y(8.0f);
            7zO.A1K(A00, 2RH.A07);
            int i = r0.A01;
            int i2 = this.A00;
            MigColorScheme migColorScheme = this.A01;
            A00.A2Z(i == i2 ? migColorScheme.AZc() : migColorScheme.AZd());
            A0z.add(A00.A2V());
        }
        2lQ r02 = 2lO.A02;
        2lO A0S = 7zR.A0S(7zS.A0g(0S2.A05, 4YV.A06(2RH.A03)), C1ro.CENTER, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        Iterator it = A0z.iterator();
        while (it.hasNext()) {
            A0L.A00((1LI) it.next());
        }
        return C2so.A0I(A0L, c2k5, A0S);
    }
}

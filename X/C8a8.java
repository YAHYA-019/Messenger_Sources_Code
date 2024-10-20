package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8a8, reason: invalid class name */
/* loaded from: 8a8.class */
public final class C8a8 extends 1LH {
    public final int A00;
    public final 2Of A01;
    public final C79a A02;
    public final String A03;

    public C8a8(2Of r302, C79a c79a, String str, int i) {
        7zT.A1U(str, r302, c79a);
        this.A00 = i;
        this.A03 = str;
        this.A01 = r302;
        this.A02 = c79a;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        List list = (List) AQY.A00(c2k5, this, new Object[0], 15);
        C79j c79j = (C79j) AQf.A00(c2k5, this, AnonymousClass001.A1a(this.A00), 42);
        1Iw r0 = c2k5.A05;
        C1qb c1qb = new C1qb(r0);
        C5j5 c5j5 = C5j5.A00;
        long A0A = 7zP.A0A();
        8Dm A01 = C9d1.A01(c2k5, null, 7zL.A0w(A0A), 7zL.A0w(A0A), null);
        long A08 = 7zP.A08();
        2NI r02 = C8nc.A0O;
        C02A c02a = r0.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A00 = C9sn.A00(r0);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return new C8ej(r02, A01, null, null, null, C9mj.A04(r0, c1j8, 7zN.A03(c2k5, A08), z), A00.A01, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, true);
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            String str = 7zM.A16(next).A09;
            11T.A0D(c5j5);
            2lQ r03 = 2lO.A02;
            2lO A0R = 7zT.A0R(4YV.A0L((2lO) null, 0S2.A0C, false, 1), 7zP.A0G(), 7zQ.A07());
            C9sn.A01(7zN.A0N(7Gg.A00(c1qb, c5j5, (5vW) list.get(i2), c79j, list, i2), 7zQ.A0U(A00.A00), A00, A0R), A00, str);
            i = i3;
        }
    }
}

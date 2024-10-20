package X;

import java.util.List;

/* renamed from: X.8fx, reason: invalid class name */
/* loaded from: 8fx.class */
public final class C8fx extends 1LH {
    public static final long A03 = 7zO.A0A();
    public static final List A04 = C0s8.A14("Happy Birthday", "Happy Bday!", "HBD!!");
    public final 2Of A00;
    public final List A01;
    public final boolean A02;

    public C8fx(2Of r302, List list, boolean z) {
        1BL.A1F(r302, list);
        this.A00 = r302;
        this.A01 = list;
        this.A02 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        C2sn A0U = 7zQ.A0U(7zL.A0X(c2k5));
        8Dm A01 = C9d1.A01(A0U, 7zL.A0w(7zQ.A08()), null, null, null);
        int i = 0;
        Boolean valueOf = Boolean.valueOf(this.A02);
        long A08 = 7zP.A08();
        2NI r0 = C8nc.A0O;
        1Iw r02 = A0U.A00;
        C02A c02a = r02.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A00 = C9sn.A00(r02);
        List list = this.A01;
        if (list.isEmpty()) {
            list = A04;
        }
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            String str = (String) obj;
            1Br A012 = 1Bu.A01(3vP.A00(A00), 16979);
            2lQ r03 = 2lO.A02;
            2lO A0P = 7zS.A0P((2lO) null, 2.0d);
            C2sn A0U2 = 7zQ.A0U(A00.A00);
            C5Ax A002 = 5Av.A00(A0U2.A00);
            A002.A2i(str);
            C00i c00i = A012.A00;
            A002.A2e(7zM.A11(c00i).B4i());
            int Abp = 7zM.A11(c00i).Abp();
            long j = A03;
            A002.A2f(C2cn.A02(7zO.A01(A0U2, j), Abp));
            A002.A2j(true);
            5Av r04 = A002.A01;
            r04.A0A = 7zL.A04(A002, 8.0f);
            A002.A2a(14.0f);
            A002.A0w(1.0f);
            r04.A00 = 7zO.A04(A0U2, j);
            r04.A0E = new C9px(this, str, i);
            C9sn.A01(7zM.A0l(A002.A2V(), A0U2, A00, A0P), A00, Integer.valueOf(i));
            i = i2;
        }
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, 7zL.A16(new C8ej(r0, A01, null, null, null, C9mj.A04(r02, c1j8, 7zN.A03(A0U, A08), z), A00.A01, null, null, null, null, null, null, null, false, false, valueOf, null, null, null, null, null, null, true), A0U), false);
    }
}

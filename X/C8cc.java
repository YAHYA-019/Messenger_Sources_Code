package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8cc, reason: invalid class name */
/* loaded from: 8cc.class */
public final class C8cc extends 1LH {
    public final Function2 A00;
    public final 8La A01;
    public final MigColorScheme A02;
    public final C00m A03;
    public final C00m A04;
    public final C00m A05;
    public final C00m A06;

    public C8cc(8La r302, MigColorScheme migColorScheme, C00m c00m, C00m c00m2, C00m c00m3, C00m c00m4, Function2 function2) {
        11T.A0F(r302, 2);
        this.A02 = migColorScheme;
        this.A01 = r302;
        this.A00 = function2;
        this.A06 = c00m;
        this.A04 = c00m2;
        this.A05 = c00m3;
        this.A03 = c00m4;
    }

    public 1LI A0s(C2k5 c2k5) {
        ArrayList A0z = 7zO.A0z(c2k5, 0);
        final 8La r0 = this.A01;
        Integer num = r0.A01;
        boolean A1W = AnonymousClass001.A1W(r0.A00, 0S2.A01);
        final MigColorScheme migColorScheme = this.A02;
        C00m c00m = this.A03;
        C00m c00m2 = this.A05;
        List list = r0.A04;
        boolean A1Y = 1BK.A1Y(list);
        boolean z = r0.A06;
        int size = list.size();
        Set set = r0.A05;
        boolean A1Q = AnonymousClass001.A1Q(size, set.size());
        A0z.add(new C1964Axt(migColorScheme, num, c00m, c00m2, this.A04, this.A06, set.size(), A1W, A1Y, z, A1Q));
        final AVM avm = new AVM(this, 39);
        A0z.add(new 1LH(r0, migColorScheme, avm) { // from class: X.8Wj
            public final 8La A00;
            public final MigColorScheme A01;
            public final Function2 A02;

            {
                11T.A0F(migColorScheme, 1);
                this.A01 = migColorScheme;
                this.A00 = r0;
                this.A02 = avm;
            }

            public 1LI A0s(C2k5 c2k52) {
                8UD r304;
                11T.A0F(c2k52, 0);
                8La r02 = this.A00;
                Integer num2 = r02.A00;
                if (num2 == 0S2.A00 || num2 == 0S2.A0N) {
                    2lQ r03 = 2lO.A02;
                    Integer num3 = 0S2.A01;
                    2lO A04 = C82m.A04(7zQ.A0X((2lO) null, num3, 1.0f), num3, 50.0f, 0);
                    C2sn A0L = 7zR.A0L(c2k52);
                    8Tj.A07(A0L, 7zL.A0q(A0L), this.A01);
                    return C2so.A06(A0L, c2k52, A04);
                }
                C2sn A0L2 = 7zR.A0L(c2k52);
                List list2 = r02.A04;
                boolean isEmpty = list2.isEmpty();
                MigColorScheme migColorScheme2 = this.A01;
                if (isEmpty) {
                    r304 = new 8UD(migColorScheme2);
                } else {
                    A0L2.A00(new 8UC(migColorScheme2));
                    r304 = new 8Yp(r02, migColorScheme2, list2, this.A02);
                }
                return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, 7zL.A16(r304, A0L2), false);
            }
        });
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0z, false);
    }
}

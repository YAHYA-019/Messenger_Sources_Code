package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.93p, reason: invalid class name */
/* loaded from: 93p.class */
public final class C93p extends 2pB {
    public final MigColorScheme A00;

    public C93p(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    public 1LI A00(1LI r302, 1Iw r303, C2m6 c2m6, Object obj) {
        boolean A1X = 1BL.A1X(r303, r302);
        11T.A0F(c2m6, 3);
        2oT r0 = (2oT) c2m6;
        2oO r02 = (2oO) r0.A01.A00(2oO.A01);
        if (r02 != null) {
            String str = r02.A00;
            if (r0.A00.A1A() && str.length() != 0) {
                C2p8 A00 = C2p6.A00(r0.A04 ? 0S2.A0N : 0S2.A01);
                C1rq A002 = C1rg.A00(r303);
                QBx qBx = new QBx(r303, new 8jW());
                MigColorScheme migColorScheme = this.A00;
                8jW r03 = qBx.A01;
                r03.A01 = migColorScheme;
                BitSet bitSet = qBx.A02;
                bitSet.set(0);
                r03.A03 = str;
                bitSet.set(A1X ? 1 : 0);
                2KE r04 = A00.A07;
                r03.A02 = r04;
                bitSet.set(3);
                C1u7 c1u7 = A00.A03;
                r03.A00 = c1u7;
                bitSet.set(2);
                qBx.A0q(50.0f);
                7zP.A14(qBx, r03, A002, bitSet, qBx.A03);
                2KD A01 = 2K3.A01(r303, 0);
                A01.A32(A1X);
                A01.A2z(" · ");
                A01.A2y(r04);
                7zU.A1R(c1u7, migColorScheme, A01, A1X ? 1 : 0);
                7zN.A1T(A002, A01);
                return 7zL.A0d(r302, A002);
            }
        }
        return r302;
    }
}

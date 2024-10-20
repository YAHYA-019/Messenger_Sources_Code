package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8cf, reason: invalid class name */
/* loaded from: 8cf.class */
public final class C8cf extends 1LH {
    public final int A00;
    public final int A01;
    public final 06Z A02;
    public final FbUserSession A03;
    public final 8KL A04;
    public final MigColorScheme A05;
    public final String A06;

    public C8cf(06Z r302, FbUserSession fbUserSession, 8KL r304, MigColorScheme migColorScheme, String str, int i, int i2) {
        11T.A0F(migColorScheme, 1);
        4YV.A1M(fbUserSession, 6, r302);
        this.A05 = migColorScheme;
        this.A04 = r304;
        this.A06 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = fbUserSession;
        this.A02 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        float f;
        MigColorScheme migColorScheme;
        QI6 qgj;
        QAL qal;
        11T.A0F(c2k5, 0);
        8KL r0 = this.A04;
        Integer num = r0.A02;
        int intValue = num.intValue();
        if (intValue == 0) {
            f = 0.6666667f;
        } else if (intValue == 1) {
            f = 1.0f;
        } else {
            if (intValue != 2) {
                throw 1BK.A1F();
            }
            f = 1.3333334f;
        }
        int i = this.A01;
        int A01 = 0KF.A01(i * f);
        int intValue2 = r0.A04.intValue();
        if (intValue2 == 0) {
            migColorScheme = this.A05;
            qgj = new QGJ(migColorScheme, this.A00);
        } else if (intValue2 == 1) {
            migColorScheme = this.A05;
            List list = r0.A0C;
            qgj = new QIF(migColorScheme, num, r0.A03, r0.A05, (list == null || (qal = (QAL) 0QD.A0E(list)) == null) ? null : qal.A02, r0.A07, r0.A06, r0.A09);
        } else if (intValue2 == 2) {
            migColorScheme = this.A05;
            qgj = new QHQ(migColorScheme, num, r0.A03, r0.A05, r0.A07, r0.A06, r0.A09);
        } else {
            if (intValue2 != 3) {
                throw 1BK.A1F();
            }
            migColorScheme = this.A05;
            List list2 = r0.A0C;
            if (list2 == null) {
                list2 = C0ty.A00;
            }
            qgj = new QI6(migColorScheme, r0.A03, r0.A05, r0.A07, r0.A06, list2, i, A01);
        }
        8Tm A00 = C8mf.A00(c2k5.A05);
        8Tm.A09(A00, migColorScheme);
        A00.A2Z(18.0f);
        A00.A0C(i);
        A00.A1L(A01);
        7zR.A1A(A00, new AR7(c2k5, this, 11));
        A00.A2g(qgj);
        return A00.A2W();
    }
}

package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.59b, reason: invalid class name */
/* loaded from: 59b.class */
public final class C59b implements 59X {
    public /* bridge */ /* synthetic */ 1LI AK1(1Iw r302, AnonymousClass556 anonymousClass556) {
        C59c c59c = (C59c) anonymousClass556;
        final Integer num = c59c.A01;
        if (num != null) {
            final MigColorScheme migColorScheme = c59c.A00;
            return new 1LH(migColorScheme, num) { // from class: X.8W9
                public final MigColorScheme A00;
                public final Integer A01;

                {
                    11T.A0F(migColorScheme, 1);
                    this.A00 = migColorScheme;
                    this.A01 = num;
                }

                public 1LI A0s(C2k5 c2k5) {
                    7zM.A1Z(c2k5);
                    2lO A0i = 7zT.A0i((2lO) null, 0S2.A00, 7zP.A0A());
                    C2sn A0L = 7zR.A0L(c2k5);
                    C6c2 A00 = C6c1.A00(A0L.A00);
                    A00.A2Z(this.A00.AZc());
                    A00.A2Y(this.A01 != null ? r0.intValue() : 14);
                    A0L.A00(A00.A2W());
                    return C2so.A0N(A0L, c2k5, A0i);
                }
            };
        }
        final MigColorScheme migColorScheme2 = c59c.A00;
        final Integer num2 = null;
        return new 1LH(migColorScheme2, num2) { // from class: X.8W9
            public final MigColorScheme A00;
            public final Integer A01;

            {
                11T.A0F(migColorScheme2, 1);
                this.A00 = migColorScheme2;
                this.A01 = num2;
            }

            public 1LI A0s(C2k5 c2k5) {
                7zM.A1Z(c2k5);
                2lO A0i = 7zT.A0i((2lO) null, 0S2.A00, 7zP.A0A());
                C2sn A0L = 7zR.A0L(c2k5);
                C6c2 A00 = C6c1.A00(A0L.A00);
                A00.A2Z(this.A00.AZc());
                A00.A2Y(this.A01 != null ? r0.intValue() : 14);
                A0L.A00(A00.A2W());
                return C2so.A0N(A0L, c2k5, A0i);
            }
        };
    }

    public Class BDi() {
        return C59c.class;
    }
}

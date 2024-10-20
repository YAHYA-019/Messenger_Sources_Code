package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Jw, reason: invalid class name */
/* loaded from: 4Jw.class */
public final class C4Jw {
    public final List A00;

    public C4Jw(C4Ja c4Ja) {
        11T.A0F(c4Ja, 1);
        C4Jd c4Jd = c4Ja.A01;
        11T.A0F(c4Jd, 1);
        C4Jy c4Jy = new C4Jy(c4Jd);
        C4Je c4Je = c4Ja.A00;
        11T.A0F(c4Je, 1);
        C4Jy c4Jy2 = new C4Jy(c4Je);
        C4Jd c4Jd2 = c4Ja.A03;
        11T.A0F(c4Jd2, 1);
        C4Jy c4Jy3 = new C4Jy(c4Jd2);
        C4Jd c4Jd3 = c4Ja.A02;
        11T.A0F(c4Jd3, 1);
        this.A00 = C0s8.A14(c4Jy, c4Jy2, c4Jy3, new C4Jy(c4Jd3), new C4Jy(c4Jd3), new C4Jy(c4Jd3), new C4Jy(c4Jd3));
    }

    public final boolean A00(C4Kf c4Kf) {
        List list = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            C4Jy c4Jy = (C4Jy) obj;
            if (c4Jy.A01(c4Kf) && c4Jy.A02(c4Jy.A00.A00())) {
                A0s.add(obj);
            }
        }
        if (!A0s.isEmpty()) {
            4IS.A00().A02(KxE.A00, 0Pz.A0v("Work ", c4Kf.A0M, " constrained by ", 0QD.A0K(", ", "", "", A0s, C4Y9.A00, -1)));
        }
        return A0s.isEmpty();
    }
}

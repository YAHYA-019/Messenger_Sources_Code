package X;

import java.util.Locale;

/* loaded from: Duq.class */
public final class Duq extends 1LH {
    public final boolean A00;

    public Duq(boolean z) {
        this.A00 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        Object A0A = r0.A0A(F99.class);
        if (A0A == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Object A0A2 = r0.A0A(F76.class);
        if (A0A2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        C1ro c1ro = C1ro.CENTER;
        2lQ r02 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, new C2xi(0S2.A00, c1ro, 0));
        boolean z = this.A00;
        GAd gAd = new GAd(7, A0A2, A0A, c2k5);
        Integer num = 0S2.A1G;
        if (!z) {
            gAd = null;
        }
        2lO A0b = 7zS.A0b(A0g, num, gAd);
        C2sn A0U = 7zQ.A0U(r0);
        Locale locale = 4YU.A0B(3vP.A00(A0U)).getLocales().get(0);
        11T.A0D(locale);
        String displayName = locale.getDisplayName();
        11T.A0A(displayName);
        A0U.A00(new Dvj(MfW.A2B, null, ELv.A07, EM5.A07, displayName, 7zQ.A07(), 7zP.A0F()));
        04J r03 = F3h.A00;
        return C2so.A0M(A0U, c2k5, A0b);
    }
}

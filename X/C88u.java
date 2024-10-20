package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.88u, reason: invalid class name */
/* loaded from: 88u.class */
public final class C88u extends 1LH {
    public final String A00;
    public final C00m A01;
    public final boolean A02;

    public C88u(String str, C00m c00m, boolean z) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        5XA r308;
        11T.A0F(c2k5, 0);
        MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0p(c2k5, 16979);
        Object A0A = 1Bn.A0A(16453);
        String A09 = 3yH.A09(c2k5, 2131966952);
        C2lh A00 = C2lc.A00(c2k5, new AnonymousClass894(A09, 2));
        final C2lh A002 = C2lc.A00(c2k5, AnonymousClass896.A00);
        Runnable runnable = new Runnable() { // from class: X.895
            public static final String __redex_internal_original_name = "BusinessChatAnimatedTitleBarSubtitleComponent$render$animationRunnable$1";

            @Override // java.lang.Runnable
            public final void run() {
                C2lh.this.A04(AS3.A00);
            }
        };
        String str = this.A00;
        4FL.A00(c2k5, new M17(runnable, A00, A0A, this, A002, A09, 1), new Object[]{A002, str, Boolean.valueOf(this.A02)});
        Number number = (Number) A002.A02;
        if (number.intValue() == 0 || str == null || str.length() == 0) {
            r308 = null;
        } else {
            5Rn r0 = 5Rn.A02;
            5X3 A003 = C3s9.A00(r0, 0Pz.A0T("subtitle_", (number.intValue() + 1) % 2));
            C2jo c2jo = C2jm.A00;
            A003.A03(c2jo);
            A003.A02(0.0f);
            7zM.A1U(A003, 400);
            C2jo c2jo2 = C2jm.A09;
            A003.A03(c2jo2);
            Integer num = 0S2.A0N;
            A003.A05(new C5X1(num, -40.0f));
            7zM.A1U(A003, 400);
            5X3 A004 = C3s9.A00(r0, 0Pz.A0T("subtitle_", number.intValue() % 2));
            A004.A03(c2jo);
            A004.A01(0.0f);
            7zM.A1U(A004, 300);
            A004.A03(c2jo2);
            A004.A04(new C5X1(num, 40.0f));
            7zM.A1U(A004, 400);
            r308 = new 5XA(new 5X3[]{A003, A004}, 200);
        }
        5XC.A00(c2k5, r308);
        C84a c84a = new C84a(c2k5.A05, new 6oV());
        2lQ r02 = 2lO.A02;
        7zS.A1L(c84a, (2lO) null, 0S2.A00, new AeI(this, 35));
        c84a.A2Y((CharSequence) A00.A02);
        c84a.A2X(migColorScheme);
        c84a.A2L(0Pz.A0T("subtitle_", number.intValue() % 2));
        c84a.A1x(5Rn.A02);
        return c84a.A2V();
    }
}

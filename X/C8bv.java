package X;

import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8bv, reason: invalid class name */
/* loaded from: 8bv.class */
public final class C8bv extends 1LH {
    public final Drawable A00;
    public final 9IW A01;
    public final MigColorScheme A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C8bv(Drawable drawable, 9IW r303, MigColorScheme migColorScheme, String str, boolean z, boolean z2) {
        7zR.A1O(r303, str);
        this.A02 = migColorScheme;
        this.A01 = r303;
        this.A03 = str;
        this.A04 = z;
        this.A00 = drawable;
        this.A05 = z2;
    }

    public 1LI A0s(C2k5 c2k5) {
        8hT A2W;
        C1rh A0N;
        C8m4 c8m4;
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A02;
        int BDl = migColorScheme.BDl();
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, 7zL.A0j(BDl), 1));
        Integer num2 = 0S2.A01;
        2lO A0X = 7zQ.A0X(A0g, num2, 1.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C9zj.A01(A0L, migColorScheme, 7zS.A0l(AeS, migColorScheme, A1W), this, 42);
        2lO A0X2 = 7zQ.A0X((2lO) null, num2, 1.0f);
        C1ro c1ro = C1ro.CENTER;
        2lO A0L2 = 4YV.A0L(A0X2, num, c1ro, A1W ? 1 : 0);
        C2sn A0U = 7zQ.A0U(AeS);
        Dud A01 = Dzc.A01(A0U.A00);
        A01.A1y(c1ro);
        2lO A0L3 = 4YV.A0L((2lO) null, num, c1ro, A1W ? 1 : 0);
        C2sn A0J = 7zS.A0J(A0U);
        1Iw AeS2 = A0J.AeS();
        C2cq A00 = C2cp.A00(AeS2, A1W ? 1 : 0);
        A00.A2Z(7zS.A02(C9ll.A02, migColorScheme));
        A00.A0z(245.0f);
        A00.A0l(180.0f);
        7zN.A1O(A0J, A00);
        2KD A0Y = 7zN.A0Y(AeS2, A1W);
        A0Y.A1J(2131956992);
        A0Y.A2r(2131956992);
        A0Y.A2x(migColorScheme);
        A0Y.A2m();
        A0Y.A2b();
        A0Y.A17(C9Fy.A01);
        float f = C9Fy.A00;
        A0Y.A16(f);
        A0Y.A2X();
        7zN.A1Q(A0J, A0Y);
        String str = this.A03;
        if (0CU.A0O(str)) {
            A0N = null;
        } else {
            2lO A0L4 = 4YV.A0L((2lO) null, num, C1ro.STRETCH, A1W ? 1 : 0);
            long A07 = 7zL.A07(f);
            long doubleToRawLongBits = Double.doubleToRawLongBits(30.0d);
            2lO A0K = 4YV.A0K(A0L4, 0S2.A0E, A07);
            Integer num3 = 0S2.A08;
            2lO A0L5 = 4YV.A0L(7zS.A0d(4YV.A0L(7zT.A0I(4YV.A0K(A0K, num3, doubleToRawLongBits), 7zL.A02()), num, this.A00, 1), 3yH.A0A(A0J, str, 2131956990)), num3, "EncryptedBackupsFortyDigitCodeGenerationComponent-code", 1);
            C2sn A0U2 = 7zQ.A0U(AeS2);
            if (this.A05) {
                A2W = new 8hT((C2iw) null, migColorScheme, str, 3yH.A09(A0U2, 2131956991), AQv.A01(this, 35), (Function1) null, 2535);
            } else {
                8SV r0 = new 8SV(A0U2.A00, new C8nb());
                C8nb c8nb = r0.A01;
                c8nb.A06 = migColorScheme;
                r0.A02.set(A1W ? 1 : 0);
                r0.A2S(3yH.A0A(A0U2, str, 2131956990));
                r0.A2K("EncryptedBackupsFortyDigitCodeGenerationComponent-code");
                c8nb.A08 = 3yH.A09(A0U2, 2131956991);
                c8nb.A0A = A1W;
                7zR.A1A(r0, AVJ.A01(this, 1));
                c8nb.A07 = str;
                A2W = r0.A2W();
                11T.A0D(A2W);
            }
            A0U2.A00(A2W);
            A0N = C2so.A0N(A0U2, A0J, A0L5);
        }
        A0J.A00(A0N);
        2lO A0L6 = 4YV.A0L((2lO) null, num, c1ro, A1W ? 1 : 0);
        long A072 = 7zL.A07(f);
        Integer num4 = 0S2.A0E;
        2lO A0K2 = 4YV.A0K(A0L6, num4, A072);
        C2sn A0U3 = 7zQ.A0U(AeS2);
        1Iw r02 = A0U3.A00;
        2KD A012 = 2K3.A01(r02, A1W ? 1 : 0);
        A012.A2K("EncryptedBackupsFortyDigitCodeGenerationComponent-description");
        A012.A33(new Object[]{4YU.A0E(r02).getString(2131959933)}, 2131956988);
        A012.A2x(migColorScheme);
        A012.A2X();
        A012.A2n();
        A012.A2d();
        A012.A2Q(true);
        A012.A17(30.0f);
        A012.A16(f);
        7zS.A1P(A0U3, A0J, A0K2, A012);
        7zQ.A1E(7zM.A0w(C2so.A06(A0J, A0U, A0L3), A01), A0U, A0L, A0L2);
        if (this.A04) {
            8Tj A002 = C8m4.A00(AeS);
            A002.A2X(25.0f);
            A002.A2Y(migColorScheme.AZc());
            c8m4 = 8Tj.A06(A002, migColorScheme);
        } else {
            c8m4 = null;
        }
        A0L.A00(c8m4);
        2lO A0U4 = 7zT.A0U((2lO) null, 7zL.A0u(num, c1ro, A1W ? 1 : 0));
        2RH r03 = 2RH.A03;
        2lO A0Z = 7zT.A0Z(A0U4, 7zL.A0i(num4, 4YV.A06(r03)), 4YV.A06(r03));
        C2sn A0U5 = 7zQ.A0U(AeS);
        8TZ A003 = C8nr.A00(A0U5.AeS());
        A003.A2Y(2131956989);
        A003.A2a(migColorScheme);
        A003.A1y(c1ro);
        4YU.A1N(A003, 2RH.A05);
        7zR.A1A(A003, AVJ.A01(this, A1W ? 1 : 0));
        A003.A0E("EncryptedBackupsFortyDigitCodeGenerationComponent-continue");
        7zQ.A1G(A003.A2W(), A0U5, A0L, A0Z);
        return C2so.A02(A0L, c2k5, A0X);
    }
}

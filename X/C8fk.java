package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8fk, reason: invalid class name */
/* loaded from: 8fk.class */
public final class C8fk extends 1LH {
    public static final CallerContext A03 = CallerContext.A0B("MessengerThinQpBannerComponent");
    public final RJZ A00;
    public final 9VP A01;
    public final MigColorScheme A02;

    public C8fk(RJZ rjz, 9VP r303, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 2);
        this.A01 = r303;
        this.A02 = migColorScheme;
        this.A00 = rjz;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI A0K;
        1LI A0Z;
        1LI A0Z2;
        C5hr c5hr;
        8Tk A00 = C8mn.A00(7zL.A0X(c2k5));
        2lQ r0 = 2lO.A02;
        2RH r02 = 2RH.A04;
        2lO A0K2 = 4YV.A0K((2lO) null, 0S2.A06, 4YV.A06(r02));
        C2sn A0I = 7zS.A0I(c2k5);
        9VP r03 = this.A01;
        CharSequence charSequence = r03.A03;
        if (charSequence == null) {
            A0K = null;
        } else {
            Uri A0C = 7zU.A0C(charSequence.toString());
            5BH A0N = 7zO.A0N(A0I);
            C07004ik A0I2 = 7zR.A0I();
            ((C07014il) A0I2).A04 = 5BK.A06;
            C06984ii.A01(A0N, A0I2);
            7zS.A19(A0C, A0N);
            A0N.A2b(A03);
            7zO.A1L(A0N, r02);
            7zQ.A1B(A0N);
            A0N.A0T();
            A0K = 7zL.A0K(A0N);
        }
        A0I.A00(A0K);
        2lO A0Y = 7zS.A0Y((2lO) null, 0S2.A01);
        1Iw AeS = A0I.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        CharSequence charSequence2 = r03.A06;
        if (charSequence2 == null) {
            A0Z = null;
        } else {
            2KD A0a = 7zO.A0a(A0U, 0);
            7zS.A1K(A0a, (2lO) null, 0S2.A0A, 7zQ.A0A());
            A0a.A2z(charSequence2);
            7zN.A1Y(A0a);
            A0Z = 7zN.A0Z(this.A02, A0a);
        }
        A0U.A00(A0Z);
        CharSequence charSequence3 = r03.A02;
        if (charSequence3 == null) {
            A0Z2 = null;
        } else {
            2KD A0a2 = 7zO.A0a(A0U, 0);
            7zS.A1K(A0a2, (2lO) null, 0S2.A0A, 7zQ.A0A());
            7zQ.A1S(A0a2, charSequence3);
            A0Z2 = 7zN.A0Z(this.A02, A0a2);
        }
        A0U.A00(A0Z2);
        CharSequence charSequence4 = r03.A04;
        C1rh c1rh = null;
        if (charSequence4 != null) {
            C1ro c1ro = C1ro.FLEX_START;
            C2sn A0J = 7zS.A0J(A0U);
            A0J.A00(new C8di(83S.A00(this, 7), 5Aw.A02, this.A02, 2KV.A05, charSequence4, 0, 2132279311, 0, true));
            c1rh = C2so.A0S(A0J, A0U, null, c1ro);
        }
        7zQ.A1E(c1rh, A0U, A0I, A0Y);
        if (r03.A07) {
            8Tl A002 = C5hr.A00(AeS);
            8Tl.A08(A002);
            A002.A2Y(this.A02);
            A002.A0S();
            A002.A0N();
            7zO.A1H(A002, 2RH.A03);
            7zR.A1A(A002, new AR2(this, 27));
            c5hr = A002.A2W();
        } else {
            c5hr = null;
        }
        A00.A2e(7zN.A0R(c5hr, A0I, c2k5, A0K2));
        MigColorScheme migColorScheme = this.A02;
        int Abp = migColorScheme.Abp();
        C8mn c8mn = A00.A01;
        c8mn.A03 = Abp;
        8Tk.A07(A00, migColorScheme);
        A00.A2b(2132279311);
        A00.A01.A01 = 7zL.A05(A00, 2132279305);
        c8mn.A07 = migColorScheme.AYx();
        A00.A2c(0);
        return A00.A2W();
    }
}

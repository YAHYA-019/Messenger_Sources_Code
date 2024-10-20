package X;

import android.text.style.ClickableSpan;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8Wy, reason: invalid class name */
/* loaded from: 8Wy.class */
public final class C8Wy extends 1LH {
    public final ClickableSpan A00;
    public final 9Ip A01;
    public final MigColorScheme A02;

    public C8Wy(ClickableSpan clickableSpan, 9Ip r303, MigColorScheme migColorScheme) {
        this.A02 = migColorScheme;
        this.A01 = r303;
        this.A00 = clickableSpan;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        MigColorScheme migColorScheme = this.A02;
        1Iw AeS = c2k5.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, false);
        C9zj.A04(A0l, this, 62);
        A0l.A2Y();
        7zM.A1W(migColorScheme, A0l);
        C9lC A00 = C9lC.A00();
        C9lC.A01(A00, c2k5, 2131964245);
        A00.A01 = migColorScheme;
        9zQ.A02(A0l, A00, this, 15);
        C5yv A2V = A0l.A2V();
        AVJ A01 = AVJ.A01(this, 30);
        C1ro c1ro = C1ro.CENTER;
        2lQ r0 = 2lO.A02;
        2lO A0U = 7zT.A0U((2lO) null, 7zL.A0u(0S2.A00, c1ro, 0));
        2RH r02 = 2RH.A03;
        long A06 = 4YV.A06(r02);
        2lO A0Z = 7zT.A0Z(A0U, 7zN.A0T(A06), 4YV.A06(r02));
        C2sn A0U2 = 7zQ.A0U(AeS);
        1Iw AeS2 = A0U2.AeS();
        8TZ A002 = C8nr.A00(AeS2);
        A002.A2Y(2131964515);
        A002.A2a(migColorScheme);
        A002.A1y(c1ro);
        2RH r03 = 2RH.A05;
        4YU.A1N(A002, r03);
        7zO.A1N(A002, AVJ.A01(this, 28));
        A002.A0E("EncryptedBackupsResetYourRecoveryCodeComponent-enterNewRecoveryCode");
        A0U2.A00(A002.A2W());
        8TU A003 = C8nm.A00(AeS2);
        A003.A2X(2131964516);
        A003.A2Y(migColorScheme);
        A003.A1y(c1ro);
        4YU.A1N(A003, r03);
        7zO.A1N(A003, AVJ.A01(this, 29));
        A003.A0E("EncryptedBackupsResetYourRecoveryCodeComponent-cantResetRecoveryCode");
        return C9dC.A00(A2V, 7zM.A0k(A003.A2W(), A0U2, c2k5, A0Z), c2k5, migColorScheme, A01);
    }
}

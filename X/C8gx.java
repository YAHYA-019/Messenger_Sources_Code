package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8gx, reason: invalid class name */
/* loaded from: 8gx.class */
public final class C8gx extends 1LH {
    public static final CallerContext A07 = CallerContext.A0B("AiBotPickerBotItemComponent");
    public final long A00;
    public final Uri A01;
    public final C9ct A02;
    public final MigColorScheme A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C8gx(Uri uri, C9ct c9ct, MigColorScheme migColorScheme, String str, String str2, long j, boolean z) {
        1BK.A1K(migColorScheme, 1, str);
        11T.A0F(c9ct, 7);
        this.A03 = migColorScheme;
        this.A00 = j;
        this.A01 = uri;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = z;
        this.A02 = c9ct;
    }

    public 1LI A0s(C2k5 c2k5) {
        QFh qFh;
        1LI A2W;
        C2sn A0K = 7zR.A0K(7zL.A0X(c2k5));
        2RH r0 = 2RH.A05;
        2lO A0Z = 7zT.A0Z((2lO) null, 7zN.A0T(4YV.A06(r0)), 4YV.A06(2RH.A03));
        Integer num = 0S2.A00;
        2lO A0L = 4YV.A0L(C82m.A04(A0Z, num, 100.0f, 0), 0S2.A1G, AV1.A00(this, 11), 1);
        C2sn A0K2 = 7zS.A0K(A0K);
        2lO A0X = 7zQ.A0X(C82m.A04(null, num, 100.0f, 0), 0S2.A0Y, 0.82f);
        MigColorScheme migColorScheme = this.A03;
        2lO A0a = 7zS.A0a(A0X, num, migColorScheme.AYw());
        1Iw AeS = A0K2.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        AV1 A00 = AV1.A00(this, 10);
        8Tm A002 = C8mf.A00(A0U.AeS());
        8Tm.A09(A002, migColorScheme);
        A002.A2Z(18.0f);
        A002.A2g((1LI) A00.invoke(A0U));
        7zQ.A1F(A002.A2W(), A0U, A0K2, A0a);
        if (this.A06) {
            C2sn A0U2 = 7zQ.A0U(AeS);
            A0U2.A00(new QFh(migColorScheme, this.A04));
            Drawable A08 = 4YV.A0I().A08(C1u3.A0j, migColorScheme.AZc());
            C2cm A0M = 7zO.A0M(A0U2);
            A0M.A2b(A08);
            7zO.A1K(A0M, 2RH.A09);
            A0M.A0l(20.0f);
            A0M.A0z(20.0f);
            A0M.A2X(migColorScheme.AZc());
            4YU.A1N(A0M, r0);
            7zR.A17(A0M, A0U2);
            qFh = C2so.A0G(A0U2, A0K2);
        } else {
            qFh = new QFh(migColorScheme, this.A04);
        }
        A0K2.A00(qFh);
        String str = this.A05;
        if (str == null) {
            A2W = null;
        } else {
            2KD A0n = 7zQ.A0n(AeS, migColorScheme, str, 0);
            7zL.A1N(A0n);
            A0n.A2q(1);
            A0n.A2Z();
            A0n.A2d();
            A2W = A0n.A2W();
        }
        7zQ.A1E(A2W, A0K2, A0K, A0L);
        return new C1rh(null, null, null, null, A0K.A01, false);
    }
}

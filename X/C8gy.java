package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* renamed from: X.8gy, reason: invalid class name */
/* loaded from: 8gy.class */
public final class C8gy extends 1LH {
    public static final CallerContext A07 = CallerContext.A0B("AiBotPickerFeaturedItemComponent");
    public final long A00;
    public final Uri A01;
    public final C9ct A02;
    public final MigColorScheme A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    public C8gy(Uri uri, C9ct c9ct, MigColorScheme migColorScheme, Integer num, String str, String str2, long j) {
        1BK.A1K(migColorScheme, 1, str);
        11T.A0F(c9ct, 7);
        this.A03 = migColorScheme;
        this.A00 = j;
        this.A01 = uri;
        this.A06 = str;
        this.A04 = num;
        this.A05 = str2;
        this.A02 = c9ct;
    }

    public 1LI A0s(C2k5 c2k5) {
        8Tk A00 = C8mn.A00(7zL.A0X(c2k5));
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A0X = 7zQ.A0X(7zL.A0g((2lO) null, C82m.A08(num, 100.0f, 0)), 0S2.A0Y, 0.971f);
        MigColorScheme migColorScheme = this.A03;
        2lO A0L = 4YV.A0L(A0X, num, 7zL.A0j(migColorScheme.AYw()), 1);
        1Iw AeS = c2k5.AeS();
        ArrayList A0s = AnonymousClass001.A0s();
        11T.A0F(AeS, 1);
        C06974ih A0Q = 7zO.A0Q(InterfaceC07034in.A01, C06984ii.A00());
        5BH A01 = 5BG.A01(AeS);
        A01.A2X(this.A01);
        A01.A0c();
        A01.A10(100.0f);
        A01.A0m(100.0f);
        A01.A2Z(A0Q);
        A01.A2b(A07);
        A0s.add(7zO.A0O(A01));
        2KD A0X2 = 7zN.A0X(AeS, migColorScheme, 0);
        A0X2.A2z(this.A06);
        A0X2.A2f();
        A0X2.A2q(1);
        A0X2.A2Z();
        A0X2.A2e();
        A0X2.A0c();
        7zO.A1M(A0X2, 2RH.A03, C26z.ALL);
        7zQ.A1X(A0X2, A0s);
        String str = this.A05;
        if (str != null) {
            Integer num2 = this.A04;
            int intValue = num2 != null ? num2.intValue() : migColorScheme.Amk();
            2KD A012 = 2K3.A01(AeS, 0);
            A012.A10(100.0f);
            7zO.A1E(A012, 2RH.A06);
            A012.A1C(26.0f);
            A012.A0c();
            A012.A2E(C26z.BOTTOM, -1);
            A012.A2x(migColorScheme);
            A012.A1H(intValue);
            A012.A2z(str);
            A012.A2h();
            A012.A2a();
            A012.A2e();
            A012.A2q(2);
            A012.A2Z();
            7zQ.A1X(A012, A0s);
        }
        C1rh c1rh = new C1rh(null, null, null, null, A0s, false);
        7zM.A1P(c2k5.AeS(), c1rh, A0L);
        A00.A2e(c1rh);
        A00.A2X(18.0f);
        8Tk.A07(A00, migColorScheme);
        A00.A2Y(5.0f);
        7zR.A1A(A00, AV1.A00(this, 12));
        return A00.A2W();
    }
}

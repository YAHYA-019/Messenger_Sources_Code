package X;

import android.graphics.PointF;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ga, reason: invalid class name */
/* loaded from: 8ga.class */
public final class C8ga extends 1LH {
    public static final CallerContext A05 = CallerContext.A0B("MemoryMediaComponent");
    public final MigColorScheme A00;
    public final String A01;
    public final C00m A02;
    public final float A03;
    public final String A04;

    public C8ga(MigColorScheme migColorScheme, String str, String str2, C00m c00m, float f) {
        this.A00 = migColorScheme;
        this.A04 = str;
        this.A01 = str2;
        this.A03 = f;
        this.A02 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A00;
        int Awo = migColorScheme.Awo();
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, 7zL.A0j(Awo), 1));
        Integer num2 = 0S2.A01;
        2lO A0Z = 7zQ.A0Z(7zQ.A0X(A0g, num2, 1.0f), num, new GAb(this, 8));
        C2sn A0L = 7zR.A0L(c2k5);
        Uri uri = null;
        try {
            uri = C0A2.A03(this.A04);
        } catch (SecurityException unused) {
        }
        float f = this.A03;
        1Iw AeS = A0L.AeS();
        5BH A01 = 5BG.A01(AeS);
        C06984ii.A01(A01, 7zR.A0H());
        2cL r309 = null;
        A01.A2a(5Bm.A01(uri, (java.util.Map) null));
        A01.A10(100.0f);
        A01.A2b(A05);
        if (f == 0.0f) {
            f = 0.5625f;
        }
        A01.A2W(f);
        C1rp c1rp = C1rp.FLEX_END;
        C2sn A0U = 7zQ.A0U(AeS);
        7zO.A1A(A01, A0U);
        1Iw AeS2 = A0U.AeS();
        C89k A00 = C89j.A00(AeS2);
        PointF pointF = new PointF(0.0f, 0.5f);
        C89j c89j = A00.A00;
        c89j.A01 = pointF;
        c89j.A00 = new PointF(0.0f, 0.1f);
        A00.A2X(new int[]{migColorScheme.Chx(C1td.A03), A1W ? 1 : 0});
        2dP r0 = 2dP.A01;
        A00.A2H(r0);
        A00.A27(C26z.ALL, 0.0f);
        A0U.A00(A00.A2V());
        String str = this.A01;
        if (str != null) {
            2lO A0K = 4YV.A0K(C82m.A02(null, 7zL.A0u(0S2.A0Y, r0, A1W ? 1 : 0), num, 100.0f, A1W ? 1 : 0), 0S2.A1J, 4YV.A06(2RH.A03));
            C2sn A0U2 = 7zQ.A0U(AeS2);
            2lO A04 = C82m.A04(null, num, 100.0f, A1W ? 1 : 0);
            1Iw r02 = A0U2.A00;
            C2sn A0U3 = 7zQ.A0U(r02);
            2KD A0r = 7zL.A0r(A0U3, A1W ? 1 : 0);
            A0r.A10(100.0f);
            7zM.A1X(A0r, A0U3, 2131968196);
            A0r.A2q(1);
            A0r.A2y(2KE.A0B);
            A0r.A2e();
            A0r.A0L();
            A0r.A2a();
            7zQ.A1K(A0U3, migColorScheme, A0r);
            7zM.A1R(A0U3, A0U2, A04);
            2lO A042 = C82m.A04(null, num, 100.0f, A1W ? 1 : 0);
            C2sn A0U4 = 7zQ.A0U(r02);
            2KD A0r2 = 7zL.A0r(A0U4, A1W ? 1 : 0);
            A0r2.A10(100.0f);
            A0r2.A2z(str);
            A0r2.A2q(1);
            A0r2.A2h();
            A0r2.A2e();
            A0r2.A0L();
            A0r2.A2a();
            7zQ.A1K(A0U4, migColorScheme, A0r2);
            r309 = 7zM.A0l(C2so.A0N(A0U4, A0U2, A042), A0U2, A0U, A0K);
        }
        A0L.A00(new 2cL((C1ro) null, (C1ro) null, c1rp, (EnumC00743oh) null, 7zL.A16(r309, A0U), A1W));
        return 7zM.A0l(C2so.A0E(A0L, 7zS.A0a(C82m.A05(4YV.A0L((2lO) null, 0S2.A0Y, r0, A1W ? 1 : 0), num2, num, 100.0f, A1W ? 1 : 0), num, 7zO.A05(migColorScheme, 83886080, 352321535))), A0L, c2k5, A0Z);
    }
}

package X;

import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8bo, reason: invalid class name */
/* loaded from: 8bo.class */
public final class C8bo extends 1LH {
    public final long A00;
    public final 1pI A01;
    public final 8LU A02;
    public final MigColorScheme A03;
    public final String A04;
    public final Function2 A05;

    public C8bo(1pI r302, 8LU r303, MigColorScheme migColorScheme, String str, Function2 function2, long j) {
        7zR.A1N(migColorScheme, r302);
        11T.A0F(function2, 6);
        this.A03 = migColorScheme;
        this.A02 = r303;
        this.A01 = r302;
        this.A00 = j;
        this.A04 = str;
        this.A05 = function2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        4NU A00 = 4NT.A00(c2k5, ALl.A00);
        Object A0A = 1Bn.A0A(83118);
        FbSharedPreferences A0W = 1BL.A0W();
        C0dp A0G = 7zR.A0G();
        MigColorScheme migColorScheme = this.A03;
        int[] iArr = (int[]) 2rO.A00(c2k5, new AKM(this, 23), AnonymousClass001.A1a(migColorScheme.AZc()));
        int[] iArr2 = (int[]) 2rO.A00(c2k5, new AKM(this, 22), AnonymousClass001.A1b(Integer.valueOf(migColorScheme.AZc()), migColorScheme.Atn()));
        C2lh A002 = C2lc.A00(c2k5, ALo.A00);
        C2lh A003 = C2lc.A00(c2k5, ALm.A00);
        C2lh A004 = C2lc.A00(c2k5, ALn.A00);
        boolean z = false;
        if (A0W.Av1(1G3.A00(1NK.A0d, String.valueOf(this.A00)), A0G.now()) + 5000 < A0G.now()) {
            z = true;
        }
        8LU r0 = this.A02;
        int i = r0.A00;
        Integer valueOf = Integer.valueOf(i);
        int i2 = r0.A02;
        4FL.A00(c2k5, new 85O(39, A003, A002, this), AnonymousClass001.A1b(valueOf, i2));
        float A005 = z ? 7zM.A00(A002.A02) : i == 0 ? 0.03f : i / i2;
        if (7zP.A1V(A004)) {
            return null;
        }
        1Iw r02 = c2k5.A05;
        8T8 A006 = 8mV.A00(r02);
        2lQ r03 = 2lO.A02;
        2lO A0a = 7zS.A0a((2lO) null, 0S2.A00, migColorScheme.AYp());
        2RH r04 = 2RH.A04;
        long A06 = 4YV.A06(r04);
        Integer num = 0S2.A06;
        2lO A0Z = 7zQ.A0Z(4YV.A0K(A0a, num, A06), 0S2.A0C, new ARW(5, A0W, A0G, A0A, A00, this));
        C2sn A0U = 7zQ.A0U(r02);
        1Iw r05 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r05);
        2lO A0d = 7zT.A0d(7zS.A0R((2lO) null, 1.0f), 2RH.A07, num);
        1Iw r06 = A0U2.A00;
        C2sn A0U3 = 7zQ.A0U(r06);
        1Iw r07 = A0U3.A00;
        2KD A0X = 7zN.A0X(r07, migColorScheme, 0);
        A0X.A2b();
        A0X.A2h();
        A0X.A2z(r0.A0A);
        2KD A0d2 = 7zR.A0d(r07, A0U3, A0X, 0);
        A0d2.A2x(migColorScheme);
        A0d2.A2d();
        A0d2.A2i();
        A0d2.A2z(r0.A09);
        7zS.A1O(A0U3, A0U2, A0d, A0d2);
        if (r0.A0B) {
            8Tl A007 = C5hr.A00(r06);
            8Tl.A08(A007);
            A007.A2Y(migColorScheme);
            7zR.A1A(A007, new ARN(17, this, A004, A0A, A0W));
            A0U2.A00(A007.A2W());
        }
        A0U.A00(C2so.A0G(A0U2, A0U));
        8T3 A008 = C8o0.A00(r05);
        A008.A2Y(A005);
        int AYv = migColorScheme.AYv();
        C8o0 c8o0 = A008.A00;
        c8o0.A02 = AYv;
        A008.A2X(6.0f);
        c8o0.A05 = true;
        if (7zP.A1V(A003)) {
            iArr = iArr2;
        }
        c8o0.A06 = iArr;
        4YU.A1N(A008, r04);
        2RH r08 = 2RH.A05;
        4YU.A1M(A008, r08);
        A0U.A00(A008.A2W());
        2KD A0X2 = 7zN.A0X(r05, migColorScheme, 0);
        A0X2.A2d();
        7zL.A1N(A0X2);
        A0X2.A2s(Layout.Alignment.ALIGN_OPPOSITE);
        A0X2.A2z(r0.A05);
        7zN.A1Q(A0U, A0X2);
        8Au A009 = 8Av.A00(r05);
        A009.A2Z(migColorScheme);
        A009.A2a(r0.A04);
        4YU.A1N(A009, r08);
        A009.A2Y(C9pw.A00(A0A, this, 11));
        A006.A2X(7zM.A0l(A009.A2W(), A0U, c2k5, A0Z));
        A006.A2Y(migColorScheme);
        return A006.A2W();
    }
}

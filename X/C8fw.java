package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8fw, reason: invalid class name */
/* loaded from: 8fw.class */
public final class C8fw extends 1LH {
    public final Function1 A00;
    public final 1LI A01;
    public final boolean A02;
    public static final CallerContext A04 = CallerContext.A0B("ReelsXmaAutoPlayableVideoOverlayComponent");
    public static final long A03 = 7zQ.A08();

    public C8fw(1LI r302, Function1 function1, boolean z) {
        this.A01 = r302;
        this.A02 = z;
        this.A00 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        C1u2 A0G = 7zS.A0G(c2k5, 0);
        1Iw r0 = c2k5.A05;
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r0, 16979);
        C2lh A00 = C2lc.A00(c2k5, ANx.A00);
        int parseColor = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{parseColor, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        C2sn A0U = 7zQ.A0U(r0);
        A0U.A00(this.A01);
        2lQ r02 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A042 = C82m.A04(null, num, 100.0f, 0);
        Integer num2 = 0S2.A01;
        2lO A0W = 7zS.A0W(A042, C82m.A08(num2, 20.0f, 0), num, (Object) null, 1);
        2dP r03 = 2dP.A01;
        Integer num3 = 0S2.A0Y;
        2lO A0L = 4YV.A0L(A0W, num3, r03, 0);
        1Iw r04 = A0U.A00;
        7zN.A1I(7zQ.A0U(r04), A0U, A0L);
        2lO A0L2 = 4YV.A0L((2lO) null, num3, r03, 0);
        long j = A03;
        2lO A02 = C82m.A02(7zT.A0a(A0L2, 7zL.A0i(0S2.A0u, j), j), 7zL.A0i(0S2.A1G, j), num, 100.0f, 0);
        C2sn A0U2 = 7zQ.A0U(r04);
        if (this.A02) {
            2lO A0Y = 7zS.A0Y((2lO) null, num2);
            C2sn A0K = 7zS.A0K(A0U2);
            2zB A002 = 2cP.A00(A0K.A00);
            A002.A2Z(A0G.A05(7zP.A1V(A00) ? 2MQ.A0L : 2MQ.A0M, 2Re.A02));
            A002.A2a(migColorScheme);
            C1ut c1ut = C1ut.A04;
            2cP r05 = A002.A01;
            r05.A04 = c1ut;
            r05.A05 = C1td.A03;
            A002.A2X(24.0f);
            7zR.A1A(A002, 83U.A01(A00, this, 48));
            A002.A0M();
            A002.A29(C26z.ALL, 16.0f);
            7zQ.A1E(A002.A2W(), A0K, A0U2, A0Y);
        }
        7zN.A1J(A0U2, A0U, A02);
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
    }
}

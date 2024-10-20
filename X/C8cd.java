package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8cd, reason: invalid class name */
/* loaded from: 8cd.class */
public final class C8cd extends 1LH {
    public final int A00;
    public final 8Ks A01;
    public final Function2 A02;
    public final 2lO A03;
    public final MigColorScheme A04;
    public final boolean A05;
    public final boolean A06;

    public C8cd(8Ks r302, 2lO r303, MigColorScheme migColorScheme, Function2 function2, int i, boolean z, boolean z2) {
        4YV.A1M(migColorScheme, 2, function2);
        this.A03 = r303;
        this.A04 = migColorScheme;
        this.A00 = i;
        this.A01 = r302;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = function2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2lO r0 = this.A03;
        2lQ r02 = 2lO.A02;
        2lO A00 = r0.A00(7zL.A0g((2lO) null, 7zL.A0u(0S2.A1G, AV1.A00(this, 21), 1)));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r03 = A0L.A00;
        5BH A01 = 5BG.A01(r03);
        7zN.A1A(A01, this.A01.A03);
        A01.A10(100.0f);
        A01.A0f(1.0f);
        A01.A1D(1.0f);
        7zO.A1A(A01, A0L);
        if (this.A06) {
            MigColorScheme migColorScheme = this.A04;
            int A05 = 1tG.A05(migColorScheme.BKg(), ActionId.VIDEO_SET_RENDERER_CONTEXT);
            Integer num = 0S2.A00;
            2lO A0a = 7zS.A0a((2lO) null, num, A05);
            2dP r04 = 2dP.A01;
            Integer num2 = 0S2.A0Y;
            7zM.A1S(A0L, 4YV.A0L(7zQ.A0X(C82m.A02(A0a, 7zL.A0u(num2, r04, 0), num, 100.0f, 0), num2, 1.0f), num, C1ro.CENTER, 0));
            AwZ A002 = Dyc.A00(r03);
            A002.A2X(migColorScheme);
            A002.A2Y(this.A05);
            A002.A2H(r04);
            A002.A0M();
            A0L.A00(A002.A2W());
        }
        return C2so.A02(A0L, c2k5, A00);
    }
}

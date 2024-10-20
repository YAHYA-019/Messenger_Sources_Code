package X;

import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8ha, reason: invalid class name */
/* loaded from: 8ha.class */
public final class C8ha extends 1LH {
    public static final long A0F = 7zQ.A08();
    public final Function1 A00;
    public final Function1 A01;
    public final Function1 A02;
    public final float A03;
    public final long A04;
    public final 1LI A05;
    public final 1LI A06;
    public final HighlightsFeedContent A07;
    public final MigColorScheme A08;
    public final C1ro A09;
    public final Integer A0A;
    public final String A0B;
    public final Function1 A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C8ha(1LI r302, 1LI r303, HighlightsFeedContent highlightsFeedContent, MigColorScheme migColorScheme, C1ro c1ro, Integer num, String str, Function1 function1, Function1 function12, Function1 function13, Function1 function14, float f, long j, boolean z, boolean z2) {
        7zP.A1O(migColorScheme, 4, num);
        this.A0B = str;
        this.A0E = z;
        this.A09 = c1ro;
        this.A08 = migColorScheme;
        this.A05 = r302;
        this.A00 = function1;
        this.A01 = function12;
        this.A04 = j;
        this.A02 = function13;
        this.A03 = f;
        this.A0A = num;
        this.A0C = function14;
        this.A0D = z2;
        this.A06 = r303;
        this.A07 = highlightsFeedContent;
    }

    public 1LI A0s(C2k5 c2k5) {
        HighlightsFeedContent highlightsFeedContent;
        11T.A0F(c2k5, 0);
        if (C1ub.A03.A0A() && (highlightsFeedContent = this.A07) != null && highlightsFeedContent.A05 == C5by.A07.value) {
            2lQ r0 = 2lO.A02;
            2lO A0K = 4YV.A0K((2lO) null, 0S2.A08, this.A04);
            Integer num = 0S2.A01;
            2lO A0X = 7zQ.A0X(A0K, num, 1.0f);
            boolean A1T = AnonymousClass001.A1T(this.A02);
            AVC A01 = AVC.A01(this, 32);
            Integer num2 = 0S2.A1G;
            if (!A1T) {
                A01 = null;
            }
            2lO A0L = 4YV.A0L(A0X, num2, A01, 1);
            C2sn A0L2 = 7zR.A0L(c2k5);
            2lO A0L3 = 4YV.A0L(7zQ.A0X(7zR.A0S((2lO) null, C1ro.STRETCH, 0), num, this.A03), 0S2.A0u, true, 1);
            boolean A1T2 = AnonymousClass001.A1T(this.A00);
            AVC A012 = AVC.A01(this, 33);
            if (!A1T2) {
                A012 = null;
            }
            2lO A0L4 = 4YV.A0L(A0L3, num2, A012, 1);
            boolean A1T3 = AnonymousClass001.A1T(this.A01);
            AVC A013 = AVC.A01(this, 34);
            Integer num3 = 0S2.A03;
            if (!A1T3) {
                A013 = null;
            }
            7zQ.A1E(this.A05, 7zS.A0K(A0L2), A0L2, 4YV.A0L(A0L4, num3, A013, 1));
            return C2so.A0I(A0L2, c2k5, A0L);
        }
        C2sn A0K2 = 7zR.A0K(c2k5.A05);
        2lO A0K3 = 4YV.A0K((2lO) null, 0S2.A08, this.A04);
        Integer num4 = 0S2.A01;
        2lO A0X2 = 7zQ.A0X(A0K3, num4, 1.0f);
        boolean A1T4 = AnonymousClass001.A1T(this.A02);
        AVC A014 = AVC.A01(this, 35);
        Integer num5 = 0S2.A1G;
        if (!A1T4) {
            A014 = null;
        }
        2lO A0L5 = 4YV.A0L(A0X2, num5, A014, 1);
        C2sn A0K4 = 7zS.A0K(A0K2);
        long A06 = 3yH.A06(A0K4, 2132279303);
        Integer num6 = 0S2.A00;
        2lO A0U = 7zT.A0U((2lO) null, 7zL.A0i(num6, A06));
        C1rp c1rp = C1rp.FLEX_END;
        C1ro c1ro = C1ro.FLEX_END;
        1Iw r02 = A0K4.A00;
        C2sn A0U2 = 7zQ.A0U(r02);
        C1ro c1ro2 = this.A09;
        C2sn A0K5 = 7zS.A0K(A0U2);
        A0K5.A00(this.A0E ? new 8Z9(this.A08, this.A0A, this.A0B, this.A0C) : this.A0D ? this.A06 : null);
        A0U2.A00(C2so.A0V(A0K5, A0U2, null, c1ro2, c1rp));
        A0K4.A00(C2so.A0T(A0U2, A0K4, A0U, c1ro, null, c1rp));
        A0K4.A00(new C8f3(null, 2132279327));
        2lO A0L6 = 4YV.A0L(7zQ.A0X(4YV.A0L((2lO) null, num6, C1ro.STRETCH, 0), num4, this.A03), 0S2.A0u, true, 1);
        boolean A1T5 = AnonymousClass001.A1T(this.A00);
        AVC A015 = AVC.A01(this, 36);
        if (!A1T5) {
            A015 = null;
        }
        7zQ.A1E(this.A05, 7zQ.A0U(r02), A0K4, 4YV.A0L(A0L6, num5, A015, 1));
        7zN.A1J(A0K4, A0K2, A0L5);
        return new C1rh(null, null, null, null, A0K2.A01, false);
    }
}

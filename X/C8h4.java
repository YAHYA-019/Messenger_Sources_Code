package X;

import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8h4, reason: invalid class name */
/* loaded from: 8h4.class */
public final class C8h4 extends 1LH {
    public final HighlightsAttachmentContent A00;
    public final C5by A01;
    public final MigColorScheme A02;
    public final C00m A03;
    public final Function1 A04;
    public final HighlightsFeedContent A05;
    public final List A06;
    public static final CallerContext A0B = CallerContext.A0B("HighlightsTabXMAComponent");
    public static final long A0A = 7zP.A0H();
    public static final long A09 = 7zP.A0F();
    public static final long A08 = 7zQ.A06();
    public static final int A07 = 0KF.A01(127.5f);

    public C8h4(HighlightsAttachmentContent highlightsAttachmentContent, HighlightsFeedContent highlightsFeedContent, C5by c5by, MigColorScheme migColorScheme, List list, C00m c00m, Function1 function1) {
        C3o5.A0k(migColorScheme, 3, list);
        this.A05 = highlightsFeedContent;
        this.A00 = highlightsAttachmentContent;
        this.A02 = migColorScheme;
        this.A01 = c5by;
        this.A06 = list;
        this.A03 = c00m;
        this.A04 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        2cL r304;
        11T.A0F(c2k5, 0);
        MigColorScheme migColorScheme = this.A02;
        C5bb c5bb = new C5bb(migColorScheme.Awo());
        11T.A0A(c2k5.AeS().A0E);
        c5bb.Cte(r0.A02(c2k5.B7k().A07(2131427335)));
        C5by c5by = this.A01;
        String str = c5by == C5by.A09 ? null : this.A00.A07;
        long A03 = 9nH.A01.A07(this.A05) ? 3yH.A03(c2k5) : 3yH.A06(c2k5, 2132279305);
        2lQ r0 = 2lO.A02;
        2lO A0L = 4YV.A0L(4YV.A0L(4YV.A0K((2lO) null, 0S2.A15, A03), 0S2.A1G, AVC.A01(this, 27), 1), 0S2.A03, AVC.A01(this, 28), 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        C85r A01 = 7LG.A01(A0L2.A00);
        A01.A2Z(migColorScheme);
        HighlightsAttachmentContent highlightsAttachmentContent = this.A00;
        A01.A2c(highlightsAttachmentContent.A0F);
        C1u7 c1u7 = C1u7.A08;
        7LG r02 = A01.A01;
        r02.A0D = c1u7;
        r02.A0G = 2KE.A03;
        A01.A2b(highlightsAttachmentContent.A0E);
        r02.A0C = C1u7.A0A;
        r02.A0Q = str;
        String str2 = highlightsAttachmentContent.A0B;
        if (str2 != null) {
            Integer num = 0S2.A00;
            2lO A04 = C82m.A04(null, num, 100.0f, 0);
            2dP r03 = 2dP.A02;
            Integer num2 = 0S2.A0Y;
            2lO A0L3 = 4YV.A0L(A04, num2, r03, 0);
            C2sn A0J = 7zS.A0J(A0L2);
            5BH A012 = 5BG.A01(A0J.A00);
            C07004ik A0H = 7zR.A0H();
            C1qo c1qo = A0J.AeS().A0E;
            11T.A0A(c1qo);
            float A02 = c1qo.A02(A0J.B7k().A07(2131427335));
            ((C07014il) A0H).A04 = 5BJ.A01(A02, A02, 0.0f, 0.0f);
            C06984ii.A01(A012, A0H);
            A012.A10(100.0f);
            A012.A2b(A0B);
            Uri uri = null;
            try {
                uri = C0A2.A03(str2);
            } catch (SecurityException unused) {
            }
            A012.A2X(uri);
            A012.A2W((float) 9nH.A00(highlightsAttachmentContent));
            A012.A1H(0);
            7zO.A1A(A012, A0J);
            String str3 = highlightsAttachmentContent.A0C;
            if ((11T.A0O(str3, "YOUTUBE_VIDEO") || 11T.A0O(str3, "YOUTUBE_SHORTS")) && highlightsAttachmentContent.A0A != null) {
                C1u2 A0I = 4YV.A0I();
                RippleDrawable A072 = 7zN.A07(7zO.A01(A0J, A08), 7zT.A03(migColorScheme, A07), migColorScheme.AZM());
                2lO A042 = C82m.A04(null, num, 100.0f, 0);
                Integer num3 = 0S2.A01;
                2lO A0L4 = 4YV.A0L(C82m.A04(A042, num3, 100.0f, 0), num2, 2dP.A01, 0);
                long A082 = 7zP.A08();
                Integer num4 = 0S2.A0C;
                2lO A0h = 7zT.A0h(A0L4, num4, A082);
                C2sn A0J2 = 7zS.A0J(A0J);
                2lO A0W = 7zS.A0W(7zT.A0j((2lO) null, num3, num4, 0.0f), 7zL.A0i(0S2.A06, A09), num, A072, 1);
                C2sn A0K = 7zS.A0K(A0J2);
                C2cm A0I2 = 7zL.A0I(A0K);
                7zN.A18(A0I2, C1u3.A51, A0I);
                A0I2.A2X(migColorScheme.BKg());
                7zT.A1H(A0I2, A0K, A0A);
                7zQ.A1E(7zL.A0J(A0I2), A0K, A0J2, A0W);
                A0J.A00(C2so.A06(A0J2, A0J, A0h));
            }
            r304 = C2so.A02(A0J, A0L2, A0L3);
        } else {
            r304 = null;
        }
        A01.A2Y(r304);
        C5by c5by2 = C5by.A0K;
        r02.A0T = c5by == c5by2 ? 11T.A03(7LX.A07.A01(new C9zo(A0L2, this, 0), 3yH.A09(A0L2, 2131963789))) : null;
        7zR.A1A(A01, AVC.A01(this, 29));
        7zS.A1M(A01, (2lO) null, 0S2.A00, c5bb, 1);
        if (!C1ub.A00().AZk(2342164645703795307L) && c5by != c5by2) {
            A01.A0p(A0L2.B7k().A07(2131427332));
        }
        return 7zN.A0R(A01.A2V(), A0L2, c2k5, A0L);
    }
}

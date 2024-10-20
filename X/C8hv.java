package X;

import android.net.Uri;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8hv, reason: invalid class name */
/* loaded from: 8hv.class */
public final class C8hv extends 1LH {
    public static final PlayerOrigin A08 = new PlayerOrigin(6TL.A0k, "highlights_tab");
    public final 8Lu A00;
    public final HighlightsAttachmentContent A01;
    public final Function1 A02;
    public final float A03;
    public final Uri A04;
    public final 2lO A05;
    public final String A06;
    public final boolean A07;

    public C8hv(Uri uri, 8Lu r303, 2lO r304, HighlightsAttachmentContent highlightsAttachmentContent, String str, Function1 function1, float f, boolean z) {
        1BK.A1L(str, 3, function1);
        this.A04 = uri;
        this.A05 = r304;
        this.A06 = str;
        this.A01 = highlightsAttachmentContent;
        this.A03 = f;
        this.A07 = z;
        this.A00 = r303;
        this.A02 = function1;
    }

    public static final GRS A01(C8hv c8hv) {
        return 7zQ.A0w().A06(A08, c8hv.A01.A05);
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        4NU A00 = 4NT.A00(c2k5, AMf.A00);
        C2lh A002 = C2lc.A00(c2k5, AMg.A00);
        4FL.A00(c2k5, new AQj(18, this, c2k5, A00, A002), 7zL.A1Y());
        Function1 A01 = 4FN.A01(c2k5, AV8.A00(A002, this, A00, 19));
        Function1 A012 = 4FN.A01(c2k5, AV8.A00(A002, this, A00, 20));
        C00m A003 = 4FN.A00(c2k5, AQl.A01(this, 39));
        8Lu r0 = this.A00;
        if (r0 != null) {
            C2lh c2lh = (C2lh) r0.A01;
            if (7zP.A1V(c2lh)) {
                2JB.A01(new AFz(A00, A002, this));
                c2lh.A01();
            }
        }
        C1ro c1ro = C1ro.CENTER;
        C1rp c1rp = C1rp.FLEX_START;
        2lQ r02 = 2lO.A02;
        float f = this.A03;
        2lO A004 = 7zQ.A0Z(7zQ.A0Z(7zS.A0f(0S2.A0Y, f), 0S2.A0C, A01), 0S2.A0N, A012).A00(this.A05);
        C2sn A0L = 7zR.A0L(c2k5);
        A0L.A00(new C8e3(this.A04, null, this.A01.A05, this.A06, A003, null, f, this.A07, 7zP.A1V(A002), true));
        return C2so.A0A(A0L, c2k5, A004, c1ro, c1ro, c1rp, null, false);
    }
}

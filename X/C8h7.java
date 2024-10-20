package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8h7, reason: invalid class name */
/* loaded from: 8h7.class */
public final class C8h7 extends 1LH {
    public static final CallerContext A08 = CallerContext.A0B("HighlightsFeedSingleMediaAttachmentComponent");
    public final int A00;
    public final Aaj A01;
    public final 2Qz A02;
    public final HighlightsAttachmentContent A03;
    public final HighlightsFeedContent A04;
    public final Function1 A05;
    public final boolean A06;
    public final 2lO A07;

    public C8h7(2lO r302, Aaj aaj, 2Qz r304, HighlightsAttachmentContent highlightsAttachmentContent, HighlightsFeedContent highlightsFeedContent, Function1 function1, int i, boolean z) {
        7zT.A1W(highlightsAttachmentContent, highlightsFeedContent, aaj, r304);
        11T.A0F(function1, 5);
        this.A03 = highlightsAttachmentContent;
        this.A04 = highlightsFeedContent;
        this.A01 = aaj;
        this.A02 = r304;
        this.A05 = function1;
        this.A07 = r302;
        this.A06 = z;
        this.A00 = i;
    }

    public 1LI A0s(C2k5 c2k5) {
        C8e3 A0O;
        11T.A0F(c2k5, 0);
        8Lu r0 = new 8Lu(4NT.A00(c2k5, AMH.A00), C2lc.A00(c2k5, AMI.A00));
        2dD A00 = C2dB.A00(c2k5.A05);
        C5z7.A00(A00, this.A07);
        HighlightsAttachmentContent highlightsAttachmentContent = this.A03;
        Integer num = highlightsAttachmentContent.A02;
        int i = C96g.A07.value;
        if (num == null || num.intValue() != i) {
            C1qo c1qo = c2k5.AeS().A0E;
            11T.A0A(c1qo);
            float A02 = c1qo.A02(c2k5.B7k().A07(2131427335));
            5BH A01 = 5BG.A01(c2k5.AeS());
            String str = highlightsAttachmentContent.A0B;
            if (str == null) {
                throw 1BK.A0h();
            }
            Uri uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
            A01.A2X(uri);
            A01.A0f((float) 9nH.A00(highlightsAttachmentContent));
            A01.A2b(A08);
            7zO.A1N(A01, AV6.A00(c2k5, this, 35));
            A01.A1q(7zL.A0a(AVC.A01(this, 26)));
            C07004ik A002 = C06984ii.A00();
            7zM.A1K(A002, A02);
            C06984ii.A01(A01, A002);
            A01.A2S(9nH.A02(c2k5, highlightsAttachmentContent, this.A04, this.A00, this.A06));
            A0O = 7zO.A0O(A01);
        } else {
            String str2 = highlightsAttachmentContent.A0B;
            if (str2 == null) {
                throw 1BK.A0h();
            }
            String str3 = highlightsAttachmentContent.A05;
            double A003 = 9nH.A00(highlightsAttachmentContent);
            String A022 = 9nH.A02(c2k5, highlightsAttachmentContent, this.A04, 0, false);
            AQh A004 = AQh.A00(this, c2k5, r0, 6);
            Function1 function1 = this.A05;
            boolean A1Z = 7zP.A1Z(str3);
            Uri uri2 = null;
            try {
                uri2 = C0A2.A03(str2);
            } catch (SecurityException unused2) {
            }
            A0O = new C8e3(uri2, r0, str3, A022, A004, function1, A003, A1Z, A1Z, false);
        }
        return 7zN.A0S(A0O, A00);
    }
}

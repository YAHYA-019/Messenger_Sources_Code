package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8e5, reason: invalid class name */
/* loaded from: 8e5.class */
public final class C8e5 extends 1LH {
    public final int A00;
    public final HighlightsAttachmentContent A01;
    public final HighlightsFeedContent A02;
    public final InterfaceC07034in A03;
    public final 8Lu A04;
    public final 2lO A05;
    public final C2lu A06;
    public final Float A07;
    public final Function1 A08;
    public final boolean A09;

    public C8e5(InterfaceC07034in interfaceC07034in, 8Lu r303, 2lO r304, HighlightsAttachmentContent highlightsAttachmentContent, HighlightsFeedContent highlightsFeedContent, C2lu c2lu, Float f, Function1 function1, int i, boolean z) {
        1BL.A1F(highlightsFeedContent, highlightsAttachmentContent);
        11T.A0F(function1, 10);
        this.A02 = highlightsFeedContent;
        this.A01 = highlightsAttachmentContent;
        this.A05 = r304;
        this.A06 = c2lu;
        this.A07 = f;
        this.A09 = z;
        this.A03 = interfaceC07034in;
        this.A00 = i;
        this.A04 = r303;
        this.A08 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        final Uri A03;
        QGp qGp;
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, AMe.A00);
        4FL.A00(c2k5, new AQd(A00, c2k5, 6), 7zL.A1Y());
        C2lu c2lu = this.A06;
        2lO r306 = 2lO.A02;
        if (c2lu != null) {
            r306 = 4YV.A0K((2lO) null, 0S2.A0N, c2lu.A00);
        }
        final 2lO A002 = r306.A00(this.A05);
        HighlightsFeedContent highlightsFeedContent = this.A02;
        final HighlightsAttachmentContent highlightsAttachmentContent = this.A01;
        final String str = (String) AQd.A00(c2k5, this, 1BK.A1a(highlightsFeedContent, highlightsAttachmentContent, this.A00), 7);
        String str2 = highlightsAttachmentContent.A0B;
        if (str2 != null) {
            try {
                A03 = C0A2.A03(str2);
            } catch (SecurityException unused) {
            }
            if (A03 != null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Rendering media component for media type ");
                Integer num = highlightsAttachmentContent.A02;
                0fH.A0j("HTImmersiveMediaComponent", AnonymousClass001.A0a(9CR.A00(num), A0k));
                int i = C96g.A07.value;
                if (num == null || num.intValue() != i) {
                    final Float f = this.A07;
                    final boolean z = this.A09;
                    final InterfaceC07034in interfaceC07034in = this.A03;
                    final Function1 function1 = this.A08;
                    qGp = new 1LH(A03, interfaceC07034in, A002, highlightsAttachmentContent, f, str, function1, z) { // from class: X.8h8
                        public static final CallerContext A08 = CallerContext.A0B("HTImmersiveMediaImageComponent");
                        public final HighlightsAttachmentContent A00;
                        public final Function1 A01;
                        public final Uri A02;
                        public final InterfaceC07034in A03;
                        public final 2lO A04;
                        public final Float A05;
                        public final String A06;
                        public final boolean A07;

                        {
                            1BK.A1L(str, 3, function1);
                            this.A02 = A03;
                            this.A04 = A002;
                            this.A06 = str;
                            this.A00 = highlightsAttachmentContent;
                            this.A05 = f;
                            this.A07 = z;
                            this.A03 = interfaceC07034in;
                            this.A01 = function1;
                        }

                        public 1LI A0s(C2k5 c2k52) {
                            5BH A01 = 5BG.A01(7zO.A0T(c2k52));
                            A01.A2X(this.A02);
                            A01.A2b(A08);
                            C5z7.A00(A01, this.A04);
                            C07004ik A003 = C06984ii.A00();
                            if (this.A07) {
                                7zM.A1K(A003, 7zP.A00(r0, 3yH.A06(c2k52, 2132279333)));
                            }
                            InterfaceC07034in interfaceC07034in2 = this.A03;
                            if (interfaceC07034in2 == null) {
                                interfaceC07034in2 = InterfaceC07034in.A04;
                            }
                            A003.A00(interfaceC07034in2);
                            C06984ii.A01(A01, A003);
                            7zR.A1A(A01, AVD.A01(this, 8));
                            A01.A2S(this.A06);
                            Float f2 = this.A05;
                            if (f2 != null) {
                                A01.A2W(f2.floatValue());
                            } else {
                                11T.A0D(A01);
                            }
                            return 7zO.A0O(A01);
                        }
                    };
                } else if (7zP.A1V(A00)) {
                    Float f2 = this.A07;
                    qGp = new C8hv(A03, this.A04, A002, highlightsAttachmentContent, str, this.A08, f2 != null ? f2.floatValue() : (float) 9nH.A00(highlightsAttachmentContent), this.A09);
                } else {
                    0fH.A0j("HTImmersiveMediaComponent", "Fail to render the media, do nothing");
                }
                return (1LI) qGp;
            }
        }
        Float f3 = this.A07;
        qGp = new QGp(A002, c2lu, f3 != null ? f3.floatValue() : (float) 9nH.A00(highlightsAttachmentContent), this.A09);
        return (1LI) qGp;
    }
}

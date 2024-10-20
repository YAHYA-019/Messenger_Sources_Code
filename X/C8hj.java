package X;

import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveColorScheme;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* renamed from: X.8hj, reason: invalid class name */
/* loaded from: 8hj.class */
public final class C8hj extends 1LH {
    public final 06Z A00;
    public final HTImmersiveColorScheme A01;
    public final 95J A02;
    public final HighlightsFeedContent A03;

    public C8hj(06Z r302, HTImmersiveColorScheme hTImmersiveColorScheme, 95J r304, HighlightsFeedContent highlightsFeedContent) {
        11T.A0F(hTImmersiveColorScheme, 2);
        this.A03 = highlightsFeedContent;
        this.A01 = hTImmersiveColorScheme;
        this.A00 = r302;
        this.A02 = r304;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.2cL A01(X.C2k6 r302) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8hj.A01(X.2k6):X.2cL");
    }

    private final 2KD A0L(C2k6 c2k6) {
        2KD A00 = 2K3.A00(c2k6.AeS());
        String str = this.A03.A0Q;
        7zQ.A1W(A00, str);
        A00.A2x(this.A01);
        A00.A2X();
        A00.A2S(str);
        2lQ r0 = 2lO.A02;
        7zS.A1K(A00, (2lO) null, 0S2.A08, 3yH.A04(c2k6));
        return A00;
    }

    public /* bridge */ /* synthetic */ 1LI A0s(C2k5 c2k5) {
        2K3 A0w;
        2cL r309;
        String str;
        11T.A0F(c2k5, 0);
        long A04 = 3yH.A04(c2k5);
        2lQ r0 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A04, A04);
        HighlightsFeedContent highlightsFeedContent = this.A03;
        String str2 = highlightsFeedContent.A0P;
        2lO A00 = 9CL.A00(A0K, "immersive_life_event_text_transition_name", str2);
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        if (this.A02 == 95J.A02) {
            A0U.A00(A01(A0U));
            2KD A0L = A0L(A0U);
            A0L.A01.A0J = 9CM.A00(A0U, this.A01, AQg.A00(this, A0U, 40));
            A0L.A2q(2);
            7zR.A1A(A0L, AV6.A00(A0U, this, 48));
            A0w = A0L.A2W();
        } else {
            1Iw r02 = A0U.A00;
            Dud A01 = Dzc.A01(r02);
            C5z7.A00(A01, 7zT.A0f((2lO) null, 0S2.A01, 1.0f));
            2lO A002 = 9CL.A00(r0, "immersive_life_event_text_transition_name", str2);
            C2sn A0U2 = 7zQ.A0U(r02);
            A0U2.A00(A01(A0U2));
            7zN.A1Q(A0U2, A0L(A0U2));
            C2sn A0J = 7zS.A0J(A0U2);
            for (HighlightsAttachmentContent highlightsAttachmentContent : highlightsFeedContent.A0g) {
                if (highlightsAttachmentContent == null || (str = highlightsAttachmentContent.A0B) == null) {
                    r309 = null;
                } else {
                    float A012 = 7zU.A01(A0J, 2132279333);
                    2lO A0K2 = 4YV.A0K((2lO) null, 0S2.A08, 3yH.A04(A0J));
                    C2sn A0J2 = 7zS.A0J(A0J);
                    5BH A013 = 5BG.A01(A0J2.A00);
                    7zM.A1J(A013, str);
                    A013.A0f((float) 9nH.A00(highlightsAttachmentContent));
                    A013.A0e();
                    C07004ik A003 = C06984ii.A00();
                    7zM.A1K(A003, A012);
                    C06984ii.A01(A013, A003);
                    7zR.A1A(A013, AV8.A00(A0J2, this, highlightsAttachmentContent, 17));
                    7zO.A1A(A013, A0J2);
                    r309 = C2so.A02(A0J2, A0J, A0K2);
                }
                A0J.A00(r309);
            }
            A0w = 7zM.A0w(7zM.A0l(C2so.A00(A0J), A0U2, A0U, A002), A01);
        }
        return 7zN.A0N(A0w, A0U, c2k5, A00);
    }
}

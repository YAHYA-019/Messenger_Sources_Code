package X;

import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* renamed from: X.8fh, reason: invalid class name */
/* loaded from: 8fh.class */
public final class C8fh extends 1LH {
    public static final long A03 = 7zQ.A07();
    public final Aaj A00;
    public final 2Qz A01;
    public final HighlightsFeedContent A02;

    public C8fh(Aaj aaj, 2Qz r303, HighlightsFeedContent highlightsFeedContent) {
        7zR.A1O(r303, aaj);
        this.A02 = highlightsFeedContent;
        this.A01 = r303;
        this.A00 = aaj;
    }

    public 1LI A0s(C2k5 c2k5) {
        JSr jSr;
        11T.A0F(c2k5, 0);
        1BV A0R = 7zL.A0R(3vP.A00(c2k5), 16979);
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A08, A03);
        JSr jvo = new JVO(3vP.A00(c2k5), 7zN.A0W(A0R));
        if (7Sm.A00(3vP.A00(c2k5))) {
            jSr = new JSr(jvo, false, true);
            11T.A0D(jSr);
        } else {
            jSr = jvo;
        }
        2lO A0R2 = 7zR.A0R(7zR.A0S(A0g, jSr, 1), AV6.A00(c2k5, this, 39), 1);
        C2sn A0L = 7zR.A0L(c2k5);
        2KD A0r = 7zL.A0r(A0L, 0);
        7zQ.A1W(A0r, this.A02.A0Q);
        A0r.A2x(7zN.A0W(A0R));
        A0r.A32(true);
        7zN.A1Q(A0L, A0r);
        return C2so.A02(A0L, c2k5, A0R2);
    }
}

package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveColorScheme;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* renamed from: X.8dn, reason: invalid class name */
/* loaded from: 8dn.class */
public final class C8dn extends 1LH {
    public final HTImmersiveColorScheme A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1LH A03;
    public final 8KI A04;
    public final 95J A05;
    public final 9SW A06;
    public final HighlightsFeedContent A07;
    public final Integer A08;

    public C8dn(06Z r302, FbUserSession fbUserSession, 1LH r304, HTImmersiveColorScheme hTImmersiveColorScheme, 8KI r306, 95J r307, 9SW r308, HighlightsFeedContent highlightsFeedContent, Integer num) {
        11T.A0F(hTImmersiveColorScheme, 6);
        this.A03 = r304;
        this.A07 = highlightsFeedContent;
        this.A04 = r306;
        this.A02 = fbUserSession;
        this.A06 = r308;
        this.A00 = hTImmersiveColorScheme;
        this.A01 = r302;
        this.A05 = r307;
        this.A08 = num;
    }

    public 1LI A0s(C2k5 c2k5) {
        Integer num;
        2lU A08;
        long j = ((C2lu) 2rO.A00(c2k5, AQg.A00(this, c2k5, 38), 7zL.A1Z(c2k5))).A00;
        C2lh A00 = C2lc.A00(c2k5, AQl.A01(this, 21));
        Object A002 = 2rO.A00(c2k5, AQl.A01(A00, 19), new Object[]{A00});
        Object A003 = AQl.A00(c2k5, new Object[0], 20);
        HighlightsFeedContent highlightsFeedContent = this.A07;
        String str = highlightsFeedContent.A0f;
        4FL.A00(c2k5, new AKf(A003, A00, str, 7), new Object[]{str});
        2lQ r0 = 2lO.A02;
        95J r02 = this.A05;
        int ordinal = r02.ordinal();
        if (ordinal == 1) {
            num = 0S2.A01;
            A08 = C82m.A08(num, 100.0f, 0);
        } else {
            if (ordinal != 0) {
                throw 1BK.A1F();
            }
            num = 0S2.A01;
            A08 = 7zL.A0i(num, j);
        }
        2lO A0g = 7zL.A0g((2lO) null, A08);
        Integer num2 = 0S2.A00;
        2lO A04 = C82m.A04(A0g, num2, 100.0f, 0);
        9SW r03 = this.A06;
        2lO A0W = 7zQ.A0W(r03.A02, A04, 0S2.A03);
        Integer num3 = this.A08;
        2lO A0L = 4YV.A0L(7zS.A0a(A0W, num2, num3 != null ? num3.intValue() : this.A00.Abp()), num2, A002, 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        8KI r04 = this.A04;
        C9kv c9kv = (C9kv) A00.A02;
        HTImmersiveColorScheme hTImmersiveColorScheme = c9kv.A01;
        if (hTImmersiveColorScheme == null) {
            hTImmersiveColorScheme = this.A00;
        }
        06Z r05 = this.A01;
        FbUserSession fbUserSession = this.A02;
        A0L2.A00(new 8dP(r05, fbUserSession, (2lO) null, r04, r02, highlightsFeedContent, hTImmersiveColorScheme, Float.valueOf(r03.A00)));
        7zQ.A1E(this.A03, 7zS.A0K(A0L2), A0L2, 7zT.A0f((2lO) null, num, 1.0f));
        A0L2.A00(new 8fH(true, 7zR.A05(c9kv.A02)));
        HTImmersiveColorScheme hTImmersiveColorScheme2 = c9kv.A00;
        if (hTImmersiveColorScheme2 == null) {
            hTImmersiveColorScheme2 = this.A00;
        }
        return 7zM.A0l(new 8dN(r05, fbUserSession, (2lO) null, (9ST) null, r02, highlightsFeedContent, hTImmersiveColorScheme2, true), A0L2, c2k5, A0L);
    }
}

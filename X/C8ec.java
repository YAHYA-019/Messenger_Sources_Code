package X;

import android.graphics.drawable.Drawable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveColorScheme;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* renamed from: X.8ec, reason: invalid class name */
/* loaded from: 8ec.class */
public final class C8ec extends 1LH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ 06Z A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ 1LI A04;
    public final /* synthetic */ C1rn A05;
    public final /* synthetic */ HTImmersiveColorScheme A06;
    public final /* synthetic */ HTImmersiveColorScheme A07;
    public final /* synthetic */ HTImmersiveColorScheme A08;
    public final /* synthetic */ 8KI A09;
    public final /* synthetic */ 95J A0A;
    public final /* synthetic */ HighlightsFeedContent A0B;
    public final /* synthetic */ Float A0C;
    public final /* synthetic */ Integer A0D;
    public final /* synthetic */ boolean A0E;

    public C8ec(Drawable drawable, 06Z r303, FbUserSession fbUserSession, 1LI r305, C1rn c1rn, HTImmersiveColorScheme hTImmersiveColorScheme, HTImmersiveColorScheme hTImmersiveColorScheme2, HTImmersiveColorScheme hTImmersiveColorScheme3, 8KI r310, 95J r311, HighlightsFeedContent highlightsFeedContent, Float f, Integer num, int i, boolean z) {
        this.A0A = r311;
        this.A0D = num;
        this.A06 = hTImmersiveColorScheme;
        this.A01 = drawable;
        this.A05 = c1rn;
        this.A09 = r310;
        this.A08 = hTImmersiveColorScheme2;
        this.A02 = r303;
        this.A0B = highlightsFeedContent;
        this.A03 = fbUserSession;
        this.A0C = f;
        this.A0E = z;
        this.A00 = i;
        this.A07 = hTImmersiveColorScheme3;
        this.A04 = r305;
    }

    public 1LI A0s(C2k5 c2k5) {
        long j = ((C2lu) 2rO.A00(c2k5, new AQd(null, c2k5, 3), 7zL.A1Z(c2k5))).A00;
        2lQ r0 = 2lO.A02;
        95J r02 = this.A0A;
        2lO A00 = 9CJ.A00(r0, r02, j);
        Integer num = 0S2.A00;
        2lO A04 = C82m.A04(A00, num, 100.0f, 0);
        Integer num2 = this.A0D;
        2lO A0L = 4YV.A0L(A04, num, 7zL.A0j(num2 != null ? num2.intValue() : this.A06.Abp()), 1);
        Drawable drawable = this.A01;
        if (drawable != null) {
            A0L = 4YV.A0L(A0L, num, drawable, 1);
        }
        C1rn c1rn = this.A05;
        8KI r03 = this.A09;
        HTImmersiveColorScheme hTImmersiveColorScheme = this.A08;
        HTImmersiveColorScheme hTImmersiveColorScheme2 = this.A06;
        06Z r04 = this.A02;
        HighlightsFeedContent highlightsFeedContent = this.A0B;
        FbUserSession fbUserSession = this.A03;
        Float f = this.A0C;
        boolean z = this.A0E;
        int i = this.A00;
        HTImmersiveColorScheme hTImmersiveColorScheme3 = this.A07;
        1LI r05 = this.A04;
        C2sn A0L2 = 7zR.A0L(c2k5);
        Integer num3 = 0S2.A01;
        2lO A0X = 7zQ.A0X((2lO) null, num3, 1.0f);
        Integer num4 = 0S2.A0C;
        2lO A0W = 7zQ.A0W(c1rn, 7zQ.A0X(A0X, num4, 1.0f), 0S2.A03);
        C2sn A0K = 7zS.A0K(A0L2);
        if (hTImmersiveColorScheme == null) {
            hTImmersiveColorScheme = hTImmersiveColorScheme2;
        }
        A0K.A00(new 8dP(r04, fbUserSession, (2lO) null, r03, r02, highlightsFeedContent, hTImmersiveColorScheme, f));
        7zQ.A1E(r05, 7zS.A0K(A0K), A0K, 7zT.A0j((2lO) null, num3, num4, 1.0f));
        A0K.A00(new 8fH(z, i));
        if (hTImmersiveColorScheme3 == null) {
            hTImmersiveColorScheme3 = hTImmersiveColorScheme2;
        }
        7zQ.A1E(new 8dN(r04, fbUserSession, (2lO) null, (9ST) null, r02, highlightsFeedContent, hTImmersiveColorScheme3, z), A0K, A0L2, A0W);
        return C2so.A02(A0L2, c2k5, A0L);
    }
}

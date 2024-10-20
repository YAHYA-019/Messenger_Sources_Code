package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.immersiveuicomponents.footer.plugins.inlinereplybar.textonlyinlinereplies.HTImmersiveTextOnlyInlineReplyBarImplementation;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import kotlin.jvm.functions.Function1;

/* loaded from: ARa.class */
public final class ARa extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARa(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(1);
        this.A00 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A06 = z;
        this.A03 = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 == 0) {
            if (this.A06) {
                7zL.A1R(this.A04);
                C2k6 c2k6 = (C2k6) this.A05;
                Context A00 = 3vP.A00(c2k6);
                HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) this.A01;
                String str = HTImmersiveTextOnlyInlineReplyBarImplementation.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                AaX aaX = (AaX) this.A03;
                C3o5.A0k(highlightsFeedContent, 1, fbUserSession);
                Long l = highlightsFeedContent.A0M;
                if (l != null) {
                    9gM.A09.A01(A00, fbUserSession, highlightsFeedContent.A0E, new ARh(c2k6, A00, highlightsFeedContent, fbUserSession, aaX, str, 0, false), l.longValue());
                }
            }
            return 04S.A00;
        }
        C2i6 c2i6 = (C2i6) obj;
        8iE r0 = (8iE) this.A05;
        C2sn c2sn = (C2sn) this.A04;
        FbUserSession fbUserSession2 = (FbUserSession) this.A01;
        1Iw r02 = c2sn.A00;
        Object obj2 = c2i6.A01;
        11T.A09(obj2);
        AXE axe = (AXE) obj2;
        int i = c2i6.A00;
        Object obj3 = this.A02;
        boolean z = this.A06;
        int A01 = 7zP.A01((C2lh) this.A03);
        C2hj A0m = 7zL.A0m();
        2lQ r03 = 2lO.A02;
        int i2 = 8;
        if (z) {
            i2 = 4;
        }
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A06, 7zL.A08(i2));
        C2sn A0J = 7zS.A0J(c2sn);
        8TC r04 = new 8TC(r02, new C8ma());
        r04.A2X(fbUserSession2);
        2lO A0L = 4YV.A0L((2lO) null, 0S2.A1G, new M3t(r0, obj3, axe, A01, i, 2), 1);
        boolean z2 = r0.A07;
        ARZ arz = new ARZ(A01, i, 2, axe, obj3, A0J, r0);
        Integer num = 0S2.A03;
        ARZ arz2 = null;
        if (z2) {
            arz2 = arz;
        }
        7zS.A1M(r04, A0L, num, arz2, 1);
        r04.A2Y(axe);
        boolean z3 = r0.A06;
        C8ma c8ma = r04.A01;
        c8ma.A04 = z3;
        r04.A0I();
        c8ma.A02 = z ? 5BJ.A00(10.0f) : null;
        return 7zM.A0t(7zN.A0R(r04.A2W(), A0J, c2sn, A0K), A0m);
    }
}

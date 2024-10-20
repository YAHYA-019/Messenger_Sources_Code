package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.video.plugins.subtitle.SubtitleButtonPlugin;

/* loaded from: Ii1.class */
public final class Ii1 implements C6dl {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ SubtitleButtonPlugin A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public Ii1(FbUserSession fbUserSession, SubtitleButtonPlugin subtitleButtonPlugin, String str, boolean z) {
        this.A01 = subtitleButtonPlugin;
        this.A03 = z;
        this.A02 = str;
        this.A00 = fbUserSession;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, java.lang.Object, com.facebook.video.plugins.subtitle.SubtitleButtonPlugin, X.6d6] */
    @Override // X.C6dl
    public void CGp(Hgo hgo) {
        11T.A0F(hgo, 0);
        ?? r0 = this.A01;
        6U2 r02 = r0.A06;
        if (!AbL.A1H(((HyJ) 1Br.A0B(r0.A09)).A00)) {
            if (r02 != null) {
                r02.A06(new C6do(hgo));
                return;
            } else {
                SubtitleButtonPlugin.A00(r0);
                return;
            }
        }
        SubtitleButtonPlugin.A01(r0, hgo);
        1Iw r03 = new 1Iw(r0.getContext());
        C2148Dfc c2148Dfc = new C2148Dfc(r03);
        c2148Dfc.A0f(2131954237);
        AbstractC2158Dfm abstractC2158Dfm = new AbstractC2158Dfm(r03);
        abstractC2158Dfm.A0i(2131962432);
        DfG A0h = abstractC2158Dfm.A0h(2131962432);
        A0h.A04 = new 3vS(JBL.A00, (Object[]) null, -1);
        c2148Dfc.A03 = RXy.A00(A0h);
        FFJ ffj = new FFJ(new 1Iw(r03));
        c2148Dfc.A0X(C26z.BOTTOM, 90.0f);
        ffj.A00 = c2148Dfc;
        ffj.A02(CallerContext.A0B(AnonymousClass001.A0Y(r0))).A01();
    }

    @Override // X.C6dl
    public void CGt() {
        SubtitleButtonPlugin subtitleButtonPlugin = this.A01;
        if (AbL.A1H(((HyJ) 1Br.A0B(subtitleButtonPlugin.A09)).A00)) {
            1Ql A08 = 1Br.A08(((I7Q) 1Br.A0B(subtitleButtonPlugin.A06)).A01);
            A08.CaE(I7Q.A05, 2131957382);
            A08.commit();
        }
        6U2 r0 = ((C6d6) subtitleButtonPlugin).A06;
        if (r0 == null) {
            SubtitleButtonPlugin.A00(subtitleButtonPlugin);
        } else {
            r0.A06(new C6do(null));
            r0.A06(new C6dp(false));
        }
    }

    @Override // X.C6dl
    public void CGv(Throwable th) {
        SubtitleButtonPlugin subtitleButtonPlugin = this.A01;
        if (((C6d6) subtitleButtonPlugin).A06 != null) {
            boolean z = this.A03;
            subtitleButtonPlugin.A02 = z;
            SubtitleButtonPlugin.A02(subtitleButtonPlugin, z);
            ((HrR) 1Br.A0B(subtitleButtonPlugin.A0A)).A01(this.A00, subtitleButtonPlugin.A01, this.A02);
        }
    }
}

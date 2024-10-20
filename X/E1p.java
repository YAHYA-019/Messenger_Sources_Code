package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: E1p.class */
public final class E1p extends GS2 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 54D A06;
    public final Fjm A07;
    public final Context A08;
    public final FbUserSession A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1p(FbUserSession fbUserSession, Context context) {
        super("ScreenSharingDrawerPluginRsysPresenter");
        11T.A0F(fbUserSession, 1);
        this.A09 = fbUserSession;
        this.A08 = context;
        this.A01 = 1Lm.A00(context, fbUserSession, 99475);
        this.A00 = 1Lm.A00(context, fbUserSession, 98492);
        this.A04 = 1Lm.A00(context, fbUserSession, 114911);
        this.A05 = 1Lm.A00(context, fbUserSession, 99477);
        this.A02 = 1Bu.A01(context, 114982);
        this.A06 = new 54D(fbUserSession, context);
        this.A03 = 1Lm.A00(context, fbUserSession, 33088);
        this.A07 = new Fjm(this, 1);
    }

    public static final void A00(E1p e1p) {
        8LW A01;
        C00i c00i = e1p.A01.A00;
        e1p.A0Z(new Fjt(((JOS) c00i.get()).A03 == 1 ? ((IMK) 1Br.A0B(e1p.A00)).A07.bottom : 0, A01(e1p), ((JOS) c00i.get()).A0B, !A01(e1p) || ((A01 = e1p.A06.A01()) != null && 9Dz.A00(A01).A00())));
    }

    public static final boolean A01(E1p e1p) {
        JOL B3j = ((JOS) 1Br.A0B(e1p.A01)).B3j(5);
        return B3j != null && B3j.BT9();
    }

    public void A0b() {
        ((2JN) 1Br.A0B(this.A03)).A02(this.A07);
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        ((2JN) 1Br.A0B(this.A03)).A03(this.A07, 02H.A02(new HAp[]{HAp.A02, HAp.A03}));
        A00(this);
    }
}

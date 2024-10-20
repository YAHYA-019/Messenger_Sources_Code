package X;

import android.content.Context;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.Ayo, reason: case insensitive filesystem */
/* loaded from: Ayo.class */
public final class C1995Ayo extends C1rj {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public 06Z A02;
    public 06Z A03;
    public FbUserSession A04;
    public C62 A05;
    public 9ZS A06;
    public ThreadSummary A07;
    public MigColorScheme A08;
    public Capabilities A09;
    public boolean A0A;

    public C1995Ayo() {
        super("ReviewSelectedMessagesPage");
    }

    public final Object[] A0k() {
        return new Object[]{this.A09, this.A02, this.A08, this.A04, this.A03, Boolean.valueOf(this.A0A), this.A05, this.A00, this.A01, this.A06, this.A07};
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [X.6Fa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.6Fc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, X.63D] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, X.62r] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C62 c62 = this.A05;
        9ZS r0 = this.A06;
        View.OnClickListener onClickListener = this.A01;
        View.OnClickListener onClickListener2 = this.A00;
        MigColorScheme migColorScheme = this.A08;
        boolean z = this.A0A;
        ThreadSummary threadSummary = this.A07;
        FbUserSession fbUserSession = this.A04;
        Capabilities capabilities = this.A09;
        06Z r02 = this.A03;
        06Z r03 = this.A02;
        11T.A0F(r302, 0);
        7zT.A1W(c62, r0, onClickListener, onClickListener2);
        11T.A0F(migColorScheme, 5);
        7zS.A18(7, threadSummary, fbUserSession, capabilities);
        7zP.A1O(r02, 10, r03);
        Context context = r302.A0D;
        C62h A0N = ((82O) 7zN.A0k(context, 65586)).A0N(fbUserSession);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A2e(new C1927Aws(migColorScheme, CxE.A00(onClickListener2, 50)));
        11T.A0D(A0N);
        6kI A012 = 6kI.A01(context, r02, r03, fbUserSession, threadSummary.A0n, threadSummary, (6Fe) null, (63D) new Object(), A0N, (C62r) new Object(), (6Fa) new Object(), (6Fc) new Object(), (63W) null, (User) null, capabilities);
        7zL.A1K(r302);
        B28 b28 = new B28();
        b28.A01 = r0;
        63E r04 = c62.A00;
        if (r04 == null) {
            11T.A0L("_messageListComponentBinder");
            throw 0Q8.createAndThrow();
        }
        b28.A02 = r04;
        b28.A03 = A012;
        b28.A00 = c62.A02;
        b28.A04 = migColorScheme;
        C2ki A00 = C2kV.A00(r302);
        A00.A0R();
        A00.A2j(true);
        A00.A2d(b28);
        AbG.A1M(A01, A00);
        8Ti A013 = 8oM.A01(r302);
        A013.A0w(7zL.A02());
        A013.A2Z(migColorScheme);
        7zM.A1O(A013, migColorScheme);
        A013.A1g(ViewOutlineProvider.BOUNDS);
        int i = 2131965656;
        if (z) {
            i = 2131960076;
        }
        A013.A2X(i);
        A013.A2b(!z);
        A013.A2Y(Cx1.A01(onClickListener, 20));
        return 7zL.A0V(A01, A013.A2W());
    }
}

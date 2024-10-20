package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: C62.class */
public final class C62 {
    public 63E A00;
    public final C6tg A01;
    public final 5zD A02;
    public final FbUserSession A03;
    public final 2S4 A04;
    public final 82O A05;
    public final 1De A06;
    public final ThreadViewColorScheme A07;
    public final boolean A08;

    public C62(FbUserSession fbUserSession, 2S4 r303, 1De r304, boolean z) {
        1BK.A1K(r303, 2, fbUserSession);
        this.A06 = r304;
        1BY r0 = r304.A00;
        this.A02 = (5zD) 1Bn.A0E((Context) null, r0, 67704);
        this.A07 = (ThreadViewColorScheme) 1Bn.A0E((Context) null, r0, 68548);
        this.A05 = (82O) 1Bn.A0E((Context) null, r0, 736);
        this.A01 = (C6tg) 1Bn.A0E((Context) null, r0, 50179);
        this.A04 = r303;
        this.A03 = fbUserSession;
        this.A08 = z;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, X.63D] */
    public final void A00(Context context, 06Z r303) {
        11T.A0F(r303, 1);
        this.A01.A0A(context);
        C1F6 c1f6 = (C1F6) 1Bu.A06(context, 938);
        82O r0 = (82O) 1Bu.A06(context, 65586);
        FbUserSession fbUserSession = this.A03;
        C62h A0N = r0.A0N(fbUserSession);
        boolean z = this.A08;
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Cv8 cv8 = new Cv8(7zQ.A0S(c1f6), z);
            1Bn.A0K();
            FbInjector.A04(A01);
            63E A0P = this.A05.A0P(context, fbUserSession, this.A04, (63D) new Object(), A0N, cv8);
            this.A00 = A0P;
            A0P.A01 = r303;
            A0P.A06 = true;
            this.A02.Cn0(this.A07);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}

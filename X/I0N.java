package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: I0N.class */
public final class I0N {
    public I4D A00;
    public boolean A01;
    public final Context A02;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A07;
    public final Hfx A08;
    public final HTQ A09;
    public final HmG A0A;
    public final Ij0 A0C;
    public final FbUserSession A0D;
    public final 1Br A06 = 7zM.A0P();
    public final 1Br A03 = AbG.A0I();
    public final Iac A0B = new Iac(this);

    public I0N(Context context, FbUserSession fbUserSession, HTQ htq, HmG hmG, Ij0 ij0) {
        this.A02 = context;
        this.A0D = fbUserSession;
        this.A09 = htq;
        this.A0A = hmG;
        this.A0C = ij0;
        this.A04 = 1Bu.A01(context, 115499);
        this.A05 = 1Bu.A01(context, 499);
        this.A07 = 1Bu.A01(context, 16430);
        C1F6 A0I = GOp.A0I(this.A05);
        Hy7 hy7 = new Hy7(fbUserSession, this);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0I);
        try {
            Hfx hfx = new Hfx(7zQ.A0S(A0I), hy7);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A08 = hfx;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static QuickPerformanceLogger A00(I0N i0n) {
        return (QuickPerformanceLogger) ((HTh) i0n.A04.A00.get()).A00.get();
    }
}

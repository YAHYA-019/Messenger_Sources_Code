package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gr9.class */
public final class Gr9 extends GS2 {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final JLm A0M;
    public final 1qP A0N;
    public final 2Qn A0O;
    public final IY8 A0P;
    public final JGO A0Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gr9(FbUserSession fbUserSession, Context context) {
        super("SettingsAndSecurityDrawerPluginPresenter");
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A0M = GpZ.A00(this, 9);
        this.A0N = new Gpy(this, 3);
        this.A0Q = new IfJ(this);
        this.A0O = IYv.A00(this, 12);
        this.A0P = IY8.A01(this, 12);
        this.A0E = 1Bu.A01(context, 85088);
        this.A0D = 1Bu.A01(context, 85087);
        this.A02 = GOn.A0Y(context, fbUserSession);
        this.A0C = GOn.A0V(context, fbUserSession);
        this.A03 = GOn.A0a(context, fbUserSession);
        this.A07 = 1Bu.A01(context, 68120);
        this.A09 = 1BK.A0C();
        this.A0F = GOn.A0U(context, fbUserSession);
        this.A0A = 1Lm.A00(context, fbUserSession, 114855);
        this.A0G = GOn.A0b(context, fbUserSession);
        this.A06 = 1Bu.A01(context, 82592);
        this.A0I = 1Lm.A00(context, fbUserSession, 85142);
        this.A0J = 1Bu.A01(context, 115682);
        this.A0K = GOn.A0T(context, fbUserSession);
        this.A0L = 1Bu.A01(context, 85079);
        this.A08 = 1Lm.A00(context, fbUserSession, 67965);
        this.A04 = GOn.A0Z(context, fbUserSession);
        this.A05 = 1Bu.A01(context, 114939);
        this.A0H = 1Lm.A00(context, fbUserSession, 17067);
        this.A0B = 1Bu.A01(context, 114936);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x01a0, code lost:
    
        if (X.1Br.A07(r301.A09).AZk(36313763804158974L) == false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r304v2, types: [java.lang.Object, X.I0Q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.I0Q A00(X.Gr9 r301) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gr9.A00(X.Gr9):X.I0Q");
    }

    public static void A01(Gr9 gr9, I0Q i0q) {
        A02(gr9, new IZs(i0q));
    }

    public static final void A02(Gr9 gr9, IZs iZs) {
        if (AbJ.A0X(gr9.A0K).A06 != null) {
            gr9.A0Z(iZs);
        } else {
            0fH.A0o("SettingsAndSecurityDrawerPluginPresenter", "Attempted to show settings drawer with no valid link");
        }
    }
}

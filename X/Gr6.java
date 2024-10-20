package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;

/* loaded from: Gr6.class */
public final class Gr6 extends GS2 {
    public boolean A00;
    public boolean A01;
    public String A02;
    public boolean A03;
    public final Handler A04;
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
    public final 1Br A0M;
    public final Gpr A0N;
    public final I0I A0O;
    public final IY8 A0P;
    public final C00m A0Q;
    public final Context A0R;
    public final FbUserSession A0S;
    public final C00m A0T;
    public final C00m A0U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gr6(FbUserSession fbUserSession, Context context) {
        super("MediaGridRsysPresenter");
        11T.A0F(fbUserSession, 1);
        this.A0S = fbUserSession;
        this.A0R = context;
        this.A0K = AbG.A0V();
        this.A0M = GOn.A0U(context, fbUserSession);
        this.A05 = GOn.A0X(context, fbUserSession);
        this.A0C = 1Bu.A01(context, 67593);
        this.A0A = 1Bu.A01(context, 67677);
        this.A06 = GOn.A0Y(context, fbUserSession);
        this.A0B = 1Lm.A00(context, fbUserSession, 99472);
        this.A08 = 1Lm.A00(context, fbUserSession, 115519);
        this.A09 = 1Lm.A00(context, fbUserSession, 115520);
        this.A0D = GOn.A0d(context, fbUserSession);
        this.A0F = 1Lm.A00(context, fbUserSession, 114852);
        this.A0G = 1Lm.A00(context, fbUserSession, 99476);
        this.A0H = GOn.A0e(context, fbUserSession);
        this.A0I = GOn.A0V(context, fbUserSession);
        this.A0J = 1Lm.A00(context, fbUserSession, 67679);
        this.A0L = 1Lm.A00(context, fbUserSession, 114859);
        this.A0E = GOn.A0S(context);
        1Br A01 = 1Bu.A01(context, 147733);
        this.A07 = A01;
        1Br.A0C(A01);
        this.A0O = new I0I(fbUserSession, context);
        this.A0P = IY8.A01(this, 28);
        this.A0Q = new J9t(this, 3);
        this.A0N = new Gpr(this, 1);
        this.A04 = AnonymousClass001.A07();
        this.A0U = new J9t(this, 5);
        this.A0T = new J9t(this, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x010a, code lost:
    
        if (((X.FAb) r0.get()).A05 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020b, code lost:
    
        if (r301.A00 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x025d, code lost:
    
        if (r0.isReel == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r0.mode != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05f5, code lost:
    
        if (X.IMK.A00(r0) != r0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x06fb, code lost:
    
        if (r310 != false) goto L41;
     */
    /* JADX WARN: Type inference failed for: r306v3, types: [X.Hkd, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.Gr6 r301, X.2JS r302) {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gr6.A00(X.Gr6, X.2JS):void");
    }

    private final boolean A01() {
        JFq jFq = ((GS2) this).A00;
        boolean z = true;
        if (AbM.A1a(jFq) && GOq.A0A((JPD) AbM.A0r(jFq)) != 1) {
            z = false;
        }
        return z;
    }

    public final void A0d(int i, int i2) {
        ILS A0Y = GOp.A0Y(this.A0F);
        Point point = A0Y.A01;
        if (point.x != i || point.y != i2) {
            A0Y.A01 = new Point(i, i2);
            Iterator it = A0Y.A0B.iterator();
            while (it.hasNext()) {
                ((HFr) it.next()).A01();
            }
            GOp.A0O(A0Y.A07).A04(HAp.A0D);
        }
        A00(this, GOq.A0p(this.A0M));
    }
}

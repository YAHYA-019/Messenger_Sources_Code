package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import kotlin.jvm.functions.Function1;

/* loaded from: GrR.class */
public final class GrR extends Gqk {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public C00m A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final FbUserSession A09;
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
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final 1Br A0T;
    public final 1Br A0U;
    public final 1Br A0V;
    public final 1Br A0W;
    public final JLm A0X;
    public final ETl A0Y;
    public final 1qP A0Z;
    public final HFr A0a;
    public final Ht3 A0b;
    public final 2Qn A0c;
    public final HFc A0d;
    public final JDA A0e;
    public final JFn A0f;
    public final IY5 A0g;
    public final 3Fu A0h;
    public final 2QY A0i;
    public final C01i A0j;
    public final Function1 A0k;
    public final JKF A0l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrR(Context context, FbUserSession fbUserSession, String str) {
        super(str);
        7zR.A1O(fbUserSession, context);
        this.A09 = fbUserSession;
        this.A08 = context;
        this.A0F = GOn.A0b(context, fbUserSession);
        this.A0S = 1Bu.A01(context, 115428);
        this.A0W = 1Bu.A01(context, 85079);
        this.A0O = 1Bu.A01(context, 115427);
        this.A0U = 1Bu.A01(context, 85225);
        this.A0D = 1Bu.A01(context, 68298);
        this.A0C = 1Bu.A01(context, 68141);
        this.A0M = 1Bu.A01(context, 82317);
        this.A0E = 1Lm.A00(context, fbUserSession, 115649);
        this.A0I = GOn.A0S(context);
        this.A0N = 1Bu.A01(context, 84855);
        this.A0J = 1Bu.A01(context, 115631);
        this.A0R = 1Lm.A00(context, fbUserSession, 114859);
        this.A0B = GOn.A0U(context, fbUserSession);
        this.A0j = J9t.A01(this, 21);
        this.A0L = GOn.A0e(context, fbUserSession);
        this.A0H = 1Lm.A00(context, fbUserSession, 99472);
        this.A0V = GOn.A0T(context, fbUserSession);
        this.A0K = 1Lm.A00(context, fbUserSession, 114852);
        this.A0P = 1Lm.A00(context, fbUserSession, 114987);
        this.A0Q = GOn.A0V(context, fbUserSession);
        this.A0A = GOn.A0Y(context, fbUserSession);
        this.A0T = 1Lm.A00(context, fbUserSession, 85166);
        this.A0G = GOn.A0Z(context, fbUserSession);
        this.A0k = new AV2(this, 5);
        this.A0g = new IY5(this);
        this.A0h = Gyu.A00(this, 24);
        this.A0i = Gys.A00(this, 27);
        this.A0e = new IYz(this, 2);
        this.A0b = new Gq8(this, 12);
        this.A0f = new GqG(this, 2);
        this.A0Z = new Gpy(this, 8);
        this.A0a = new Gq0(this, 5);
        this.A0c = IYv.A00(this, 34);
        this.A0X = GpZ.A00(this, 38);
        this.A0d = new GqF(this, 5);
        this.A0Y = new Gpr(this, 4);
        this.A0l = new IYj(this);
        this.A07 = true;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.HkW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.HkW, java.lang.Object] */
    public static final HkW A00(GrR grR) {
        JDB jdb = ((GS2) grR).A01;
        if (!AbM.A1a(jdb)) {
            ?? obj = new Object();
            ((HkW) obj).A04 = GOp.A0w(grR.A0G).A05;
            1Br.A0C(grR.A0I);
            ((HkW) obj).A0I = true;
            return obj;
        }
        IZl iZl = (IZl) AbM.A0r(jdb);
        ?? obj2 = new Object();
        iZl.getClass();
        ((HkW) obj2).A02 = iZl.A02;
        ((HkW) obj2).A0A = iZl.A0A;
        ((HkW) obj2).A0B = iZl.A0B;
        ((HkW) obj2).A0C = iZl.A0C;
        ((HkW) obj2).A0D = iZl.A0D;
        ((HkW) obj2).A00 = iZl.A00;
        ((HkW) obj2).A0E = iZl.A0E;
        ((HkW) obj2).A0F = iZl.A0F;
        ((HkW) obj2).A0G = iZl.A0G;
        ((HkW) obj2).A0H = iZl.A0H;
        ((HkW) obj2).A08 = iZl.A08;
        ((HkW) obj2).A01 = iZl.A01;
        ((HkW) obj2).A09 = iZl.A09;
        ((HkW) obj2).A04 = iZl.A04;
        ((HkW) obj2).A07 = iZl.A07;
        ((HkW) obj2).A05 = iZl.A05;
        ((HkW) obj2).A06 = iZl.A06;
        ((HkW) obj2).A0I = iZl.A0I;
        ((HkW) obj2).A03 = iZl.A03;
        return obj2;
    }

    private final String A01() {
        CallModel A0S = AbstractC2326GOr.A0S(this.A0B);
        if (A0S == null) {
            return null;
        }
        1Br.A0C(this.A0O);
        return Hvq.A00(4YU.A0C(this.A08), A0S.remoteParticipants);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.GrR r301) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrR.A02(X.GrR):void");
    }

    public static final void A03(GrR grR) {
        C00i c00i = grR.A0L.A00;
        if (GOp.A0b(c00i).A0A.size() != 1) {
            grR.A05 = false;
            ((I8n) grR.A0j.getValue()).A02();
        } else {
            ((I8n) grR.A0j.getValue()).A03(grR.A0l, (String) 4YU.A0q(GOp.A0b(c00i).A0A, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0476, code lost:
    
        if (X.GOp.A0w(r0).BTq() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0577, code lost:
    
        if (r327 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0ae9, code lost:
    
        if (r0.length() == 0) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0bc9, code lost:
    
        if (r311 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0cb8, code lost:
    
        if (X.0CU.A0O(r313) == false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0d9f, code lost:
    
        if (r307 != null) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0382, code lost:
    
        if (X.GOq.A0a(r301.A0A).A03 != 2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x043f, code lost:
    
        if (r303.length() != 0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x1004  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A08(X.GrR r301) {
        /*
            Method dump skipped, instructions count: 4104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrR.A08(X.GrR):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01dc, code lost:
    
        if (X.IFr.A0B(r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0207, code lost:
    
        if (X.GOp.A0b(r0).A02 == 4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012e, code lost:
    
        if (X.GOq.A0a(r0).A03 != 2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A09(X.GrR r301) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrR.A09(X.GrR):void");
    }
}

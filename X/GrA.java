package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: GrA.class */
public final class GrA extends GS2 {
    public int A00;
    public HG5 A01;
    public final 1De A02;
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
    public final HGB A0J;
    public final HFZ A0K;
    public final Ht3 A0L;
    public final HFc A0M;
    public final HVn A0N;
    public final 3Fu A0O;
    public final Runnable A0P;
    public final FbUserSession A0Q;

    public GrA(1De r302) {
        super("SelfVideoParticipantPresenter");
        this.A02 = r302;
        1BY r0 = r302.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A0I = A03;
        FbUserSession A032 = 1Br.A03(A03);
        this.A0Q = A032;
        this.A08 = 1Lm.A03(A032, r0, 99846);
        this.A0F = 1Lm.A03(A032, r0, 114859);
        this.A07 = GOn.A0i(A032, r0);
        this.A0D = 1Lm.A03(A032, r0, 114856);
        this.A0B = 1Lm.A03(A032, r0, 100047);
        this.A03 = 1Lm.A03(A032, r0, 98492);
        this.A04 = 1Lm.A03(A032, r0, 98492);
        this.A0E = 1Lm.A03(A032, r0, 33089);
        this.A06 = 1Lm.A03(A032, r0, 100046);
        this.A05 = 1Lm.A03(A032, r0, 115483);
        this.A0G = 1Bu.A03(r0, 115685);
        this.A0A = 1Lm.A03(A032, r0, 98491);
        this.A0C = 1BK.A0E();
        this.A0H = 1Bu.A03(r0, 16430);
        this.A0P = new Is6(this);
        this.A0O = Gyu.A00(this, 26);
        this.A0M = new GqF(this, 6);
        this.A0J = new Gpl(this, 19);
        this.A0K = new Gpt(this, 6);
        this.A0L = new Gq8(this, 15);
        this.A0N = new HVn(this);
        this.A09 = GOn.A0Q();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.Hhg] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Hhg] */
    public static final Hhg A00(GrA grA) {
        JDB jdb = ((GS2) grA).A01;
        if (!AbM.A1a(jdb)) {
            return new Object();
        }
        IZg iZg = (IZg) AbM.A0r(jdb);
        ?? obj = new Object();
        iZg.getClass();
        obj.A02 = iZg.A02;
        obj.A03 = iZg.A03;
        obj.A00 = iZg.A00;
        obj.A04 = iZg.A04;
        obj.A01 = iZg.A01;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:
    
        if (X.GOq.A1U(((X.D09) r0.get()).A00) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b1, code lost:
    
        r308 = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0160, code lost:
    
        r308 = X.0S2.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015d, code lost:
    
        if (X.GOq.A1U(((X.D09) r0.get()).A00) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.GrA r301) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrA.A01(X.GrA):void");
    }

    public static final void A02(GrA grA) {
        JFq jFq = ((GS2) grA).A00;
        if (AbM.A1a(jFq)) {
            HqE hqE = ((JPH) AbM.A0r(jFq)).A02;
            hqE.A02 = null;
            I2h i2h = (I2h) 1Br.A0B(grA.A08);
            if (i2h.A02 == hqE) {
                JNE jne = i2h.A01;
                if (jne != null) {
                    jne.CtJ((HqE) null);
                }
                i2h.A02 = null;
            }
        }
    }

    public static final void A03(GrA grA) {
        int i = grA.A00;
        IYp A0a = GOp.A0a(grA.A0D);
        11T.A0F(A0a, 1);
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
            if (A0a.A07 >= 2) {
                i2 = 2;
            }
        }
        Hhg A00 = A00(grA);
        A00.A00 = i2;
        grA.A0Z(new IZg(A00));
    }
}

package X;

/* renamed from: X.JdN, reason: case insensitive filesystem */
/* loaded from: JdN.class */
public final class C2934JdN extends AbstractC2887Jc8 implements MNX, MNO, MNS, MNL {
    public MEI A00;
    public final C2884Jc5 A01;
    public final C2891Jca A02;
    public final C2902Jco A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.LPR, X.MBc, X.Jc5] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.LPR, X.MBc, X.Jco] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.LPR, X.MBc, X.Jca] */
    public C2934JdN(MMs mMs) {
        ?? lpr = new LPR();
        lpr.A01 = mMs;
        A0H(lpr);
        this.A01 = lpr;
        ?? lpr2 = new LPR();
        A0H(lpr2);
        this.A02 = lpr2;
        ?? lpr3 = new LPR();
        A0H(lpr3);
        this.A03 = lpr3;
        A0H(new LPR());
    }

    public final void A0J(MMs mMs) {
        LMs lMs;
        C2884Jc5 c2884Jc5 = this.A01;
        if (11T.A0O(c2884Jc5.A01, mMs)) {
            return;
        }
        MMs mMs2 = c2884Jc5.A01;
        if (mMs2 != null && (lMs = c2884Jc5.A00) != null) {
            JQx.A1M(mMs2, new LMw(lMs));
        }
        c2884Jc5.A00 = null;
        c2884Jc5.A01 = mMs;
    }

    public void A8y(MEV mev) {
        MEI mei = this.A00;
        boolean z = false;
        if (mei != null && mei.BSp()) {
            z = true;
        }
        mev.ClM(KdW.A06, Boolean.valueOf(z));
        LPR.A07(KdT.A0H, mev, (String) null, M3K.A00(this, 6));
    }

    public /* synthetic */ boolean BAh() {
        return false;
    }

    public /* synthetic */ boolean BAo() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r307v4, types: [X.MBE, java.lang.Object] */
    public void BzI(MEI mei) {
        C2901Jcm c2901Jcm;
        if (11T.A0O(this.A00, mei)) {
            return;
        }
        boolean BSp = mei.BSp();
        if (BSp) {
            2aK.A03((Integer) null, (0DE) null, new JTs(this, (0DR) null, 3), A08(), 3);
        }
        if (((LPR) this).A08) {
            LDX.A07(this);
        }
        C2884Jc5 c2884Jc5 = this.A01;
        MMs mMs = c2884Jc5.A01;
        if (mMs != null) {
            LMs lMs = null;
            LMs lMs2 = c2884Jc5.A00;
            if (BSp) {
                if (lMs2 != null) {
                    C2884Jc5.A00(c2884Jc5, new LMw(lMs2), mMs);
                    c2884Jc5.A00 = null;
                }
                ?? obj = new Object();
                C2884Jc5.A00(c2884Jc5, obj, mMs);
                lMs = obj;
            } else if (lMs2 != null) {
                C2884Jc5.A00(c2884Jc5, new LMw(lMs2), mMs);
            }
            c2884Jc5.A00 = lMs;
        }
        C2902Jco c2902Jco = this.A03;
        if (BSp != c2902Jco.A00) {
            if (BSp) {
                C2902Jco.A00(c2902Jco);
            } else if (((LPR) c2902Jco).A08) {
                MNa A00 = L5f.A00(c2902Jco, C2901Jcm.A02);
                if ((A00 instanceof C2901Jcm) && (c2901Jcm = (C2901Jcm) A00) != null) {
                    c2901Jcm.A0H(null);
                }
            }
            c2902Jco.A00 = BSp;
        }
        C2891Jca c2891Jca = this.A02;
        LPJ lpj = null;
        if (BSp) {
            ?? obj2 = new Object();
            KUl.A00(c2891Jca, new JR6(c2891Jca, (Object) obj2, 0));
            MEP mep = (MEP) ((0CL) obj2).element;
            if (mep != null) {
                lpj = mep.CXP();
            }
        } else {
            MEO meo = c2891Jca.A00;
            if (meo != null) {
                meo.release();
            }
        }
        c2891Jca.A00 = lpj;
        c2891Jca.A01 = BSp;
        this.A00 = mei;
    }

    public void C0m(MKq mKq) {
        this.A03.C0m(mKq);
    }
}

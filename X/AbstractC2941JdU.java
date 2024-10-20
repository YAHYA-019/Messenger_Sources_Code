package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.JdU, reason: case insensitive filesystem */
/* loaded from: JdU.class */
public abstract class AbstractC2941JdU extends AbstractC2927JdF implements MNG {
    public MKR A01;
    public java.util.Map A02;
    public final AbstractC2938JdR A04;
    public long A00 = 0;
    public final LOt A03 = new LOt(this);
    public final java.util.Map A05 = 1BK.A1C();

    public AbstractC2941JdU(AbstractC2938JdR abstractC2938JdR) {
        this.A04 = abstractC2938JdR;
    }

    public static final void A03(MKR mkr, AbstractC2941JdU abstractC2941JdU) {
        java.util.Map map;
        abstractC2941JdU.A0H(mkr != null ? JR1.A0S(mkr.getWidth(), mkr.getHeight()) : 0L);
        if (!11T.A0O(abstractC2941JdU.A01, mkr) && mkr != null && (((map = abstractC2941JdU.A02) != null && !map.isEmpty()) || AbF.A1b(mkr.AWF()))) {
            java.util.Map AWF = mkr.AWF();
            if (!11T.A0O(AWF, abstractC2941JdU.A02)) {
                C2925JdD c2925JdD = abstractC2941JdU.A04.A0H.A0R.A05;
                11T.A0D(c2925JdD);
                c2925JdD.A0H.A02();
                java.util.Map map2 = abstractC2941JdU.A02;
                if (map2 == null) {
                    map2 = 1BK.A1C();
                    abstractC2941JdU.A02 = map2;
                }
                map2.clear();
                map2.putAll(AWF);
            }
        }
        abstractC2941JdU.A01 = mkr;
    }

    public static final void A04(AbstractC2941JdU abstractC2941JdU, long j) {
        if (abstractC2941JdU.A00 != j) {
            abstractC2941JdU.A00 = j;
            AbstractC2938JdR abstractC2938JdR = abstractC2941JdU.A04;
            C2925JdD c2925JdD = abstractC2938JdR.A0H.A0R.A05;
            if (c2925JdD != null) {
                c2925JdD.A0L();
            }
            AbstractC2927JdF.A02(abstractC2938JdR);
        }
        if (((AbstractC2927JdF) abstractC2941JdU).A02) {
            return;
        }
        AbstractC2927JdF.A01(abstractC2941JdU, new LPX(abstractC2941JdU.A0N(), abstractC2941JdU));
    }

    @Override // X.L56
    public final void A0K(Function1 function1, float f, long j) {
        A04(this, j);
        if (((AbstractC2927JdF) this).A03) {
            return;
        }
        if (!(this instanceof C2939JdS)) {
            A0N().CXR();
            return;
        }
        C2925JdD c2925JdD = this.A04.A0H.A0R.A05;
        11T.A0D(c2925JdD);
        c2925JdD.A0M();
    }

    public final long A0O(AbstractC2941JdU abstractC2941JdU) {
        long j = 0;
        AbstractC2941JdU abstractC2941JdU2 = this;
        while (!11T.A0O(abstractC2941JdU2, abstractC2941JdU)) {
            j = L8U.A00(j, abstractC2941JdU2.A00);
            AbstractC2938JdR abstractC2938JdR = abstractC2941JdU2.A04.A07;
            11T.A0D(abstractC2938JdR);
            abstractC2941JdU2 = abstractC2938JdR.A0Q();
            11T.A0D(abstractC2941JdU2);
        }
        return j;
    }

    public float AhL() {
        return this.A04.AhL();
    }

    public float Amu() {
        return this.A04.Amu();
    }

    public KMW AtT() {
        return this.A04.A0H.A0D;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.MNd, X.JdT] */
    public int Bd0(int i) {
        if (this instanceof C2940JdT) {
            ?? r0 = (C2940JdT) this;
            C2943Je8 c2943Je8 = r0.A00;
            return c2943Je8.A01.Bd2(AbstractC2927JdF.A00(c2943Je8), (MNd) r0, i);
        }
        KgP A00 = LPQ.A00(this.A04.A0H);
        MKQ mkq = (MKQ) A00.A00.getValue();
        LPQ lpq = A00.A01;
        return mkq.Bd1(lpq.A0T.A04, lpq.A0H(), i);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.MNd, X.JdT] */
    public int Bd3(int i) {
        if (this instanceof C2940JdT) {
            ?? r0 = (C2940JdT) this;
            C2943Je8 c2943Je8 = r0.A00;
            return c2943Je8.A01.Bd5(AbstractC2927JdF.A00(c2943Je8), (MNd) r0, i);
        }
        KgP A00 = LPQ.A00(this.A04.A0H);
        MKQ mkq = (MKQ) A00.A00.getValue();
        LPQ lpq = A00.A01;
        return mkq.Bd4(lpq.A0T.A04, lpq.A0H(), i);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.MNd, X.JdT] */
    public int BeI(int i) {
        if (this instanceof C2940JdT) {
            ?? r0 = (C2940JdT) this;
            C2943Je8 c2943Je8 = r0.A00;
            return c2943Je8.A01.BeK(AbstractC2927JdF.A00(c2943Je8), (MNd) r0, i);
        }
        KgP A00 = LPQ.A00(this.A04.A0H);
        MKQ mkq = (MKQ) A00.A00.getValue();
        LPQ lpq = A00.A01;
        return mkq.BeJ(lpq.A0T.A04, lpq.A0H(), i);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.MNd, X.JdT] */
    public int BeL(int i) {
        if (this instanceof C2940JdT) {
            ?? r0 = (C2940JdT) this;
            C2943Je8 c2943Je8 = r0.A00;
            return c2943Je8.A01.BeN(AbstractC2927JdF.A00(c2943Je8), (MNd) r0, i);
        }
        KgP A00 = LPQ.A00(this.A04.A0H);
        MKQ mkq = (MKQ) A00.A00.getValue();
        LPQ lpq = A00.A01;
        return mkq.BeM(lpq.A0T.A04, lpq.A0H(), i);
    }
}

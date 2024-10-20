package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;

/* renamed from: X.JdD, reason: case insensitive filesystem */
/* loaded from: JdD.class */
public final class C2925JdD extends L56 implements MNG, MNK, MER {
    public int A00;
    public int A01;
    public GraphicsLayer A03;
    public Constraints A04;
    public Object A06;
    public Function1 A07;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final /* synthetic */ L3O A0I;
    public Integer A05 = 0S2.A0C;
    public long A02 = 0;
    public final L4u A0H = new L4u(this);
    public final LtK A0G = LtK.A02(new C2925JdD[16]);
    public boolean A08 = true;
    public boolean A0C = true;

    public C2925JdD(L3O l3o) {
        this.A0I = l3o;
        int i = (-1) >>> 1;
        this.A01 = i;
        this.A00 = i;
        this.A06 = l3o.A0J.A0A;
    }

    private final void A00() {
        boolean z = this.A09;
        this.A09 = true;
        if (!z) {
            L3O l3o = this.A0I;
            if (l3o.A0G) {
                LPQ.A0A(l3o.A0I, true, true, true);
            }
        }
        LtK A0D = this.A0I.A0I.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                LPQ lpq = (LPQ) objArr[i2];
                C2925JdD c2925JdD = lpq.A0R.A05;
                if (c2925JdD == null) {
                    throw AnonymousClass001.A0L("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                }
                if (c2925JdD.A00 != ((-1) >>> 1)) {
                    c2925JdD.A00();
                    LPQ.A09(lpq);
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A01() {
        LPQ lpq = this.A0I.A0I;
        LPQ.A0A(lpq, false, true, true);
        LPQ A0E = lpq.A0E();
        if (A0E == null || lpq.A0E != 0S2.A0C) {
            return;
        }
        int intValue = A0E.A0R.A06.intValue();
        lpq.A0E = intValue != 0 ? intValue != 2 ? A0E.A0E : 0S2.A01 : 0S2.A00;
    }

    public static final void A02(GraphicsLayer graphicsLayer, C2925JdD c2925JdD, Function1 function1, long j) {
        L3O l3o = c2925JdD.A0I;
        MES mes = l3o.A0I;
        if (!(!((LPQ) mes).A0I)) {
            throw AnonymousClass001.A0L("place is called on a deactivated node");
        }
        l3o.A06 = 0S2.A0N;
        c2925JdD.A0D = true;
        c2925JdD.A0B = false;
        if (j != c2925JdD.A02) {
            if (l3o.A0C || l3o.A0D) {
                l3o.A0E = true;
            }
            c2925JdD.A0L();
        }
        MNF A00 = Kx3.A00(mes);
        if (l3o.A0E || !c2925JdD.A09) {
            if (l3o.A0C) {
                l3o.A0C = false;
                if (!l3o.A0D) {
                    L3O.A00(l3o, l3o.A01 - 1);
                }
            }
            c2925JdD.A0H.A02 = false;
            Kqb kqb = ((AndroidComposeView) A00).A0g;
            kqb.A00(mes, new AKc(0, j, l3o, A00), ((LPQ) mes).A08 != null ? kqb.A03 : kqb.A02);
        } else {
            AbstractC2941JdU A0Q = ((LPQ) mes).A0T.A04.A0Q();
            11T.A0D(A0Q);
            AbstractC2941JdU.A04(A0Q, L8U.A00(j, ((L56) A0Q).A02));
            c2925JdD.A0M();
        }
        c2925JdD.A02 = j;
        c2925JdD.A07 = function1;
        c2925JdD.A03 = graphicsLayer;
        l3o.A06 = 0S2.A0Y;
    }

    public static final void A03(C2925JdD c2925JdD) {
        if (c2925JdD.A09) {
            int i = 0;
            c2925JdD.A09 = false;
            LtK A0D = c2925JdD.A0I.A0I.A0D();
            int i2 = A0D.A00;
            if (i2 > 0) {
                Object[] objArr = A0D.A02;
                do {
                    C2925JdD c2925JdD2 = ((LPQ) objArr[i]).A0R.A05;
                    11T.A0D(c2925JdD2);
                    A03(c2925JdD2);
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override // X.L56
    public void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        A02(graphicsLayer, this, null, j);
    }

    @Override // X.L56
    public void A0K(Function1 function1, float f, long j) {
        A02(null, this, function1, j);
    }

    public final void A0L() {
        LtK A0D;
        int i;
        L3O l3o = this.A0I;
        if (l3o.A01 <= 0 || (i = (A0D = l3o.A0I.A0D()).A00) <= 0) {
            return;
        }
        Object[] objArr = A0D.A02;
        int i2 = 0;
        do {
            LPQ lpq = (LPQ) objArr[i2];
            L3O l3o2 = lpq.A0R;
            if ((l3o2.A0D || l3o2.A0C) && !l3o2.A0E) {
                lpq.A0Z(false);
            }
            C2925JdD c2925JdD = l3o2.A05;
            if (c2925JdD != null) {
                c2925JdD.A0L();
            }
            i2++;
        } while (i2 < i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0M() {
        /*
            r301 = this;
            r0 = r301
            r1 = 1
            r0.A0B = r1
            r0 = r301
            X.L3O r0 = r0.A0I
            X.LPQ r0 = r0.A0I
            r302 = r0
            r0 = r302
            X.LPQ r0 = r0.A0E()
            r303 = r0
            r0 = r301
            boolean r0 = r0.A09
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            if (r0 != 0) goto L87
            r0 = r301
            r0.A00()
            r0 = r301
            boolean r0 = r0.A0E
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L87
            r0 = r303
            if (r0 == 0) goto L8e
            r0 = r303
            r1 = 0
            r0.A0Z(r1)
        L37:
            r0 = r301
            boolean r0 = r0.A0E
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L82
            r0 = r303
            X.L3O r0 = r0.A0R
            r303 = r0
            r0 = r303
            java.lang.Integer r0 = r0.A06
            r306 = r0
            java.lang.Integer r0 = X.0S2.A0C
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 == r1) goto L5f
            java.lang.Integer r0 = X.0S2.A0N
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 != r1) goto L82
        L5f:
            r0 = r301
            int r0 = r0.A00
            r305 = r0
            r0 = -1
            r1 = 1
            int r0 = r0 >>> r1
            r304 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L96
            r0 = r303
            int r0 = r0.A02
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r304
            r1 = 1
            int r0 = r0 + r1
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A02 = r1
        L82:
            r0 = r301
            r0.BYA()
            return
        L87:
            r0 = r303
            if (r0 == 0) goto L8e
            goto L37
        L8e:
            r0 = r301
            r1 = 0
            r0.A00 = r1
            goto L82
        L96:
            java.lang.String r0 = "Place was called on a node which was placed already"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2925JdD.A0M():void");
    }

    public final boolean A0N(long j) {
        long A0S;
        Constraints constraints;
        L3O l3o = this.A0I;
        LPQ lpq = l3o.A0I;
        boolean z = true;
        if (!(!lpq.A0I)) {
            throw AnonymousClass001.A0L("measure is called on a deactivated node");
        }
        LPQ A0E = lpq.A0E();
        lpq.A0F = lpq.A0F || (A0E != null && A0E.A0F);
        if (!lpq.A0R.A0G && (constraints = this.A04) != null && constraints.A00 == j) {
            MNF mnf = lpq.A0A;
            if (mnf != null) {
                ((AndroidComposeView) mnf).A0f.A0B(lpq, true);
            }
            lpq.A0T();
            return false;
        }
        this.A04 = new Constraints(j);
        A0I(j);
        this.A0H.A03 = false;
        ATY(M53.A00);
        if (this.A0F) {
            A0S = super.A03;
        } else {
            int i = (-1) << (-1);
            A0S = JR1.A0S(i, i);
        }
        this.A0F = true;
        AbstractC2941JdU A0Q = lpq.A0T.A04.A0Q();
        if (A0Q == null) {
            throw AnonymousClass001.A0N("Lookahead result from lookaheadRemeasure cannot be null");
        }
        l3o.A06 = 0S2.A01;
        l3o.A0G = false;
        Kqb kqb = ((AndroidComposeView) Kx3.A00(lpq)).A0g;
        kqb.A00(lpq, new DCG(l3o, j, 0), lpq.A08 != null ? kqb.A05 : kqb.A06);
        l3o.A0E = true;
        l3o.A0F = true;
        if (KUj.A00(lpq)) {
            l3o.A0A = true;
            l3o.A0B = true;
        } else {
            l3o.A0H = true;
        }
        l3o.A06 = 0S2.A0Y;
        A0H(JR1.A0S(((L56) A0Q).A01, ((L56) A0Q).A00));
        if (JQz.A0C(A0S) == ((L56) A0Q).A01 && JR0.A0I(A0S) == ((L56) A0Q).A00) {
            z = false;
        }
        return z;
    }

    public void ATY(Function1 function1) {
        LtK A0D = this.A0I.A0I.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                C2925JdD c2925JdD = ((LPQ) objArr[i2]).A0R.A05;
                11T.A0D(c2925JdD);
                function1.invoke(c2925JdD);
                i2++;
            } while (i2 < i);
        }
    }

    public L4u AWE() {
        return this.A0H;
    }

    public C2942Je7 Aqo() {
        return this.A0I.A0I.A0T.A06;
    }

    public MNK B1I() {
        L3O l3o;
        LPQ A0E = this.A0I.A0I.A0E();
        if (A0E == null || (l3o = A0E.A0R) == null) {
            return null;
        }
        return l3o.A05;
    }

    public boolean BUq() {
        return this.A09;
    }

    public void BYA() {
        LPQ lpq;
        LtK A0D;
        int i;
        this.A0A = true;
        L4u l4u = this.A0H;
        l4u.A04();
        L3O l3o = this.A0I;
        if (l3o.A0E && (i = (A0D = (lpq = l3o.A0I).A0D()).A00) > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                LPQ lpq2 = (LPQ) objArr[i2];
                if (lpq2.A0R.A0G) {
                    C2925JdD c2925JdD = lpq2.A0R.A05;
                    if ((c2925JdD != null ? c2925JdD.A05 : 0S2.A0C) == 0S2.A00) {
                        L3O l3o2 = lpq2.A0R;
                        C2925JdD c2925JdD2 = l3o2.A05;
                        11T.A0D(c2925JdD2);
                        C2925JdD c2925JdD3 = l3o2.A05;
                        Constraints constraints = c2925JdD3 != null ? c2925JdD3.A04 : null;
                        11T.A0D(constraints);
                        if (c2925JdD2.A0N(constraints.A00)) {
                            LPQ.A0A(lpq, false, true, true);
                        }
                    }
                }
                i2++;
            } while (i2 < i);
        }
        AbstractC2941JdU A0Q = Aqo().A0Q();
        11T.A0D(A0Q);
        if (l3o.A0F || (!((AbstractC2927JdF) A0Q).A02 && l3o.A0E)) {
            l3o.A0E = false;
            Integer num = l3o.A06;
            l3o.A06 = 0S2.A0N;
            MES mes = l3o.A0I;
            MNF A00 = Kx3.A00(mes);
            if (l3o.A0D) {
                l3o.A0D = false;
                if (!l3o.A0C) {
                    L3O.A00(l3o, l3o.A01 - 1);
                }
            }
            Kqb kqb = ((AndroidComposeView) A00).A0g;
            kqb.A00(mes, new 85O(5, A0Q, this, l3o), ((LPQ) mes).A08 != null ? kqb.A04 : kqb.A01);
            l3o.A06 = num;
            if (l3o.A0D && ((AbstractC2927JdF) A0Q).A02) {
                requestLayout();
            }
            l3o.A0F = false;
        }
        if (l4u.A01) {
            l4u.A04();
            if (l4u.A00 != null) {
                l4u.A03();
            }
        }
        this.A0A = false;
    }

    public int Bd0(int i) {
        A01();
        return LDS.A03(this).Bd0(i);
    }

    public int Bd3(int i) {
        A01();
        return LDS.A03(this).Bd3(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r308 == X.0S2.A0N) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.L56 Bdz(long r302) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2925JdD.Bdz(long):X.L56");
    }

    public int BeI(int i) {
        A01();
        return LDS.A03(this).BeI(i);
    }

    public int BeL(int i) {
        A01();
        return LDS.A03(this).BeL(i);
    }

    public void Cgz() {
        LPQ.A0A(this.A0I.A0I, false, true, true);
    }

    public void Csg(boolean z) {
        AbstractC2941JdU A0Q;
        LDS lds = this.A0I.A0I.A0T;
        AbstractC2941JdU A0Q2 = lds.A04.A0Q();
        if (11T.A0O(Boolean.valueOf(z), A0Q2 != null ? Boolean.valueOf(((AbstractC2927JdF) A0Q2).A01) : null) || (A0Q = lds.A04.A0Q()) == null) {
            return;
        }
        ((AbstractC2927JdF) A0Q).A01 = z;
    }

    public void requestLayout() {
        this.A0I.A0I.A0Z(false);
    }
}

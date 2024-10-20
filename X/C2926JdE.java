package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.JdE, reason: case insensitive filesystem */
/* loaded from: JdE.class */
public final class C2926JdE extends L56 implements MNG, MNK, MER {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public GraphicsLayer A07;
    public GraphicsLayer A08;
    public Object A0A;
    public Function1 A0B;
    public Function1 A0C;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final C00m A0Q;
    public final /* synthetic */ L3O A0R;
    public Integer A09 = 0S2.A0C;
    public long A05 = 0;
    public boolean A0J = true;
    public final L4u A0N = new L4u(this);
    public final LtK A0O = LtK.A02(new C2926JdE[16]);
    public boolean A0D = true;
    public final C00m A0P = M3K.A00(this, 40);
    public long A06 = 0;

    public C2926JdE(L3O l3o) {
        this.A0R = l3o;
        int i = (-1) >>> 1;
        this.A04 = i;
        this.A03 = i;
        this.A0Q = new JR6(this, l3o, 6);
    }

    private final void A00() {
        boolean z = this.A0E;
        this.A0E = true;
        LPQ lpq = this.A0R.A0I;
        if (!z) {
            L3O l3o = lpq.A0R;
            if (l3o.A0H) {
                LPQ.A0B(lpq, true, true, true);
            } else if (l3o.A0G) {
                LPQ.A0A(lpq, true, true, true);
            }
        }
        LDS lds = lpq.A0T;
        AbstractC2938JdR abstractC2938JdR = lds.A06.A06;
        for (AbstractC2938JdR abstractC2938JdR2 = lds.A04; !11T.A0O(abstractC2938JdR2, abstractC2938JdR) && abstractC2938JdR2 != null; abstractC2938JdR2 = abstractC2938JdR2.A06) {
            if (abstractC2938JdR2.A0C) {
                abstractC2938JdR2.A0S();
            }
        }
        LtK A0D = lpq.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                LPQ lpq2 = (LPQ) objArr[i2];
                if (lpq2.A0R.A0J.A03 != ((-1) >>> 1)) {
                    lpq2.A0R.A0J.A00();
                    LPQ.A09(lpq2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A01() {
        LPQ lpq = this.A0R.A0I;
        LPQ.A0B(lpq, false, true, true);
        LPQ A0E = lpq.A0E();
        if (A0E == null || lpq.A0E != 0S2.A0C) {
            return;
        }
        int intValue = A0E.A0R.A06.intValue();
        lpq.A0E = intValue != 0 ? intValue != 2 ? A0E.A0E : 0S2.A01 : 0S2.A00;
    }

    public static final void A02(GraphicsLayer graphicsLayer, C2926JdE c2926JdE, Function1 function1, float f, long j) {
        L3O l3o = c2926JdE.A0R;
        MES mes = l3o.A0I;
        if (!(!((LPQ) mes).A0I)) {
            throw AnonymousClass001.A0L("place is called on a deactivated node");
        }
        l3o.A06 = 0S2.A0C;
        c2926JdE.A05 = j;
        c2926JdE.A00 = f;
        c2926JdE.A0B = function1;
        c2926JdE.A07 = graphicsLayer;
        c2926JdE.A0K = true;
        c2926JdE.A0I = false;
        MNF A00 = Kx3.A00(mes);
        if (l3o.A0A || !c2926JdE.A0E) {
            c2926JdE.A0N.A02 = false;
            if (l3o.A07) {
                l3o.A07 = false;
                if (!l3o.A08) {
                    l3o.A02(l3o.A00 - 1);
                }
            }
            c2926JdE.A0C = function1;
            c2926JdE.A06 = j;
            c2926JdE.A01 = f;
            c2926JdE.A08 = graphicsLayer;
            Kqb kqb = ((AndroidComposeView) A00).A0g;
            kqb.A00(mes, c2926JdE.A0Q, kqb.A02);
        } else {
            AbstractC2938JdR abstractC2938JdR = ((LPQ) mes).A0T.A04;
            AbstractC2938JdR.A0E(graphicsLayer, abstractC2938JdR, function1, f, L8U.A00(j, ((L56) abstractC2938JdR).A02));
            c2926JdE.A0N();
        }
        l3o.A06 = 0S2.A0Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009d, code lost:
    
        if (r317 == null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [X.L8T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03(androidx.compose.ui.graphics.layer.GraphicsLayer r302, kotlin.jvm.functions.Function1 r303, float r304, long r305) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2926JdE.A03(androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.jvm.functions.Function1, float, long):void");
    }

    public static final void A04(C2926JdE c2926JdE) {
        if (c2926JdE.A0E) {
            int i = 0;
            c2926JdE.A0E = false;
            LPQ lpq = c2926JdE.A0R.A0I;
            LDS lds = lpq.A0T;
            AbstractC2938JdR abstractC2938JdR = lds.A06.A06;
            for (AbstractC2938JdR abstractC2938JdR2 = lds.A04; !11T.A0O(abstractC2938JdR2, abstractC2938JdR) && abstractC2938JdR2 != null; abstractC2938JdR2 = abstractC2938JdR2.A06) {
                abstractC2938JdR2.A0W();
            }
            LtK A0D = lpq.A0D();
            int i2 = A0D.A00;
            if (i2 > 0) {
                Object[] objArr = A0D.A02;
                do {
                    A04(((LPQ) objArr[i]).A0R.A0J);
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override // X.L56
    public void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        A03(graphicsLayer, null, f, j);
    }

    @Override // X.L56
    public void A0K(Function1 function1, float f, long j) {
        A03(null, function1, f, j);
    }

    public final List A0L() {
        LPQ lpq = this.A0R.A0I;
        lpq.A0U();
        boolean z = this.A0D;
        LtK ltK = this.A0O;
        if (z) {
            LtK A0D = lpq.A0D();
            int i = A0D.A00;
            if (i > 0) {
                Object[] objArr = A0D.A02;
                int i2 = 0;
                do {
                    LPQ lpq2 = (LPQ) objArr[i2];
                    int i3 = ltK.A00;
                    C2926JdE c2926JdE = lpq2.A0R.A0J;
                    if (i3 <= i2) {
                        ltK.A0C(c2926JdE);
                    } else {
                        ltK.A02[i2] = c2926JdE;
                    }
                    i2++;
                } while (i2 < i);
            }
            ltK.A07(lpq.A0I().size(), ltK.A00);
            this.A0D = false;
        }
        List list = ltK.A01;
        if (list == null) {
            list = new Lsy(ltK);
            ltK.A01 = list;
        }
        return list;
    }

    public final void A0M() {
        LtK A0D;
        int i;
        L3O l3o = this.A0R;
        if (l3o.A00 <= 0 || (i = (A0D = l3o.A0I.A0D()).A00) <= 0) {
            return;
        }
        Object[] objArr = A0D.A02;
        int i2 = 0;
        do {
            LPQ lpq = (LPQ) objArr[i2];
            L3O l3o2 = lpq.A0R;
            if ((l3o2.A08 || l3o2.A07) && !l3o2.A0A) {
                lpq.A0a(false);
            }
            l3o2.A0J.A0M();
            i2++;
        } while (i2 < i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0N() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2926JdE.A0N():void");
    }

    public final boolean A0O(long j) {
        L3O l3o = this.A0R;
        LPQ lpq = l3o.A0I;
        boolean z = true;
        if (!(!lpq.A0I)) {
            throw AnonymousClass001.A0L("measure is called on a deactivated node");
        }
        MNF A00 = Kx3.A00(lpq);
        LPQ A0E = lpq.A0E();
        lpq.A0F = lpq.A0F || (A0E != null && A0E.A0F);
        if (!lpq.A0R.A0H && super.A04 == j) {
            ((AndroidComposeView) A00).A0f.A0B(lpq, false);
            lpq.A0T();
            return false;
        }
        this.A0N.A03 = false;
        ATY(M56.A00);
        this.A0H = true;
        LDS lds = lpq.A0T;
        long j2 = ((L56) lds.A04).A03;
        A0I(j);
        Integer num = l3o.A06;
        Integer num2 = 0S2.A0Y;
        if (num != num2) {
            throw AnonymousClass001.A0N("layout state is not idle before measure starts");
        }
        Integer num3 = 0S2.A00;
        l3o.A06 = num3;
        l3o.A0H = false;
        l3o.A04 = j;
        Kqb kqb = ((AndroidComposeView) Kx3.A00(lpq)).A0g;
        kqb.A00(lpq, l3o.A0K, kqb.A06);
        if (l3o.A06 == num3) {
            l3o.A0A = true;
            l3o.A0B = true;
            l3o.A06 = num2;
        }
        AbstractC2938JdR abstractC2938JdR = lds.A04;
        if (((L56) abstractC2938JdR).A03 == j2 && ((L56) abstractC2938JdR).A01 == super.A01 && ((L56) abstractC2938JdR).A00 == super.A00) {
            z = false;
        }
        A0H(JR1.A0S(((L56) abstractC2938JdR).A01, ((L56) abstractC2938JdR).A00));
        return z;
    }

    public void ATY(Function1 function1) {
        LtK A0D = this.A0R.A0I.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                function1.invoke(((LPQ) objArr[i2]).A0R.A0J);
                i2++;
            } while (i2 < i);
        }
    }

    public L4u AWE() {
        return this.A0N;
    }

    public C2942Je7 Aqo() {
        return this.A0R.A0I.A0T.A06;
    }

    public MNK B1I() {
        L3O l3o;
        LPQ A0E = this.A0R.A0I.A0E();
        if (A0E == null || (l3o = A0E.A0R) == null) {
            return null;
        }
        return l3o.A0J;
    }

    public boolean BUq() {
        return this.A0E;
    }

    public void BYA() {
        LPQ lpq;
        LtK A0D;
        int i;
        this.A0G = true;
        L4u l4u = this.A0N;
        l4u.A04();
        L3O l3o = this.A0R;
        if (l3o.A0A && (i = (A0D = (lpq = l3o.A0I).A0D()).A00) > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                LPQ lpq2 = (LPQ) objArr[i2];
                if (lpq2.A0R.A0H && lpq2.A0R.A0J.A09 == 0S2.A00) {
                    C2926JdE c2926JdE = lpq2.A0R.A0J;
                    if (c2926JdE.A0H) {
                        Constraints constraints = new Constraints(((L56) c2926JdE).A04);
                        if (lpq2.A0E == 0S2.A0C) {
                            lpq2.A0K();
                        }
                        if (lpq2.A0R.A0J.A0O(constraints.A00)) {
                            LPQ.A0B(lpq, false, true, true);
                        }
                    }
                }
                i2++;
            } while (i2 < i);
        }
        if (l3o.A0B || (!((AbstractC2927JdF) Aqo()).A02 && l3o.A0A)) {
            l3o.A0A = false;
            Integer num = l3o.A06;
            l3o.A06 = 0S2.A0C;
            if (l3o.A08) {
                l3o.A08 = false;
                if (!l3o.A07) {
                    l3o.A02(l3o.A00 - 1);
                }
            }
            MES mes = l3o.A0I;
            Kqb kqb = ((AndroidComposeView) Kx3.A00(mes)).A0g;
            kqb.A00(mes, this.A0P, kqb.A01);
            l3o.A06 = num;
            if (((AbstractC2927JdF) Aqo()).A02 && l3o.A08) {
                requestLayout();
            }
            l3o.A0B = false;
        }
        if (l4u.A01) {
            l4u.A04();
            if (l4u.A00 != null) {
                l4u.A03();
            }
        }
        this.A0G = false;
    }

    public int Bd0(int i) {
        A01();
        return this.A0R.A0I.A0T.A04.Bd0(i);
    }

    public int Bd3(int i) {
        A01();
        return this.A0R.A0I.A0T.A04.Bd3(i);
    }

    public L56 Bdz(long j) {
        L3O l3o = this.A0R;
        LPQ lpq = l3o.A0I;
        Integer num = lpq.A0E;
        Integer num2 = 0S2.A0C;
        if (num == num2) {
            lpq.A0K();
        }
        if (KUj.A00(lpq)) {
            C2925JdD c2925JdD = l3o.A05;
            11T.A0D(c2925JdD);
            c2925JdD.A05 = num2;
            c2925JdD.Bdz(j);
        }
        LPQ A0E = lpq.A0E();
        if (A0E != null) {
            if (this.A09 != num2 && !lpq.A0F) {
                throw AnonymousClass001.A0N("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            Integer num3 = A0E.A0R.A06;
            int intValue = num3.intValue();
            if (intValue == 0) {
                num2 = 0S2.A00;
            } else {
                if (intValue != 2) {
                    throw 1BK.A0i("Measurable could be only measured from the parent's measure or layout block. Parents state is ", KUi.A00(num3));
                }
                num2 = 0S2.A01;
            }
        }
        this.A09 = num2;
        A0O(j);
        return this;
    }

    public int BeI(int i) {
        A01();
        return this.A0R.A0I.A0T.A04.BeI(i);
    }

    public int BeL(int i) {
        A01();
        return this.A0R.A0I.A0T.A04.BeL(i);
    }

    public void Cgz() {
        LPQ.A0B(this.A0R.A0I, false, true, true);
    }

    public void Csg(boolean z) {
        AbstractC2938JdR abstractC2938JdR = this.A0R.A0I.A0T.A04;
        boolean z2 = ((AbstractC2927JdF) abstractC2938JdR).A01;
        if (z != z2) {
            ((AbstractC2927JdF) abstractC2938JdR).A01 = z2;
            this.A0M = true;
        }
    }

    public void requestLayout() {
        this.A0R.A0I.A0a(false);
    }
}

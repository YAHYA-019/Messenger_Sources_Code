package X;

import com.facebook.graphservice.interfaces.PaginableList;
import java.util.concurrent.TimeUnit;

/* loaded from: Jtw.class */
public final class Jtw extends 2Yf {
    public int A00;
    public int A01;
    public int A02;
    public PaginableList A03;
    public 1Im A04;
    public L0i A05;
    public boolean A06;

    public Jtw() {
        super("BaseInternalPaginableListSection");
        this.A06 = true;
        this.A00 = 1;
        this.A01 = 5;
        this.A02 = 10;
    }

    public Object A0M(2Yf r302) {
        return ((Jtw) r302).A05;
    }

    public void A0N(2Yf r302, 2Yf r303, C1qb c1qb) {
        ((Jtw) r303).A05 = ((Jtw) r302).A05;
    }

    public void A0O(C1qb c1qb) {
        Jtu jtu = (Jtu) ((2Yf) this).A03;
        L0i l0i = this.A05;
        KSl kSl = jtu.A02;
        Kep kep = jtu.A03;
        ELK elk = jtu.A01;
        Throwable th = jtu.A05;
        C01s A0I = 1BL.A0I();
        if (l0i == null) {
            0BS A01 = 0BR.A01("BasePaginableListSection", "null service param in onBindService()");
            A01.A04 = AnonymousClass001.A0L("service should not be null");
            DKD.A1F(A0I, A01);
            return;
        }
        if (kep != null) {
            kep.A00.set(l0i);
        }
        if (kSl != null) {
            synchronized (kSl) {
                kSl.A00 = c1qb;
                kSl.A01 = elk;
                kSl.A02 = th;
            }
            l0i.A06.set(kSl);
        }
    }

    public void A0P(C1qb c1qb) {
        this.A05 = (L0i) 1Bn.A0E(((1Iw) c1qb).A0D, (1BY) null, 131350);
    }

    public void A0R(C1qb c1qb) {
        Jtu jtu = (Jtu) ((2Yf) this).A03;
        L0i l0i = this.A05;
        KSl kSl = jtu.A02;
        Kep kep = jtu.A03;
        C01s A0I = 1BL.A0I();
        if (l0i == null) {
            0BS A01 = 0BR.A01("BasePaginableListSection", "null service param in onUnbindService()");
            A01.A04 = AnonymousClass001.A0L("service should not be null");
            DKD.A1F(A0I, A01);
            return;
        }
        l0i.A06.set(null);
        if (kSl != null) {
            synchronized (kSl) {
                kSl.A00 = null;
            }
        }
        if (kep != null) {
            kep.A00.set(null);
        }
    }

    public void A0X(2Yv r302, 2Yv r303) {
        Jtu jtu = (Jtu) r302;
        Jtu jtu2 = (Jtu) r303;
        jtu2.A05 = jtu.A05;
        jtu2.A01 = jtu.A01;
        jtu2.A00 = jtu.A00;
        jtu2.A03 = jtu.A03;
        jtu2.A02 = jtu.A02;
        jtu2.A04 = jtu.A04;
    }

    public void A0Z(2Yy r302, C1qb c1qb, int i, int i2, int i3, long j, boolean z, boolean z2) {
        int i4;
        C00i c00i;
        Jtu jtu = (Jtu) ((2Yf) this).A03;
        PaginableList paginableList = this.A03;
        int i5 = jtu.A00;
        KpK kpK = jtu.A04;
        KpK kpK2 = (KhP) 1Bn.A0A(131351);
        if (i5 != 0) {
            String str = paginableList.mNextPageUUID;
            if (paginableList.mIsLoadingNext || 1JF.A0B(str) || !kpK.A00(str)) {
                return;
            }
            for (C2hp c2hp : r302.A00) {
                if (c2hp != null && ((i4 = c2hp.A03) == -1 || i4 == 1)) {
                    synchronized (kpK) {
                        try {
                            kpK.A01.remove(str);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int hashCode = str.hashCode();
                    kpK = kpK2;
                    synchronized (kpK2) {
                        c00i = ((KhP) kpK2).A01;
                        1BK.A0V(c00i).markerPoint(i5, hashCode, "render_end", 1BL.A09(((KhP) kpK2).A00), TimeUnit.MILLISECONDS);
                    }
                    synchronized (kpK2) {
                        1BK.A0U(c00i).markerEnd(i5, hashCode, (short) 2);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.KSl, java.lang.Object] */
    public void A0a(C1qb c1qb) {
        Jtu jtu = (Jtu) ((2Yf) this).A03;
        1Bi.A03(16385);
        ELK elk = ELK.A04;
        ?? obj = new Object();
        ((KSl) obj).A00 = c1qb;
        int i = 0;
        if (((2yD) 1Bi.A03(16385)).AZk(36312097357041527L)) {
            i = 25821189;
        }
        Integer valueOf = Integer.valueOf(i);
        Kep kep = new Kep();
        KpK kpK = new KpK();
        jtu.A01 = elk;
        jtu.A02 = obj;
        if (valueOf != null) {
            jtu.A00 = valueOf.intValue();
        }
        jtu.A03 = kep;
        jtu.A04 = kpK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x030f  */
    /* JADX WARN: Type inference failed for: r319v0, types: [X.01s] */
    /* JADX WARN: Type inference failed for: r319v1 */
    /* JADX WARN: Type inference failed for: r319v5, types: [X.L0i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0b(X.C1qb r302, int r303, int r304, int r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jtw.A0b(X.1qb, int, int, int, int, int):void");
    }

    public boolean A0c(2Yf r302, 2Yf r303, C1qb c1qb, C1qb c1qb2) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.RKy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2Ys A0d(X.C1qb r302) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jtw.A0d(X.1qb):X.2Ys");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        2Yf A0g = super.A0g(z);
        if (!z) {
            A0g.A03 = new Object();
        }
        return A0g;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Jtw jtw = (Jtw) r302;
            if (this.A06 != jtw.A06 || this.A00 != jtw.A00 || this.A01 != jtw.A01 || this.A02 != jtw.A02) {
                return false;
            }
            PaginableList paginableList = this.A03;
            PaginableList paginableList2 = jtw.A03;
            if (paginableList != null) {
                if (!paginableList.equals(paginableList2)) {
                    return false;
                }
            } else if (paginableList2 != null) {
                return false;
            }
        }
        return true;
    }
}

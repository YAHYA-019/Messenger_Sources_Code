package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.List;

/* loaded from: E0u.class */
public final class E0u extends 2Yf {
    public static final CallerContext A02 = CallerContext.A0B("NewHomeSectionSpec");
    public Ra0 A00;
    public RoA A01;

    public E0u() {
        super("NewHomeSection");
    }

    public void A0X(2Yv r302, 2Yv r303) {
        E0K e0k = (E0K) r302;
        E0K e0k2 = (E0K) r303;
        e0k2.A00 = e0k.A00;
        e0k2.A01 = e0k.A01;
        e0k2.A02 = e0k.A02;
    }

    public void A0a(C1qb c1qb) {
        E0K e0k = ((2Yf) this).A03;
        Ra0 ra0 = this.A00;
        11T.A0F(ra0, 4);
        FdY fdY = new FdY(ra0);
        Fda fda = new Fda(ra0);
        Fdb fdb = new Fdb(ra0);
        e0k.A00 = fdY;
        e0k.A01 = fda;
        e0k.A02 = fdb;
    }

    public 2Ys A0d(C1qb c1qb) {
        E0K e0k = ((2Yf) this).A03;
        RoA roA = this.A01;
        GET get = e0k.A00;
        11T.A0F(c1qb, 0);
        11T.A0G(roA, 1, get);
        2Ys r0 = new 2Ys();
        2hO r02 = new 2hO();
        r02.A00 = new Dvz(2Yg.A09(c1qb, E0u.class, "NewHomeSection", 231554742)).A0l();
        r02.A01 = true;
        List list = r0.A00;
        list.add(r02);
        1Du it = roA.A00.iterator();
        while (it.hasNext()) {
            RSR rsr = (RSR) it.next();
            String str = rsr.A01;
            if (str != null) {
                2hO r03 = new 2hO();
                C1rq A01 = C1rg.A01(c1qb, null, 0);
                A01.A19(16.0f);
                A01.A0X();
                C2152Dfg c2152Dfg = new C2152Dfg(c1qb);
                c2152Dfg.A05 = str;
                c2152Dfg.A03 = EP4.A0I;
                c2152Dfg.A0e(true);
                AbstractC2178Dg6.A09(A02, c2152Dfg, A01);
                r03.A00 = A01.A00;
                r03.A01 = true;
                list.add(r03);
            }
            C2he c2he = new C2he();
            c2he.A05 = rsr.A00;
            c2he.A02 = 2Yg.A07(c1qb, E0u.class, "NewHomeSection");
            c2he.A01 = 2Yg.A06(c1qb, E0u.class, "NewHomeSection");
            c2he.A00 = 2Yg.A08(c1qb, E0u.class, "NewHomeSection");
            list.add(c2he);
        }
        2hO r04 = new 2hO();
        C1rq A012 = C1rg.A01(c1qb, null, 0);
        A012.A25(C26z.ALL, 16.0f);
        A012.A0X();
        A012.A0e();
        DuI duI = new DuI(new DxX(), c1qb);
        duI.A0e();
        DxX dxX = duI.A00;
        dxX.A02 = true;
        duI.A2W(2131956755);
        dxX.A00 = get;
        A012.A2e(duI);
        r04.A00 = 7zQ.A0T(A012.A00);
        r04.A01 = true;
        list.add(r04);
        return r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x015d, code lost:
    
        if (com.google.common.base.Objects.equal(r310, r307) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x034e, code lost:
    
        if (com.google.common.base.Objects.equal(r310, r307) != false) goto L86;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.2hj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0u.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0u e0u = (E0u) r302;
            RoA roA = this.A01;
            RoA roA2 = e0u.A01;
            if (roA != null) {
                if (!roA.equals(roA2)) {
                    return false;
                }
            } else if (roA2 != null) {
                return false;
            }
            Ra0 ra0 = this.A00;
            Ra0 ra02 = e0u.A00;
            if (ra0 != null) {
                if (!ra0.equals(ra02)) {
                    return false;
                }
            } else if (ra02 != null) {
                return false;
            }
        }
        return true;
    }
}

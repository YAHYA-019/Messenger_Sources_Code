package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8nc, reason: invalid class name */
/* loaded from: 8nc.class */
public final class C8nc extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 2NI A05;
    public 2kG A06;
    public 2Yf A07;
    public C2kf A08;
    public 3xS A09;
    public 9cG A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Integer A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public static final C2kf A0P = new 2kW().A00();
    public static final 2NI A0O = new C2kh();

    public C8nc() {
        super("CollectionRecycler");
        this.A0I = true;
        this.A0J = true;
        this.A0K = true;
        this.A0L = true;
        this.A05 = A0O;
        this.A0F = Collections.emptyList();
        this.A08 = A0P;
    }

    public final Object[] A0k() {
        Object[] objArr = new Object[34];
        boolean A1W = 1BK.A1W(new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A0G), this.A0B, this.A0C, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0I), Boolean.valueOf(this.A0J), Boolean.valueOf(this.A0K), Boolean.valueOf(this.A0L), this.A05, this.A06, null, this.A0A, this.A0D, this.A0F, this.A0E, Boolean.valueOf(this.A0M), this.A08, null, null, null, null, null, this.A07, null}, objArr);
        System.arraycopy(new Object[]{null, Boolean.valueOf(A1W), Integer.valueOf(this.A03), null, Integer.valueOf(this.A04), this.A09, Boolean.valueOf(this.A0N)}, A1W ? 1 : 0, objArr, 27, 7);
        return objArr;
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8nc c8nc = (C8nc) super.A0l();
        2Yf r0 = c8nc.A07;
        c8nc.A07 = r0 != null ? r0.A0g(false) : null;
        return c8nc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00d6, code lost:
    
        if (r0 == false) goto L6;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8nc.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1873243140) {
            if (i != -1048037474) {
                return null;
            }
            1LI.A0J(r302, obj);
            return null;
        }
        2Xo r0 = ((C8pd) 4YU.A0P(r302.A00.A00)).A00;
        11T.A0F(r0, 1);
        r0.A0M();
        return true;
    }

    @Override // X.C1rj
    public void A1D(1Iw r302) {
        C2X2 c2x2 = ((C8pd) 4YU.A0P(r302)).A01;
        11T.A0F(c2x2, 1);
        c2x2.AN3();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C8pd c8pd = (C8pd) r303;
        2Yf r0 = this.A07;
        C2kf c2kf = this.A08;
        boolean z = this.A0G;
        9cG r02 = this.A0A;
        7zS.A17(0, r302, r0, c2kf);
        2kZ B6R = c2kf.B6R();
        C2ys c2ys = new C2ys();
        c2ys.A04 = c2kf.AtV(r302);
        c2ys.A03 = null;
        c2ys.A06 = B6R.A02;
        2Xm r03 = new 2Xm(c2ys.A00(r302), B6R.A01);
        C1qb c1qb = new C1qb(r302);
        String str = r0.A0D;
        if (str == null) {
            str = "";
        }
        final 2Xo r04 = new 2Xo(c1qb, r03, B6R.A00, str, false, false, B6R.A04);
        if (r02 != null) {
            r02.A00 = r04;
        }
        C2ky c2ky = new C2ky();
        if (r02 != null) {
            r02.A01 = c2ky;
        }
        2XZ r05 = new 2XZ() { // from class: X.9t3
            public final void D95(int i, int i2, int i3, int i4, int i5) {
                r04.A0N(i, i2, i3, i4, i5);
            }
        };
        C2X1 c2x1 = r03.A00;
        2Xj r06 = c2x1.A0a;
        synchronized (r06) {
            r06.A07.add(r05);
        }
        c2x1.A0F = z;
        c8pd.A00 = r04;
        c8pd.A01 = r03;
        c8pd.A02 = c2ky;
    }

    @Override // X.C1rj
    public boolean A1R() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

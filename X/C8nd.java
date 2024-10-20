package X;

import android.content.Context;
import android.view.ViewConfiguration;
import java.util.List;

/* renamed from: X.8nd, reason: invalid class name */
/* loaded from: 8nd.class */
public final class C8nd extends C1rj {
    public static final C2kf A0A;
    public int A00;
    public 1LI A01;
    public 1LI A02;
    public 1Im A03;
    public 1Im A04;
    public 1Im A05;
    public C2ko A06;
    public C2kf A07;
    public List A08;
    public boolean A09;

    static {
        2kW r0 = new 2kW();
        r0.A01 = 0;
        r0.A02 = (-1) >>> 1;
        A0A = r0.A00();
    }

    public C8nd() {
        super("ViewPagerComponent");
        this.A00 = 0;
        this.A09 = false;
        this.A07 = A0A;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A09), this.A08, this.A01, this.A02, this.A07, this.A05, 4YU.A0k(), 7zN.A0h()};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8nd c8nd = (C8nd) super.A0l();
        1LI r304 = null;
        c8nd.A01 = 7zO.A0S(c8nd.A01);
        1LI r0 = c8nd.A02;
        if (r0 != null) {
            r304 = r0.A0l();
        }
        c8nd.A02 = r304;
        return c8nd;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        8pY A0P = 4YU.A0P(r302);
        List list = this.A08;
        1LI r0 = this.A01;
        1LI r02 = this.A02;
        1Im r03 = this.A05;
        C2kf c2kf = this.A07;
        int i = this.A00;
        int i2 = A0P.A00;
        3xS r04 = A0P.A01;
        String A0C = r302.A0C();
        C9ab c9ab = new C9ab(A0C);
        C2kx c2kx = (C2kx) r302.A0B(c9ab, A0C, 0);
        if (c2kx == null) {
            c2kx = new C2kx();
            r302.A0I(c9ab, c2kx, A0C, 0);
        }
        C2ki A00 = C2kV.A00(new C1qb(r302));
        C8qb c8qb = new C8qb();
        c8qb.A02 = 1LI.A0A(r302, C8nd.class, "ViewPagerComponent", 239257522);
        c8qb.A04 = list;
        c8qb.A00 = i;
        c8qb.A03 = r03;
        1LI r05 = r302.A02;
        c8qb.A01 = r05 == null ? null : ((C8nd) r05).A03;
        A00.A2d(c8qb);
        A00.A2j(true);
        A00.A0R();
        C2kV c2kV = A00.A01;
        c2kV.A0O = r04;
        A00.A2f(c2kf);
        A00.A2e(c2kx);
        A00.A0C(i2);
        c2kV.A0d = false;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A2h(C1rp.FLEX_START);
        A01.A2e(r02);
        A01.A2e(A00.A2W());
        return 7zL.A0V(A01, r0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.9MU, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        Object obj2 = null;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 239257522) {
            1Iw r0 = r302.A00.A00;
            Object obj3 = ((9MU) obj).A00;
            1LI r02 = r0.A02;
            1Im r308 = r02 == null ? null : ((C8nd) r02).A04;
            ?? obj4 = new Object();
            ((9MU) obj4).A00 = obj3;
            obj2 = r308.A00((Object) obj4);
        }
        return obj2;
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (c2ko.A02 != -892020616) {
            return null;
        }
        1Iw r0 = c2ko.A00;
        C1rl c1rl = c2ko.A01;
        int i = ((9MV) obj).A00;
        boolean z = ((C8nd) c1rl).A09;
        String A0C = r0.A0C();
        C9ab c9ab = new C9ab(A0C);
        C2ky c2ky = (C2ky) r0.A0B(c9ab, A0C, 0);
        if (c2ky == null) {
            c2ky = new C2kx();
            r0.A0I(c9ab, c2ky, A0C, 0);
        }
        c2ky.A05(i, z);
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A06, this, r303);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.3Yx, X.3xS, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        8pY r0 = (8pY) r303;
        Context context = r302.A0D;
        ?? obj = new Object();
        obj.A00 = -1;
        obj.A01 = ViewConfiguration.get(context).getScaledTouchSlop();
        int A01 = C7W1.A01(context);
        r0.A01 = obj;
        r0.A00 = A01;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

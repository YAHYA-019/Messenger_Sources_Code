package X;

import java.util.BitSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.8lh, reason: invalid class name */
/* loaded from: 8lh.class */
public final class C8lh extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 1LI A05;
    public C2ko A06;
    public 7HH A07;
    public C5fv A08;
    public AaS A09;
    public 6vE A0A;
    public String A0B;
    public List A0C;
    public Set A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    public C8lh() {
        super("ReactionsAndActionDrawerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, Integer.valueOf(this.A00), Boolean.valueOf(this.A0E), Integer.valueOf(this.A01), this.A0D, this.A07, Boolean.valueOf(this.A0F), this.A08, this.A0B, Integer.valueOf(this.A02), this.A09, Integer.valueOf(this.A03), this.A0C, Integer.valueOf(this.A04), Boolean.valueOf(this.A0G), Boolean.valueOf(this.A0H), this.A0A};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8lh c8lh = (C8lh) super.A0l();
        c8lh.A05 = 4YV.A0J(c8lh.A05);
        return c8lh;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        8oW r331;
        C8q6 c8q6 = (C8q6) 4YU.A0P(r302);
        1LI r0 = this.A05;
        int i = this.A00;
        Set set = this.A0D;
        String str = this.A0B;
        AaS aaS = this.A09;
        int i2 = this.A03;
        List list = this.A0C;
        boolean z = this.A0G;
        boolean z2 = this.A0H;
        boolean z3 = this.A0F;
        boolean z4 = this.A0E;
        int i3 = this.A02;
        int i4 = this.A04;
        7HH r02 = this.A07;
        6vE r03 = this.A0A;
        C5fv c5fv = this.A08;
        boolean z5 = c8q6.A00;
        11T.A0F(set, 3);
        11T.A0F(str, 4);
        11T.A0F(aaS, 5);
        11T.A0F(list, 7);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        2cL r304 = null;
        if (z) {
            8SD r04 = new 8SD(r302, new 8oW());
            r331 = r04.A01;
            r331.A09 = set;
            BitSet bitSet = r04.A02;
            bitSet.set(1);
            r331.A03 = r02;
            bitSet.set(2);
            r331.A0B = z5;
            r331.A07 = str;
            bitSet.set(5);
            r331.A04 = c5fv;
            bitSet.set(4);
            r331.A00 = i3;
            bitSet.set(6);
            r331.A05 = aaS;
            bitSet.set(7);
            r331.A08 = list;
            bitSet.set(8);
            r331.A01 = i4;
            bitSet.set(9);
            r331.A02 = i2;
            bitSet.set(12);
            r331.A06 = r03;
            bitSet.set(11);
            r331.A0C = z3;
            bitSet.set(3);
            r331.A0D = z2;
            bitSet.set(10);
            r331.A0A = z4;
            bitSet.set(0);
            C1rs.A05(bitSet, r04.A03, 13);
            r04.A0J();
        } else {
            r331 = null;
        }
        A01.A2e(r331);
        if (!z5) {
            if (z2) {
                2cM A012 = 2cK.A01(r302, (String) null, 0);
                A012.A1L(i);
                2dD A0p = 7zM.A0p(r0, r302);
                A0p.A2L("ACTION_DRAWER_TRANSITION_KEY");
                A0p.A0d();
                A0p.A2E(C26z.TOP, (-i2) + i);
                A0p.A2E(z3 ? C26z.END : C26z.START, 7zN.A01(4YU.A0E(r302)));
                A0p.A1y(z3 ? C1ro.FLEX_END : C1ro.FLEX_START);
                r304 = 7zL.A0V(A012, A0p.A2W());
            } else {
                2dD A0p2 = 7zM.A0p(r0, r302);
                A0p2.A2L("ACTION_DRAWER_TRANSITION_KEY");
                A0p2.A0d();
                r304 = A0p2.A2W();
            }
        }
        A01.A2e(r304);
        7zN.A1C(A01, r302, C8lh.class, "ReactionsAndActionDrawerComponent");
        A01.A0R();
        A01.A0m(100.0f);
        A01.A2h(C1rp.FLEX_END);
        A01.A10(100.0f);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        5X3 A02;
        float A00;
        boolean z = this.A0H;
        11T.A0F(r302, 0);
        if (z) {
            A02 = C3s9.A02("ACTION_DRAWER_TRANSITION_KEY");
            A02.A03(C2jm.A00);
            7zM.A1U(A02, 50);
            A00 = 0.0f;
        } else {
            A02 = C3s9.A02("ACTION_DRAWER_TRANSITION_KEY");
            A02.A03(C2jm.A09);
            7zM.A1U(A02, 250);
            A00 = C7W1.A00(7zL.A0A(r302));
        }
        A02.A01(A00);
        return A02;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        C8lh c8lh = (C8lh) r02;
        C8q6 c8q6 = (C8q6) 4YU.A0P(r03);
        AaS aaS = c8lh.A09;
        boolean z = c8q6.A00;
        11T.A0F(aaS, 1);
        if (z) {
            return null;
        }
        aaS.D1a();
        return null;
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (c2ko.A02 != 892946138) {
            return null;
        }
        1Iw r0 = c2ko.A00;
        C8lh c8lh = (C8lh) c2ko.A01;
        AaS aaS = c8lh.A09;
        boolean z = c8lh.A0H;
        1BK.A1M(r0, aaS);
        float A00 = C7W1.A00(7zL.A0A(r0));
        if (r0.A02 == null) {
            return null;
        }
        r0.A0G(7zL.A0f(new Object[]{Float.valueOf(A00), aaS, Boolean.valueOf(z)}, 0), "updateState:ReactionsAndActionDrawerComponent.beginDismissalAnimation");
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A06, this, r303);
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

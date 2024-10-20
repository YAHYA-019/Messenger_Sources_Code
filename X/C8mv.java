package X;

import com.mapbox.mapboxsdk.R;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8mv, reason: invalid class name */
/* loaded from: 8mv.class */
public final class C8mv extends C1rj {
    public static final C2kf A06;
    public int A00;
    public int A01;
    public int A02;
    public C2kf A03;
    public 6RU A04;
    public List A05;

    static {
        2kW r0 = new 2kW();
        r0.A01 = 0;
        r0.A08 = false;
        A06 = r0.A00();
    }

    public C8mv() {
        super("DrawerShelfComponent");
        this.A00 = 2132279367;
        this.A01 = 2132279310;
        this.A05 = Collections.emptyList();
        this.A02 = -16777216;
        this.A03 = A06;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A05, Integer.valueOf(this.A02), this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        List list = this.A05;
        C2kf c2kf = this.A03;
        11T.A0F(r302, 0);
        11T.A0G(list, 1, c2kf);
        C2ki A00 = C2kV.A00(r302);
        A00.A2j(true);
        A00.A2h(true);
        A00.A2f(c2kf);
        A00.A0e();
        C2kV c2kV = A00.A01;
        C1qo c1qo = ((C1rs) A00).A02;
        c2kV.A02 = c1qo.A06(R.dimen.mapbox_eight_dp);
        c2kV.A06 = c1qo.A06(R.dimen.mapbox_eight_dp);
        A00.A0R();
        A00.A2i(false);
        C2hf A0s = 7zM.A0s(new C1qb(r302), list);
        A0s.A05(1LI.A0A(r302, C8mv.class, "DrawerShelfComponent", 239392008));
        A00.A2d(A0s.A01());
        return A00.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        C2hl c2hl = null;
        if (i == -1351902487) {
            1Is r0 = r302.A00.A01;
            78P r02 = (78P) 7zN.A0o(r302);
            6RU r03 = ((C8mv) r0).A04;
            1BL.A1F(r03, r02);
            7FI.A02(r03, r02.A04);
            return null;
        }
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 239392008) {
            1Iv r04 = r302.A00;
            1Is r05 = r04.A01;
            1Iw r06 = r04.A00;
            78P r07 = (78P) ((C2i6) obj).A01;
            C8mv c8mv = (C8mv) r05;
            int i2 = c8mv.A02;
            int i3 = c8mv.A01;
            int i4 = c8mv.A00;
            11T.A0F(r06, 0);
            11T.A0F(r07, 4);
            C2hj A0m = 7zL.A0m();
            QEr qEr = new QEr(r06, new QKI());
            int i5 = r07.A02;
            QKI qki = qEr.A01;
            C1qo c1qo = qEr.A02;
            qki.A05 = c1qo.A0B(i5);
            BitSet bitSet = qEr.A02;
            bitSet.set(4);
            78O r08 = r07.A03;
            7zL.A1L(r06);
            qki.A02 = r08.A00;
            bitSet.set(2);
            qki.A06 = c1qo.A0D(r07.A00);
            bitSet.set(0);
            qki.A00 = i2;
            bitSet.set(1);
            qki.A07 = c1qo.A0D(r07.A01);
            bitSet.set(3);
            qEr.A1c(R.dimen.mapbox_eight_dp);
            qki.A04 = i3;
            qki.A01 = i4;
            7zM.A1N(qEr, r06, C8mv.class, "DrawerShelfComponent", new Object[]{r07});
            C1rs.A04(bitSet, qEr.A03);
            qEr.A0J();
            c2hl = 7zM.A0t(qki, A0m);
        }
        return c2hl;
    }
}

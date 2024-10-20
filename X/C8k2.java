package X;

import android.view.View;

/* renamed from: X.8k2, reason: invalid class name */
/* loaded from: 8k2.class */
public final class C8k2 extends C1rj {
    public C59g A00;

    public C8k2() {
        super("MigIconButtonAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C59g c59g = this.A00;
        11T.A0H(r302, c59g);
        1Im r305 = null;
        C83g A00 = C02413v4.A00(r302);
        A00.A2Z(c59g.A01);
        A00.A2a(c59g.A02);
        boolean z = c59g.A09;
        A00.A2g(z);
        A00.A2e(c59g.A06);
        A00.A2d(c59g.A05);
        A00.A2S(c59g.A08);
        if (z) {
            r305 = 1LI.A06(r302, C8k2.class, "MigIconButtonAccessoryLayout");
        }
        A00.A2b(r305);
        A00.A2c(c59g.A03);
        A00.A1N(c59g.A00);
        return A00.A2V();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        C59g c59g = ((C8k2) r0).A00;
        1BL.A1F(c59g, view);
        c59g.A04.onClick(view);
        return null;
    }
}

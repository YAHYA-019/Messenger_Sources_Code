package X;

import android.view.View;

/* renamed from: X.7fq, reason: invalid class name */
/* loaded from: 7fq.class */
public final class C7fq extends C1rj {
    public C59m A00;

    public C7fq() {
        super("MigTertiaryButtonAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C59m c59m = this.A00;
        11T.A0H(r302, c59m);
        5fH A00 = 5fG.A00(r302);
        A00.A2Z(c59m.A03);
        A00.A2S(c59m.A01);
        boolean z = c59m.A04;
        A00.A2a(z);
        A00.A2Y(c59m.A00);
        A00.A2T(z ? 1LI.A06(r302, C7fq.class, "MigTertiaryButtonAccessoryLayout") : null);
        return A00.A2W();
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
        C59m c59m = ((C7fq) r0).A00;
        11T.A0F(c59m, 1);
        AnonymousClass553 anonymousClass553 = c59m.A02;
        if (view == null) {
            throw 1BK.A0h();
        }
        anonymousClass553.onClick(view);
        return null;
    }
}

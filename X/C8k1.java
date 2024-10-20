package X;

import android.view.View;

/* renamed from: X.8k1, reason: invalid class name */
/* loaded from: 8k1.class */
public final class C8k1 extends C1rj {
    public C59o A00;

    public C8k1() {
        super("MigFlatPrimaryAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C59o c59o = this.A00;
        1BK.A1M(r302, c59o);
        8TX A00 = C8nl.A00(r302);
        A00.A2a(c59o.A02);
        A00.A2b(false);
        A00.A2Z(c59o.A00);
        A00.A2T(null);
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
        C59o c59o = ((C8k1) r0).A00;
        11T.A0F(c59o, 1);
        AnonymousClass553 anonymousClass553 = c59o.A01;
        if (view == null) {
            throw 1BK.A0h();
        }
        anonymousClass553.onClick(view);
        return null;
    }
}

package X;

import android.view.View;

/* renamed from: X.8k3, reason: invalid class name */
/* loaded from: 8k3.class */
public final class C8k3 extends C1rj {
    public C59i A00;

    public C8k3() {
        super("MigPrimaryButtonAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C59i c59i = this.A00;
        boolean A1W = 1BL.A1W(r302, c59i);
        8Th A00 = C8nq.A00(r302);
        A00.A2a(c59i.A02);
        A00.A2b(A1W);
        A00.A2Z(c59i.A00);
        7zN.A1C(A00, r302, C8k3.class, "MigPrimaryButtonAccessoryLayout");
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
        C59i c59i = ((C8k3) r0).A00;
        11T.A0F(c59i, 1);
        AnonymousClass553 anonymousClass553 = c59i.A01;
        if (view == null) {
            throw 1BK.A0h();
        }
        anonymousClass553.onClick(view);
        return null;
    }
}

package X;

import android.view.View;

/* renamed from: X.Ayz, reason: case insensitive filesystem */
/* loaded from: Ayz.class */
public final class C2006Ayz extends C1rj {
    public C59s A00;

    public C2006Ayz() {
        super("MigFlatTertiaryAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C59s c59s = this.A00;
        11T.A0H(r302, c59s);
        AwY A00 = B0m.A00(r302);
        A00.A2Y(c59s.A02);
        boolean z = c59s.A03;
        A00.A2Z(z);
        A00.A2X(c59s.A00);
        A00.A2T(z ? 1LI.A06(r302, C2006Ayz.class, "MigFlatTertiaryAccessoryLayout") : null);
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
        C59s c59s = ((C2006Ayz) r0).A00;
        11T.A0F(c59s, 1);
        AnonymousClass553 anonymousClass553 = c59s.A01;
        if (view == null) {
            throw 1BK.A0h();
        }
        anonymousClass553.onClick(view);
        return null;
    }
}

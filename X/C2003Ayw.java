package X;

import android.view.View;

/* renamed from: X.Ayw, reason: case insensitive filesystem */
/* loaded from: Ayw.class */
public final class C2003Ayw extends C1rj {
    public C2003Ayw() {
        super("ContextMenuButtonAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{null};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cl.A00(r302);
        throw AnonymousClass001.A0Q("menuIconDrawableResId");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        View view = ((3xC) obj).A00;
        new 8Ca(view.getContext(), view);
        throw AnonymousClass001.A0Q("menuHandler");
    }
}

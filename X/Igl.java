package X;

import androidx.lifecycle.LifecycleOwner;

/* loaded from: Igl.class */
public final class Igl implements GGS {
    public final /* synthetic */ H4x A00;

    public Igl(H4x h4x) {
        this.A00 = h4x;
    }

    public final void BwD() {
        LifecycleOwner lifecycleOwner;
        H4x h4x = this.A00;
        06Z r0 = h4x.A01;
        if (r0 == null || (lifecycleOwner = h4x.A02) == null) {
            return;
        }
        1Br.A0C(h4x.A0O);
        Hvu.A00(r0, lifecycleOwner, h4x.A03, new IgZ(h4x, 5), "SearchTabView");
    }
}

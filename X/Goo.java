package X;

import android.view.ViewGroup;

/* loaded from: Goo.class */
public final class Goo extends IXY {
    public boolean A00;
    public final 1Br A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Goo(ViewGroup viewGroup, Hao hao) {
        super(viewGroup, hao, 2131368426);
        11T.A0F(viewGroup, 2);
        this.A01 = 1Bu.A01(4YU.A08(viewGroup), 16980);
    }

    public void A03() {
        super.A03();
        I3K i3k = ((IXY) this).A06;
        I0O i0o = new I0O(i3k.A02());
        i0o.A0D = false;
        I3K.A00(i0o, i3k);
    }

    public void A05() {
        super.A05();
        I3K i3k = ((IXY) this).A06;
        I0O i0o = new I0O(i3k.A02());
        i0o.A0D = true;
        I3K.A00(i0o, i3k);
    }
}

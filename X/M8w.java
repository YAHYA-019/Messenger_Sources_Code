package X;

import androidx.compose.foundation.ScrollSemanticsElement;
import androidx.compose.foundation.ScrollingLayoutElement;

/* loaded from: M8w.class */
public final class M8w extends C00q implements C0Bd {
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ LMp $state;
    public final /* synthetic */ boolean $reverseScrolling = false;
    public final /* synthetic */ MBC $flingBehavior = null;
    public final /* synthetic */ boolean $isScrollable = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8w(LMp lMp, boolean z) {
        super(3);
        this.$state = lMp;
        this.$isVertical = z;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        LNS A0N = JQz.A0N(obj2, obj3);
        A0N.D2A(1478351300);
        LMp lMp = this.$state;
        boolean z = this.$reverseScrolling;
        MBC mbc = this.$flingBehavior;
        boolean z2 = this.$isScrollable;
        boolean z3 = this.$isVertical;
        MLj D4B = KU0.A00(mbc, z3 ? KMT.A02 : KMT.A01, lMp, lMp.A02, A0N, new ScrollSemanticsElement(lMp, mbc, z, z2, z3), z2, z).D4B(new ScrollingLayoutElement(this.$state, this.$reverseScrolling, this.$isVertical));
        LNS.A0P(A0N, false);
        return D4B;
    }
}

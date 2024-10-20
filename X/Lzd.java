package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* loaded from: Lzd.class */
public final class Lzd extends 0DP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lzd(Object obj, 0DR r303, int i) {
        super(r303);
        this.A04 = i;
        this.A05 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A00 |= (-1) << (-1);
        return i != 0 ? ((NestedScrollNode) this.A05).CD6(this, 0L) : ((AndroidEdgeEffectOverscrollEffect) this.A05).A94(this, null, 0L);
    }
}

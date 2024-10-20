package X;

import com.facebook.litho.ComponentTree;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8ib, reason: invalid class name */
/* loaded from: 8ib.class */
public final class C8ib extends 2Kb {
    public final Hkb A00;
    public final 1LI A01;
    public final 2lO A02;
    public final Function2 A03;

    public C8ib(1LI r302, 2lO r303, Hkb hkb, Function2 function2) {
        11T.A0F(hkb, 2);
        this.A01 = r302;
        this.A00 = hkb;
        this.A03 = function2;
        this.A02 = r303;
    }

    public C2lt A0s(2lX r302) {
        11T.A0F(r302, 0);
        C2lh A00 = C2lc.A00(r302, new J9o(r302, 38));
        ComponentTree componentTree = (ComponentTree) A00.A02;
        componentTree.A0O(this.A01);
        return new C2lt(this.A02, new A2i(componentTree, this.A03), new C2ll(7zQ.A0s(A2b.A00, true), AOx.A00, 83T.A01(this, A00, 39), r302.A01()));
    }
}

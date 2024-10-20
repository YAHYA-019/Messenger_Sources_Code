package X;

import kotlin.jvm.functions.Function2;

/* loaded from: A2y.class */
public final class A2y implements Ab8, AXA {
    public final int A00;
    public final Object A01;

    public A2y(Function2 function2, int i) {
        this.A00 = i;
        this.A01 = function2;
    }

    @Override // X.Ab8
    public final void BQ6(8LW r302, Object obj) {
        11T.A0F(r302, 0);
        ((Function2) this.A01).invoke(r302, obj);
    }
}

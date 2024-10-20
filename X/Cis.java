package X;

import kotlin.jvm.functions.Function1;

/* loaded from: Cis.class */
public final class Cis implements AXi {
    public final /* synthetic */ Function1 A00;

    public Cis(Function1 function1) {
        this.A00 = function1;
    }

    @Override // X.AXi
    public void C0a(String str) {
        this.A00.invoke(str);
    }
}

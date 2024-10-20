package X;

import kotlin.jvm.functions.Function1;

/* loaded from: Iyg.class */
public final class Iyg implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerObserversManager$postUpdate$1";
    public final /* synthetic */ GRJ A00;
    public final /* synthetic */ Function1 A01;

    public Iyg(GRJ grj, Function1 function1) {
        this.A00 = grj;
        this.A01 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GRJ.A00(this.A00, this.A01);
    }
}

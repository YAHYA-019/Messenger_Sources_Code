package X;

import android.util.Pair;

/* loaded from: Lpo.class */
public final /* synthetic */ class Lpo implements Runnable {
    public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2";
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ JTk A01;
    public final /* synthetic */ 6aF A02;

    public /* synthetic */ Lpo(Pair pair, JTk jTk, 6aF r304) {
        this.A01 = jTk;
        this.A00 = pair;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JTk jTk = this.A01;
        Pair pair = this.A00;
        6aF r0 = this.A02;
        jTk.A01.A04.Buw(r0, (6YR) pair.second, GOo.A03(pair));
    }
}

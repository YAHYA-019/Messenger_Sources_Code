package X;

import android.util.Pair;

/* loaded from: Lqf.class */
public final /* synthetic */ class Lqf implements Runnable {
    public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda3";
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ JTk A01;
    public final /* synthetic */ 6aC A02;
    public final /* synthetic */ 6aF A03;

    public /* synthetic */ Lqf(Pair pair, JTk jTk, 6aC r304, 6aF r305) {
        this.A01 = jTk;
        this.A00 = pair;
        this.A02 = r304;
        this.A03 = r305;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JTk jTk = this.A01;
        Pair pair = this.A00;
        6aC r0 = this.A02;
        6aF r02 = this.A03;
        jTk.A01.A04.C3s(r0, r02, (6YR) pair.second, GOo.A03(pair));
    }
}

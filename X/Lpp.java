package X;

import android.util.Pair;

/* loaded from: Lpp.class */
public final /* synthetic */ class Lpp implements Runnable {
    public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda4";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Pair A01;
    public final /* synthetic */ JTk A02;

    public /* synthetic */ Lpp(Pair pair, JTk jTk, int i) {
        this.A02 = jTk;
        this.A01 = pair;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JTk jTk = this.A02;
        Pair pair = this.A01;
        int i = this.A00;
        jTk.A01.A04.BvH((6YR) pair.second, GOo.A03(pair), i);
    }
}

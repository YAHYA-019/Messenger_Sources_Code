package X;

import android.util.Pair;

/* loaded from: Lpr.class */
public final /* synthetic */ class Lpr implements Runnable {
    public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda8";
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ JTk A01;
    public final /* synthetic */ Exception A02;

    public /* synthetic */ Lpr(Pair pair, JTk jTk, Exception exc) {
        this.A01 = jTk;
        this.A00 = pair;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JTk jTk = this.A01;
        Pair pair = this.A00;
        Exception exc = this.A02;
        jTk.A01.A04.BvI((6YR) pair.second, exc, GOo.A03(pair));
    }
}

package X;

import android.util.Pair;

/* loaded from: Lr2.class */
public final /* synthetic */ class Lr2 implements Runnable {
    public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda9";
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ JTk A01;
    public final /* synthetic */ 6aC A02;
    public final /* synthetic */ 6aF A03;
    public final /* synthetic */ Object A04;
    public final /* synthetic */ Object A05;

    public /* synthetic */ Lr2(Pair pair, JTk jTk, 6aC r304, 6aF r305, Object obj, Object obj2) {
        this.A01 = jTk;
        this.A00 = pair;
        this.A02 = r304;
        this.A03 = r305;
        this.A04 = obj;
        this.A05 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JTk jTk = this.A01;
        Pair pair = this.A00;
        6aC r0 = this.A02;
        6aF r02 = this.A03;
        Object obj = this.A04;
        Object obj2 = this.A05;
        jTk.A01.A04.C3w(r0, r02, (6YR) pair.second, obj, obj2, GOo.A03(pair));
    }
}

package X;

import android.util.Pair;
import java.io.IOException;

/* loaded from: Lr1.class */
public final /* synthetic */ class Lr1 implements Runnable {
    public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1";
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ JTk A01;
    public final /* synthetic */ 6aC A02;
    public final /* synthetic */ 6aF A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ Lr1(Pair pair, JTk jTk, 6aC r304, 6aF r305, IOException iOException, boolean z) {
        this.A01 = jTk;
        this.A00 = pair;
        this.A02 = r304;
        this.A03 = r305;
        this.A04 = iOException;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JTk jTk = this.A01;
        Pair pair = this.A00;
        6aC r0 = this.A02;
        6aF r02 = this.A03;
        IOException iOException = this.A04;
        boolean z = this.A05;
        jTk.A01.A04.C42(r0, r02, (6YR) pair.second, iOException, GOo.A03(pair), z);
    }
}

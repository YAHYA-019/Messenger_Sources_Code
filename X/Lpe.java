package X;

import com.facebook.papaya.client.PapayaJNI;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Lpe.class */
public final /* synthetic */ class Lpe implements Runnable {
    public static final String __redex_internal_original_name = "Papaya$$ExternalSyntheticLambda4";
    public final /* synthetic */ C5gr A00;
    public final /* synthetic */ 5hT A01;
    public final /* synthetic */ SettableFuture A02;

    public /* synthetic */ Lpe(C5gr c5gr, 5hT r303, SettableFuture settableFuture) {
        this.A01 = r303;
        this.A00 = c5gr;
        this.A02 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5hT r0 = this.A01;
        C5gr c5gr = this.A00;
        SettableFuture settableFuture = this.A02;
        r0.A00.A00();
        PapayaJNI.submitExecutor(c5gr.getName(), "federated");
        settableFuture.A04();
    }
}

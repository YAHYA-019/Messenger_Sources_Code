package X;

import com.facebook.papaya.client.PapayaJNI;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Lpd.class */
public final /* synthetic */ class Lpd implements Runnable {
    public static final String __redex_internal_original_name = "Papaya$$ExternalSyntheticLambda0";
    public final /* synthetic */ 5hT A00;
    public final /* synthetic */ PapayaRestrictions A01;
    public final /* synthetic */ SettableFuture A02;

    public /* synthetic */ Lpd(5hT r302, PapayaRestrictions papayaRestrictions, SettableFuture settableFuture) {
        this.A00 = r302;
        this.A01 = papayaRestrictions;
        this.A02 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5hT r0 = this.A00;
        PapayaRestrictions papayaRestrictions = this.A01;
        SettableFuture settableFuture = this.A02;
        r0.A00.A00();
        PapayaJNI.run(papayaRestrictions);
        settableFuture.set((Object) null);
    }
}

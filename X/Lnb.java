package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Lnb.class */
public final /* synthetic */ class Lnb implements Runnable {
    public static final String __redex_internal_original_name = "ChatHeadWindowManager$7$$ExternalSyntheticLambda0";
    public final /* synthetic */ AmX A00;
    public final /* synthetic */ SettableFuture A01;

    public /* synthetic */ Lnb(AmX amX, SettableFuture settableFuture) {
        this.A01 = settableFuture;
        this.A00 = amX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.set(this.A00);
    }
}

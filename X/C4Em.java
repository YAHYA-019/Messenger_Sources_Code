package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: X.4Em, reason: invalid class name */
/* loaded from: 4Em.class */
public final /* synthetic */ class C4Em implements Runnable {
    public static final String __redex_internal_original_name = "AsyncMetadataHelper$$ExternalSyntheticLambda1";
    public final /* synthetic */ C4El A00;
    public final /* synthetic */ ListenableFuture A01;
    public final /* synthetic */ ListenableFuture A02;

    public /* synthetic */ C4Em(C4El c4El, ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        this.A00 = c4El;
        this.A01 = listenableFuture;
        this.A02 = listenableFuture2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.AMM(this.A01.get(), this.A02.get());
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}

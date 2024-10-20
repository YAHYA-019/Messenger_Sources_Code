package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.AcB, reason: case insensitive filesystem */
/* loaded from: AcB.class */
public final class RunnableC1268AcB implements Runnable {
    public static final String __redex_internal_original_name = "FetchStrategyUseExecutor$fetch$1";
    public final /* synthetic */ C6j8 A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ SettableFuture A02;

    public RunnableC1268AcB(C6j8 c6j8, ImmutableList immutableList, SettableFuture settableFuture) {
        this.A02 = settableFuture;
        this.A00 = c6j8;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.setFuture(this.A00.A00.ARv(this.A01));
    }
}

package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Cu1.class */
public final class Cu1 implements 2Ut {
    public final /* synthetic */ 2Ur A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ AtomicBoolean A02;

    public Cu1(2Ur r302, SettableFuture settableFuture, AtomicBoolean atomicBoolean) {
        this.A02 = atomicBoolean;
        this.A00 = r302;
        this.A01 = settableFuture;
    }

    public final void Bmm(CancellationException cancellationException) {
        if (this.A02.getAndSet(true)) {
            this.A01.setException(cancellationException);
            return;
        }
        0fH.A0n(Cbf.__redex_internal_original_name, "Operation cancelled. Retry ThreadListLoader.startLoad.");
        this.A00.A0A(2fC.A00(Cbf.A0C, 1Hb.A02, false, false, false));
    }
}

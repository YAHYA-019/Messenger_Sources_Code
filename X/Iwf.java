package X;

import java.util.concurrent.Future;

/* loaded from: Iwf.class */
public final class Iwf implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerLoaderController$RemovePendingFutureAfterCompletionCallback";
    public Future A00;
    public final /* synthetic */ IPw A01;

    public Iwf(IPw iPw, Future future) {
        this.A01 = iPw;
        this.A00 = future;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A0E.remove(this.A00);
    }
}

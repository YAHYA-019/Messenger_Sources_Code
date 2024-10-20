package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: D7o.class */
public final class D7o implements Runnable {
    public static final String __redex_internal_original_name = "DefaultThreadKeyFactory$resolveThreadKeyForOtherUser$1";
    public final /* synthetic */ DFI A00;
    public final /* synthetic */ ListenableFuture A01;

    public D7o(DFI dfi, ListenableFuture listenableFuture) {
        this.A01 = listenableFuture;
        this.A00 = dfi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.CQC((ThreadKey) this.A01.get());
        } catch (InterruptedException unused) {
            throw AnonymousClass001.A0T("Resolve thread key failed");
        } catch (ExecutionException unused2) {
            throw AnonymousClass001.A0T("Resolve thread key failed");
        }
    }
}

package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: D86.class */
public final class D86 implements Runnable {
    public static final String __redex_internal_original_name = "OmniPickerFragment$19";
    public final /* synthetic */ C1557Alb A00;
    public final /* synthetic */ ListenableFuture A01;

    public D86(C1557Alb c1557Alb, ListenableFuture listenableFuture) {
        this.A00 = c1557Alb;
        this.A01 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            final ThreadKey threadKey = (ThreadKey) this.A01.get();
            AnonymousClass001.A07().post(new Runnable() { // from class: X.D85
                public static final String __redex_internal_original_name = "OmniPickerFragment$19$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C1557Alb.A0B(threadKey, this.A00);
                }
            });
        } catch (InterruptedException | ExecutionException e) {
            0fH.A0q("omni_picker", "Cannot resolve thread key", e);
        }
    }
}

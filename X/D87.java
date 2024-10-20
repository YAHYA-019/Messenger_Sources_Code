package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: D87.class */
public final /* synthetic */ class D87 implements Runnable {
    public static final String __redex_internal_original_name = "OmniPickerFragment$23$2$$ExternalSyntheticLambda1";
    public final /* synthetic */ CoC A00;
    public final /* synthetic */ ListenableFuture A01;

    public /* synthetic */ D87(CoC coC, ListenableFuture listenableFuture) {
        this.A00 = coC;
        this.A01 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final CoC coC = this.A00;
        try {
            final ThreadKey threadKey = (ThreadKey) this.A01.get();
            AnonymousClass001.A07().post(new Runnable() { // from class: X.D88
                public static final String __redex_internal_original_name = "OmniPickerFragment$23$2$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    C1557Alb.A0D(threadKey, coC.A01.A02, false);
                }
            });
        } catch (InterruptedException | ExecutionException e) {
            0fH.A0q("omni_picker", "Cannot resolve thread key", e);
        }
    }
}

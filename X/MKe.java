package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: MKe.class */
public interface MKe {
    boolean isAvailableOnDevice();

    void onClearCredential(KRC krc, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);

    void onCreateCredential(Context context, Kjv kjv, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);

    void onGetCredential(Context context, Kgc kgc, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);

    void onGetCredential(Context context, KoU koU, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);

    void onPrepareCredential(Kgc kgc, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);
}

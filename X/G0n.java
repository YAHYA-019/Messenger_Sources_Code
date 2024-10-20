package X;

import android.view.View;
import java.util.Queue;

/* loaded from: G0n.class */
public final class G0n implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverInGameNotificationController$dismissNotificationRunnable$1";
    public final /* synthetic */ F6e A00;

    public G0n(F6e f6e) {
        this.A00 = f6e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Queue queue;
        Queue queue2;
        Queue queue3;
        RH5 rh5;
        F6e f6e = this.A00;
        if (f6e.A01 == null || (queue = f6e.A02) == null || queue.isEmpty() || (queue2 = f6e.A02) == null || queue2.peek() == null || (queue3 = f6e.A02) == null || (rh5 = (RH5) queue3.peek()) == null) {
            return;
        }
        View view = rh5.A00;
        FHq.A02(view, new FpO(view, f6e, 1));
    }
}

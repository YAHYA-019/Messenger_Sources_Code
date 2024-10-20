package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.6ri, reason: invalid class name */
/* loaded from: 6ri.class */
public final class C6ri {
    public static final Thread A03;
    public final Queue A00 = new LinkedList();
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public volatile 6xF A02;

    static {
        Thread thread = Looper.getMainLooper().getThread();
        11T.A0A(thread);
        A03 = thread;
    }

    public void A00(final 6Sh r302) {
        6xF r0 = this.A02;
        if (r0 == null) {
            0fH.A0n("ComposerEventQueueImpl", "Null composer controller.");
            if (Thread.currentThread() == A03) {
                this.A00.offer(r302);
                return;
            } else {
                this.A01.post(new Runnable() { // from class: X.7W4
                    public static final String __redex_internal_original_name = "ComposerEventQueueImpl$enqueue$controller$1$1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C6ri c6ri = C6ri.this;
                        c6ri.A00.offer(r302);
                    }
                });
                return;
            }
        }
        6Sh[] r02 = {r302};
        11T.A0F(r02, 0);
        List asList = Arrays.asList(r02);
        11T.A0A(asList);
        6xF.A02(r0, asList);
    }
}

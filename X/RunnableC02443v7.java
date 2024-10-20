package X;

import java.util.Queue;

/* renamed from: X.3v7, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3v7.class */
public final class RunnableC02443v7 implements Runnable {
    public static final String __redex_internal_original_name = "FbSharedPreferencesImpl$initialize$2";
    public final /* synthetic */ 1Cv A00;

    public RunnableC02443v7(1Cv r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Queue queue = this.A00.A09;
        while (true) {
            Runnable runnable = (Runnable) queue.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }
}

package X;

import android.os.Process;

/* renamed from: X.4Er, reason: invalid class name */
/* loaded from: 4Er.class */
public final class C4Er implements Runnable {
    public static final String __redex_internal_original_name = "zza";
    public final Runnable A00;

    public C4Er(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.A00.run();
    }
}

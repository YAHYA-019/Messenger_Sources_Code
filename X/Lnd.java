package X;

import android.os.Process;

/* loaded from: Lnd.class */
public final class Lnd implements Runnable {
    public static final String __redex_internal_original_name = "TigonNetworkSessionListenerManagerModule$1$1";
    public final /* synthetic */ Lty A00;
    public final /* synthetic */ Runnable A01;

    public Lnd(Lty lty, Runnable runnable) {
        this.A00 = lty;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Process.setThreadPriority(this.A00.A01);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
        this.A01.run();
    }
}

package X;

import android.os.Process;

/* renamed from: X.4X1, reason: invalid class name */
/* loaded from: 4X1.class */
public final class C4X1 implements Runnable {
    public static final String __redex_internal_original_name = "WhatsAppWorkers$WaWorkersThreadFactory$1";
    public final /* synthetic */ 7A3 A00;
    public final /* synthetic */ Runnable A01;

    public C4X1(7A3 r302, Runnable runnable) {
        this.A00 = r302;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.A00.A00);
        this.A01.run();
    }
}

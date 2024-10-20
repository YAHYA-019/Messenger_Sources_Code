package X;

import java.util.concurrent.TimeUnit;

/* loaded from: G15.class */
public final class G15 implements Runnable {
    public static final String __redex_internal_original_name = "LogsManager$storeLogsToFile$1";
    public final /* synthetic */ FIN A00;

    public G15(FIN fin) {
        this.A00 = fin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        FIN fin = this.A00;
        FIN fin2 = FIN.A09;
        GGV ggv = fin.A02;
        if (ggv == null) {
            str = "clock";
        } else {
            long ALY = ggv.ALY() - fin.A00;
            str = "storeLogsScheduler";
            Ep3 ep3 = fin.A03;
            if (ALY < 15000) {
                if (ep3 != null) {
                    if (ep3.A04.incrementAndGet() < 5 || !ep3.A03.compareAndSet(false, true)) {
                        return;
                    }
                    ep3.A02.execute(new S9V(ep3));
                    return;
                }
            } else if (ep3 != null) {
                if (ep3.A03.compareAndSet(false, true)) {
                    ep3.A02.schedule((Runnable) new S9U(ep3), ep3.A00, TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}

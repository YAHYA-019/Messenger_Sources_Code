package X;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

/* loaded from: Lrf.class */
public final class Lrf implements Runnable, C50v {
    public static final String __redex_internal_original_name = "RetriableBillingClient$StartConnectionRunnable";
    public LDG A00;
    public final C50m A01;
    public final LXl A02;
    public final ConcurrentLinkedQueue A03;
    public final Semaphore A04 = new Semaphore(1);

    public Lrf(LDG ldg, C50m c50m, LXl lXl, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.A00 = ldg;
        this.A02 = lXl;
        this.A03 = concurrentLinkedQueue;
        this.A01 = c50m;
    }

    private final void A00(L1w l1w) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A03;
        LinkedList A1F = AbF.A1F();
        for (Object poll = concurrentLinkedQueue.poll(); poll != null; poll = concurrentLinkedQueue.poll()) {
            A1F.add(poll);
        }
        while (true) {
            Kta kta = (Kta) A1F.poll();
            if (kta == null) {
                return;
            }
            if (kta instanceof Juj) {
                kta.A01(l1w, new AVE(l1w, 38));
            } else {
                kta.A00();
            }
        }
    }

    @Override // X.C50v
    public void BlT() {
        this.A01.A00.BZX(null, null, "client_init_iap_store_connection_stopped");
        this.A02.D1W(new LSp(this, 1), false);
    }

    @Override // X.C50v
    public void BlU(L1w l1w) {
        11T.A0F(l1w, 0);
        this.A04.release();
        int i = l1w.A00;
        C50m c50m = this.A01;
        if (i == 0) {
            c50m.A00.BZX(null, null, "client_init_iap_store_connection_success");
        } else {
            C50k c50k = c50m.A00;
            LinkedHashMap A06 = 04R.A06(04R.A0G());
            FHZ.A00(l1w, A06);
            c50k.BZX(A06, null, "client_init_iap_store_connection_fail");
        }
        A00(l1w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.L1w, java.lang.Object] */
    @Override // java.lang.Runnable
    public void run() {
        LDG ldg = this.A00;
        if (!ldg.A0F()) {
            Semaphore semaphore = this.A04;
            if (!semaphore.tryAcquire()) {
                return;
            }
            if (!ldg.A0F()) {
                this.A01.A00.BZX(null, null, "client_init_iap_store_connection_init");
                0fH.A0k("DCP", "Starting in-app billing connection.");
                ldg.A09(this);
                return;
            }
            semaphore.release();
        }
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A01 = "";
        A00(obj);
    }
}

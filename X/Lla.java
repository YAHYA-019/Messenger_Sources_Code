package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: Lla.class */
public final /* synthetic */ class Lla implements Runnable {
    public static final String __redex_internal_original_name = "PlayerWarmupScheduler$$ExternalSyntheticLambda4";
    public final /* synthetic */ 5N9 A00;

    @Override // java.lang.Runnable
    public final void run() {
        5N9 r0 = this.A00;
        ConcurrentLinkedQueue concurrentLinkedQueue = r0.A06;
        int size = concurrentLinkedQueue.size();
        java.util.Map map = r0.A05;
        C51f.A01("PlayerWarmupScheduler", "processQueue, queueSize=%d", AnonymousClass001.A1a(size + map.size()));
        5L4 r02 = (5L4) r0.A08.get();
        if (r02 != null) {
            if (r0.A03.enableWarmupProcessPeriodically) {
                if (concurrentLinkedQueue.isEmpty() && map.isEmpty()) {
                    return;
                }
                5N9.A00(r02, r0);
                return;
            }
            do {
                if (concurrentLinkedQueue.isEmpty() && map.isEmpty()) {
                    return;
                }
            } while (5N9.A00(r02, r0));
        }
    }
}

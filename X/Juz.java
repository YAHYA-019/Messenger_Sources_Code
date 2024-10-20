package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: Juz.class */
public final class Juz extends 1LV {
    public final /* synthetic */ L0n A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Juz(L0n l0n, Object[] objArr) {
        super((String[]) objArr);
        this.A00 = l0n;
    }

    public void A02(JSi jSi) {
        JSj jSj;
        if (jSi instanceof JSk) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            L0n l0n = this.A00;
            Object obj = jSi.A04.get("duration");
            if (timeUnit.toMillis((!(obj instanceof JSj) || (jSj = (JSj) obj) == null) ? 0L : jSj.A00) <= l0n.A01.A02) {
                return;
            }
        }
        L0n l0n2 = this.A00;
        ConcurrentLinkedQueue concurrentLinkedQueue = l0n2.A03;
        concurrentLinkedQueue.add(jSi);
        AtomicLong atomicLong = l0n2.A04;
        long incrementAndGet = atomicLong.incrementAndGet();
        if (incrementAndGet == 1) {
            L0n.A00(l0n2);
        }
        if (incrementAndGet <= l0n2.A01.A01 || 2JB.A03()) {
            return;
        }
        l0n2.A00.removeCallbacks(l0n2.A02);
        int i = 0;
        do {
            concurrentLinkedQueue.poll();
            i++;
        } while (i < 1000);
        atomicLong.set(atomicLong.get() - 1000);
        L0n.A00(l0n2);
    }
}

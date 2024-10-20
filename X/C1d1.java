package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1d1, reason: invalid class name */
/* loaded from: 1d1.class */
public final class C1d1 implements C1d3 {
    public ScheduledFuture A01;
    public final ScheduledExecutorService A02 = (ScheduledExecutorService) 1Bi.A03(16461);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public int A00 = 0;

    @Override // X.C1d3
    public boolean BQN() {
        return this.A03.get();
    }
}

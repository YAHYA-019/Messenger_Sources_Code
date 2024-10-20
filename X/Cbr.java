package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cbr.class */
public final class Cbr implements InterfaceC07964le {
    public final int A00;
    public final Object A01;

    public Cbr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC07964le
    public final void CIz(boolean z) {
        AmX amX;
        ThreadSummary threadSummary;
        if (this.A00 == 0) {
            JU4 ju4 = (JU4) this.A01;
            if (z) {
                JU4.A0V(ju4);
                return;
            }
            return;
        }
        if (!z || (threadSummary = (amX = (AmX) this.A01).A04) == null) {
            return;
        }
        AmX.A02(amX, threadSummary);
        amX.A04 = null;
    }
}

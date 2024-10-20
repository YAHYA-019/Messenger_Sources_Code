package X;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* renamed from: X.Jh6, reason: case insensitive filesystem */
/* loaded from: Jh6.class */
public final class C3041Jh6 extends AbstractC3042Jh7 implements MCs {
    public final Set A00;
    public final Semaphore A01;

    public C3041Jh6(Context context, Set set) {
        super(context);
        this.A01 = new Semaphore(0);
        this.A00 = set;
    }

    public final void A04() {
        this.A01.drainPermits();
        A08();
    }
}

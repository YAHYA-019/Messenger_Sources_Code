package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: Krt.class */
public final class Krt {
    public boolean A00;
    public final Object A01;
    public final C00m A02;
    public final Runnable A03;
    public final List A04;
    public final Executor A05;

    public Krt(Executor executor, C00m c00m) {
        11T.A0F(executor, 1);
        this.A05 = executor;
        this.A02 = c00m;
        this.A01 = AnonymousClass001.A0R();
        this.A04 = AnonymousClass001.A0s();
        this.A03 = new LjT(this);
    }

    public final void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            List list = this.A04;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C00m) it.next()).invoke();
            }
            list.clear();
        }
    }

    public final boolean A01() {
        boolean z;
        synchronized (this.A01) {
            z = this.A00;
        }
        return z;
    }
}

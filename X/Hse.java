package X;

import android.os.Handler;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Hse.class */
public final class Hse {
    public final Handler A03;
    public final JHq A04;
    public final AtomicInteger A06 = GOn.A1K(0);
    public final LinkedList A05 = AbF.A1F();
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02 = false;

    public Hse(Handler handler, JHq jHq) {
        this.A04 = jHq;
        this.A03 = handler;
    }

    public INw A00(Runnable runnable) {
        INw iNw;
        synchronized (this) {
            if (this.A01) {
                throw AnonymousClass001.A0N("Cannot generate callbacks after complete is called");
            }
            this.A00++;
            iNw = new INw(runnable, this, 6);
        }
        return iNw;
    }

    public void A01() {
        synchronized (this) {
            try {
                this.A01 = true;
                if (this.A06.get() == this.A00) {
                    Hv9.A00(this.A03, this.A04);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

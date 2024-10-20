package X;

import android.os.Handler;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Hsd.class */
public final class Hsd {
    public final Handler A03;
    public final JIk A04;
    public final AtomicInteger A06 = GOn.A1K(0);
    public final LinkedList A05 = AbF.A1F();
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02 = false;

    public Hsd(JIk jIk, Handler handler) {
        this.A04 = jIk;
        this.A03 = handler;
    }

    public IcF A00() {
        IcF icF;
        synchronized (this) {
            if (this.A01) {
                throw AnonymousClass001.A0N("Cannot generate callbacks after complete is called");
            }
            this.A00++;
            icF = new IcF(this, 3);
        }
        return icF;
    }

    public void A01() {
        synchronized (this) {
            try {
                this.A01 = true;
                if (this.A06.get() == this.A00) {
                    Hvj.A01(this.A04, this.A03);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Lz0.class */
public final class Lz0 extends AtomicReference implements MKH {
    public static final long serialVersionUID = 2620149119579502636L;
    public final MKH downstream;
    public final Lyw parent;

    public Lz0(MKH mkh, Lyw lyw) {
        this.downstream = mkh;
        this.parent = lyw;
    }

    public void Bpm() {
        Lyw lyw = this.parent;
        lyw.active = false;
        lyw.A00();
    }

    public void C9Q(Object obj) {
        this.downstream.C9Q(obj);
    }

    public void COI(MHY mhy) {
        Object obj;
        do {
            obj = get();
            if (obj == JS2.A01) {
                if (mhy != null) {
                    mhy.dispose();
                    return;
                }
                return;
            }
        } while (!1MG.A00(this, obj, mhy));
    }

    public void onError(Throwable th) {
        Lyw lyw = this.parent;
        if (!Kxz.A00(th, lyw.error)) {
            KZ0.A00(th);
            return;
        }
        if (!lyw.tillTheEnd) {
            lyw.upstream.dispose();
        }
        lyw.active = false;
        lyw.A00();
    }
}

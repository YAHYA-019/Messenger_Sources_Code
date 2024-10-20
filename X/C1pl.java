package X;

import android.os.Handler;
import android.view.Choreographer;

/* renamed from: X.1pl, reason: invalid class name */
/* loaded from: 1pl.class */
public abstract class C1pl {
    public Runnable A00;
    public Choreographer.FrameCallback A01;

    public Choreographer.FrameCallback A02() {
        67D r302 = this.A01;
        if (r302 == null) {
            r302 = new 67D(this);
            this.A01 = r302;
        }
        return r302;
    }

    public void A03(long j) {
        Handler handler;
        Runnable runnable;
        3AH r0 = (3AH) this;
        int i = r0.A00;
        Object obj = r0.A01;
        if (i != 0) {
            C1pg c1pg = (C1pg) obj;
            handler = (Handler) c1pg.A00.get();
            runnable = c1pg.A04;
        } else {
            C1pg c1pg2 = (C1pg) obj;
            handler = (Handler) c1pg2.A00.get();
            runnable = c1pg2.A03;
        }
        handler.postAtFrontOfQueue(runnable);
    }
}

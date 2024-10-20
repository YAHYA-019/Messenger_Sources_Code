package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.1dy, reason: invalid class name */
/* loaded from: 1dy.class */
public final class C1dy {
    public Handler A00;
    public HandlerThread A01;
    public final C00i A02;
    public final C00i A03;

    public C1dy() {
        this.A03 = new 1BQ(16511);
        this.A02 = new 1BV(16758);
    }

    public C1dy(int i) {
    }

    public final Handler A00() {
        Handler handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("BaseDependencyManager", 10);
            C0T8.A00(handlerThread);
            this.A01 = handlerThread;
            handlerThread.start();
            handler = new Handler(this.A01.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    public C1e5 A01() {
        C01s c01s = (C01s) this.A03.get();
        C1e5 c1e5 = C1e5.A04;
        if (c1e5 == null) {
            c1e5 = new C1e5(c01s);
            C1e5.A04 = c1e5;
        }
        if (!c1e5.A03) {
            c1e5.A00 = c01s;
            c1e5.A03 = true;
        }
        return c1e5;
    }
}

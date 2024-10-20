package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Am, reason: invalid class name */
/* loaded from: 1Am.class */
public abstract class C1Am extends 16A {
    public final Handler A00;

    public C1Am(Handler handler) {
        this.A00 = handler;
    }

    public Object get() {
        if (Looper.myLooper() != this.A00.getLooper() || isDone()) {
            return super.get();
        }
        throw AnonymousClass001.A0N("Must not call get() function from this Handler thread. Will deadlock!");
    }

    public Object get(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() != this.A00.getLooper() || isDone()) {
            return super.get(j, timeUnit);
        }
        throw AnonymousClass001.A0N("Must not call get() function from this Handler thread. Will deadlock!");
    }
}

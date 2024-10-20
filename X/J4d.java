package X;

import java.io.IOException;
import java.lang.Thread;

/* loaded from: J4d.class */
public final class J4d implements Thread.UncaughtExceptionHandler {
    public final int A00;
    public final Object A01;

    public J4d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.A00 != 0) {
            ((I7F) this.A01).A00.A00(new IOException("uncaughtException for backup", th));
        } else {
            IEN.A03((IEN) this.A01, th);
        }
    }
}

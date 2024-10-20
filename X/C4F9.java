package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4F9, reason: invalid class name */
/* loaded from: 4F9.class */
public final class C4F9 extends Handler {
    public final Looper A00;

    public C4F9() {
        this.A00 = Looper.getMainLooper();
    }

    public C4F9(Looper looper) {
        super(looper);
        this.A00 = Looper.getMainLooper();
    }
}

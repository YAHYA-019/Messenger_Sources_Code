package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.28w, reason: invalid class name */
/* loaded from: 28w.class */
public class C28w extends Handler {
    public final Looper A00;

    public C28w() {
        this.A00 = Looper.getMainLooper();
    }

    public C28w(Looper looper) {
        super(looper);
        this.A00 = Looper.getMainLooper();
    }

    public C28w(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.A00 = Looper.getMainLooper();
    }
}

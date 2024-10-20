package X;

import android.os.Looper;

/* renamed from: X.1pR, reason: invalid class name */
/* loaded from: 1pR.class */
public abstract class C1pR {
    public static void A00() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be called on the main thread");
        }
    }
}

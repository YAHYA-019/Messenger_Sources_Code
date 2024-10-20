package X;

import java.io.Closeable;

/* renamed from: X.127, reason: invalid class name */
/* loaded from: 127.class */
public abstract class AnonymousClass127 {
    public static final void A00(Closeable closeable, Throwable th) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                C0ra.A01(th, th2);
            }
        }
    }
}

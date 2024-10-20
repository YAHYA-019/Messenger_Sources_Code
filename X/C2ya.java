package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2ya, reason: invalid class name */
/* loaded from: 2ya.class */
public final class C2ya {
    public final 9Ap A00 = new Object();
    public final java.util.Map A01 = 1BK.A1C();
    public final Set A02 = new LinkedHashSet();
    public volatile boolean A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.AutoCloseable] */
    public static final void A00(AutoCloseable autoCloseable) {
        ?? r0 = autoCloseable;
        if (r0 != 0) {
            try {
                r0 = autoCloseable;
                r0.close();
            } catch (Exception unused) {
                throw AnonymousClass001.A0U(r0);
            }
        }
    }
}

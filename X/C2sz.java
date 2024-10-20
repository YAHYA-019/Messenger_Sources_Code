package X;

import java.util.HashMap;

/* renamed from: X.2sz, reason: invalid class name */
/* loaded from: 2sz.class */
public final class C2sz {
    public int A00 = -1;
    public final java.util.Map A01 = new HashMap();

    public final int A00() {
        int i;
        synchronized (this) {
            if (!A01()) {
                throw AnonymousClass001.A0N("Attempted to get unread count when cache is not initialized");
            }
            i = this.A00;
        }
        return i;
    }

    public final boolean A01() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A00 != -1) {
                z = true;
            }
        }
        return z;
    }
}

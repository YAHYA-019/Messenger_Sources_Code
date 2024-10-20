package X;

import java.util.Collections;

/* loaded from: L9j.class */
public final class L9j {
    public static final L9j A01 = new L9j(true);
    public static volatile L9j A02;
    public final java.util.Map A00;

    public L9j() {
        this.A00 = AnonymousClass001.A0u();
    }

    public L9j(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public static L9j A00() {
        L9j l9j;
        L9j l9j2 = A02;
        if (l9j2 != null) {
            return l9j2;
        }
        synchronized (L9j.class) {
            l9j = A02;
            if (l9j == null) {
                l9j = KwX.A00();
                A02 = l9j;
            }
        }
        return l9j;
    }
}

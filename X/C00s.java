package X;

/* renamed from: X.00s, reason: invalid class name */
/* loaded from: 00s.class */
public abstract class C00s {
    public static volatile int A00;

    public C00s() {
        throw 0Q8.createAndThrow();
    }

    public static boolean A00() {
        if (A00 != 0) {
            return false;
        }
        synchronized (C00s.class) {
            if (A00 == 0) {
                A00 = -1;
            }
        }
        return false;
    }
}

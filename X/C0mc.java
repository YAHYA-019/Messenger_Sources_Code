package X;

/* renamed from: X.0mc, reason: invalid class name */
/* loaded from: 0mc.class */
public final class C0mc {
    public static 03D A00;
    public static volatile boolean A01;

    public static 03D A00() {
        return A01();
    }

    public static 03D A01() {
        03D r302;
        synchronized (C0mc.class) {
            r302 = A00;
            if (r302 == null) {
                if (A01) {
                    new 0FN();
                } else {
                    new Object();
                }
                A00 = r302;
            }
        }
        return r302;
    }

    public static void A02() {
        synchronized (C0mc.class) {
            if (A00 != null) {
                throw AnonymousClass001.A0N("Enable is called after recorder initialization");
            }
            A01 = true;
        }
    }

    public static boolean A03() {
        return A01;
    }
}

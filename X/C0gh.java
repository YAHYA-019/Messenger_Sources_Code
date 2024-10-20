package X;

/* renamed from: X.0gh, reason: invalid class name */
/* loaded from: 0gh.class */
public final class C0gh {
    public static C0gc A00;

    public static void A00(C0gc c0gc) {
        synchronized (C0gh.class) {
            if (A00 != null) {
                throw AnonymousClass001.A0N("Cannot re-initialize NativeLoader.");
            }
            A00 = c0gc;
        }
    }

    public static boolean A01() {
        boolean A1T;
        synchronized (C0gh.class) {
            A1T = AnonymousClass001.A1T(A00);
        }
        return A1T;
    }

    public static boolean A02(String str) {
        return A03(str);
    }

    public static boolean A03(String str) {
        C0gc c0gc;
        synchronized (C0gh.class) {
            c0gc = A00;
            if (c0gc == null) {
                throw AnonymousClass001.A0N("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return c0gc.BYh(str, 0);
    }
}

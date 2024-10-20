package X;

/* renamed from: X.2t5, reason: invalid class name */
/* loaded from: 2t5.class */
public abstract class C2t5 {
    public static 2LZ A00;
    public static 2Lb A01;
    public static 2Lb A02;

    static {
        2LZ r0 = new 2LZ("com.samsung.android.os.SemPerfManager");
        A00 = r0;
        Class cls = Boolean.TYPE;
        A01 = r0.A02("onScrollEvent", new Class[]{cls});
        A02 = A00.A03("onSmoothScrollEvent", new Class[]{cls});
    }

    public static boolean A00() {
        boolean z = false;
        if (A02.A00 != null) {
            z = true;
        }
        return z;
    }

    public static boolean A01() {
        return A00.A05((ClassLoader) null);
    }
}

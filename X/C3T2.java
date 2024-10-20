package X;

import com.hisi.perfhub.PerfHub;

/* renamed from: X.3T2, reason: invalid class name */
/* loaded from: 3T2.class */
public final class C3T2 {
    public static 2LZ A02;
    public static 2Lb A03;
    public final PerfHub A00;
    public final Object A01;

    static {
        2LZ r0 = new 2LZ("com.hisi.perfhub.PerfHub");
        A02 = r0;
        A03 = r0.A02("perfEvent", new Class[]{Integer.TYPE, String.class, int[].class});
    }

    public C3T2() {
        2LZ r0 = A02;
        if (r0.A03) {
            this.A00 = new PerfHub();
            return;
        }
        Class cls = r0.A01;
        Object obj = null;
        if (cls != null) {
            try {
                obj = cls.newInstance();
            } catch (Throwable unused) {
            }
        }
        this.A01 = obj;
    }

    public static boolean A00() {
        return A02.A05((ClassLoader) null);
    }

    public int A01(int i, int... iArr) {
        PerfHub perfHub = this.A00;
        if (perfHub != null) {
            return perfHub.perfEvent(i, "", iArr);
        }
        return A03.A00(new Object[]{Integer.valueOf(i), "", iArr}, this.A01);
    }
}

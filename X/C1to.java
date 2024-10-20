package X;

/* renamed from: X.1to, reason: invalid class name */
/* loaded from: 1to.class */
public abstract class C1to {
    public static int[] A00 = new int[2];

    static {
        int i = 0;
        String[] strArr = {"overscroll_glow", "overscroll_edge"};
        try {
            Class<?> cls = Class.forName("com.android.internal.R$drawable");
            int i2 = 0;
            do {
                A00[i2] = cls.getDeclaredField(strArr[i]).getInt(null);
                i2++;
                i++;
            } while (i < 2);
        } catch (Exception unused) {
        }
    }
}

package X;

/* renamed from: X.3Pi, reason: invalid class name */
/* loaded from: 3Pi.class */
public abstract class C3Pi {
    public static final long[] A00 = {86400000, 3600000, 60000, 1000};
    public static final String[] A01 = {"d", "h", "m", K93.__redex_internal_original_name, "ms"};

    public static String A00(long j) {
        int i;
        StringBuilder A0k = AnonymousClass001.A0k();
        long[] jArr = A00;
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= 4) {
                break;
            }
            long j2 = j / jArr[i];
            if (j2 > 0) {
                if (A0k.length() > 0) {
                    A0k.append(' ');
                }
                A0k.append(j2);
                A0k.append(A01[i]);
                j %= jArr[i];
            }
            i2 = i + 1;
        }
        if (A0k.length() > 0) {
            if (j > 0) {
                A0k.append(' ');
            }
            return A0k.toString();
        }
        A0k.append(j);
        A0k.append(A01[i]);
        return A0k.toString();
    }
}

package X;

/* loaded from: Kyj.class */
public abstract class Kyj {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;

    static {
        long j = 3;
        long j2 = j << 32;
        A01 = j2;
        A02 = 1 | j2;
        A00 = j2 | 2;
        A03 = j | (4 << 32);
    }

    public static String A00(long j) {
        return j == A01 ? "Rgb" : j == A02 ? "Xyz" : j == A00 ? "Lab" : j == A03 ? "Cmyk" : "Unknown";
    }
}

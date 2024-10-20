package X;

/* loaded from: F8g.class */
public final class F8g {
    public static final F8g A01 = new Object();
    public static final long A00 = System.nanoTime();

    public final long A00(long j) {
        long nanoTime = System.nanoTime() - A00;
        0zY r0 = 0zY.A07;
        if ((1 | (j - 1)) != Long.MAX_VALUE) {
            return EZE.A00(r0, nanoTime, j);
        }
        return ((-((j < 0 ? C0zc.A02 : C0zc.A01) >> 1)) << 1) + (((int) r309) & 1);
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}

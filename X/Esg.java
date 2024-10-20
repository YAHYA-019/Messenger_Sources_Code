package X;

/* loaded from: Esg.class */
public final class Esg {
    public static int A01;
    public static long A02;
    public final 1Br A00 = 1Bq.A00(84488);

    public final boolean A00() {
        A01++;
        long A012 = 1Br.A01(this.A00);
        long j = A02;
        long j2 = A012 - j;
        if (A01 > 1000 && j2 < 60000) {
            return false;
        }
        if (j2 >= 60000) {
            A02 = j + j2;
            A01 = 0;
        }
        return true;
    }
}

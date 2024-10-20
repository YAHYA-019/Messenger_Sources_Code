package X;

/* loaded from: Lpg.class */
public final class Lpg implements Runnable {
    public static final String __redex_internal_original_name = "AnrTimer$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ boolean A02;

    public Lpg(long j, int i, boolean z) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        C7u4 c7u4 = C7u4.A09;
        int i = this.A00;
        long j = this.A01;
        boolean z = this.A02;
        if (c7u4.A05) {
            return;
        }
        synchronized (c7u4) {
            c7u4.A03 = Thread.currentThread();
            7rE[] r0 = new 7rE[10];
            c7u4.A07 = r0;
            int i2 = 0;
            do {
                r0[i2] = new Object();
                i2++;
            } while (i2 < 10);
            c7u4.A05 = true;
            if (i > 0) {
                c7u4.A08 = new Kl5[i];
                c7u4.A02 = j;
                c7u4.A01 = i - 1;
                c7u4.A04 = z;
            }
        }
    }
}

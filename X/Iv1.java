package X;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

/* loaded from: Iv1.class */
public final class Iv1 implements Runnable {
    public static final String __redex_internal_original_name = "EglRenderer$2";
    public final /* synthetic */ IJG A00;

    public Iv1(IJG ijg) {
        this.A00 = ijg;
    }

    @Override // java.lang.Runnable
    public void run() {
        IJG ijg = this.A00;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (ijg.A0M) {
            long j = nanoTime - ijg.A0A;
            if (j > 0) {
                float nanos = ((float) (ijg.A04 * TimeUnit.SECONDS.toNanos(1L))) / ((float) j);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Duration: ");
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                A0k.append(timeUnit.toMillis(j));
                A0k.append(" ms. Frames received: ");
                A0k.append(ijg.A03);
                A0k.append(". Dropped: ");
                A0k.append(ijg.A02);
                A0k.append(". Rendered: ");
                A0k.append(ijg.A04);
                A0k.append(". Render fps: ");
                A0k.append(decimalFormat.format(nanos));
                A0k.append(". Average render time: ");
                long j2 = ijg.A09;
                int i = ijg.A04;
                A0k.append(i <= 0 ? "NA" : 0Pz.A0I(timeUnit.toMicros(j2 / i), " us"));
                A0k.append(". Average swapBuffer time: ");
                long j3 = ijg.A08;
                int i2 = ijg.A04;
                A0k.append(i2 <= 0 ? "NA" : 0Pz.A0I(timeUnit.toMicros(j3 / i2), " us"));
                IJG.A01(AnonymousClass001.A0d(".", A0k), ijg);
                IJG.A02(ijg, nanoTime);
            }
        }
        synchronized (ijg.A0N) {
            Hgv hgv = ijg.A0C;
            if (hgv != null) {
                GTL gtl = hgv.A01;
                Runnable runnable = ijg.A0P;
                gtl.removeCallbacks(runnable);
                ijg.A0C.A01.postDelayed(runnable, TimeUnit.SECONDS.toMillis(10));
            }
        }
    }
}

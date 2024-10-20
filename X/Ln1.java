package X;

import android.content.Context;

/* loaded from: Ln1.class */
public final class Ln1 implements Runnable {
    public static final String __redex_internal_original_name = "BrowserLiteCallbacker$2";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ LDF A01;

    public Ln1(Context context, LDF ldf) {
        this.A01 = ldf;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        LDF ldf = this.A01;
        Context context = this.A00;
        int i = ldf.A00 - 1;
        ldf.A00 = i;
        if (i != 0 || ldf.A01 == null) {
            return;
        }
        if (ldf.A06 != null) {
            synchronized (ldf) {
                if (ldf.A04 != null) {
                    C0ft.A05(C0g6.A70);
                    C0ft.A05(C0g6.A6z);
                    0fH.A0j("MainProcessStateTracker", DKB.A00(446));
                    ldf.A04 = null;
                }
            }
            context.unbindService(ldf.A01);
        }
        ldf.A03.quit();
        ldf.A01 = null;
        ldf.A06 = null;
        ldf.A07 = null;
        ldf.A03 = null;
        ldf.A02 = null;
    }
}

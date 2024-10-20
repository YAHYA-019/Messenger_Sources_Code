package X;

import java.util.concurrent.ExecutorService;

/* loaded from: Iph.class */
public final class Iph implements Runnable {
    public static final String __redex_internal_original_name = "CameraFeatures$1";
    public final /* synthetic */ IEp A00;

    public Iph(IEp iEp) {
        this.A00 = iEp;
    }

    @Override // java.lang.Runnable
    public void run() {
        IEp iEp = this.A00;
        synchronized (iEp) {
            ExecutorService executorService = IEp.A08;
            if (iEp.A06 != null) {
                iEp.A0E(false);
            }
            iEp.A07 = false;
        }
    }
}

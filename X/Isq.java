package X;

import java.util.Iterator;

/* loaded from: Isq.class */
public final class Isq implements Runnable {
    public static final String __redex_internal_original_name = "CameraLifecycleNotifier$1";
    public final /* synthetic */ HrO A00;

    public Isq(HrO hrO) {
        this.A00 = hrO;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
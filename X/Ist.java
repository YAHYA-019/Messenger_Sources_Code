package X;

import java.util.Iterator;

/* loaded from: Ist.class */
public final class Ist implements Runnable {
    public static final String __redex_internal_original_name = "CameraLifecycleNotifier$4";
    public final /* synthetic */ HrO A00;

    public Ist(HrO hrO) {
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

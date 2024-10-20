package X;

import java.util.Iterator;

/* loaded from: Isr.class */
public final class Isr implements Runnable {
    public static final String __redex_internal_original_name = "CameraLifecycleNotifier$2";
    public final /* synthetic */ HrO A00;

    public Isr(HrO hrO) {
        this.A00 = hrO;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            Gtj gtj = ((HWk) it.next()).A00;
            if (gtj.A02 && ((z = gtj.A03) || gtj.A04)) {
                boolean z2 = gtj.A04;
                gtj.A04 = false;
                gtj.A03 = false;
                Gtj.A00(gtj, Boolean.valueOf(z2), Boolean.valueOf(z));
            }
        }
    }
}

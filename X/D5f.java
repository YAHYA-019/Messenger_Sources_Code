package X;

import java.util.List;

/* loaded from: D5f.class */
public final class D5f implements Runnable {
    public static final String __redex_internal_original_name = "DirectShareChooserTargetServiceDelegate$1";
    public final /* synthetic */ CEA A00;

    public D5f(CEA cea) {
        this.A00 = cea;
    }

    @Override // java.lang.Runnable
    public void run() {
        CEA cea = this.A00;
        CDd cDd = cea.A02;
        List A00 = CEA.A00(cea);
        synchronized (cDd) {
            cDd.A01 = A00;
            cDd.A00 = 1BL.A08(cDd.A02);
        }
    }
}

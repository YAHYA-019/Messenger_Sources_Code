package X;

import java.lang.ref.WeakReference;

/* loaded from: Ljn.class */
public final class Ljn implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$StopIgnoringCancelRunnable";
    public final WeakReference A00;

    public Ljn(C3027Jgq c3027Jgq) {
        this.A00 = 7zL.A14(c3027Jgq);
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((C3027Jgq) weakReference.get()).A0M = false;
        }
    }
}

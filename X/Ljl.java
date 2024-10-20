package X;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

/* loaded from: Ljl.class */
public final class Ljl implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$ShowPromptForAuthenticationRunnable";
    public final WeakReference A00;

    public Ljl(BiometricFragment biometricFragment) {
        this.A00 = 7zL.A14(biometricFragment);
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((BiometricFragment) weakReference.get()).A08();
        }
    }
}

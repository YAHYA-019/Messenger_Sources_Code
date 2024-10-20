package X;

import androidx.biometric.BiometricFragment;

/* loaded from: Ljk.class */
public final class Ljk implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$7";
    public final /* synthetic */ BiometricFragment A00;

    public Ljk(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A01.A0L = false;
    }
}

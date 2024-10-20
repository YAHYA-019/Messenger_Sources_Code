package X;

import androidx.biometric.BiometricFragment;

/* loaded from: Lp3.class */
public final class Lp3 implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$8";
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public Lp3(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        BiometricFragment biometricFragment = this.A01;
        BiometricFragment.A04(biometricFragment, this.A02, this.A00);
        biometricFragment.A07();
    }
}

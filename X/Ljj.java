package X;

import androidx.biometric.BiometricFragment;

/* loaded from: Ljj.class */
public final class Ljj implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$11";
    public final /* synthetic */ BiometricFragment A00;

    public Ljj(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3027Jgq c3027Jgq = this.A00.A01;
        JaO jaO = c3027Jgq.A04;
        if (jaO == null) {
            jaO = new JaO(c3027Jgq);
            c3027Jgq.A04 = jaO;
        }
        jaO.A00();
    }
}

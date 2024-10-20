package X;

import androidx.biometric.BiometricFragment;

/* loaded from: Lma.class */
public final class Lma implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$9";
    public final /* synthetic */ BiometricFragment A00;
    public final /* synthetic */ KgI A01;

    public Lma(BiometricFragment biometricFragment, KgI kgI) {
        this.A00 = biometricFragment;
        this.A01 = kgI;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3027Jgq c3027Jgq = this.A00.A01;
        JaO jaO = c3027Jgq.A04;
        if (jaO == null) {
            jaO = new JaO(c3027Jgq);
            c3027Jgq.A04 = jaO;
        }
        jaO.A02(this.A01);
    }
}

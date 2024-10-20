package X;

import androidx.biometric.BiometricFragment;

/* loaded from: Lp2.class */
public final class Lp2 implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$10";
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public Lp2(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3027Jgq c3027Jgq = this.A01.A01;
        JaO jaO = c3027Jgq.A04;
        if (jaO == null) {
            jaO = new JaO(c3027Jgq);
            c3027Jgq.A04 = jaO;
        }
        jaO.A01(this.A00, this.A02);
    }
}

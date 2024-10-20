package X;

import java.lang.ref.WeakReference;

/* loaded from: AE7.class */
public final class AE7 implements Runnable {
    public static final String __redex_internal_original_name = "PlayerListener$WeakReferenceLogHeartbeatRunnable";
    public final WeakReference A00;

    public AE7(6Un r302) {
        11T.A0F(r302, 1);
        this.A00 = 7zL.A14(r302);
    }

    @Override // java.lang.Runnable
    public void run() {
        6Un r0 = (6Un) this.A00.get();
        if (r0 != null) {
            6Un.A04(r0);
        }
    }
}

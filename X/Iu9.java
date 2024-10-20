package X;

/* loaded from: Iu9.class */
public final class Iu9 implements Runnable {
    public static final String __redex_internal_original_name = "AudioFocusManager$maybeReleaseAudioFocusRunnable$1";
    public final /* synthetic */ Hsw A00;

    public Iu9(Hsw hsw) {
        this.A00 = hsw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hsw hsw = this.A00;
        if (hsw.A01) {
            5Vh r0 = hsw.A02;
            5Vj r02 = hsw.A00;
            11T.A0D(r02);
            int A00 = r0.A00(r02);
            if (A00 != 1) {
                C51f.A01("AudioFocusManager", 0Pz.A0W(A00 == 2 ? "Delayed" : "Failed", " to abandon audio focus"), new Object[0]);
                hsw.A04.BxS(A00);
            }
        }
        hsw.A00 = null;
        hsw.A01 = false;
        hsw.A0C = 0;
    }
}

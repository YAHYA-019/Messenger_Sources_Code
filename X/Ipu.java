package X;

/* loaded from: Ipu.class */
public final /* synthetic */ class Ipu implements Runnable {
    public static final String __redex_internal_original_name = "AudioClipPlayer$$ExternalSyntheticLambda0";
    public final /* synthetic */ IDp A00;

    @Override // java.lang.Runnable
    public final void run() {
        IDp iDp = this.A00;
        1GU.A00(iDp.A06);
        iDp.A05.removeCallbacks(iDp.A09);
        HaF haF = iDp.A07;
        synchronized (haF) {
            haF.A00 = null;
        }
        JNF jnf = iDp.A01;
        if (jnf != null) {
            iDp.A01 = null;
            jnf.release();
        }
    }
}

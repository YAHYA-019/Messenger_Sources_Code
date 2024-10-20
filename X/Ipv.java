package X;

/* loaded from: Ipv.class */
public final class Ipv implements Runnable {
    public static final String __redex_internal_original_name = "AudioClipPlayer$1";
    public final /* synthetic */ IDp A00;

    public Ipv(IDp iDp) {
        this.A00 = iDp;
    }

    @Override // java.lang.Runnable
    public void run() {
        IDp iDp = this.A00;
        IDp.A03(iDp, 0S2.A0Y);
        iDp.A05.postDelayed(this, 25);
    }
}

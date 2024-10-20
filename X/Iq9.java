package X;

/* loaded from: Iq9.class */
public final class Iq9 implements Runnable {
    public static final String __redex_internal_original_name = "AudioComposerRecorder$3";
    public final /* synthetic */ I7p A00;

    public Iq9(I7p i7p) {
        this.A00 = i7p;
    }

    @Override // java.lang.Runnable
    public void run() {
        I7p i7p = this.A00;
        if (i7p.A04) {
            i7p.A0C.add(Double.valueOf(((7Fa) i7p.A05.get()).A06()));
            4YU.A0G(i7p.A07).postDelayed(this, i7p.A0D ? 38 : 50);
        }
    }
}

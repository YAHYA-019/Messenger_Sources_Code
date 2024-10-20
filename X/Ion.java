package X;

/* loaded from: Ion.class */
public final class Ion implements Runnable {
    public static final String __redex_internal_original_name = "InputFramesProvider$2";
    public final /* synthetic */ IHB A00;

    public Ion(IHB ihb) {
        this.A00 = ihb;
    }

    @Override // java.lang.Runnable
    public void run() {
        IHB ihb = this.A00;
        IHB.A00(ihb);
        if (ihb.A05) {
            ihb.A07.open();
        }
    }
}

package X;

/* loaded from: J1c.class */
public final class J1c implements Runnable {
    public static final String __redex_internal_original_name = "Transcoder$1";
    public final /* synthetic */ JKZ A00;
    public final /* synthetic */ IjA A01;
    public final /* synthetic */ Ho9 A02;

    public J1c(JKZ jkz, IjA ijA, Ho9 ho9) {
        this.A02 = ho9;
        this.A00 = jkz;
        this.A01 = ijA;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.A00.run();
        } catch (Exception e) {
            HLc.A00(this.A02.A00, e, "videolite-transcoder", "resizeOperation failed");
        }
        IjA ijA = this.A01;
        ijA.A00.countDown();
        ijA.A01 = null;
    }
}

package X;

/* loaded from: Iz7.class */
public final class Iz7 implements Runnable {
    public static final String __redex_internal_original_name = "SubtitlesRequestAPI$onRequestComplete$1";
    public final /* synthetic */ Hgo A00;
    public final /* synthetic */ C6dl A01;

    public Iz7(Hgo hgo, C6dl c6dl) {
        this.A01 = c6dl;
        this.A00 = hgo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6dl c6dl = this.A01;
        if (c6dl != null) {
            c6dl.CGp(this.A00);
        }
    }
}

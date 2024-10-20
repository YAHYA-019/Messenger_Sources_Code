package X;

/* loaded from: Iz8.class */
public final class Iz8 implements Runnable {
    public static final String __redex_internal_original_name = "SubtitlesRequestAPI$onRequestFailed$1";
    public final /* synthetic */ C6dl A00;
    public final /* synthetic */ Throwable A01;

    public Iz8(C6dl c6dl, Throwable th) {
        this.A00 = c6dl;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6dl c6dl = this.A00;
        if (c6dl != null) {
            c6dl.CGv(this.A01);
        }
    }
}

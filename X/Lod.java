package X;

/* loaded from: Lod.class */
public final class Lod implements Runnable {
    public static final String __redex_internal_original_name = "zzc";
    public final /* synthetic */ JRX A00;
    public final /* synthetic */ C4Ez A01;

    public Lod(JRX jrx, C4Ez c4Ez) {
        this.A00 = jrx;
        this.A01 = c4Ez;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Exception] */
    @Override // java.lang.Runnable
    public final void run() {
        C4Ez c4Ez = this.A01;
        if (c4Ez.A05) {
            this.A00.A01.A06();
            return;
        }
        try {
            JRX jrx = this.A00;
            jrx.A01.A0C(jrx.A00.D4D(c4Ez));
        } catch (Lwu e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            C4Ez c4Ez2 = this.A00.A01;
            if (z) {
                e = (Exception) e.getCause();
            }
            c4Ez2.A0B(e);
        } catch (Exception e2) {
            this.A00.A01.A0B(e2);
        }
    }
}

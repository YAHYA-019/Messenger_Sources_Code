package X;

/* loaded from: Iol.class */
public final class Iol implements Runnable {
    public static final String __redex_internal_original_name = "PhotoPostCaptureControllerImpl$2$1";
    public final /* synthetic */ Id3 A00;

    public Iol(Id3 id3) {
        this.A00 = id3;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2430Gcr c2430Gcr = (C2430Gcr) this.A00.A01;
        if (c2430Gcr.A06) {
            if (c2430Gcr.A05) {
                c2430Gcr.A01.A02.CfS(null);
            } else {
                c2430Gcr.A06 = true;
            }
        }
        c2430Gcr.A05 = true;
    }
}

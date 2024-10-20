package X;

/* loaded from: Iom.class */
public final class Iom implements Runnable {
    public static final String __redex_internal_original_name = "PhotoPostCaptureControllerImpl$4$1";
    public final /* synthetic */ Id4 A00;

    public Iom(Id4 id4) {
        this.A00 = id4;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2430Gcr c2430Gcr = (C2430Gcr) this.A00.A01;
        c2430Gcr.A08 = true;
        if (c2430Gcr.A05) {
            c2430Gcr.A01.A02.CfS(null);
        } else {
            c2430Gcr.A06 = true;
        }
        JLq jLq = c2430Gcr.A0C;
        jLq.getClass();
        jLq.Bzh();
    }
}

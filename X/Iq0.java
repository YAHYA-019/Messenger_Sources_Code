package X;

/* loaded from: Iq0.class */
public final class Iq0 implements Runnable {
    public static final String __redex_internal_original_name = "CameraUtil$BackgroundJob$1";
    public final /* synthetic */ J4U A00;

    public Iq0(J4U j4u) {
        this.A00 = j4u;
    }

    @Override // java.lang.Runnable
    public void run() {
        J4U j4u = this.A00;
        j4u.A02.A0H.remove(j4u);
        DMV dmv = j4u.A01;
        if (dmv.getWindow() != null) {
            dmv.dismiss();
        }
    }
}
